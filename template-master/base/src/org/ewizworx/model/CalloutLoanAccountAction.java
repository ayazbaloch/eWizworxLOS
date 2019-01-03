package org.ewizworx.model;

import java.util.Properties;

import org.compiere.model.CalloutEngine;
import org.compiere.model.GridField;
import org.compiere.model.GridTab;
import org.compiere.util.Env;

public class CalloutLoanAccountAction extends CalloutEngine {
	
	private  int PROMISE_ACTIVE = 1000010;
	private  int PROMISE_BROKEN = 1000011;
	
	//private  int PROMISE_FULL_PAYMENT = 1000019;
	//private  int PROMISE_NSF_PAYMENT = 1000020;
	//private  int PROMISE_OVERPAYMENT = 1000021;
	//private  int PROMISE_UNDERPAYMENT = 1000023;

	/**
	 *	completePTP.
	 *		- called from COL_ACTIONTYPE
	 *		- sets Status
	 *	@param ctx context
	 *	@param WindowNo window no
	 *	@param mTab tab
	 *	@param mField field
	 *	@param value value
	 *	@return null or error message
	 */
	public String completePTP (Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value,Object oldValue)
	{
		
		if (isCalloutActive())
			return "";
		
			if (value!=null){
				
								
				if (PROMISE_ACTIVE==((Integer) value).intValue() || PROMISE_BROKEN==((Integer)value).intValue()) {
					int COL_LOANACCOUNT_ID = Env.getContextAsInt(ctx, WindowNo, "COL_LOANACCOUNT_ID");
					MCOLLOANACCOUNTACTION activePTP;
					activePTP=MCOLLOANACCOUNTACTION.getActivePTP(COL_LOANACCOUNT_ID);
					
					
					//if (activePTP!=null){
					//	activePTP.setStatus(activePTP.STATUS_Complete);
					//	activePTP.save();
					//	mTab.getParentTab().dataSave(true);
					//	mTab.getParentTab().dataRefreshAll();			
					//}
					//else{
					//	return "PTP active/broken action is not allowed without PTP contact";
					//	
					//}
				
					if (activePTP==null){
						return "PTP active/broken action is not allowed without PTP contact";
					}
				
				}
				
				
				
				
			}
		
		return "";
	}
	
	
	public String refreshAll (Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value)
	{
		if (value!=null){
			
			//completePTP (ctx, WindowNo, mTab,  mField,  COL_LOANACCOUNTACTION_ID);
			//mTab.dataRefreshAll();
			
			
		}
		int COL_LOANACCOUNTACTION_ID = Env.getContextAsInt(ctx, WindowNo, "COL_LOANACCOUNTACTION_ID");
		Integer M_PriceList_ID = (Integer) mTab.getValue("COL_LOANACCOUNTACTION_ID");
		log.saveError("Action","called from refreshAll " + COL_LOANACCOUNTACTION_ID);
		log.saveError("Action","called from refreshAll M_PriceList_ID " + M_PriceList_ID);
		
		return "";
	}
	
	
	
}
