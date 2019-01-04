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

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.util.Properties;
import org.compiere.model.*;
import org.compiere.util.Env;

/** Generated Model for LOS_LeadRequest
 *  @author Adempiere (generated) 
 *  @version Release 3.9.0 - $Id$ */
public class X_LOS_LEADREQUEST extends PO implements I_LOS_LEADREQUEST, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20190104L;

    /** Standard Constructor */
    public X_LOS_LEADREQUEST (Properties ctx, int LOS_LeadRequest_ID, String trxName)
    {
      super (ctx, LOS_LeadRequest_ID, trxName);
      /** if (LOS_LeadRequest_ID == 0)
        {
			setAmount (Env.ZERO);
			setLOS_LEADREQUEST_ID (0);
			setSIGMENT (null);
			setUUID (null);
        } */
    }

    /** Load Constructor */
    public X_LOS_LEADREQUEST (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_LOS_LeadRequest[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set Amount.
		@param Amount 
		Amount in a defined currency
	  */
	public void setAmount (BigDecimal Amount)
	{
		set_Value (COLUMNNAME_Amount, Amount);
	}

	/** Get Amount.
		@return Amount in a defined currency
	  */
	public BigDecimal getAmount () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Amount);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set LOS LEAD REQUEST ID.
		@param LOS_LEADREQUEST_ID LOS LEAD REQUEST ID	  */
	public void setLOS_LEADREQUEST_ID (int LOS_LEADREQUEST_ID)
	{
		if (LOS_LEADREQUEST_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_LOS_LEADREQUEST_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_LOS_LEADREQUEST_ID, Integer.valueOf(LOS_LEADREQUEST_ID));
	}

	/** Get LOS LEAD REQUEST ID.
		@return LOS LEAD REQUEST ID	  */
	public int getLOS_LEADREQUEST_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_LOS_LEADREQUEST_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set LOS Lead ID.
		@param LOS_Lead_ID LOS Lead ID	  */
	public void setLOS_Lead_ID (int LOS_Lead_ID)
	{
		if (LOS_Lead_ID < 1) 
			set_Value (COLUMNNAME_LOS_Lead_ID, null);
		else 
			set_Value (COLUMNNAME_LOS_Lead_ID, Integer.valueOf(LOS_Lead_ID));
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

	public org.ewizworx.model.I_LOS_PRODUCT getLOS_PRODUCT() throws RuntimeException
    {
		return (org.ewizworx.model.I_LOS_PRODUCT)MTable.get(getCtx(), org.ewizworx.model.I_LOS_PRODUCT.Table_Name)
			.getPO(getLOS_PRODUCT_ID(), get_TrxName());	}

	/** Set LOS_PRODUCT_ID.
		@param LOS_PRODUCT_ID LOS_PRODUCT_ID	  */
	public void setLOS_PRODUCT_ID (int LOS_PRODUCT_ID)
	{
		if (LOS_PRODUCT_ID < 1) 
			set_Value (COLUMNNAME_LOS_PRODUCT_ID, null);
		else 
			set_Value (COLUMNNAME_LOS_PRODUCT_ID, Integer.valueOf(LOS_PRODUCT_ID));
	}

	/** Get LOS_PRODUCT_ID.
		@return LOS_PRODUCT_ID	  */
	public int getLOS_PRODUCT_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_LOS_PRODUCT_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.ewizworx.model.I_LOS_PURPOSE getLOS_PURPOSE() throws RuntimeException
    {
		return (org.ewizworx.model.I_LOS_PURPOSE)MTable.get(getCtx(), org.ewizworx.model.I_LOS_PURPOSE.Table_Name)
			.getPO(getLOS_PURPOSE_ID(), get_TrxName());	}

	/** Set LOS_PURPOSE_ID.
		@param LOS_PURPOSE_ID LOS_PURPOSE_ID	  */
	public void setLOS_PURPOSE_ID (int LOS_PURPOSE_ID)
	{
		if (LOS_PURPOSE_ID < 1) 
			set_Value (COLUMNNAME_LOS_PURPOSE_ID, null);
		else 
			set_Value (COLUMNNAME_LOS_PURPOSE_ID, Integer.valueOf(LOS_PURPOSE_ID));
	}

	/** Get LOS_PURPOSE_ID.
		@return LOS_PURPOSE_ID	  */
	public int getLOS_PURPOSE_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_LOS_PURPOSE_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set SIGMENT.
		@param SIGMENT SIGMENT	  */
	public void setSIGMENT (String SIGMENT)
	{
		set_Value (COLUMNNAME_SIGMENT, SIGMENT);
	}

	/** Get SIGMENT.
		@return SIGMENT	  */
	public String getSIGMENT () 
	{
		return (String)get_Value(COLUMNNAME_SIGMENT);
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