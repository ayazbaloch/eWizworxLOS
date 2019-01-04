/******************************************************************************
 * Product: ADempiere ERP & CRM Smart Business Solution                       *
 * Copyright (C) 2006-2017 ADempiere Foundation, All Rights Reserved.         *
 * This program is free software, you can redistribute it and/or modify it    *
 * under the terms version 2 of the GNU General Public License as published   *
 * or (at your option) any later version.										*
 * by the Free Software Foundation. This program is distributed in the hope   *
 * that it will be useful, but WITHOUT ANY WARRANTY, without even the implied *
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.           *
 * See the GNU General Public License for more details.                       *
 * You should have received a copy of the GNU General Public License along    *
 * with this program, if not, write to the Free Software Foundation, Inc.,    *
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.                     *
 * For the text or an alternative of this public license, you may reach us    *
 * or via info@adempiere.net or http://www.adempiere.net/license.html         *
 *****************************************************************************/
/** Generated Model - DO NOT CHANGE */
package org.ewizworx.model;

import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.Properties;
import org.compiere.model.*;

/** Generated Model for LOS_Lead
 *  @author Adempiere (generated) 
 *  @version Release 3.9.0 - $Id$ */
public class X_LOS_Lead extends PO implements I_LOS_Lead, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20190104L;

    /** Standard Constructor */
    public X_LOS_Lead (Properties ctx, int LOS_Lead_ID, String trxName)
    {
      super (ctx, LOS_Lead_ID, trxName);
      /** if (LOS_Lead_ID == 0)
        {
			setBUSINESSSIGMENT (null);
			setCOL_BRANCH_ID (0);
			setCOL_PRIORITY_ID (0);
			setLEAD_DATE (new Timestamp( System.currentTimeMillis() ));
			setLOS_Lead_ID (0);
			setProcessed (false);
			setUUID (null);
        } */
    }

    /** Load Constructor */
    public X_LOS_Lead (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_LOS_Lead[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** BUSINESSSIGMENT AD_Reference_ID=1000048 */
	public static final int BUSINESSSIGMENT_AD_Reference_ID=1000048;
	/** Consumer = Consumer */
	public static final String BUSINESSSIGMENT_Consumer = "Consumer";
	/** Commercial = Commercial */
	public static final String BUSINESSSIGMENT_Commercial = "Commercial";
	/** Corporate = Corporate */
	public static final String BUSINESSSIGMENT_Corporate = "Corporate";
	/** Set BUSINESSSIGMENT.
		@param BUSINESSSIGMENT BUSINESSSIGMENT	  */
	public void setBUSINESSSIGMENT (String BUSINESSSIGMENT)
	{

		set_Value (COLUMNNAME_BUSINESSSIGMENT, BUSINESSSIGMENT);
	}

	/** Get BUSINESSSIGMENT.
		@return BUSINESSSIGMENT	  */
	public String getBUSINESSSIGMENT () 
	{
		return (String)get_Value(COLUMNNAME_BUSINESSSIGMENT);
	}

	/** Set CHANNEL.
		@param CHANNEL CHANNEL	  */
	public void setCHANNEL (String CHANNEL)
	{
		set_Value (COLUMNNAME_CHANNEL, CHANNEL);
	}

	/** Get CHANNEL.
		@return CHANNEL	  */
	public String getCHANNEL () 
	{
		return (String)get_Value(COLUMNNAME_CHANNEL);
	}

	/** Set COL_BRANCH.
		@param COL_BRANCH_ID COL_BRANCH	  */
	public void setCOL_BRANCH_ID (int COL_BRANCH_ID)
	{
		if (COL_BRANCH_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_COL_BRANCH_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_COL_BRANCH_ID, Integer.valueOf(COL_BRANCH_ID));
	}

	/** Get COL_BRANCH.
		@return COL_BRANCH	  */
	public int getCOL_BRANCH_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_COL_BRANCH_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Priority.
		@param COL_PRIORITY_ID Priority	  */
	public void setCOL_PRIORITY_ID (int COL_PRIORITY_ID)
	{
		if (COL_PRIORITY_ID < 1) 
			set_Value (COLUMNNAME_COL_PRIORITY_ID, null);
		else 
			set_Value (COLUMNNAME_COL_PRIORITY_ID, Integer.valueOf(COL_PRIORITY_ID));
	}

	/** Get Priority.
		@return Priority	  */
	public int getCOL_PRIORITY_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_COL_PRIORITY_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set LEAD_DATE.
		@param LEAD_DATE LEAD_DATE	  */
	public void setLEAD_DATE (Timestamp LEAD_DATE)
	{
		set_Value (COLUMNNAME_LEAD_DATE, LEAD_DATE);
	}

	/** Get LEAD_DATE.
		@return LEAD_DATE	  */
	public Timestamp getLEAD_DATE () 
	{
		return (Timestamp)get_Value(COLUMNNAME_LEAD_DATE);
	}

	public org.ewizworx.model.I_LOS_LOANENTITYTYPE getLOS_LOANENTITYTYPE() throws RuntimeException
    {
		return (org.ewizworx.model.I_LOS_LOANENTITYTYPE)MTable.get(getCtx(), org.ewizworx.model.I_LOS_LOANENTITYTYPE.Table_Name)
			.getPO(getLOS_LOANENTITYTYPE_ID(), get_TrxName());	}

	/** Set LOS Loan Entity Type ID.
		@param LOS_LOANENTITYTYPE_ID LOS Loan Entity Type ID	  */
	public void setLOS_LOANENTITYTYPE_ID (int LOS_LOANENTITYTYPE_ID)
	{
		if (LOS_LOANENTITYTYPE_ID < 1) 
			set_Value (COLUMNNAME_LOS_LOANENTITYTYPE_ID, null);
		else 
			set_Value (COLUMNNAME_LOS_LOANENTITYTYPE_ID, Integer.valueOf(LOS_LOANENTITYTYPE_ID));
	}

	/** Get LOS Loan Entity Type ID.
		@return LOS Loan Entity Type ID	  */
	public int getLOS_LOANENTITYTYPE_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_LOS_LOANENTITYTYPE_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set LOS Lead ID.
		@param LOS_Lead_ID LOS Lead ID	  */
	public void setLOS_Lead_ID (int LOS_Lead_ID)
	{
		if (LOS_Lead_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_LOS_Lead_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_LOS_Lead_ID, Integer.valueOf(LOS_Lead_ID));
	}

	/** Get LOS Lead ID.
		@return LOS Lead ID	  */
	public int getLOS_Lead_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_LOS_Lead_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
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

	/** SOURCE AD_Reference_ID=1000049 */
	public static final int SOURCE_AD_Reference_ID=1000049;
	/** Direct Mail = 10000003 */
	public static final String SOURCE_DirectMail = "10000003";
	/** Email = 10000004 */
	public static final String SOURCE_Email = "10000004";
	/** Online Advertising = 10000005 */
	public static final String SOURCE_OnlineAdvertising = "10000005";
	/** Seminars = 10000006 */
	public static final String SOURCE_Seminars = "10000006";
	/** Telemarketing = 10000007 */
	public static final String SOURCE_Telemarketing = "10000007";
	/** Tradeshow = 10000008 */
	public static final String SOURCE_Tradeshow = "10000008";
	/** Webinar/Podcast = 10000009 */
	public static final String SOURCE_WebinarPodcast = "10000009";
	/** Website = 10000010 */
	public static final String SOURCE_Website = "10000010";
	/** Set SOURCE.
		@param SOURCE SOURCE	  */
	public void setSOURCE (String SOURCE)
	{

		set_Value (COLUMNNAME_SOURCE, SOURCE);
	}

	/** Get SOURCE.
		@return SOURCE	  */
	public String getSOURCE () 
	{
		return (String)get_Value(COLUMNNAME_SOURCE);
	}

	/** Set Immutable Universally Unique Identifier.
		@param UUID 
		Immutable Universally Unique Identifier
	  */
	public void setUUID (String UUID)
	{
		set_Value (COLUMNNAME_UUID, UUID);
	}

	/** Get Immutable Universally Unique Identifier.
		@return Immutable Universally Unique Identifier
	  */
	public String getUUID () 
	{
		return (String)get_Value(COLUMNNAME_UUID);
	}
}