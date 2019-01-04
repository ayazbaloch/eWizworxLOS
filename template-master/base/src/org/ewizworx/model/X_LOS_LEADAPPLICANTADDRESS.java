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
import java.util.Properties;
import org.compiere.model.*;

/** Generated Model for LOS_LEADAPPLICANTADDRESS
 *  @author Adempiere (generated) 
 *  @version Release 3.9.0 - $Id$ */
public class X_LOS_LEADAPPLICANTADDRESS extends PO implements I_LOS_LEADAPPLICANTADDRESS, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20190104L;

    /** Standard Constructor */
    public X_LOS_LEADAPPLICANTADDRESS (Properties ctx, int LOS_LEADAPPLICANTADDRESS_ID, String trxName)
    {
      super (ctx, LOS_LEADAPPLICANTADDRESS_ID, trxName);
      /** if (LOS_LEADAPPLICANTADDRESS_ID == 0)
        {
			setAddress1 (null);
			setCOL_CITY_ID (0);
			setCOL_COUNTRY_ID (0);
			setCOL_STATE_ID (0);
			setEW_ADDRESSTYPE_ID (0);
			setLOS_LEADAPPLICANTADDRESS_ID (0);
			setLOS_LEADAPPLICANT_ID (0);
			setUUID (null);
        } */
    }

    /** Load Constructor */
    public X_LOS_LEADAPPLICANTADDRESS (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_LOS_LEADAPPLICANTADDRESS[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set Address 1.
		@param Address1 
		Address line 1 for this location
	  */
	public void setAddress1 (String Address1)
	{
		set_Value (COLUMNNAME_Address1, Address1);
	}

	/** Get Address 1.
		@return Address line 1 for this location
	  */
	public String getAddress1 () 
	{
		return (String)get_Value(COLUMNNAME_Address1);
	}

	/** Set Address 2.
		@param Address2 
		Address line 2 for this location
	  */
	public void setAddress2 (String Address2)
	{
		set_Value (COLUMNNAME_Address2, Address2);
	}

	/** Get Address 2.
		@return Address line 2 for this location
	  */
	public String getAddress2 () 
	{
		return (String)get_Value(COLUMNNAME_Address2);
	}

	/** Set Address 3.
		@param Address3 
		Address Line 3 for the location
	  */
	public void setAddress3 (String Address3)
	{
		set_Value (COLUMNNAME_Address3, Address3);
	}

	/** Get Address 3.
		@return Address Line 3 for the location
	  */
	public String getAddress3 () 
	{
		return (String)get_Value(COLUMNNAME_Address3);
	}

	/** Set City.
		@param COL_CITY_ID City	  */
	public void setCOL_CITY_ID (int COL_CITY_ID)
	{
		if (COL_CITY_ID < 1) 
			set_Value (COLUMNNAME_COL_CITY_ID, null);
		else 
			set_Value (COLUMNNAME_COL_CITY_ID, Integer.valueOf(COL_CITY_ID));
	}

	/** Get City.
		@return City	  */
	public int getCOL_CITY_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_COL_CITY_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Country.
		@param COL_COUNTRY_ID Country	  */
	public void setCOL_COUNTRY_ID (int COL_COUNTRY_ID)
	{
		if (COL_COUNTRY_ID < 1) 
			set_Value (COLUMNNAME_COL_COUNTRY_ID, null);
		else 
			set_Value (COLUMNNAME_COL_COUNTRY_ID, Integer.valueOf(COL_COUNTRY_ID));
	}

	/** Get Country.
		@return Country	  */
	public int getCOL_COUNTRY_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_COL_COUNTRY_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set State.
		@param COL_STATE_ID State	  */
	public void setCOL_STATE_ID (int COL_STATE_ID)
	{
		if (COL_STATE_ID < 1) 
			set_Value (COLUMNNAME_COL_STATE_ID, null);
		else 
			set_Value (COLUMNNAME_COL_STATE_ID, Integer.valueOf(COL_STATE_ID));
	}

	/** Get State.
		@return State	  */
	public int getCOL_STATE_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_COL_STATE_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Address Type.
		@param EW_ADDRESSTYPE_ID Address Type	  */
	public void setEW_ADDRESSTYPE_ID (int EW_ADDRESSTYPE_ID)
	{
		if (EW_ADDRESSTYPE_ID < 1) 
			set_Value (COLUMNNAME_EW_ADDRESSTYPE_ID, null);
		else 
			set_Value (COLUMNNAME_EW_ADDRESSTYPE_ID, Integer.valueOf(EW_ADDRESSTYPE_ID));
	}

	/** Get Address Type.
		@return Address Type	  */
	public int getEW_ADDRESSTYPE_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_EW_ADDRESSTYPE_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set LOS LEAD APPLICANT ADDRESS ID.
		@param LOS_LEADAPPLICANTADDRESS_ID LOS LEAD APPLICANT ADDRESS ID	  */
	public void setLOS_LEADAPPLICANTADDRESS_ID (int LOS_LEADAPPLICANTADDRESS_ID)
	{
		if (LOS_LEADAPPLICANTADDRESS_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_LOS_LEADAPPLICANTADDRESS_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_LOS_LEADAPPLICANTADDRESS_ID, Integer.valueOf(LOS_LEADAPPLICANTADDRESS_ID));
	}

	/** Get LOS LEAD APPLICANT ADDRESS ID.
		@return LOS LEAD APPLICANT ADDRESS ID	  */
	public int getLOS_LEADAPPLICANTADDRESS_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_LOS_LEADAPPLICANTADDRESS_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set LOS LEAD APPLICANT ID.
		@param LOS_LEADAPPLICANT_ID LOS LEAD APPLICANT ID	  */
	public void setLOS_LEADAPPLICANT_ID (int LOS_LEADAPPLICANT_ID)
	{
		if (LOS_LEADAPPLICANT_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_LOS_LEADAPPLICANT_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_LOS_LEADAPPLICANT_ID, Integer.valueOf(LOS_LEADAPPLICANT_ID));
	}

	/** Get LOS LEAD APPLICANT ID.
		@return LOS LEAD APPLICANT ID	  */
	public int getLOS_LEADAPPLICANT_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_LOS_LEADAPPLICANT_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set POST_CD.
		@param POST_CD POST_CD	  */
	public void setPOST_CD (String POST_CD)
	{
		set_Value (COLUMNNAME_POST_CD, POST_CD);
	}

	/** Get POST_CD.
		@return POST_CD	  */
	public String getPOST_CD () 
	{
		return (String)get_Value(COLUMNNAME_POST_CD);
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