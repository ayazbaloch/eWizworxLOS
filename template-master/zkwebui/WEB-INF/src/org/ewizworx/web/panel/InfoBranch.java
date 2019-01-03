package org.ewizworx.web.panel;

import org.adempiere.webui.panel.InfoBranchPanel;
//import org.adempiere.webui.panel.InfoGeneralPanel;
import org.adempiere.webui.panel.InfoPanel;
import org.adempiere.webui.panel.InfoPanelFactory;

public class InfoBranch implements InfoPanelFactory {
	 InfoPanel info = null;
	@Override
	public InfoPanel create(int WindowNo, boolean modal, String tableName, String keyColumn, int record_id,
			String value, boolean multipleSelection, boolean saveResults, String whereClause) {
		// TODO Auto-generated method stub
		org.adempiere.webui.window.FDialog.ask(1,null,"Are you sure to save these data ?");
		if (tableName.equals("COL_BRANCH"))
        	info = new InfoBranchPanel (WindowNo, modal, record_id, value,
        			multipleSelection, saveResults, whereClause);
        
       
		 return info;
	}
	
	
	InfoBranch(){
		org.adempiere.webui.window.FDialog.ask(1,null,"Are you sure to save these data ?");
		
	}
	

}
