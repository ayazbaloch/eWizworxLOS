package org.ewizworx.model;

import java.sql.ResultSet;
import java.util.Properties;

import org.compiere.model.Query;

public class MLOSLead extends X_LOS_Lead {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5631479337114784081L;

	public MLOSLead(Properties ctx, int LOS_Lead_ID, String trxName) {
		super(ctx, LOS_Lead_ID, trxName);
		// TODO Auto-generated constructor stub
	}

	public MLOSLead(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
		// TODO Auto-generated constructor stub
	}
	
	
	protected boolean beforeSave (boolean newRecord){
		
		return true;
		
	}
	
	

}
