package org.adempiere.webui.apps.form;

import org.adempiere.webui.panel.ADForm;
import org.zkoss.zk.ui.Executions;
import org.zkoss.zk.ui.metainfo.PageDefinition;

public class WDateTime extends ADForm {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void initForm() {
		// TODO Auto-generated method stub
		//Executions.sendRedirect("/zul/date_and_time_picker.zul");
		
		String zulfile = "/zul/myzul/date_and_time_picker.zul"; // Relative to the root
		PageDefinition pageDefintion = Executions.getCurrent().getPageDefinition(zulfile);
		Executions.createComponents(pageDefintion, this, null);
		
		
	}

}
