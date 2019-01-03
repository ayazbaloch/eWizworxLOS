package org.ewizworx.model;

import java.sql.ResultSet;
import java.util.Properties;

import org.compiere.model.Query;
import org.compiere.util.CCache;

import org.compiere.util.Env;
import java.util.List;

public class MCOLLOANACCOUNTACTION extends X_COL_LOANACCOUNTACTION {

	private static final long serialVersionUID = 1L;
	//private static final String whereClause1;
	
	private static final long PROMISE_ACTIVE = 1000010;
	private static final long PROMISE_BROKEN = 1000011;
	private static final long PROMISE_FULL_PAYMENT = 1000019;
	private static final long PROMISE_NSF_PAYMENT = 1000020;
	private static final long PROMISE_OVERPAYMENT = 1000021;
	private static final long PROMISE_UNDERPAYMENT = 1000023;

	private MCOLLOANACCOUNTACTION[]	m_lines = null;
	
	//private int idLoanAccountAction=0;
	
	
	private static final String activePTPWhere="ISACTIVE='Y' AND UPPER(STATUS)='INPROGRESS' " +
								"AND COL_ACTIONTYPE_ID IN ( " +PROMISE_FULL_PAYMENT +"," +
															PROMISE_NSF_PAYMENT + "," +
															PROMISE_OVERPAYMENT + "," +
															PROMISE_UNDERPAYMENT + ") " +
								"AND COL_LOANACCOUNT_ID=? AND STATUS='" + STATUS_Inprogress + "'";
								
	public MCOLLOANACCOUNTACTION(Properties ctx, int COL_LOANACCOUNTACTION_ID,
			String trxName) {
		super(ctx, COL_LOANACCOUNTACTION_ID, trxName);
	}
	
	public MCOLLOANACCOUNTACTION(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
		
	}
	
	/**************************************************************************
	 * 	Before Save
	 *  Check is OneActivePTP
	 *  Allow Action of PTPActive or PTPBroken when PTP inprogress then closeActivePTP
	 *	@param newRecord new
	 *	@return save
	 */
	protected boolean beforeSave (boolean newRecord)
	{
		int COL_ACTIONTYPE_ID=getCOL_ACTIONTYPE_ID ();
		String status= getStatus ();
		MCOLLOANACCOUNTACTION activePTP=getActivePTP(getCOL_LOANACCOUNT_ID());
		
		//Validate PTP, make sure one PTP should be active at one time, 
		//code must belong to PTP and status is inprogress
		if ((COL_ACTIONTYPE_ID>=PROMISE_FULL_PAYMENT && COL_ACTIONTYPE_ID<=PROMISE_UNDERPAYMENT) && status.equals("Inprogress") && activePTP!=null){
			log.saveError("PTP","PTP already active, multi active PTP are not allowed.");
		    return false;
		}
						
		
		if ((getACTIONMODE().equals(ACTIONMODE_Action)) && getStatus().equals(STATUS_Inprogress))
			setStatus(STATUS_Complete);
		
		
		//Auto mark Complete when Actions could be PTP Active/PTP Broken
		if ((COL_ACTIONTYPE_ID==PROMISE_ACTIVE || COL_ACTIONTYPE_ID==PROMISE_BROKEN) && newRecord){
			if (activePTP!=null){
				activePTP.setStatus(STATUS_Complete);
				activePTP.save();
				//setStatus(STATUS_Complete);
			}
				
			else{
				log.saveError("Action","PTP active/broken action is not allowed without PTP contact");
				return false;
			}
		}
		
		COL_ACTIONTYPE_ID=(Integer)get_Value(COLUMNNAME_COL_ACTIONTYPE_ID);
		
		if ((COL_ACTIONTYPE_ID>=PROMISE_FULL_PAYMENT && COL_ACTIONTYPE_ID<=PROMISE_UNDERPAYMENT) || (COL_ACTIONTYPE_ID==PROMISE_ACTIVE || COL_ACTIONTYPE_ID==PROMISE_BROKEN)){
			setProcessed(true);
		}
		
		/*
		COL_ACTIONTYPE_ID=(Integer)get_ValueOld(COLUMNNAME_COL_ACTIONTYPE_ID);
		if (COL_ACTIONTYPE_ID==PROMISE_ACTIVE || COL_ACTIONTYPE_ID==PROMISE_BROKEN) {
			
			log.saveError("PTP","Can't change Promise active/Broken action.");
		    return false;
		}
		*/
					
		return true;
	} //	beforeSave
	
	protected boolean afterSave(boolean newRecord, boolean success){
		
		return true;
	}
	
	
	public static MCOLLOANACCOUNTACTION getActivePTP(int COL_LOANACCOUNT_ID){
			MCOLLOANACCOUNTACTION action = new Query(Env.getCtx(), MCOLLOANACCOUNTACTION.Table_Name, activePTPWhere, null)
			  .setParameters(new Object[]{COL_LOANACCOUNT_ID})
	 		  .firstOnly();	
			return action;
	}

	
	
	/**
	 * 	Get Loan Account Action line
	 * 	@param ctx context
	 * 	@param COL_LOANACCOUNT_ID Loan Account id
	 *	@return array of LoanAccountAction
	 */
	
	public MCOLLOANACCOUNTACTION[] getLines (boolean requery)
	{
		
		if (m_lines != null && !requery) {
			set_TrxName(m_lines, get_TrxName());
			return m_lines;
		}
		
		final String whereClause = I_COL_LOANACCOUNTACTION.COLUMNNAME_COL_LOANACCOUNT_ID+"=?";
		List <MCOLLOANACCOUNTACTION> list = new Query(getCtx(),I_COL_LOANACCOUNTACTION.Table_Name,  whereClause,  get_TrxName())
		.setParameters(getCOL_LOANACCOUNT_ID())
		.setOrderBy("COL_LOANACCOUNTACTION_ID")
		.list();
		
		m_lines = new MCOLLOANACCOUNTACTION[list.size ()];
		
		//for(MCOLLOANACCOUNTACTION action : list)
		//{
		  //log.saveError("AYAZ",action.getDescription() );
			
		  //action.setDescription("AYAZ");
		  //action.save();
		  // do some processing here
		//}
		
		list.toArray (m_lines);
		return m_lines;			
	 
	}	//	getLastActivePTP
	
	
	
	
	/**	Cache						*/
	private static CCache<Integer,MCOLLOANACCOUNTACTION> s_cache = 
		new CCache<Integer,MCOLLOANACCOUNTACTION> ("COL_LOANACCOUNTACTION", 3);
	
	/**
	 * 	Get MBank from Cache
	 *	@param ctx context
	 *	@param C_Bank_ID id
	 *	@return MBank
	 */
	public static MCOLLOANACCOUNTACTION get (Properties ctx, int COL_LOANACCOUNTACTION_ID)
	{
		Integer key = new Integer (COL_LOANACCOUNTACTION_ID);
		MCOLLOANACCOUNTACTION retValue = (MCOLLOANACCOUNTACTION)s_cache.get (key);
		if (retValue != null)
			return retValue;
		retValue = new MCOLLOANACCOUNTACTION (ctx, COL_LOANACCOUNTACTION_ID, null);
		if (retValue.get_ID() != 0)
			s_cache.put (key, retValue);
		
		
		return retValue;
	} //	get
	
	
	
	
	
	

}
