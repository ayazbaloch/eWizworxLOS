package org.adempiere.webui.panel;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;

import org.adempiere.exceptions.ValueChangeEvent;
import org.adempiere.exceptions.ValueChangeListener;
import org.adempiere.webui.apps.AEnv;
import org.adempiere.webui.component.Label;
import org.adempiere.webui.component.Listbox;
import org.adempiere.webui.component.ListboxFactory;
import org.adempiere.webui.component.Row;
import org.adempiere.webui.component.Rows;
import org.adempiere.webui.component.Textbox;
//import org.adempiere.webui.editor.WSearchEditor;
import org.adempiere.webui.editor.WTableDirEditor;
import org.compiere.minigrid.ColumnInfo;
import org.compiere.minigrid.IDColumn;

import org.compiere.model.MColumn;
import org.compiere.model.MLookupFactory;
import org.compiere.model.MQuery;
import org.compiere.util.DB;
import org.compiere.util.DisplayType;
import org.compiere.util.Env;
import org.compiere.util.KeyNamePair;
import org.compiere.util.Msg;
import org.compiere.util.ValueNamePair;
import org.ewizworx.model.I_COL_BRANCH;
//import org.jfree.text.TextBox;
import org.zkoss.zk.ui.event.EventListener;
import org.zkoss.zk.ui.event.Events;

