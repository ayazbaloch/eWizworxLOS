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

/** Generated Model for COL_BRANCH
 *  @author Adempiere (generated) 
 *  @version Release 3.7.0LTS - $Id$ */
public class X_COL_BRANCH extends PO implements I_COL_BRANCH, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20150105L;

    /** Standard Constructor */
    public X_COL_BRANCH (Properties ctx, int COL_BRANCH_ID, String trxName)
    {
      super (ctx, COL_BRANCH_ID, trxName);
      /** if (COL_BRANCH_ID == 0)
        {
			setBRANCH_NM (null);
			setCOL_BRANCH_ID (0);
			setCOL_BR_REGION_ID (0);
			setCOL_DISTRICT_ID (0);
			setCOL_TEHSIL_ID (0);
			setC_BPartner_ID (0);
			setISLAMIC_BANKING (false);
			setREF_CODE (null);
			setStatus (null);
        } */
    }

    /** Load Constructor */
    public X_COL_BRANCH (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_COL_BRANCH[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set BRANCH_NM.
		@param BRANCH_NM BRANCH_NM	  */
	public void setBRANCH_NM (String BRANCH_NM)
	{
		set_Value (COLUMNNAME_BRANCH_NM, BRANCH_NM);
	}

	/** Get BRANCH_NM.
		@return BRANCH_NM	  */
	public String getBRANCH_NM () 
	{
		return (String)get_Value(COLUMNNAME_BRANCH_NM);
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

	public org.ewizworx.model.I_COL_BR_REGION getCOL_BR_REGION() throws RuntimeException
    {
		return (org.ewizworx.model.I_COL_BR_REGION)MTable.get(getCtx(), org.ewizworx.model.I_COL_BR_REGION.Table_Name)
			.getPO(getCOL_BR_REGION_ID(), get_TrxName());	}

	/** Set COL_BR_REGION.
		@param COL_BR_REGION_ID COL_BR_REGION	  */
	public void setCOL_BR_REGION_ID (int COL_BR_REGION_ID)
	{
		if (COL_BR_REGION_ID < 1) 
			set_Value (COLUMNNAME_COL_BR_REGION_ID, null);
		else 
			set_Value (COLUMNNAME_COL_BR_REGION_ID, Integer.valueOf(COL_BR_REGION_ID));
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

	public org.ewizworx.model.I_COL_DISTRICT getCOL_DISTRICT() throws RuntimeException
    {
		return (org.ewizworx.model.I_COL_DISTRICT)MTable.get(getCtx(), org.ewizworx.model.I_COL_DISTRICT.Table_Name)
			.getPO(getCOL_DISTRICT_ID(), get_TrxName());	}

	/** Set COL_DISTRICT_ID.
		@param COL_DISTRICT_ID COL_DISTRICT_ID	  */
	public void setCOL_DISTRICT_ID (int COL_DISTRICT_ID)
	{
		if (COL_DISTRICT_ID < 1) 
			set_Value (COLUMNNAME_COL_DISTRICT_ID, null);
		else 
			set_Value (COLUMNNAME_COL_DISTRICT_ID, Integer.valueOf(COL_DISTRICT_ID));
	}

	/** Get COL_DISTRICT_ID.
		@return COL_DISTRICT_ID	  */
	public int getCOL_DISTRICT_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_COL_DISTRICT_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.ewizworx.model.I_COL_TEHSIL getCOL_TEHSIL() throws RuntimeException
    {
		return (org.ewizworx.model.I_COL_TEHSIL)MTable.get(getCtx(), org.ewizworx.model.I_COL_TEHSIL.Table_Name)
			.getPO(getCOL_TEHSIL_ID(), get_TrxName());	}

	/** Set COL_TEHSIL_ID.
		@param COL_TEHSIL_ID COL_TEHSIL_ID	  */
	public void setCOL_TEHSIL_ID (int COL_TEHSIL_ID)
	{
		if (COL_TEHSIL_ID < 1) 
			set_Value (COLUMNNAME_COL_TEHSIL_ID, null);
		else 
			set_Value (COLUMNNAME_COL_TEHSIL_ID, Integer.valueOf(COL_TEHSIL_ID));
	}

	/** Get COL_TEHSIL_ID.
		@return COL_TEHSIL_ID	  */
	public int getCOL_TEHSIL_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_COL_TEHSIL_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set CONTACT_NO1.
		@param CONTACT_NO1 CONTACT_NO1	  */
	public void setCONTACT_NO1 (String CONTACT_NO1)
	{
		set_Value (COLUMNNAME_CONTACT_NO1, CONTACT_NO1);
	}

	/** Get CONTACT_NO1.
		@return CONTACT_NO1	  */
	public String getCONTACT_NO1 () 
	{
		return (String)get_Value(COLUMNNAME_CONTACT_NO1);
	}

	/** Set CONTACT_NO2.
		@param CONTACT_NO2 CONTACT_NO2	  */
	public void setCONTACT_NO2 (String CONTACT_NO2)
	{
		set_Value (COLUMNNAME_CONTACT_NO2, CONTACT_NO2);
	}

	/** Get CONTACT_NO2.
		@return CONTACT_NO2	  */
	public String getCONTACT_NO2 () 
	{
		return (String)get_Value(COLUMNNAME_CONTACT_NO2);
	}

	public org.compiere.model.I_C_BPartner getC_BPartner() throws RuntimeException
    {
		return (org.compiere.model.I_C_BPartner)MTable.get(getCtx(), org.compiere.model.I_C_BPartner.Table_Name)
			.getPO(getC_BPartner_ID(), get_TrxName());	}

	/** Set Business Partner .
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

	/** Get Business Partner .
		@return Identifies a Business Partner
	  */
	public int getC_BPartner_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_BPartner_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Category.
		@param Category Category	  */
	public void setCategory (String Category)
	{
		set_Value (COLUMNNAME_Category, Category);
	}

	/** Get Category.
		@return Category	  */
	public String getCategory () 
	{
		return (String)get_Value(COLUMNNAME_Category);
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

	/** Set EMAIL1.
		@param EMAIL1 EMAIL1	  */
	public void setEMAIL1 (String EMAIL1)
	{
		set_Value (COLUMNNAME_EMAIL1, EMAIL1);
	}

	/** Get EMAIL1.
		@return EMAIL1	  */
	public String getEMAIL1 () 
	{
		return (String)get_Value(COLUMNNAME_EMAIL1);
	}

	/** Set EMAIL2.
		@param EMAIL2 EMAIL2	  */
	public void setEMAIL2 (String EMAIL2)
	{
		set_Value (COLUMNNAME_EMAIL2, EMAIL2);
	}

	/** Get EMAIL2.
		@return EMAIL2	  */
	public String getEMAIL2 () 
	{
		return (String)get_Value(COLUMNNAME_EMAIL2);
	}

	/** Set FAX_NO1.
		@param FAX_NO1 FAX_NO1	  */
	public void setFAX_NO1 (String FAX_NO1)
	{
		set_Value (COLUMNNAME_FAX_NO1, FAX_NO1);
	}

	/** Get FAX_NO1.
		@return FAX_NO1	  */
	public String getFAX_NO1 () 
	{
		return (String)get_Value(COLUMNNAME_FAX_NO1);
	}

	/** Set FAX_NO2.
		@param FAX_NO2 FAX_NO2	  */
	public void setFAX_NO2 (String FAX_NO2)
	{
		set_Value (COLUMNNAME_FAX_NO2, FAX_NO2);
	}

	/** Get FAX_NO2.
		@return FAX_NO2	  */
	public String getFAX_NO2 () 
	{
		return (String)get_Value(COLUMNNAME_FAX_NO2);
	}

	/** Set ISLAMIC_BANKING.
		@param ISLAMIC_BANKING ISLAMIC_BANKING	  */
	public void setISLAMIC_BANKING (boolean ISLAMIC_BANKING)
	{
		set_Value (COLUMNNAME_ISLAMIC_BANKING, Boolean.valueOf(ISLAMIC_BANKING));
	}

	/** Get ISLAMIC_BANKING.
		@return ISLAMIC_BANKING	  */
	public boolean isLAMIC_BANKING () 
	{
		Object oo = get_Value(COLUMNNAME_ISLAMIC_BANKING);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
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

	/** Set SWIFT_CODE.
		@param SWIFT_CODE SWIFT_CODE	  */
	public void setSWIFT_CODE (String SWIFT_CODE)
	{
		set_Value (COLUMNNAME_SWIFT_CODE, SWIFT_CODE);
	}

	/** Get SWIFT_CODE.
		@return SWIFT_CODE	  */
	public String getSWIFT_CODE () 
	{
		return (String)get_Value(COLUMNNAME_SWIFT_CODE);
	}

	/** Status AD_Reference_ID=1000008 */
	public static final int STATUS_AD_Reference_ID=1000008;
	/** Online = Online */
	public static final String STATUS_Online = "Online";
	/** Offline = Offline */
	public static final String STATUS_Offline = "Offline";
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