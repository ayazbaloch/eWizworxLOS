package org.adempiere.webui.apps.form;

import org.adempiere.webui.component.*;
import org.adempiere.webui.editor.WAccountEditor;
import org.adempiere.webui.panel.ADForm;
import org.zkoss.zk.ui.Component;
import org.zkoss.zkex.zul.Borderlayout;
import org.zkoss.zkex.zul.Center;
import org.zkoss.zkex.zul.North;
import org.zkoss.zul.Intbox;
import org.zkoss.zul.Space;

public class WSampleWebUIWindow extends ADForm {
	
	private Tabbox tbBox=new Tabbox();
	private Tabs tbs=new Tabs();
	private Tab tb1=new Tab("Tab1");
	private Tab tb2=new Tab("Tab2");
	
	private Tabpanels tbpns=new Tabpanels();
	private Tabpanel tbpn1=new Tabpanel();
	
	
	
	private Panel mainPanel = new Panel();
	private Borderlayout mainBorderLayout = new Borderlayout();
	private Panel northPanel = new Panel();
	private Panel centerPanel = new Panel();
	private Grid cGridLayout = GridFactory.newGridLayout();
	
	
	private North north=new North();
	private Center center = new Center();
	
	private Label luserName=new Label("User Name");
	private Textbox tuserName=new Textbox();
	
	private Label lpassword=new Label("Password");
	private Textbox tpassword=new Textbox();
	
	private Label lrePassword=new Label("Re-Type Password");
	private Textbox trePassword=new Textbox();
	
	private Label lage=new Label("Age");
	private Intbox tage=new Intbox(0);
	
	private Label lDOB=new Label("Birth date");
	private Datebox tDOB=new Datebox();
	
	private Label lcombobox=new Label("Combo Box");
	private Combobox combobox=new Combobox();
	
	
	/**
	 * Generated serial number
	 */
	private static final long serialVersionUID = 7328729344548442180L;


	protected void initForm() {

        //Button but = new Button("Test Button");
        //this.appendChild(but );
		zkInit();
	}
	
	/**
	 *	Static Init
	 *  @throws Exception
	 */
	private void zkInit()
	{
		//Form
		//---TabBox
		//---------Tabs
		//-------------tb1
		//-------------tb2
		//---------Tabspanels
		//-------------------tbpn1
		//------------------------mainPanel
		//--------------------------------mainBorderLayout
		//------------------------------------------------center
		//-----------------------------------------------------centerPanel
		//----------------------------------------------------------------cGridLayout
		//------------------------------------------------north
		
		
		
		
		//Form
				//---TabBox
				//---------Tabs
				//-------------tb1
				//-------------tb2
				//---------Tabspanels
				//-------------------tbpn1
				//------------------------mainPanel
				//---------------------------------cGridLayout
				
		
		
		tbBox.appendChild(tbs);
		tbs.appendChild(tb1);
		tbs.appendChild(tb2);
		
		tbBox.appendChild(tbpns);
		tbpns.appendChild(tbpn1);
		
		tbpn1.appendChild(mainPanel);
		
		this.appendChild(tbBox);
		
		
		/*
		mainPanel.appendChild(mainBorderLayout);
		mainPanel.setStyle("width: 100%; height: 100%; padding: 0; margin: 0");
		mainBorderLayout.setHeight("90%");
		mainBorderLayout.setWidth("90%");
		
		
		north.setCollapsible(true);
		north.setSplittable(true);
		north.setSize("20%");
		
		mainBorderLayout.appendChild(center);
		mainBorderLayout.appendChild(north);
		center.appendChild(centerPanel);
		
		setTitle("This is Title");
		*/
	
		Rows rows = cGridLayout.newRows();
		Row row = rows.newRow();
		
		row.appendChild(luserName.rightAlign());
		row.appendChild(tuserName);
		//row.appendChild(new Space());
		//row.appendChild(new Space());
		
		//row=rows.newRow();
		row.appendChild(lpassword.rightAlign());
		row.appendChild(tpassword);
		
		//row=rows.newRow();
		row.appendChild(lrePassword.rightAlign());
		row.appendChild(trePassword);
		
		row=rows.newRow();
		row.appendChild(lage.rightAlign());
		row.appendChild(tage);
		
		row=rows.newRow();
		row.appendChild(lDOB.rightAlign());
		row.appendChild(tDOB);
		
		row=rows.newRow();
		row.appendChild(lcombobox);
		row.appendChild(combobox);
		
		//centerPanel.appendChild(cGridLayout);
		mainPanel.appendChild(cGridLayout);
		
		
	}
}
