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

/** Generated Model for EW_PERSON_ADDRESS
 *  @author Adempiere (generated) 
 *  @version Release 3.7.0LTS - $Id$ */
public class X_EW_PERSON_ADDRESS extends PO implements I_EW_PERSON_ADDRESS, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20150105L;

    /** Standard Constructor */
    public X_EW_PERSON_ADDRESS (Properties ctx, int EW_PERSON_ADDRESS_ID, String trxName)
    {
      super (ctx, EW_PERSON_ADDRESS_ID, trxName);
      /** if (EW_PERSON_ADDRESS_ID == 0)
        {
			setAddress1 (null);
			setCOL_CITY_ID (0);
			setCOL_COUNTRY_ID (0);
// 1000000
			setCOL_STATE_ID (0);
			setEW_ADDRESSTYPE_ID (0);
// @SQL=SELECT EW_ADDRESSTYPE_ID FROM EW_ADDRESSTYPE WHERE ISDEFAULT='Y'
			setEW_PERSON_ADDRESS_ID (0);
			setEW_PERSON_ID (0);
        } */
    }

    /** Load Constructor */
    public X_EW_PERSON_ADDRESS (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_EW_PERSON_ADDRESS[")
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

	public org.ewizworx.model.I_COL_CITY getCOL_CITY() throws RuntimeException
    {
		return (org.ewizworx.model.I_COL_CITY)MTable.get(getCtx(), org.ewizworx.model.I_COL_CITY.Table_Name)
			.getPO(getCOL_CITY_ID(), get_TrxName());	}

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

	public org.ewizworx.model.I_COL_COUNTRY getCOL_COUNTRY() throws RuntimeException
    {
		return (org.ewizworx.model.I_COL_COUNTRY)MTable.get(getCtx(), org.ewizworx.model.I_COL_COUNTRY.Table_Name)
			.getPO(getCOL_COUNTRY_ID(), get_TrxName());	}

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

	public org.ewizworx.model.I_COL_STATE getCOL_STATE() throws RuntimeException
    {
		return (org.ewizworx.model.I_COL_STATE)MTable.get(getCtx(), org.ewizworx.model.I_COL_STATE.Table_Name)
			.getPO(getCOL_STATE_ID(), get_TrxName());	}

	/** Set Province.
		@param COL_STATE_ID Province	  */
	public void setCOL_STATE_ID (int COL_STATE_ID)
	{
		if (COL_STATE_ID < 1) 
			set_Value (COLUMNNAME_COL_STATE_ID, null);
		else 
			set_Value (COLUMNNAME_COL_STATE_ID, Integer.valueOf(COL_STATE_ID));
	}

	/** Get Province.
		@return Province	  */
	public int getCOL_STATE_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_COL_STATE_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.ewizworx.model.I_EW_ADDRESSTYPE getEW_ADDRESSTYPE() throws RuntimeException
    {
		return (org.ewizworx.model.I_EW_ADDRESSTYPE)MTable.get(getCtx(), org.ewizworx.model.I_EW_ADDRESSTYPE.Table_Name)
			.getPO(getEW_ADDRESSTYPE_ID(), get_TrxName());	}

	/** Set Type.
		@param EW_ADDRESSTYPE_ID Type	  */
	public void setEW_ADDRESSTYPE_ID (int EW_ADDRESSTYPE_ID)
	{
		if (EW_ADDRESSTYPE_ID < 1) 
			set_Value (COLUMNNAME_EW_ADDRESSTYPE_ID, null);
		else 
			set_Value (COLUMNNAME_EW_ADDRESSTYPE_ID, Integer.valueOf(EW_ADDRESSTYPE_ID));
	}

	/** Get Type.
		@return Type	  */
	public int getEW_ADDRESSTYPE_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_EW_ADDRESSTYPE_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set EW_PERSON_ADDRESS.
		@param EW_PERSON_ADDRESS_ID EW_PERSON_ADDRESS	  */
	public void setEW_PERSON_ADDRESS_ID (int EW_PERSON_ADDRESS_ID)
	{
		if (EW_PERSON_ADDRESS_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_EW_PERSON_ADDRESS_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_EW_PERSON_ADDRESS_ID, Integer.valueOf(EW_PERSON_ADDRESS_ID));
	}

	/** Get EW_PERSON_ADDRESS.
		@return EW_PERSON_ADDRESS	  */
	public int getEW_PERSON_ADDRESS_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_EW_PERSON_ADDRESS_ID);
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
			set_Value (COLUMNNAME_EW_PERSON_ID, null);
		else 
			set_Value (COLUMNNAME_EW_PERSON_ID, Integer.valueOf(EW_PERSON_ID));
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

	/** Set Post Code.
		@param POST_CD Post Code	  */
	public void setPOST_CD (String POST_CD)
	{
		set_Value (COLUMNNAME_POST_CD, POST_CD);
	}

	/** Get Post Code.
		@return Post Code	  */
	public String getPOST_CD () 
	{
		return (String)get_Value(COLUMNNAME_POST_CD);
	}
}