public class InfoBranchPanel extends InfoPanel implements ValueChangeListener, EventListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;




	/**
	 *	Standard Constructor - opens in non-modal mode.
	 * @param WindowNo 			window no
	 * @param record_id			The record_id of the asset
	 * @param value    			Query Value or Name if enclosed in @
	 * @param multiSelection 	multiple selections
	 * @param whereClause 		where clause
	 */
	public InfoBranchPanel(	int WindowNo, int record_id, String value,
							boolean multiSelection, String whereClause)
	{
		this(WindowNo, true, record_id, value, multiSelection, false, whereClause);
	}	
	
	/**
	 *	Standard Constructor
	 * @param WindowNo window no
	 * @param record_id The record ID to find
	 * @param value Query value to find, exclusive of record_id
	 * @param saveResults true if results are saved in context
	 * @param multiSelection multiple selections
	 * @param whereClause where clause
	 * @param modal True if window is opened in modal mode.
	 */
	
	public InfoBranchPanel(	int WindowNo, boolean modal, int record_id, String value,
			boolean multiSelection, boolean saveResults, String whereClause)
	{
		super (WindowNo, modal, "b", "COL_Branch_ID", multiSelection, saveResults, whereClause);
		
		
		log.info(value + ", ID=" + record_id + ", WHERE=" + whereClause);
		setTitle(Msg.getMsg(Env.getCtx(), "InfoBranch"));
		//
		StringBuffer where = new StringBuffer();
		where.append("b.IsActive='Y'");
		if (whereClause != null && whereClause.length() > 0)
			where.append(" AND ").append(whereClause);
		setWhereClause(where.toString());
		setTableLayout(s_Layout);
		setFromClause(s_From);
		setOrderClause("b.BRANCH_NM");
		//
		statInit();
		initInfo(record_id, value, whereClause);
		
		//  Auto query
		if(autoQuery() || record_id != 0 || (value != null && value.length() > 0 && value != "%"))
			prepareAndExecuteQuery();
		//
		p_loadedOK = true;
	} //InfoBranchPanel

	
	/** From Clause             */
	private static String s_From = "COL_BRANCH b"
			+ " INNER JOIN COL_BR_REGION r"
			+ " ON b.COL_BR_REGION_ID=r.COL_BR_REGION_ID"
			+ " LEFT JOIN COL_DISTRICT d"
			+ " ON b.COL_DISTRICT_ID=d.COL_DISTRICT_ID"
			+ " LEFT JOIN COL_TEHSIL t"
			+ " ON b.COL_TEHSIL_ID=t.COL_TEHSIL_ID";
	
	/**  Array of Column Info    */
	private static final ColumnInfo[] s_Layout = {
		new ColumnInfo(" ", "b.COL_BRANCH_ID", IDColumn.class),
		new ColumnInfo(Msg.translate(Env.getCtx(), "Region"), "r.REGION_NM", String.class),
		new ColumnInfo(Msg.translate(Env.getCtx(), "Branch"), "b.BRANCH_NM", String.class),
		new ColumnInfo(Msg.translate(Env.getCtx(), "District"), "d.DISTRICT_NM", String.class),
		new ColumnInfo(Msg.translate(Env.getCtx(), "Tehsil"), "t.TEHSIL_NM",  String.class)
	};
	
	
	private int fieldID = 0;
	
	private WTableDirEditor fCOLRegion_ID;
	private Textbox fieldBranch = new Textbox();
	
	
	private WTableDirEditor fCOLDistrict_ID;
	//private WTableDirEditor fCOLTehsil_ID;
	
	//private Listbox fCOLTehsil_ID_x = ListboxFactory.newDropdownListbox();
	private Listbox fCOLTehsil_ID_x ;

	
	private Label labelBranch = new Label();
	private Label labelTehsil = new Label();
	
	
	
	
	/**
	 *	Static Setup - add fields to parameterPanel
	 */
	
	private void statInit()
	{
		fieldBranch.setWidth("100%");
		
		
		labelTehsil.setValue(Msg.getMsg(Env.getCtx(), "Tehsil"));
		
		
		
		labelBranch.setValue(Msg.getMsg(Env.getCtx(), "Name"));
		fieldBranch.addEventListener(Events.ON_CANCEL, this);
		fieldBranch.setAttribute("zk_component_ID", "Lookup_Criteria_fieldBranch");
		
		//fieldRefCode.addEventListener(Events.ON_CANCEL, this);
		//fieldRefCode.setAttribute("zk_component_ID", "Lookup_Criteria_fieldRefCode");
		
		// From COL_BRANCH.
		
		
		fCOLRegion_ID = new WTableDirEditor(I_COL_BRANCH.COLUMNNAME_COL_BR_REGION_ID, false, false, true,
				MLookupFactory.get (Env.getCtx(), p_WindowNo, 0, 
						MColumn.getColumn_ID(I_COL_BRANCH.Table_Name,I_COL_BRANCH.COLUMNNAME_COL_BR_REGION_ID ), 
						DisplayType.Table));
		
		fCOLRegion_ID.addValueChangeListener(this);
		fCOLRegion_ID.getComponent().setAttribute("zk_component_ID", "Lookup_Criteria_fCOLRegion_ID");
		fCOLRegion_ID.setLabel("Region");
		
		fCOLDistrict_ID = new WTableDirEditor(I_COL_BRANCH.COLUMNNAME_COL_DISTRICT_ID, false, false, true,
				MLookupFactory.get (Env.getCtx(), p_WindowNo, 0, 
						MColumn.getColumn_ID(I_COL_BRANCH.Table_Name, I_COL_BRANCH.COLUMNNAME_COL_DISTRICT_ID), 
						DisplayType.Table));
		fCOLDistrict_ID.addValueChangeListener(this);
		fCOLDistrict_ID.getComponent().setAttribute("zk_component_ID", "Lookup_Criteria_fCOLDistrict_ID");
		fCOLDistrict_ID.setLabel("District");
		
		/*
		fCOLTehsil_ID = new WTableDirEditor(I_COL_BRANCH.COLUMNNAME_COL_TEHSIL_ID, false, false, true,
				MLookupFactory.get (Env.getCtx(), p_WindowNo, 0, 
						MColumn.getColumn_ID(I_COL_BRANCH.Table_Name, I_COL_BRANCH.COLUMNNAME_COL_TEHSIL_ID), 
						DisplayType.Table));
		fCOLTehsil_ID.addValueChangeListener(this);
		fCOLTehsil_ID.getComponent().setAttribute("zk_component_ID", "Lookup_Criteria_fCOLTehsil_ID");
		fCOLTehsil_ID.setLabel("Tehsil");
		*/
		
		fCOLTehsil_ID_x = ListboxFactory.newDropdownListbox();
		fCOLTehsil_ID_x.setAttribute("zk_component_ID", "Lookup_Criteria_fCOLTehsil_ID");
		fCOLTehsil_ID_x.setWidth("100%");
		
		
		Rows rows = new Rows();
		
		Row row = new Row();
		rows.appendChild(row);
		//row.appendChild(labelRegion);
		row.appendChild(fCOLRegion_ID.getLabel().rightAlign());
		row.appendChild(fCOLRegion_ID.getComponent());
		
		
		row.appendChild(labelBranch.rightAlign());
		row.appendChild(fieldBranch);
		
		//row.appendChild(fieldRefCode);
		
		
		
		row = new Row();
		rows.appendChild(row);
		row.appendChild(fCOLDistrict_ID.getLabel().rightAlign());
		row.appendChild(fCOLDistrict_ID.getComponent());
		
		//row.appendChild(fCOLTehsil_ID.getLabel().rightAlign());
		//row.appendChild(fCOLTehsil_ID.getComponent());
		row.appendChild(labelTehsil.rightAlign());
		//row.appendChild(labelTehsil);
		row.appendChild(fCOLTehsil_ID_x);
		
		p_criteriaGrid.appendChild(rows);
		super.setSizes();
	}
	
	
	/**
	 *	Dynamic Init
	 *  @param value value
	 *  @param whereClause where clause
	 */
	
	private void initInfo (int record_id, String value, String whereClause)
	{
		//
		if (!(record_id == 0) && value != null && value.length() > 0)
		{
			log.severe("Received both a record_id and a value: " + record_id + " - " + value);
		}

		//  Set Value and boolean criteria (if any)
		if (!(record_id == 0))
		{
			fieldID = record_id;
		}
		else
		{	
			// Use the value if any
			if (value != null && value.length() > 0)
			{
				fieldBranch.setText(value);
			}
			else
			{
				//  Try to find the context - A_Asset_ID
	        	String aid = Env.getContext(Env.getCtx(), p_WindowNo, "COL_BRANCH_ID");
				if (aid != null && aid.length() != 0)
				{
					fieldID = new Integer(aid).intValue();
				}
				//  COL_BR_REGION_ID
				String rg = Env.getContext(Env.getCtx(), p_WindowNo, "COL_BR_REGION_ID");
				if (rg != null && rg.length() != 0)
				{
					fCOLRegion_ID.setValue(new Integer(rg).intValue());
				}
				//  COL_DISTRICT_ID
				String did = Env.getContext(Env.getCtx(), p_WindowNo, "COL_DISTRICT_ID");
				if (did != null && did.length() != 0)
				{
					fCOLDistrict_ID.setValue(new Integer(did).intValue());
				}
				
				//  COL_TEHSIL_ID
				String sid = Env.getContext(Env.getCtx(), p_WindowNo, "COL_TEHSIL_ID");
				if (sid != null && sid.length() != 0)
				{
					fCOLTehsil_ID_x.setValue(new Integer(sid).intValue());
				}
							
				
			}
		}
	} // initInfo

	
	/*************************************************************************/
	/**
	 *	Construct SQL Where Clause and define parameters.
	 *  (setParameters needs to set parameters)
	 *  Includes first AND
	 *  @return WHERE clause
	 */
	
	@Override
	protected String getSQLWhere() {
		StringBuffer sql = new StringBuffer();
		//  => ID
		if(isResetRecordID())
			fieldID = 0;
		if (!(fieldID == 0))
			sql.append(" AND b.COL_BRANCH_ID = ?");
		//	=> Value
		if (isValidSQLText(fieldBranch))
			sql.append(" AND UPPER(b.BRANCH_NM) LIKE ?");
		
		//	COL_BR_REGION_ID
		Integer COL_BR_REGION_ID = (Integer)fCOLRegion_ID.getValue();
		if (COL_BR_REGION_ID != null)
			sql.append (" AND b.COL_BR_REGION_ID=").append(COL_BR_REGION_ID);
		//	COL_DISTRICT_ID
		Integer COL_DISTRICT_ID = (Integer)fCOLDistrict_ID.getValue();
		if (COL_DISTRICT_ID != null)
			sql.append (" AND b.COL_DISTRICT_ID=").append(COL_DISTRICT_ID);
		
		//COL_TEHSIL_ID
		if (fCOLTehsil_ID_x.getItemCount()>0){
			Integer COL_TEHSIL_ID = Integer.valueOf(fCOLTehsil_ID_x.getValue().toString()); //(Integer)fCOLTehsil_ID_x.getValue();
			if (COL_TEHSIL_ID != null)
				sql.append (" AND b.COL_TEHSIL_ID=").append(COL_TEHSIL_ID);
		}
		
			//
		
		
		return sql.toString();
	} //getSQLWhere

	/**
	 *  Set Parameters for Query
	 *  (as defined in getSQLWhere)
	 *
	 * @param pstmt pstmt
	 * @param forCount for counting records
	 * @throws SQLException
	 */
	
	protected void setParameters(PreparedStatement pstmt, boolean forCount) throws SQLException
	{
		int index = 1;
		//  => ID
		if(!(fieldID ==0))
		{
			pstmt.setInt(index++, fieldID);
			log.fine("Record_ID: " + fieldID);
		}
		//	=> Branch
		if (isValidSQLText(fieldBranch))
		{
			pstmt.setString(index++, getSQLText(fieldBranch));
			log.fine("Value: " + fieldBranch.getText());
		}
		
	} // setParameters
	
	/**
	 *  Save Selection Details
	 *  Get Location/Partner Info
	 */
	
	public void saveSelectionDetail()
	{
		int row = p_table.getSelectedRow();
		
		if (row == -1)
			return;

		//  publish for Callout to read
		
		Integer ID = getSelectedRowKey();
		Env.setContext(Env.getCtx(), p_WindowNo, Env.TAB_INFO, "COL_BRANCH_ID", ID == null ? "0" : ID.toString());
	} // saveSelectionDetail


	/**
	 *	Zoom
	 */
	public void zoom(int record_id)
	{
		log.info( "InfoBranch.zoom");
		Integer A_Asset_ID = record_id;
		
		if (A_Asset_ID == null)
			return;
		
		MQuery query = new MQuery("COL_BRANCH");
		query.addRestriction("COL_BRANCH_ID", MQuery.EQUAL, A_Asset_ID);
		query.setRecordCount(1);
		
		int AD_WindowNo = getAD_Window_ID("COL_BRANCH", true);
		AEnv.zoom(AD_WindowNo, query);
	} // zoom
	//

	/**
	 *	Has Zoom
	 *  @return true
	 */
	
	protected boolean hasZoom()
	{
		return true;
	} // hasZoom
	
	/**
	 *  Load PBartner dependent Order/Invoice/Shipment Field.
	 *  @param COL_District_ID District
	 */
	
	protected void initTehsil (int COL_District_ID)
	{
		log.config("COL_District_ID=" + COL_District_ID);
		KeyNamePair pp = new KeyNamePair(0,"");
		//  load PO Orders - Closed, Completed
		fCOLTehsil_ID_x.removeActionListener(this);
		fCOLTehsil_ID_x.removeAllItems();
		fCOLTehsil_ID_x.addItem(pp);
		
		ArrayList<KeyNamePair> list = loadTehsilData(COL_District_ID);
		for(KeyNamePair knp : list)
			fCOLTehsil_ID_x.addItem(knp);
		
		fCOLTehsil_ID_x.setSelectedIndex(0);
		fCOLTehsil_ID_x.addActionListener(this);

		//initBPDetails(COL_District_ID);
	}   //  initBPartnerOIS

	
	/**
	 * Load Tehsil dependent Distric Field.
	 * @param COL_TEHSIL_ID
	 */
	protected ArrayList<KeyNamePair> loadTehsilData (int COL_TEHSIL_ID)
	{
		ArrayList<KeyNamePair> list = new ArrayList<KeyNamePair>();

		//	Display
		StringBuffer display = new StringBuffer("t.TEHSIL_NM");
		//	.append(DB.TO_CHAR("s.MovementDate", DisplayType.Date, Env.getAD_Language(Env.getCtx())));
		//
		StringBuffer sql = new StringBuffer("SELECT t.COL_TEHSIL_ID,").append(display)
			.append(" FROM COL_TEHSIL t "
			+ "WHERE t.COL_DISTRICT_ID=? AND t.ISACTIVE='Y'");
		try
		{
			PreparedStatement pstmt = DB.prepareStatement(sql.toString(), null);
			pstmt.setInt(1, COL_TEHSIL_ID);
			//pstmt.setInt(2, C_BPartner_ID);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next())
			{
				list.add(new KeyNamePair(rs.getInt(1), rs.getString(2)));
			}
			rs.close();
			pstmt.close();
		}
		catch (SQLException e)
		{
			
			log.log(Level.SEVERE, sql.toString(), e);
		}

		return list;
	}

	
	/**
	 *  Change Listener
	 *  @param e event
	 */
	public void valueChange (ValueChangeEvent e)
	{
		log.config(e.getPropertyName() + "=" + e.getNewValue());

		//  BPartner - load Order/Invoice/Shipment
		if (e.getPropertyName().equals("COL_DISTRICT_ID"))
		{
			int COL_DISTRICT_ID = ((Integer)e.getNewValue()).intValue();
			initTehsil (COL_DISTRICT_ID);
		}
		//v_CreateFromPanel.tableChanged(null);
	}   //  vetoableChange
	
	/**
	 * Show BPartner Info (non modal)
	 * @param WindowNo window no
	 */
	public static void showBranch (int WindowNo,String value)
	{
		InfoBranchPanel info = new InfoBranchPanel (WindowNo, false, 0, "", 
			true, false,   "");
		//(	int WindowNo, boolean modal, int record_id, String value,
		//boolean multiSelection, boolean saveResults, String whereClause)
		AEnv.showWindow(info);
	}   //  showBPartner
	
	
}
