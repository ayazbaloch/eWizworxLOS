/******************************************************************************
 * Product: Adempiere ERP & CRM Smart Business Solution                       *
 * Copyright (C) 1999-2007 ComPiere, Inc. All Rights Reserved.                *
 * This program is free software, you can redistribute it and/or modify it    *
 * under the terms version 2 of the GNU General Public License as published   *
 * by the Free Software Foundation. This program is distributed in the hope   *
 * that it will be useful, but WITHOUT ANY WARRANTY, without even the implied *
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.           *
 * See the GNU General Public License for more details.                       *
 * You should have received a copy of the GNU General Public License along    *
 * with this program, if not, write to the Free Software Foundation, Inc.,    *
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.                     *
 * For the text or an alternative of this public license, you may reach us    *
 * ComPiere, Inc., 2620 Augustine Dr. #245, Santa Clara, CA 95054, USA        *
 * or via info@compiere.org or http://www.compiere.org/license.html           *
 *****************************************************************************/
/** Generated Model - DO NOT CHANGE */
package org.ewizworx.model;

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.Properties;
import org.compiere.model.*;
import org.compiere.util.Env;

/** Generated Model for COL_LOANACCOUNTTRANS
 *  @author Adempiere (generated) 
 *  @version Release 3.7.0LTS - $Id$ */
