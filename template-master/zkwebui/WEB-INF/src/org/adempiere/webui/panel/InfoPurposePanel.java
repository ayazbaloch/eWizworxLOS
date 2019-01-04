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
import org.ewizworx.model.I_LOS_PURPOSECATEGORY;
//import org.jfree.text.TextBox;
import org.zkoss.zk.ui.event.EventListener;
import org.zkoss.zk.ui.event.Events;

public class InfoPurposePanel extends InfoPanel implements ValueChangeListener, EventListener {

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
	public InfoPurposePanel(	int WindowNo, int record_id, String value,
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
	
	public InfoPurposePanel(	int WindowNo, boolean modal, int record_id, String value,
			boolean multiSelection, boolean saveResults, String whereClause)
	{
		super (WindowNo, modal, "p", "LOS_PURPOSE_ID", multiSelection, saveResults, whereClause);
		
		
		log.info(value + ", ID=" + record_id + ", WHERE=" + whereClause);
		setTitle(Msg.getMsg(Env.getCtx(), "InfoLoanPurpose"));
		//
		StringBuffer where = new StringBuffer();
		where.append("p.IsActive='Y'");
		if (whereClause != null && whereClause.length() > 0)
			where.append(" AND ").append(whereClause);
		setWhereClause(where.toString());
		setTableLayout(s_Layout);
		setFromClause(s_From);
		setOrderClause("p.PURPOSE");
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
	private static String s_From = "LOS_PURPOSE p"
			+ " INNER JOIN LOS_PURPOSECATEGORY c"
			+ " ON p.LOS_PURPOSECATEGORY_ID=c.LOS_PURPOSECATEGORY_ID"
			+ " LEFT JOIN LOS_PURPOSESUBCATEGORY s"
			+ " ON p.LOS_PURPOSESUBCATEGORY_ID=s.LOS_PURPOSESUBCATEGORY_ID";
	
	/**  Array of Column Info    */
	private static final ColumnInfo[] s_Layout = {
		new ColumnInfo(" ", "p.LOS_PURPOSE_ID", IDColumn.class),
		new ColumnInfo(Msg.translate(Env.getCtx(), "Purpose Category"), "c.LOS_PURPOSECATEGORY", String.class),
		new ColumnInfo(Msg.translate(Env.getCtx(), "Purpose Sub-Category"), "s.LOS_PURPOSESUBCATEGORY", String.class),
		new ColumnInfo(Msg.translate(Env.getCtx(), "Purpose"), "p.PURPOSE", String.class)
	};
	
	
	private int fieldID = 0;
	
	private WTableDirEditor fLOSCtegory;
	private Textbox fieldPurpose = new Textbox();
	
	
	
	
	//private Listbox fLOSSubCategory = ListboxFactory.newDropdownListbox();
	private Listbox fLOSSubCategory ;

	
	private Label labelPurpose = new Label();
	private Label labelSubCategory = new Label();
	
	
	
	
	/**
	 *	Static Setup - add fields to parameterPanel
	 */
	
	private void statInit()
	{
		fieldPurpose.setWidth("100%");
		
		
		labelSubCategory.setValue(Msg.getMsg(Env.getCtx(), "Sub-Category"));
		
		
		
		labelPurpose.setValue(Msg.getMsg(Env.getCtx(), "Purpose"));
		fieldPurpose.addEventListener(Events.ON_CANCEL, this);
		fieldPurpose.setAttribute("zk_component_ID", "Lookup_Criteria_fieldPurpose");
		
		//fieldRefCode.addEventListener(Events.ON_CANCEL, this);
		//fieldRefCode.setAttribute("zk_component_ID", "Lookup_Criteria_fieldRefCode");
		
		// From COL_BRANCH.
		
		/* this line review after model file generation
		fCOLRegion_ID = new WTableDirEditor(I_COL_BRANCH.COLUMNNAME_COL_BR_REGION_ID, false, false, true,
				MLookupFactory.get (Env.getCtx(), p_WindowNo, 0, 
						MColumn.getColumn_ID(I_COL_BRANCH.Table_Name,I_COL_BRANCH.COLUMNNAME_COL_BR_REGION_ID ), 
						DisplayType.Table));
		*/
		
		fLOSCtegory = new WTableDirEditor(I_LOS_PURPOSECATEGORY.COLUMNNAME_LOS_PURPOSECATEGORY_ID, false, false, true,
				MLookupFactory.get (Env.getCtx(), p_WindowNo, 0, 
						MColumn.getColumn_ID(I_LOS_PURPOSECATEGORY.Table_Name,I_LOS_PURPOSECATEGORY.COLUMNNAME_LOS_PURPOSECATEGORY_ID), 
						DisplayType.Table));
		
		org.adempiere.webui.window.FDialog.ask(1,null,"Are you sure to save these data ?");
		
		fLOSCtegory.addValueChangeListener(this);
		fLOSCtegory.getComponent().setAttribute("zk_component_ID", "Lookup_Criteria_fLOSCtegory");
		fLOSCtegory.setLabel("Region");
		
		
		
		fLOSSubCategory = ListboxFactory.newDropdownListbox();
		fLOSSubCategory.setAttribute("zk_component_ID", "Lookup_Criteria_fCOLTehsil_ID");
		fLOSSubCategory.setWidth("100%");
		
		
		Rows rows = new Rows();
		
		Row row = new Row();
		rows.appendChild(row);
		//row.appendChild(labelRegion);
		row.appendChild(fLOSCtegory.getLabel().rightAlign());
		row.appendChild(fLOSCtegory.getComponent());
		
		row.appendChild(labelPurpose.rightAlign());
		row.appendChild(fieldPurpose);
		
		row.appendChild(labelSubCategory.rightAlign());
		row.appendChild(fLOSSubCategory);
		
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
				fieldPurpose.setText(value);
			}
			else
			{
				//  Try to find the context - LOS_PURPOSE_ID
	        	String aid = Env.getContext(Env.getCtx(), p_WindowNo, "LOS_PURPOSE_ID");
				if (aid != null && aid.length() != 0)
				{
					fieldID = new Integer(aid).intValue();
				}
				//  LOS_PURPOSECATEGORY_ID
				String rg = Env.getContext(Env.getCtx(), p_WindowNo, "LOS_PURPOSECATEGORY_ID");
				if (rg != null && rg.length() != 0)
				{
					fLOSCtegory.setValue(new Integer(rg).intValue());
				}
				
				
				//  LOS_PURPOSESUBCATEGORY_ID
				String sid = Env.getContext(Env.getCtx(), p_WindowNo, "LOS_PURPOSESUBCATEGORY_ID");
				if (sid != null && sid.length() != 0)
				{
					fLOSSubCategory.setValue(new Integer(sid).intValue());
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
			sql.append(" AND b.LOS_PURPOSE_ID = ?");
		//	=> Value
		if (isValidSQLText(fieldPurpose))
			sql.append(" AND UPPER(p.PURPOSE) LIKE ?");
		
		//	LOS_PURPOSECATEGORY_ID
		Integer LOS_PURPOSECATEGORY_ID = (Integer)fLOSCtegory.getValue();
		if (LOS_PURPOSECATEGORY_ID != null)
			sql.append (" AND c.LOS_PURPOSECATEGORY_ID=").append(LOS_PURPOSECATEGORY_ID);
		
		
		//LOS_PURPOSESUBCATEGORY_ID
		if (fLOSSubCategory.getItemCount()>0){
			Integer LOS_PURPOSESUBCATEGORY_ID = Integer.valueOf(fLOSSubCategory.getValue().toString()); //(Integer)fLOSSubCategory.getValue();
			if (LOS_PURPOSESUBCATEGORY_ID != null)
				sql.append (" AND s.LOS_PURPOSESUBCATEGORY_ID=").append(LOS_PURPOSESUBCATEGORY_ID);
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
		if (isValidSQLText(fieldPurpose))
		{
			pstmt.setString(index++, getSQLText(fieldPurpose));
			log.fine("Value: " + fieldPurpose.getText());
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
		Env.setContext(Env.getCtx(), p_WindowNo, Env.TAB_INFO, "LOS_PURPOSE_ID", ID == null ? "0" : ID.toString());
	} // saveSelectionDetail


	/**
	 *	Zoom
	 */
	public void zoom(int record_id)
	{
		log.info( "InfoLoanPurpose.zoom");
		Integer A_Asset_ID = record_id;
		
		if (A_Asset_ID == null)
			return;
		
		MQuery query = new MQuery("LOS_PURPOSE");
		query.addRestriction("LOS_PURPOSE_ID", MQuery.EQUAL, A_Asset_ID);
		query.setRecordCount(1);
		
		int AD_WindowNo = getAD_Window_ID("LOS_PURPOSE", true);
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
	
	protected void initTehsil (int LOS_PURPOSESUBCATEGORY_ID)
	{
		log.config("LOS_PURPOSESUBCATEGORY_ID=" + LOS_PURPOSESUBCATEGORY_ID);
		KeyNamePair pp = new KeyNamePair(0,"");
		//  load PO Orders - Closed, Completed
		fLOSSubCategory.removeActionListener(this);
		fLOSSubCategory.removeAllItems();
		fLOSSubCategory.addItem(pp);
		
		ArrayList<KeyNamePair> list = loadTehsilData(LOS_PURPOSESUBCATEGORY_ID);
		for(KeyNamePair knp : list)
			fLOSSubCategory.addItem(knp);
		
		fLOSSubCategory.setSelectedIndex(0);
		fLOSSubCategory.addActionListener(this);

		//initBPDetails(COL_District_ID);
	}   //  initBPartnerOIS

	
	/**
	 * Load Tehsil dependent Distric Field.
	 * @param LOS_PURPOSESUBCATEGORY_ID
	 */
	protected ArrayList<KeyNamePair> loadTehsilData (int LOS_PURPOSESUBCATEGORY_ID)
	{
		ArrayList<KeyNamePair> list = new ArrayList<KeyNamePair>();

		//	Display
		StringBuffer display = new StringBuffer("s.LOS_PURPOSESUBCATEGORY");
		//	.append(DB.TO_CHAR("s.MovementDate", DisplayType.Date, Env.getAD_Language(Env.getCtx())));
		//
		StringBuffer sql = new StringBuffer("SELECT s.LOS_PURPOSESUBCATEGORY_ID,").append(display)
			.append(" FROM LOS_PURPOSESUBCATEGORY s "
			+ "WHERE s.LOS_PURPOSECATEGORY_ID=? AND s.ISACTIVE='Y'");
		try
		{
			PreparedStatement pstmt = DB.prepareStatement(sql.toString(), null);
			pstmt.setInt(1, LOS_PURPOSESUBCATEGORY_ID);
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
		InfoPurposePanel info = new InfoPurposePanel (WindowNo, false, 0, "", 
			true, false,   "");
		//(	int WindowNo, boolean modal, int record_id, String value,
		//boolean multiSelection, boolean saveResults, String whereClause)
		AEnv.showWindow(info);
	}   //  showBPartner
	
	
}
