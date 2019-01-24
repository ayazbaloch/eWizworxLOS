package org.ewizworx.web.panel;

import org.adempiere.webui.panel.InfoPurposePanel;
//import org.adempiere.webui.panel.InfoGeneralPanel;
import org.adempiere.webui.panel.InfoPanel;
import org.adempiere.webui.panel.InfoPanelFactory;

public class InfoPurpose implements InfoPanelFactory {
	 InfoPanel info = null;
	@Override
	public InfoPanel create(int WindowNo, boolean modal, String tableName, String keyColumn, int record_id,
			String value, boolean multipleSelection, boolean saveResults, String whereClause) {
		// TODO Auto-generated method stub
		org.adempiere.webui.window.FDialog.ask(1,null,"Are you sure to save these data ?");
		if (tableName.equals("LOS_PURPOSE"))
        	info = new InfoPurposePanel (WindowNo, modal, record_id, value,
        			multipleSelection, saveResults, whereClause);
        
       
		 return info;
	}
	
}
