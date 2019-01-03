package org.ewizworx.model;

//import javax.swing.JOptionPane;


import org.adempiere.webui.part.WindowContainer;


//import org.compiere.apps.AEnv;
//import org.compiere.apps.AWindow;

import org.compiere.model.MClient;
import org.compiere.model.ModelValidationEngine;
import org.compiere.model.ModelValidator;
import org.compiere.model.PO;
import org.compiere.util.CLogger;
import org.compiere.util.Env;
//import org.compiere.util.Env;


import compiere.model.MyValidator;

public class CARSModelValidator implements ModelValidator {

	/**	Logger			*/
	private static CLogger log = CLogger.getCLogger(MyValidator.class);
	/** Client			*/
	private int		m_AD_Client_ID = -1;
	/** User	*/
	//private int		m_AD_User_ID = -1;
	/** Role	*/
	//private int		m_AD_Role_ID = -1;
	
	protected WindowContainer windowContainer;
	
	public void initialize(ModelValidationEngine engine, MClient client) {
		//client = null for global validator
		if (client != null) {	
			m_AD_Client_ID = client.getAD_Client_ID();
			log.info(client.toString());
		}
		else  {
			log.info("Initializing global validator: "+this.toString());
		}
		
	}

	@Override
	public int getAD_Client_ID() {
		return m_AD_Client_ID;
		
	}

	
	public String login(int AD_Org_ID, int AD_Role_ID, int AD_User_ID) {
		//boolean ok=false;
		//ok=openDelinquencySummary();
		
		/*MQuery query=new MQuery("C_Invoice");
		query.setRecordCount(1);
		query.addRestriction("C_Invoice_ID", "=", 0 );
		AEnv.zoom(183,query);
		*/
		
		log.info("");
		Env.reset(false);	// not final
		return "Cache Reset";
			 
		//}
		//JOptionPane.showMessageDialog(null, "Login Successfully");
		//return null;
	}

	@Override
	public String modelChange(PO po, int type) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String docValidate(PO po, int timing) {
		// TODO Auto-generated method stub
		return null;
	}
	
	/*
	private boolean openDelinquencySummary(){
		  //** AD_Window_ID of Delinquency Summary window 
		  final int DELINQUENCY_SUMMARY_WINDOW_ID = 1000041;
		  final AWindow poFrame= new AWindow(); 
		  final boolean ok = poFrame.initWindow(DELINQUENCY_SUMMARY_WINDOW_ID, null);  
		  if (ok){
			  poFrame.pack(); 
			  poFrame.setAlwaysOnTop(true);
			  AEnv.showCenterScreen(poFrame);
			  return true;
			  
		  }
		  return false;
		}
		
	*/
	
	

	
	
	

}
