package org.compiere.model;

import java.util.Properties;

import javax.swing.JOptionPane;

public class MPERSON extends X_EW_PERSON {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1020782925565702272L;


	public MPERSON(Properties ctx,int ew_person_ID,String trxName){
		super(ctx,ew_person_ID,trxName);
		
	}
	
	
	protected boolean beforeSave(boolean newRecord){
		log.info("Save button is clicked");
		JOptionPane.showMessageDialog( null, "I was clicked");
		
		return true;
	}

}
