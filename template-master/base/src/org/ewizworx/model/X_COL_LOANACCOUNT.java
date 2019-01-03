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

/** Generated Model for COL_LOANACCOUNT
 *  @author Adempiere (generated) 
 *  @version Release 3.7.0LTS - $Id$ */
public class X_COL_LOANACCOUNT extends PO implements I_COL_LOANACCOUNT, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20150105L;

    /** Standard Constructor */
    public X_COL_LOANACCOUNT (Properties ctx, int COL_LOANACCOUNT_ID, String trxName)
    {
      super (ctx, COL_LOANACCOUNT_ID, trxName);
      /** if (COL_LOANACCOUNT_ID == 0)
        {
			setACMLT_DUE_AMT (Env.ZERO);
			setACMLT_DUE_MARKUP_AMT (Env.ZERO);
			setACMLT_DUE_PRINCIPLE_AMT (Env.ZERO);
			setACMLT_PAID_AMT (Env.ZERO);
			setACMLT_PAID_MARKUP_AMT (Env.ZERO);
			setACMLT_PAID_PRINCIPLE_AMT (Env.ZERO);
			setAPPLICATION_NO (null);
			setAPPROVAL_DT (new Timestamp( System.currentTimeMillis() ));
			setCOL_BORROWERTYPE_ID (0);
			setCOL_CLASSIFICATION_ID (0);
			setCOL_FREQUENCY_ID (0);
			setCOL_LOANACCOUNT_ID (0);
			setCOL_MODE_ID (0);
			setCOL_PRODUCT_ID (0);
			setCOL_SECURITY_ID (0);
			setCOL_STATUS_ID (0);
			setCOL_UNIT_ID (0);
			setCURRENT_DPD (Env.ZERO);
			setDISBURSED_AMT (Env.ZERO);
			setDISBURSED_DT (new Timestamp( System.currentTimeMillis() ));
			setEW_INSTITUTE_ID (0);
			setEW_PERSON_ID (0);
			setIMSTALMENT_AMT (Env.ZERO);
			setINTEREST_RATE (Env.ZERO);
			setLOAN_NO (null);
			setLOAN_TENURE (Env.ZERO);
			setLOAN_TITLE (null);
			setOS_MARKUP_AMT (Env.ZERO);
			setOS_PRINCIPLE_AMT (Env.ZERO);
			setPREVIOUS_DPD (Env.ZERO);
			setREF_CODE (null);
			setTYPE_CD (null);
        } */
    }

    /** Load Constructor */
    public X_COL_LOANACCOUNT (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_COL_LOANACCOUNT[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set ACMLT_DUE_AMT.
		@param ACMLT_DUE_AMT ACMLT_DUE_AMT	  */
	public void setACMLT_DUE_AMT (BigDecimal ACMLT_DUE_AMT)
	{
		set_Value (COLUMNNAME_ACMLT_DUE_AMT, ACMLT_DUE_AMT);
	}

	/** Get ACMLT_DUE_AMT.
		@return ACMLT_DUE_AMT	  */
	public BigDecimal getACMLT_DUE_AMT () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_ACMLT_DUE_AMT);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set ACMLT_DUE_MARKUP_AMT.
		@param ACMLT_DUE_MARKUP_AMT ACMLT_DUE_MARKUP_AMT	  */
	public void setACMLT_DUE_MARKUP_AMT (BigDecimal ACMLT_DUE_MARKUP_AMT)
	{
		set_Value (COLUMNNAME_ACMLT_DUE_MARKUP_AMT, ACMLT_DUE_MARKUP_AMT);
	}

	/** Get ACMLT_DUE_MARKUP_AMT.
		@return ACMLT_DUE_MARKUP_AMT	  */
	public BigDecimal getACMLT_DUE_MARKUP_AMT () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_ACMLT_DUE_MARKUP_AMT);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set ACMLT_DUE_PRINCIPLE_AMT.
		@param ACMLT_DUE_PRINCIPLE_AMT ACMLT_DUE_PRINCIPLE_AMT	  */
	public void setACMLT_DUE_PRINCIPLE_AMT (BigDecimal ACMLT_DUE_PRINCIPLE_AMT)
	{
		set_Value (COLUMNNAME_ACMLT_DUE_PRINCIPLE_AMT, ACMLT_DUE_PRINCIPLE_AMT);
	}

	/** Get ACMLT_DUE_PRINCIPLE_AMT.
		@return ACMLT_DUE_PRINCIPLE_AMT	  */
	public BigDecimal getACMLT_DUE_PRINCIPLE_AMT () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_ACMLT_DUE_PRINCIPLE_AMT);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set ACMLT_PAID_AMT.
		@param ACMLT_PAID_AMT ACMLT_PAID_AMT	  */
	public void setACMLT_PAID_AMT (BigDecimal ACMLT_PAID_AMT)
	{
		set_Value (COLUMNNAME_ACMLT_PAID_AMT, ACMLT_PAID_AMT);
	}

	/** Get ACMLT_PAID_AMT.
		@return ACMLT_PAID_AMT	  */
	public BigDecimal getACMLT_PAID_AMT () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_ACMLT_PAID_AMT);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set ACMLT_PAID_MARKUP_AMT.
		@param ACMLT_PAID_MARKUP_AMT ACMLT_PAID_MARKUP_AMT	  */
	public void setACMLT_PAID_MARKUP_AMT (BigDecimal ACMLT_PAID_MARKUP_AMT)
	{
		set_Value (COLUMNNAME_ACMLT_PAID_MARKUP_AMT, ACMLT_PAID_MARKUP_AMT);
	}

	/** Get ACMLT_PAID_MARKUP_AMT.
		@return ACMLT_PAID_MARKUP_AMT	  */
	public BigDecimal getACMLT_PAID_MARKUP_AMT () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_ACMLT_PAID_MARKUP_AMT);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set ACMLT_PAID_PRINCIPLE_AMT.
		@param ACMLT_PAID_PRINCIPLE_AMT ACMLT_PAID_PRINCIPLE_AMT	  */
	public void setACMLT_PAID_PRINCIPLE_AMT (BigDecimal ACMLT_PAID_PRINCIPLE_AMT)
	{
		set_Value (COLUMNNAME_ACMLT_PAID_PRINCIPLE_AMT, ACMLT_PAID_PRINCIPLE_AMT);
	}

	/** Get ACMLT_PAID_PRINCIPLE_AMT.
		@return ACMLT_PAID_PRINCIPLE_AMT	  */
	public BigDecimal getACMLT_PAID_PRINCIPLE_AMT () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_ACMLT_PAID_PRINCIPLE_AMT);
		if (bd == null)
			 return Env.ZERO;
		return bd;
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

	/** Set APPROVAL_DT.
		@param APPROVAL_DT APPROVAL_DT	  */
	public void setAPPROVAL_DT (Timestamp APPROVAL_DT)
	{
		set_Value (COLUMNNAME_APPROVAL_DT, APPROVAL_DT);
	}

	/** Get APPROVAL_DT.
		@return APPROVAL_DT	  */
	public Timestamp getAPPROVAL_DT () 
	{
		return (Timestamp)get_Value(COLUMNNAME_APPROVAL_DT);
	}

	/** Set CLOSED_DT.
		@param CLOSED_DT CLOSED_DT	  */
	public void setCLOSED_DT (Timestamp CLOSED_DT)
	{
		set_Value (COLUMNNAME_CLOSED_DT, CLOSED_DT);
	}

	/** Get CLOSED_DT.
		@return CLOSED_DT	  */
	public Timestamp getCLOSED_DT () 
	{
		return (Timestamp)get_Value(COLUMNNAME_CLOSED_DT);
	}

	public org.ewizworx.model.I_COL_BORROWERTYPE getCOL_BORROWERTYPE() throws RuntimeException
    {
		return (org.ewizworx.model.I_COL_BORROWERTYPE)MTable.get(getCtx(), org.ewizworx.model.I_COL_BORROWERTYPE.Table_Name)
			.getPO(getCOL_BORROWERTYPE_ID(), get_TrxName());	}

	/** Set COL_BORROWERTYPE_ID.
		@param COL_BORROWERTYPE_ID COL_BORROWERTYPE_ID	  */
	public void setCOL_BORROWERTYPE_ID (int COL_BORROWERTYPE_ID)
	{
		if (COL_BORROWERTYPE_ID < 1) 
			set_Value (COLUMNNAME_COL_BORROWERTYPE_ID, null);
		else 
			set_Value (COLUMNNAME_COL_BORROWERTYPE_ID, Integer.valueOf(COL_BORROWERTYPE_ID));
	}

	/** Get COL_BORROWERTYPE_ID.
		@return COL_BORROWERTYPE_ID	  */
	public int getCOL_BORROWERTYPE_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_COL_BORROWERTYPE_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
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

	public org.ewizworx.model.I_COL_FREQUENCY getCOL_FREQUENCY() throws RuntimeException
    {
		return (org.ewizworx.model.I_COL_FREQUENCY)MTable.get(getCtx(), org.ewizworx.model.I_COL_FREQUENCY.Table_Name)
			.getPO(getCOL_FREQUENCY_ID(), get_TrxName());	}

	/** Set COL_FREQUENCY.
		@param COL_FREQUENCY_ID COL_FREQUENCY	  */
	public void setCOL_FREQUENCY_ID (int COL_FREQUENCY_ID)
	{
		if (COL_FREQUENCY_ID < 1) 
			set_Value (COLUMNNAME_COL_FREQUENCY_ID, null);
		else 
			set_Value (COLUMNNAME_COL_FREQUENCY_ID, Integer.valueOf(COL_FREQUENCY_ID));
	}

	/** Get COL_FREQUENCY.
		@return COL_FREQUENCY	  */
	public int getCOL_FREQUENCY_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_COL_FREQUENCY_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set COL_LOANACCOUNT.
		@param COL_LOANACCOUNT_ID COL_LOANACCOUNT	  */
	public void setCOL_LOANACCOUNT_ID (int COL_LOANACCOUNT_ID)
	{
		if (COL_LOANACCOUNT_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_COL_LOANACCOUNT_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_COL_LOANACCOUNT_ID, Integer.valueOf(COL_LOANACCOUNT_ID));
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

	public org.ewizworx.model.I_COL_MODE getCOL_MODE() throws RuntimeException
    {
		return (org.ewizworx.model.I_COL_MODE)MTable.get(getCtx(), org.ewizworx.model.I_COL_MODE.Table_Name)
			.getPO(getCOL_MODE_ID(), get_TrxName());	}

	/** Set COL_MODE.
		@param COL_MODE_ID COL_MODE	  */
	public void setCOL_MODE_ID (int COL_MODE_ID)
	{
		if (COL_MODE_ID < 1) 
			set_Value (COLUMNNAME_COL_MODE_ID, null);
		else 
			set_Value (COLUMNNAME_COL_MODE_ID, Integer.valueOf(COL_MODE_ID));
	}

	/** Get COL_MODE.
		@return COL_MODE	  */
	public int getCOL_MODE_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_COL_MODE_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.ewizworx.model.I_COL_PRODUCT getCOL_PRODUCT() throws RuntimeException
    {
		return (org.ewizworx.model.I_COL_PRODUCT)MTable.get(getCtx(), org.ewizworx.model.I_COL_PRODUCT.Table_Name)
			.getPO(getCOL_PRODUCT_ID(), get_TrxName());	}

	/** Set COL_PRODUCT.
		@param COL_PRODUCT_ID COL_PRODUCT	  */
	public void setCOL_PRODUCT_ID (int COL_PRODUCT_ID)
	{
		if (COL_PRODUCT_ID < 1) 
			set_Value (COLUMNNAME_COL_PRODUCT_ID, null);
		else 
			set_Value (COLUMNNAME_COL_PRODUCT_ID, Integer.valueOf(COL_PRODUCT_ID));
	}

	/** Get COL_PRODUCT.
		@return COL_PRODUCT	  */
	public int getCOL_PRODUCT_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_COL_PRODUCT_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.ewizworx.model.I_COL_SECURITY getCOL_SECURITY() throws RuntimeException
    {
		return (org.ewizworx.model.I_COL_SECURITY)MTable.get(getCtx(), org.ewizworx.model.I_COL_SECURITY.Table_Name)
			.getPO(getCOL_SECURITY_ID(), get_TrxName());	}

	/** Set COL_SECURITY.
		@param COL_SECURITY_ID COL_SECURITY	  */
	public void setCOL_SECURITY_ID (int COL_SECURITY_ID)
	{
		if (COL_SECURITY_ID < 1) 
			set_Value (COLUMNNAME_COL_SECURITY_ID, null);
		else 
			set_Value (COLUMNNAME_COL_SECURITY_ID, Integer.valueOf(COL_SECURITY_ID));
	}

	/** Get COL_SECURITY.
		@return COL_SECURITY	  */
	public int getCOL_SECURITY_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_COL_SECURITY_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.ewizworx.model.I_COL_STATUS getCOL_STATUS() throws RuntimeException
    {
		return (org.ewizworx.model.I_COL_STATUS)MTable.get(getCtx(), org.ewizworx.model.I_COL_STATUS.Table_Name)
			.getPO(getCOL_STATUS_ID(), get_TrxName());	}

	/** Set COL_STATUS.
		@param COL_STATUS_ID COL_STATUS	  */
	public void setCOL_STATUS_ID (int COL_STATUS_ID)
	{
		if (COL_STATUS_ID < 1) 
			set_Value (COLUMNNAME_COL_STATUS_ID, null);
		else 
			set_Value (COLUMNNAME_COL_STATUS_ID, Integer.valueOf(COL_STATUS_ID));
	}

	/** Get COL_STATUS.
		@return COL_STATUS	  */
	public int getCOL_STATUS_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_COL_STATUS_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.ewizworx.model.I_COL_UNIT getCOL_UNIT() throws RuntimeException
    {
		return (org.ewizworx.model.I_COL_UNIT)MTable.get(getCtx(), org.ewizworx.model.I_COL_UNIT.Table_Name)
			.getPO(getCOL_UNIT_ID(), get_TrxName());	}

	/** Set COL_UNIT.
		@param COL_UNIT_ID COL_UNIT	  */
	public void setCOL_UNIT_ID (int COL_UNIT_ID)
	{
		if (COL_UNIT_ID < 1) 
			set_Value (COLUMNNAME_COL_UNIT_ID, null);
		else 
			set_Value (COLUMNNAME_COL_UNIT_ID, Integer.valueOf(COL_UNIT_ID));
	}

	/** Get COL_UNIT.
		@return COL_UNIT	  */
	public int getCOL_UNIT_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_COL_UNIT_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set CURRENT_DPD.
		@param CURRENT_DPD CURRENT_DPD	  */
	public void setCURRENT_DPD (BigDecimal CURRENT_DPD)
	{
		set_Value (COLUMNNAME_CURRENT_DPD, CURRENT_DPD);
	}

	/** Get CURRENT_DPD.
		@return CURRENT_DPD	  */
	public BigDecimal getCURRENT_DPD () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CURRENT_DPD);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set DILINQUENT_DT.
		@param DILINQUENT_DT DILINQUENT_DT	  */
	public void setDILINQUENT_DT (Timestamp DILINQUENT_DT)
	{
		set_Value (COLUMNNAME_DILINQUENT_DT, DILINQUENT_DT);
	}

	/** Get DILINQUENT_DT.
		@return DILINQUENT_DT	  */
	public Timestamp getDILINQUENT_DT () 
	{
		return (Timestamp)get_Value(COLUMNNAME_DILINQUENT_DT);
	}

	/** Set DISBURSED_AMT.
		@param DISBURSED_AMT DISBURSED_AMT	  */
	public void setDISBURSED_AMT (BigDecimal DISBURSED_AMT)
	{
		set_Value (COLUMNNAME_DISBURSED_AMT, DISBURSED_AMT);
	}

	/** Get DISBURSED_AMT.
		@return DISBURSED_AMT	  */
	public BigDecimal getDISBURSED_AMT () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_DISBURSED_AMT);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set DISBURSED_DT.
		@param DISBURSED_DT DISBURSED_DT	  */
	public void setDISBURSED_DT (Timestamp DISBURSED_DT)
	{
		set_Value (COLUMNNAME_DISBURSED_DT, DISBURSED_DT);
	}

	/** Get DISBURSED_DT.
		@return DISBURSED_DT	  */
	public Timestamp getDISBURSED_DT () 
	{
		return (Timestamp)get_Value(COLUMNNAME_DISBURSED_DT);
	}

	public org.ewizworx.model.I_EW_INSTITUTE getEW_INSTITUTE() throws RuntimeException
    {
		return (org.ewizworx.model.I_EW_INSTITUTE)MTable.get(getCtx(), org.ewizworx.model.I_EW_INSTITUTE.Table_Name)
			.getPO(getEW_INSTITUTE_ID(), get_TrxName());	}

	/** Set EW_INSTITUTE.
		@param EW_INSTITUTE_ID EW_INSTITUTE	  */
	public void setEW_INSTITUTE_ID (int EW_INSTITUTE_ID)
	{
		if (EW_INSTITUTE_ID < 1) 
			set_Value (COLUMNNAME_EW_INSTITUTE_ID, null);
		else 
			set_Value (COLUMNNAME_EW_INSTITUTE_ID, Integer.valueOf(EW_INSTITUTE_ID));
	}

	/** Get EW_INSTITUTE.
		@return EW_INSTITUTE	  */
	public int getEW_INSTITUTE_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_EW_INSTITUTE_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.ewizworx.model.I_EW_PERSON getEW_PERSON() throws RuntimeException
    {
		return (org.ewizworx.model.I_EW_PERSON)MTable.get(getCtx(), org.ewizworx.model.I_EW_PERSON.Table_Name)
			.getPO(getEW_PERSON_ID(), get_TrxName());	}

	/** Set EW_PERSON.
		@param EW_PERSON_ID EW_PERSON	  */
	public void setEW_PERSON_ID (int EW_PERSON_ID)
	{
		if (EW_PERSON_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_EW_PERSON_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_EW_PERSON_ID, Integer.valueOf(EW_PERSON_ID));
	}

	/** Get EW_PERSON.
		@return EW_PERSON	  */
	public int getEW_PERSON_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_EW_PERSON_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set IMSTALMENT_AMT.
		@param IMSTALMENT_AMT IMSTALMENT_AMT	  */
	public void setIMSTALMENT_AMT (BigDecimal IMSTALMENT_AMT)
	{
		set_Value (COLUMNNAME_IMSTALMENT_AMT, IMSTALMENT_AMT);
	}

	/** Get IMSTALMENT_AMT.
		@return IMSTALMENT_AMT	  */
	public BigDecimal getIMSTALMENT_AMT () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_IMSTALMENT_AMT);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set INTEREST_RATE.
		@param INTEREST_RATE INTEREST_RATE	  */
	public void setINTEREST_RATE (BigDecimal INTEREST_RATE)
	{
		set_Value (COLUMNNAME_INTEREST_RATE, INTEREST_RATE);
	}

	/** Get INTEREST_RATE.
		@return INTEREST_RATE	  */
	public BigDecimal getINTEREST_RATE () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_INTEREST_RATE);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set LAST_PAYMENT_DT.
		@param LAST_PAYMENT_DT LAST_PAYMENT_DT	  */
	public void setLAST_PAYMENT_DT (Timestamp LAST_PAYMENT_DT)
	{
		set_Value (COLUMNNAME_LAST_PAYMENT_DT, LAST_PAYMENT_DT);
	}

	/** Get LAST_PAYMENT_DT.
		@return LAST_PAYMENT_DT	  */
	public Timestamp getLAST_PAYMENT_DT () 
	{
		return (Timestamp)get_Value(COLUMNNAME_LAST_PAYMENT_DT);
	}

	/** Set LOAN_NO.
		@param LOAN_NO LOAN_NO	  */
	public void setLOAN_NO (String LOAN_NO)
	{
		set_Value (COLUMNNAME_LOAN_NO, LOAN_NO);
	}

	/** Get LOAN_NO.
		@return LOAN_NO	  */
	public String getLOAN_NO () 
	{
		return (String)get_Value(COLUMNNAME_LOAN_NO);
	}

	/** Set LOAN_TENURE.
		@param LOAN_TENURE LOAN_TENURE	  */
	public void setLOAN_TENURE (BigDecimal LOAN_TENURE)
	{
		set_Value (COLUMNNAME_LOAN_TENURE, LOAN_TENURE);
	}

	/** Get LOAN_TENURE.
		@return LOAN_TENURE	  */
	public BigDecimal getLOAN_TENURE () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_LOAN_TENURE);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set LOAN_TITLE.
		@param LOAN_TITLE LOAN_TITLE	  */
	public void setLOAN_TITLE (String LOAN_TITLE)
	{
		set_Value (COLUMNNAME_LOAN_TITLE, LOAN_TITLE);
	}

	/** Get LOAN_TITLE.
		@return LOAN_TITLE	  */
	public String getLOAN_TITLE () 
	{
		return (String)get_Value(COLUMNNAME_LOAN_TITLE);
	}

	/** Set MATURITY_DT.
		@param MATURITY_DT MATURITY_DT	  */
	public void setMATURITY_DT (Timestamp MATURITY_DT)
	{
		set_Value (COLUMNNAME_MATURITY_DT, MATURITY_DT);
	}

	/** Get MATURITY_DT.
		@return MATURITY_DT	  */
	public Timestamp getMATURITY_DT () 
	{
		return (Timestamp)get_Value(COLUMNNAME_MATURITY_DT);
	}

	/** Set NEXT_PAYMENT_DT.
		@param NEXT_PAYMENT_DT NEXT_PAYMENT_DT	  */
	public void setNEXT_PAYMENT_DT (Timestamp NEXT_PAYMENT_DT)
	{
		set_Value (COLUMNNAME_NEXT_PAYMENT_DT, NEXT_PAYMENT_DT);
	}

	/** Get NEXT_PAYMENT_DT.
		@return NEXT_PAYMENT_DT	  */
	public Timestamp getNEXT_PAYMENT_DT () 
	{
		return (Timestamp)get_Value(COLUMNNAME_NEXT_PAYMENT_DT);
	}

	/** Set OS_MARKUP_AMT.
		@param OS_MARKUP_AMT OS_MARKUP_AMT	  */
	public void setOS_MARKUP_AMT (BigDecimal OS_MARKUP_AMT)
	{
		set_Value (COLUMNNAME_OS_MARKUP_AMT, OS_MARKUP_AMT);
	}

	/** Get OS_MARKUP_AMT.
		@return OS_MARKUP_AMT	  */
	public BigDecimal getOS_MARKUP_AMT () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_OS_MARKUP_AMT);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set OS_PRINCIPLE_AMT.
		@param OS_PRINCIPLE_AMT OS_PRINCIPLE_AMT	  */
	public void setOS_PRINCIPLE_AMT (BigDecimal OS_PRINCIPLE_AMT)
	{
		set_Value (COLUMNNAME_OS_PRINCIPLE_AMT, OS_PRINCIPLE_AMT);
	}

	/** Get OS_PRINCIPLE_AMT.
		@return OS_PRINCIPLE_AMT	  */
	public BigDecimal getOS_PRINCIPLE_AMT () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_OS_PRINCIPLE_AMT);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set PREVIOUS_DPD.
		@param PREVIOUS_DPD PREVIOUS_DPD	  */
	public void setPREVIOUS_DPD (BigDecimal PREVIOUS_DPD)
	{
		set_Value (COLUMNNAME_PREVIOUS_DPD, PREVIOUS_DPD);
	}

	/** Get PREVIOUS_DPD.
		@return PREVIOUS_DPD	  */
	public BigDecimal getPREVIOUS_DPD () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_PREVIOUS_DPD);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set REF_CODE.
		@param REF_CODE REF_CODE	  */
	public void setREF_CODE (String REF_CODE)
	{
		set_Value (COLUMNNAME_REF_CODE, REF_CODE);
	}

	/** Get REF_CODE.
		@return REF_CODE	  */
	public String getREF_CODE () 
	{
		return (String)get_Value(COLUMNNAME_REF_CODE);
	}

	/** Set TYPE_CD.
		@param TYPE_CD TYPE_CD	  */
	public void setTYPE_CD (String TYPE_CD)
	{
		set_Value (COLUMNNAME_TYPE_CD, TYPE_CD);
	}

	/** Get TYPE_CD.
		@return TYPE_CD	  */
	public String getTYPE_CD () 
	{
		return (String)get_Value(COLUMNNAME_TYPE_CD);
	}
}