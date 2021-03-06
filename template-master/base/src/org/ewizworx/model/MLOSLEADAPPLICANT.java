package org.ewizworx.model;

import java.sql.ResultSet;
import java.util.Properties;

import org.adempiere.exceptions.AdempiereException;
import org.compiere.model.MInvoice;
import org.compiere.model.MProduct;
import org.compiere.model.POResultSet;
import org.compiere.model.Query;
import org.compiere.util.DB;
import org.compiere.util.Msg;

public class MLOSLEADAPPLICANT extends X_LOS_LEADAPPLICANT {

	/**
	 * 
	 */
	/** Parent						*/
	private MLOSLead	m_parent = null;
	
	MLOSLead lead=new MLOSLead(getCtx(),getLOS_Lead_ID(), get_TrxName());
	
	private static final long serialVersionUID = -4815528038360243228L;

	public MLOSLEADAPPLICANT(Properties ctx, int LOS_LEADAPPLICANT_ID, String trxName) {
		super(ctx, LOS_LEADAPPLICANT_ID, trxName);
		// TODO Auto-generated constructor stub
	}

	public MLOSLEADAPPLICANT(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
		// TODO Auto-generated constructor stub
	}
	
	
	/**
	 * 	Get Parent
	 *	@return parent
	 */
	public MLOSLead getParent()
	{
		if (m_parent == null)
			m_parent = new MLOSLead(getCtx(), getLOS_Lead_ID(), get_TrxName());
		return m_parent;
	}	//	getParent
	
	protected boolean beforeSave (boolean newRecord){
		
		String key;
		key=getParent().getBUSINESSSIGMENT()+ "_" + getParent().getLOS_LOANENTITYTYPE_ID()+ "_" + getSTAKEHOLDERTYPE();
		
		
		MLOSProductStakeHolderRule rule=MLOSProductStakeHolderRule.get(getCtx(), key);
		if (rule==null){
			log.saveError("Error", "No Rule define for " + getParent().getBUSINESSSIGMENT());
			return false;
		}
		
		int cnt;
		//if (newRecord)
		//	cnt=getStakeholderCount()+1;
		//else
			cnt=getStakeholderCount();
		
		if (cnt >= rule.getMaxValue()){
			log.saveError("Error", "Not allowed more than " + String.valueOf(cnt) + " " + getSTAKEHOLDERTYPE());
			//throw new AdempiereException("Not allowed more than " + String.valueOf(cnt) + " " + getSTAKEHOLDERTYPE());
			return false;
		}
		
		
		
		
		
		
		return true;//isValidApplicantRange(key);
		
	}
	
	public boolean isValidApplicantRange(String key){
		int cnt;
		MLOSProductStakeHolderRule rule=MLOSProductStakeHolderRule.get(getCtx(), key);
		if (rule==null){
			log.saveError("Error", "No Rule define for " + getParent().getBUSINESSSIGMENT());
			return false;
		}
		
		cnt=getStakeholderCount();
		
		if (cnt >= rule.getMaxValue()){
			log.saveError("Error", "Not allowed more than " + String.valueOf(cnt) + " " + getSTAKEHOLDERTYPE());
			return false;
		}
		
		
		return true;
	}
	
	private boolean hasConsumerBorrower(boolean newRecord){
			
		if (getParent().getBUSINESSSIGMENT().equals(X_LOS_Lead.BUSINESSSIGMENT_Consumer) && getParent().getLOS_LOANENTITYTYPE_ID()== 1000001 && getSTAKEHOLDERTYPE().equals(STAKEHOLDERTYPE_Borrower)){
		
			
			StringBuilder whereClause = new StringBuilder();
			whereClause.append(" LOS_Lead_ID=?");
			whereClause.append(" AND LOS_LEADAPPLICANT_ID<>?");
			whereClause.append(" AND STAKEHOLDERTYPE='Borrower'");       

			POResultSet<MLOSLEADAPPLICANT> rs = new Query(getCtx(), I_LOS_LEADAPPLICANT.Table_Name, whereClause.toString(), null)
			 		//.setParameters(getLOS_Lead_ID())
					 .setParameters(new Object[]{getLOS_Lead_ID(), (newRecord) ? 0 : getLOS_LEADAPPLICANT_ID()})
			 		.scroll();

			 //Applicant exists
			 if (rs.hasNext()){
				 //log.saveError("Error", "Not allowed more than 1 applicant for Individual type.");
				 return true;
			 }
				
		}
		
		return false;
	}
	
	/**
	 * 	Get stakeholder count
	 *  @return count
	 */
	private int getStakeholderCount(){
		String sql;
		sql="SELECT COUNT(*) FROM " + Table_Name + " WHERE LOS_LEAD_ID=? AND STAKEHOLDERTYPE=?";
		int count = DB.getSQLValue(get_TrxName(), sql, getLOS_Lead_ID(),getSTAKEHOLDERTYPE());
		return count;
	}
	
	
	
	

}
