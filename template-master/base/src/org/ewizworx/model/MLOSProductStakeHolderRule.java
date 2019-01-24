package org.ewizworx.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.logging.Level;
import org.compiere.model.Query;
import org.compiere.util.CCache;
import org.compiere.util.CLogger;
import org.compiere.util.DB;


/**
 *	LOS Product Stakeholder Model (Value Object)
 *
 *  @author 	Ayaz Baloch
 *  @version 	$Id: MLOSProductStakeHolderRule.java,v 1.0 2019/01/24 00:58:18
 *    
 */

public class MLOSProductStakeHolderRule extends X_LOS_ProductStakeHolderRule {
	
	/**	Cache						*/
	private static CCache<String,MLOSProductStakeHolderRule> s_cache	= new CCache<String,MLOSProductStakeHolderRule>(Table_Name, 40, 5);	//	5 minutes
	/**	Static Logger					*/
	private static CLogger		s_log = CLogger.getCLogger (MLOSProductStakeHolderRule.class);
	//private static CCache<Integer,MProduct> s_cache	= new CCache<Integer,MProduct>(Table_Name, 40, 5);	//	5 minutes
	
	public MLOSProductStakeHolderRule(Properties ctx, int LOS_ProductStakeHolderRule_ID, String trxName) {
		super(ctx, LOS_ProductStakeHolderRule_ID, trxName);
		// TODO Auto-generated constructor stub
	}

	public MLOSProductStakeHolderRule(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
		// TODO Auto-generated constructor stub
	}
	
	
	/**
	 * 	Load Rules.
	 *	@param ctx context
	 */
	private static void loadAllStakeholderRule (Properties ctx)
	{
		
		//
		//s_cache = new CCache<String,MLOSProductStakeHolderRule>("C_Country", 250);
		String sql = "SELECT * FROM LOS_ProductStakeHolderRule WHERE IsActive='Y'";
		String key="";
		try
		{
			Statement stmt = DB.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next())
			{
				MLOSProductStakeHolderRule r = new MLOSProductStakeHolderRule (ctx, rs, null);
				key=r.getBUSINESSSIGMENT()+"_"+r.getLOS_LOANENTITYTYPE_ID()+"_"+r.getSTAKEHOLDERTYPE();
				
				s_cache.put(String.valueOf(key), r);
				
			}
			rs.close();
			stmt.close();
		}
		catch (SQLException e)
		{
			s_log.log(Level.SEVERE, sql, e);
		}
		
	}	//	loadAllStakeholderRule
	
	/**
	 * 	Get StakeholderRule from (cached) using key (BusinessSigment+LoanEntityType+StakeholderType
	 * 	@param ctx context
	 *	@param C_Country_ID ID
	 *	@return Country
	 */
	public static MLOSProductStakeHolderRule get (Properties ctx, String key)
	{
		int LOS_ProductStakeHolderRule_ID;
		
		if (s_cache == null || s_cache.size() == 0)
			loadAllStakeholderRule(ctx);
		//String key = String.valueOf(C_Country_ID);
		MLOSProductStakeHolderRule r = (MLOSProductStakeHolderRule)s_cache.get(key);
		if (r != null)
			return r;
		
		LOS_ProductStakeHolderRule_ID=getIDByKey(ctx,key);
		
		r = new MLOSProductStakeHolderRule (ctx, LOS_ProductStakeHolderRule_ID, null);
		if (r.getLOS_ProductStakeHolderRule_ID()== LOS_ProductStakeHolderRule_ID)
		{
			s_cache.put(key, r);
			return r;
		}
		return null;
	}	//	get
	
	/**
	 * 	Get StakeholderRule using ID
	 *	@param ctx Context
	 *	@param ISOcode	Iso code
	 *	@return MCountry
	 */
	public static MLOSProductStakeHolderRule get (Properties ctx, int LOS_ProductStakeHolderRule_ID)
	{

		MLOSProductStakeHolderRule retValue = null;
		//	Try database
		Query query = new Query(ctx, I_LOS_ProductStakeHolderRule.Table_Name, "LOS_ProductStakeHolderRule_ID=?", null);
		query.setParameters(LOS_ProductStakeHolderRule_ID);
		retValue = (MLOSProductStakeHolderRule)query.firstOnly();
		
		return retValue;
	}
	
	
	private static int getIDByKey(Properties ctx,String key){
		String where;
		where="BUSINESSSIGMENT || '_' || LOS_LOANENTITYTYPE_ID || '_' || STAKEHOLDERTYPE";
		
		MLOSProductStakeHolderRule retValue = null;
		//	Try database
		Query query = new Query(ctx, I_LOS_ProductStakeHolderRule.Table_Name, where + "=?", null);
		query.setParameters(key);
		retValue = (MLOSProductStakeHolderRule)query.firstOnly();
		
		if (retValue!=null)
			return retValue.getLOS_ProductStakeHolderRule_ID();
		return 0;
	}
	

}