public class X_COL_LOANACCOUNTTRANS extends PO implements I_COL_LOANACCOUNTTRANS, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20150805L;

    /** Standard Constructor */
    public X_COL_LOANACCOUNTTRANS (Properties ctx, int COL_LOANACCOUNTTRANS_ID, String trxName)
    {
      super (ctx, COL_LOANACCOUNTTRANS_ID, trxName);
      /** if (COL_LOANACCOUNTTRANS_ID == 0)
        {
			setAPPLICATION_NO (null);
			setCOL_CLASSIFICATION_ID (0);
			setCOL_LOANACCOUNTTRANS_ID (0);
			setCOL_LOANACCOUNT_ID (0);
			setINSTALLMENT_DUE (0);
			setINSTALLMENT_PAID (0);
			setOS_AMT (Env.ZERO);
			setPAID_AMT (Env.ZERO);
			setPAID_MARKUP (0);
			setPAID_PRICIPLE (0);
			setPERIOD (null);
        } */
    }

    /** Load Constructor */
    public X_COL_LOANACCOUNTTRANS (Properties ctx, ResultSet rs, String trxName)
    {
      super (ctx, rs, trxName);
    }

    /** AccessLevel
      * @return 7 - System - Client - Org 
      */
    protected int get_AccessLevel()
    {
      return accessLevel.intValue();
    }

    /** Load Meta Data */
    protected POInfo initPO (Properties ctx)
    {
      POInfo poi = POInfo.getPOInfo (ctx, Table_ID, get_TrxName());
      return poi;
    }

    public String toString()
    {
      StringBuffer sb = new StringBuffer ("X_COL_LOANACCOUNTTRANS[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set ACTUAL_OD.
		@param ACTUAL_OD ACTUAL_OD	  */
	public void setACTUAL_OD (int ACTUAL_OD)
	{
		set_Value (COLUMNNAME_ACTUAL_OD, Integer.valueOf(ACTUAL_OD));
	}

	/** Get ACTUAL_OD.
		@return ACTUAL_OD	  */
	public int getACTUAL_OD () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ACTUAL_OD);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set APPLICATION_NO.
		@param APPLICATION_NO APPLICATION_NO	  */
	public void setAPPLICATION_NO (String APPLICATION_NO)
	{
		set_Value (COLUMNNAME_APPLICATION_NO, APPLICATION_NO);
	}

	/** Get APPLICATION_NO.
		@return APPLICATION_NO	  */
	public String getAPPLICATION_NO () 
	{
		return (String)get_Value(COLUMNNAME_APPLICATION_NO);
	}

	public org.ewizworx.model.I_COL_CLASSIFICATION getCOL_CLASSIFICATION() throws RuntimeException
    {
		return (org.ewizworx.model.I_COL_CLASSIFICATION)MTable.get(getCtx(), org.ewizworx.model.I_COL_CLASSIFICATION.Table_Name)
			.getPO(getCOL_CLASSIFICATION_ID(), get_TrxName());	}

	/** Set COL_CLASSIFICATION.
		@param COL_CLASSIFICATION_ID COL_CLASSIFICATION	  */
	public void setCOL_CLASSIFICATION_ID (int COL_CLASSIFICATION_ID)
	{
		if (COL_CLASSIFICATION_ID < 1) 
			set_Value (COLUMNNAME_COL_CLASSIFICATION_ID, null);
		else 
			set_Value (COLUMNNAME_COL_CLASSIFICATION_ID, Integer.valueOf(COL_CLASSIFICATION_ID));
	}

	/** Get COL_CLASSIFICATION.
		@return COL_CLASSIFICATION	  */
	public int getCOL_CLASSIFICATION_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_COL_CLASSIFICATION_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set COL_LOANACCOUNTTRANS.
		@param COL_LOANACCOUNTTRANS_ID COL_LOANACCOUNTTRANS	  */
	public void setCOL_LOANACCOUNTTRANS_ID (int COL_LOANACCOUNTTRANS_ID)
	{
		if (COL_LOANACCOUNTTRANS_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_COL_LOANACCOUNTTRANS_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_COL_LOANACCOUNTTRANS_ID, Integer.valueOf(COL_LOANACCOUNTTRANS_ID));
	}

	/** Get COL_LOANACCOUNTTRANS.
		@return COL_LOANACCOUNTTRANS	  */
	public int getCOL_LOANACCOUNTTRANS_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_COL_LOANACCOUNTTRANS_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.ewizworx.model.I_COL_LOANACCOUNT getCOL_LOANACCOUNT() throws RuntimeException
    {
		return (org.ewizworx.model.I_COL_LOANACCOUNT)MTable.get(getCtx(), org.ewizworx.model.I_COL_LOANACCOUNT.Table_Name)
			.getPO(getCOL_LOANACCOUNT_ID(), get_TrxName());	}

	/** Set COL_LOANACCOUNT.
		@param COL_LOANACCOUNT_ID COL_LOANACCOUNT	  */
	public void setCOL_LOANACCOUNT_ID (int COL_LOANACCOUNT_ID)
	{
		if (COL_LOANACCOUNT_ID < 1) 
			set_Value (COLUMNNAME_COL_LOANACCOUNT_ID, null);
		else 
			set_Value (COLUMNNAME_COL_LOANACCOUNT_ID, Integer.valueOf(COL_LOANACCOUNT_ID));
	}

	/** Get COL_LOANACCOUNT.
		@return COL_LOANACCOUNT	  */
	public int getCOL_LOANACCOUNT_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_COL_LOANACCOUNT_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set CURRENT_DPD.
		@param CURRENT_DPD CURRENT_DPD	  */
	public void setCURRENT_DPD (int CURRENT_DPD)
	{
		set_Value (COLUMNNAME_CURRENT_DPD, Integer.valueOf(CURRENT_DPD));
	}

	/** Get CURRENT_DPD.
		@return CURRENT_DPD	  */
	public int getCURRENT_DPD () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_CURRENT_DPD);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set FUNDING_BAL.
		@param FUNDING_BAL FUNDING_BAL	  */
	public void setFUNDING_BAL (int FUNDING_BAL)
	{
		set_Value (COLUMNNAME_FUNDING_BAL, Integer.valueOf(FUNDING_BAL));
	}

	/** Get FUNDING_BAL.
		@return FUNDING_BAL	  */
	public int getFUNDING_BAL () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_FUNDING_BAL);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set INSTALLMENT_DUE.
		@param INSTALLMENT_DUE INSTALLMENT_DUE	  */
	public void setINSTALLMENT_DUE (int INSTALLMENT_DUE)
	{
		set_Value (COLUMNNAME_INSTALLMENT_DUE, Integer.valueOf(INSTALLMENT_DUE));
	}

	/** Get INSTALLMENT_DUE.
		@return INSTALLMENT_DUE	  */
	public int getINSTALLMENT_DUE () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_INSTALLMENT_DUE);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set INSTALLMENT_PAID.
		@param INSTALLMENT_PAID INSTALLMENT_PAID	  */
	public void setINSTALLMENT_PAID (int INSTALLMENT_PAID)
	{
		set_Value (COLUMNNAME_INSTALLMENT_PAID, Integer.valueOf(INSTALLMENT_PAID));
	}

	/** Get INSTALLMENT_PAID.
		@return INSTALLMENT_PAID	  */
	public int getINSTALLMENT_PAID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_INSTALLMENT_PAID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set OS_AMT.
		@param OS_AMT OS_AMT	  */
	public void setOS_AMT (BigDecimal OS_AMT)
	{
		set_Value (COLUMNNAME_OS_AMT, OS_AMT);
	}

	/** Get OS_AMT.
		@return OS_AMT	  */
	public BigDecimal getOS_AMT () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_OS_AMT);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set PAID_AMT.
		@param PAID_AMT PAID_AMT	  */
	public void setPAID_AMT (BigDecimal PAID_AMT)
	{
		set_Value (COLUMNNAME_PAID_AMT, PAID_AMT);
	}

	/** Get PAID_AMT.
		@return PAID_AMT	  */
	public BigDecimal getPAID_AMT () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_PAID_AMT);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set PAID_DT.
		@param PAID_DT PAID_DT	  */
	public void setPAID_DT (Timestamp PAID_DT)
	{
		set_Value (COLUMNNAME_PAID_DT, PAID_DT);
	}

	/** Get PAID_DT.
		@return PAID_DT	  */
	public Timestamp getPAID_DT () 
	{
		return (Timestamp)get_Value(COLUMNNAME_PAID_DT);
	}

	/** Set PAID_MARKUP.
		@param PAID_MARKUP PAID_MARKUP	  */
	public void setPAID_MARKUP (int PAID_MARKUP)
	{
		set_Value (COLUMNNAME_PAID_MARKUP, Integer.valueOf(PAID_MARKUP));
	}

	/** Get PAID_MARKUP.
		@return PAID_MARKUP	  */
	public int getPAID_MARKUP () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_PAID_MARKUP);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set PAID_PRICIPLE.
		@param PAID_PRICIPLE PAID_PRICIPLE	  */
	public void setPAID_PRICIPLE (int PAID_PRICIPLE)
	{
		set_Value (COLUMNNAME_PAID_PRICIPLE, Integer.valueOf(PAID_PRICIPLE));
	}

	/** Get PAID_PRICIPLE.
		@return PAID_PRICIPLE	  */
	public int getPAID_PRICIPLE () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_PAID_PRICIPLE);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set PERIOD.
		@param PERIOD PERIOD	  */
	public void setPERIOD (String PERIOD)
	{
		set_Value (COLUMNNAME_PERIOD, PERIOD);
	}

	/** Get PERIOD.
		@return PERIOD	  */
	public String getPERIOD () 
	{
		return (String)get_Value(COLUMNNAME_PERIOD);
	}

	/** Set PREVIOUS_DPD.
		@param PREVIOUS_DPD PREVIOUS_DPD	  */
	public void setPREVIOUS_DPD (int PREVIOUS_DPD)
	{
		set_Value (COLUMNNAME_PREVIOUS_DPD, Integer.valueOf(PREVIOUS_DPD));
	}

	/** Get PREVIOUS_DPD.
		@return PREVIOUS_DPD	  */
	public int getPREVIOUS_DPD () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_PREVIOUS_DPD);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}
}