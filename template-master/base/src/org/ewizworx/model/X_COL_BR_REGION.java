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

import java.sql.ResultSet;
import java.util.Properties;
import org.compiere.model.*;

/** Generated Model for COL_BR_REGION
 *  @author Adempiere (generated) 
 *  @version Release 3.7.0LTS - $Id$ */
public class X_COL_BR_REGION extends PO implements I_COL_BR_REGION, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20150105L;

    /** Standard Constructor */
    public X_COL_BR_REGION (Properties ctx, int COL_BR_REGION_ID, String trxName)
    {
      super (ctx, COL_BR_REGION_ID, trxName);
      /** if (COL_BR_REGION_ID == 0)
        {
			setCOL_BR_REGION_ID (0);
			setCOL_STATE_ID (0);
			setC_BPartner_ID (0);
			setREF_CODE (null);
			setREGION_NM (null);
        } */
    }

    /** Load Constructor */
    public X_COL_BR_REGION (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_COL_BR_REGION[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set COL_BR_REGION.
		@param COL_BR_REGION_ID COL_BR_REGION	  */
	public void setCOL_BR_REGION_ID (int COL_BR_REGION_ID)
	{
		if (COL_BR_REGION_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_COL_BR_REGION_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_COL_BR_REGION_ID, Integer.valueOf(COL_BR_REGION_ID));
	}

	/** Get COL_BR_REGION.
		@return COL_BR_REGION	  */
	public int getCOL_BR_REGION_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_COL_BR_REGION_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.ewizworx.model.I_COL_STATE getCOL_STATE() throws RuntimeException
    {
		return (org.ewizworx.model.I_COL_STATE)MTable.get(getCtx(), org.ewizworx.model.I_COL_STATE.Table_Name)
			.getPO(getCOL_STATE_ID(), get_TrxName());	}

	/** Set COL_STATE.
		@param COL_STATE_ID COL_STATE	  */
	public void setCOL_STATE_ID (int COL_STATE_ID)
	{
		if (COL_STATE_ID < 1) 
			set_Value (COLUMNNAME_COL_STATE_ID, null);
		else 
			set_Value (COLUMNNAME_COL_STATE_ID, Integer.valueOf(COL_STATE_ID));
	}

	/** Get COL_STATE.
		@return COL_STATE	  */
	public int getCOL_STATE_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_COL_STATE_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Contact #1.
		@param CONTACT_NO1 Contact #1	  */
	public void setCONTACT_NO1 (String CONTACT_NO1)
	{
		set_Value (COLUMNNAME_CONTACT_NO1, CONTACT_NO1);
	}

	/** Get Contact #1.
		@return Contact #1	  */
	public String getCONTACT_NO1 () 
	{
		return (String)get_Value(COLUMNNAME_CONTACT_NO1);
	}

	/** Set Contact #2.
		@param CONTACT_NO2 Contact #2	  */
	public void setCONTACT_NO2 (String CONTACT_NO2)
	{
		set_Value (COLUMNNAME_CONTACT_NO2, CONTACT_NO2);
	}

	/** Get Contact #2.
		@return Contact #2	  */
	public String getCONTACT_NO2 () 
	{
		return (String)get_Value(COLUMNNAME_CONTACT_NO2);
	}

	public org.compiere.model.I_C_BPartner getC_BPartner() throws RuntimeException
    {
		return (org.compiere.model.I_C_BPartner)MTable.get(getCtx(), org.compiere.model.I_C_BPartner.Table_Name)
			.getPO(getC_BPartner_ID(), get_TrxName());	}

	/** Set Regional Head.
		@param C_BPartner_ID 
		Identifies a Business Partner
	  */
	public void setC_BPartner_ID (int C_BPartner_ID)
	{
		if (C_BPartner_ID < 1) 
			set_Value (COLUMNNAME_C_BPartner_ID, null);
		else 
			set_Value (COLUMNNAME_C_BPartner_ID, Integer.valueOf(C_BPartner_ID));
	}

	/** Get Regional Head.
		@return Identifies a Business Partner
	  */
	public int getC_BPartner_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_BPartner_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
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

	/** Set e-Mail 1.
		@param EMAIL1 e-Mail 1	  */
	public void setEMAIL1 (String EMAIL1)
	{
		set_Value (COLUMNNAME_EMAIL1, EMAIL1);
	}

	/** Get e-Mail 1.
		@return e-Mail 1	  */
	public String getEMAIL1 () 
	{
		return (String)get_Value(COLUMNNAME_EMAIL1);
	}

	/** Set e-Mail 2.
		@param EMAIL2 e-Mail 2	  */
	public void setEMAIL2 (String EMAIL2)
	{
		set_Value (COLUMNNAME_EMAIL2, EMAIL2);
	}

	/** Get e-Mail 2.
		@return e-Mail 2	  */
	public String getEMAIL2 () 
	{
		return (String)get_Value(COLUMNNAME_EMAIL2);
	}

	/** Set Fax #1.
		@param FAX_NO1 Fax #1	  */
	public void setFAX_NO1 (String FAX_NO1)
	{
		set_Value (COLUMNNAME_FAX_NO1, FAX_NO1);
	}

	/** Get Fax #1.
		@return Fax #1	  */
	public String getFAX_NO1 () 
	{
		return (String)get_Value(COLUMNNAME_FAX_NO1);
	}

	/** Set Fax #2.
		@param FAX_NO2 Fax #2	  */
	public void setFAX_NO2 (String FAX_NO2)
	{
		set_Value (COLUMNNAME_FAX_NO2, FAX_NO2);
	}

	/** Get Fax #2.
		@return Fax #2	  */
	public String getFAX_NO2 () 
	{
		return (String)get_Value(COLUMNNAME_FAX_NO2);
	}

	/** Set Rg. Code.
		@param REF_CODE Rg. Code	  */
	public void setREF_CODE (String REF_CODE)
	{
		set_Value (COLUMNNAME_REF_CODE, REF_CODE);
	}

	/** Get Rg. Code.
		@return Rg. Code	  */
	public String getREF_CODE () 
	{
		return (String)get_Value(COLUMNNAME_REF_CODE);
	}

	/** Set Region.
		@param REGION_NM Region	  */
	public void setREGION_NM (String REGION_NM)
	{
		set_Value (COLUMNNAME_REGION_NM, REGION_NM);
	}

	/** Get Region.
		@return Region	  */
	public String getREGION_NM () 
	{
		return (String)get_Value(COLUMNNAME_REGION_NM);
	}
}