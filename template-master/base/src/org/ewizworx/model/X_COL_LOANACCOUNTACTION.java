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

/** Generated Model for COL_LOANACCOUNTACTION
 *  @author Adempiere (generated) 
 *  @version Release 3.8.0 - $Id$ */
public class X_COL_LOANACCOUNTACTION extends PO implements I_COL_LOANACCOUNTACTION, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20161219L;

    /** Standard Constructor */
    public X_COL_LOANACCOUNTACTION (Properties ctx, int COL_LOANACCOUNTACTION_ID, String trxName)
    {
    	
      super (ctx, COL_LOANACCOUNTACTION_ID, trxName);
      
       if (COL_LOANACCOUNTACTION_ID == 0)
        {
    	   /*
    	   setACTIONMODE (null);
			setAmount (0);
			setCOL_ACTIONTYPE_ID (0);
			setCOL_FREQUENCY_ID (0);
			setCOL_LOANACCOUNTACTION_ID (0);
			setCOL_LOANACCOUNT_ID (0);
			setDueDate (new Timestamp( System.currentTimeMillis() ));
			setPriority (Env.ZERO);
			setStatus (null);
			*/
    	   
        } 
        
    }

    /** Load Constructor */
    public X_COL_LOANACCOUNTACTION (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_COL_LOANACCOUNTACTION[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** ACTIONMODE AD_Reference_ID=1000039 */
	public static final int ACTIONMODE_AD_Reference_ID=1000039;
	/** Contact = Contact */
	public static final String ACTIONMODE_Contact = "Contact";
	/** Action = Action */
	public static final String ACTIONMODE_Action = "Action";
	/** Set ACTIONMODE.
		@param ACTIONMODE ACTIONMODE	  */
	public void setACTIONMODE (String ACTIONMODE)
	{

		set_Value (COLUMNNAME_ACTIONMODE, ACTIONMODE);
	}

	/** Get ACTIONMODE.
		@return ACTIONMODE	  */
	public String getACTIONMODE () 
	{
		return (String)get_Value(COLUMNNAME_ACTIONMODE);
	}

	/** Set Amount.
		@param Amount 
		Amount in a defined currency
	  */
	public void setAmount (int Amount)
	{
		set_Value (COLUMNNAME_Amount, Integer.valueOf(Amount));
	}

	/** Get Amount.
		@return Amount in a defined currency
	  */
	public int getAmount () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_Amount);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.ewizworx.model.I_COL_ACTIONTYPE getCOL_ACTIONTYPE() throws RuntimeException
    {
		return (org.ewizworx.model.I_COL_ACTIONTYPE)MTable.get(getCtx(), org.ewizworx.model.I_COL_ACTIONTYPE.Table_Name)
			.getPO(getCOL_ACTIONTYPE_ID(), get_TrxName());	}

	/** Set COL_ACTIONTYPE.
		@param COL_ACTIONTYPE_ID COL_ACTIONTYPE	  */
	public void setCOL_ACTIONTYPE_ID (int COL_ACTIONTYPE_ID)
	{
		if (COL_ACTIONTYPE_ID < 1) 
			set_Value (COLUMNNAME_COL_ACTIONTYPE_ID, null);
		else 
			set_Value (COLUMNNAME_COL_ACTIONTYPE_ID, Integer.valueOf(COL_ACTIONTYPE_ID));
	}

	/** Get COL_ACTIONTYPE.
		@return COL_ACTIONTYPE	  */
	public int getCOL_ACTIONTYPE_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_COL_ACTIONTYPE_ID);
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

	/** Set COL_LOANACCOUNTACTION.
		@param COL_LOANACCOUNTACTION_ID COL_LOANACCOUNTACTION	  */
	public void setCOL_LOANACCOUNTACTION_ID (int COL_LOANACCOUNTACTION_ID)
	{
		if (COL_LOANACCOUNTACTION_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_COL_LOANACCOUNTACTION_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_COL_LOANACCOUNTACTION_ID, Integer.valueOf(COL_LOANACCOUNTACTION_ID));
	}

	/** Get COL_LOANACCOUNTACTION.
		@return COL_LOANACCOUNTACTION	  */
	public int getCOL_LOANACCOUNTACTION_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_COL_LOANACCOUNTACTION_ID);
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

	/** Set DUETIME.
		@param DUETIME DUETIME	  */
	public void setDUETIME (Timestamp DUETIME)
	{
		set_Value (COLUMNNAME_DUETIME, DUETIME);
	}

	/** Get DUETIME.
		@return DUETIME	  */
	public Timestamp getDUETIME () 
	{
		return (Timestamp)get_Value(COLUMNNAME_DUETIME);
	}

	/** Set Description.
		@param Description 
		Optional short description of the record
	  */
	public void setDescription (String Description)
	{
		set_Value (COLUMNNAME_Description, Description);
	}

	/** Get Description.
		@return Optional short description of the record
	  */
	public String getDescription () 
	{
		return (String)get_Value(COLUMNNAME_Description);
	}

	/** Set Due Date.
		@param DueDate 
		Date when the payment is due
	  */
	public void setDueDate (Timestamp DueDate)
	{
		set_Value (COLUMNNAME_DueDate, DueDate);
	}

	/** Get Due Date.
		@return Date when the payment is due
	  */
	public Timestamp getDueDate () 
	{
		return (Timestamp)get_Value(COLUMNNAME_DueDate);
	}

	/** Set LOAN_TITLE.
		@param LOAN_TITLE LOAN_TITLE	  */
	public void setLOAN_TITLE (String LOAN_TITLE)
	{
		throw new IllegalArgumentException ("LOAN_TITLE is virtual column");	}

	/** Get LOAN_TITLE.
		@return LOAN_TITLE	  */
	public String getLOAN_TITLE () 
	{
		return (String)get_Value(COLUMNNAME_LOAN_TITLE);
	}

	/** Set Priority.
		@param Priority 
		Indicates if this request is of a high, medium or low priority.
	  */
	public void setPriority (BigDecimal Priority)
	{
		set_Value (COLUMNNAME_Priority, Priority);
	}

	/** Get Priority.
		@return Indicates if this request is of a high, medium or low priority.
	  */
	public BigDecimal getPriority () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Priority);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Processed.
		@param Processed 
		The document has been processed
	  */
	public void setProcessed (boolean Processed)
	{
		set_Value (COLUMNNAME_Processed, Boolean.valueOf(Processed));
	}

	/** Get Processed.
		@return The document has been processed
	  */
	public boolean isProcessed () 
	{
		Object oo = get_Value(COLUMNNAME_Processed);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Status AD_Reference_ID=1000035 */
	public static final int STATUS_AD_Reference_ID=1000035;
	/** Inprogress = Inprogress */
	public static final String STATUS_Inprogress = "Inprogress";
	/** Complete = Complete */
	public static final String STATUS_Complete = "Complete";
	/** Set Status.
		@param Status 
		Status of the currently running check
	  */
	public void setStatus (String Status)
	{

		set_Value (COLUMNNAME_Status, Status);
	}

	/** Get Status.
		@return Status of the currently running check
	  */
	public String getStatus () 
	{
		return (String)get_Value(COLUMNNAME_Status);
	}
}