package org.ewizworx.model;

import java.sql.ResultSet;
import java.util.Properties;


public class MEWGENDER extends X_EW_GENDER {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4935842559508470076L;

	public MEWGENDER(Properties ctx, int EW_GENDER_ID, String trxName) {
		super(ctx, EW_GENDER_ID, trxName);
		// TODO Auto-generated constructor stub
	}
	
	public MEWGENDER(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
		// TODO Auto-generated constructor stub
	}


	protected boolean beforeSave (boolean newRecord){
		//log.log(null,"Test message for Gender Model");
		//log.fine("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
		//log.info("xxxxxxxxxxxxxxxxxxxxxxxxxx");
		log.severe("ddddddddddddddddddddddddd");
		
		//mTab.fireDataStatusEEvent ("NoQtyAvailable", "0", true); 
		return false;
	} 
	

}
