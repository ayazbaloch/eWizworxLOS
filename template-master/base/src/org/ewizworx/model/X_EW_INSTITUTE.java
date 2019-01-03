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
import org.compiere.util.KeyNamePair;

/** Generated Model for EW_INSTITUTE
 *  @author Adempiere (generated) 
 *  @version Release 3.7.0LTS - $Id$ */
public class X_EW_INSTITUTE extends PO implements I_EW_INSTITUTE, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20150105L;

    /** Standard Constructor */
    public X_EW_INSTITUTE (Properties ctx, int EW_INSTITUTE_ID, String trxName)
    {
      super (ctx, EW_INSTITUTE_ID, trxName);
      /** if (EW_INSTITUTE_ID == 0)
        {
			setAD_Language_ID (0);
			setCOL_CITY_ID (0);
			setCOL_COUNTRY_ID (0);
			setCOL_STATE_ID (0);
			setEW_INSTITUTE_ID (0);
			setIsDefault (false);
			setName (null);
        } */
    }

    /** Load Constructor */
    public X_EW_INSTITUTE (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_EW_INSTITUTE[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	public org.compiere.model.I_AD_Language getAD_Language() throws RuntimeException
    {
		return (org.compiere.model.I_AD_Language)MTable.get(getCtx(), org.compiere.model.I_AD_Language.Table_Name)
			.getPO(getAD_Language_ID(), get_TrxName());	}

	/** Set Language ID.
		@param AD_Language_ID Language ID	  */
	public void setAD_Language_ID (int AD_Language_ID)
	{
		if (AD_Language_ID < 1) 
			set_Value (COLUMNNAME_AD_Language_ID, null);
		else 
			set_Value (COLUMNNAME_AD_Language_ID, Integer.valueOf(AD_Language_ID));
	}

	/** Get Language ID.
		@return Language ID	  */
	public int getAD_Language_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_AD_Language_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.ewizworx.model.I_COL_CITY getCOL_CITY() throws RuntimeException
    {
		return (org.ewizworx.model.I_COL_CITY)MTable.get(getCtx(), org.ewizworx.model.I_COL_CITY.Table_Name)
			.getPO(getCOL_CITY_ID(), get_TrxName());	}

	/** Set COL_CITY.
		@param COL_CITY_ID COL_CITY	  */
	public void setCOL_CITY_ID (int COL_CITY_ID)
	{
		if (COL_CITY_ID < 1) 
			set_Value (COLUMNNAME_COL_CITY_ID, null);
		else 
			set_Value (COLUMNNAME_COL_CITY_ID, Integer.valueOf(COL_CITY_ID));
	}

	/** Get COL_CITY.
		@return COL_CITY	  */
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

	/** Set EMail Address.
		@param EMail 
		Electronic Mail Address
	  */
	public void setEMail (String EMail)
	{
		set_Value (COLUMNNAME_EMail, EMail);
	}

	/** Get EMail Address.
		@return Electronic Mail Address
	  */
	public String getEMail () 
	{
		return (String)get_Value(COLUMNNAME_EMail);
	}

	/** Set EW_INSTITUTE.
		@param EW_INSTITUTE_ID EW_INSTITUTE	  */
	public void setEW_INSTITUTE_ID (int EW_INSTITUTE_ID)
	{
		if (EW_INSTITUTE_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_EW_INSTITUTE_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_EW_INSTITUTE_ID, Integer.valueOf(EW_INSTITUTE_ID));
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

	/** Set FAX_NO.
		@param FAX_NO FAX_NO	  */
	public void setFAX_NO (String FAX_NO)
	{
		set_Value (COLUMNNAME_FAX_NO, FAX_NO);
	}

	/** Get FAX_NO.
		@return FAX_NO	  */
	public String getFAX_NO () 
	{
		return (String)get_Value(COLUMNNAME_FAX_NO);
	}

	/** Set Default.
		@param IsDefault 
		Default value
	  */
	public void setIsDefault (boolean IsDefault)
	{
		set_Value (COLUMNNAME_IsDefault, Boolean.valueOf(IsDefault));
	}

	/** Get Default.
		@return Default value
	  */
	public boolean isDefault () 
	{
		Object oo = get_Value(COLUMNNAME_IsDefault);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set LAND_LINE_NO.
		@param LAND_LINE_NO LAND_LINE_NO	  */
	public void setLAND_LINE_NO (String LAND_LINE_NO)
	{
		set_Value (COLUMNNAME_LAND_LINE_NO, LAND_LINE_NO);
	}

	/** Get LAND_LINE_NO.
		@return LAND_LINE_NO	  */
	public String getLAND_LINE_NO () 
	{
		return (String)get_Value(COLUMNNAME_LAND_LINE_NO);
	}

	/** Set Name.
		@param Name 
		Alphanumeric identifier of the entity
	  */
	public void setName (String Name)
	{
		set_Value (COLUMNNAME_Name, Name);
	}

	/** Get Name.
		@return Alphanumeric identifier of the entity
	  */
	public String getName () 
	{
		return (String)get_Value(COLUMNNAME_Name);
	}

    /** Get Record ID/ColumnName
        @return ID/ColumnName pair
      */
    public KeyNamePair getKeyNamePair() 
    {
        return new KeyNamePair(get_ID(), getName());
    }

	/** Set STREET_ADDRESS.
		@param STREET_ADDRESS STREET_ADDRESS	  */
	public void setSTREET_ADDRESS (String STREET_ADDRESS)
	{
		set_Value (COLUMNNAME_STREET_ADDRESS, STREET_ADDRESS);
	}

	/** Get STREET_ADDRESS.
		@return STREET_ADDRESS	  */
	public String getSTREET_ADDRESS () 
	{
		return (String)get_Value(COLUMNNAME_STREET_ADDRESS);
	}

	/** Set UAN_NO.
		@param UAN_NO UAN_NO	  */
	public void setUAN_NO (String UAN_NO)
	{
		set_Value (COLUMNNAME_UAN_NO, UAN_NO);
	}

	/** Get UAN_NO.
		@return UAN_NO	  */
	public String getUAN_NO () 
	{
		return (String)get_Value(COLUMNNAME_UAN_NO);
	}

	/** Set WEB_SITE.
		@param WEB_SITE WEB_SITE	  */
	public void setWEB_SITE (String WEB_SITE)
	{
		set_Value (COLUMNNAME_WEB_SITE, WEB_SITE);
	}

	/** Get WEB_SITE.
		@return WEB_SITE	  */
	public String getWEB_SITE () 
	{
		return (String)get_Value(COLUMNNAME_WEB_SITE);
	}

	/** Set ZIP_CODE.
		@param ZIP_CODE ZIP_CODE	  */
	public void setZIP_CODE (String ZIP_CODE)
	{
		set_Value (COLUMNNAME_ZIP_CODE, ZIP_CODE);
	}

	/** Get ZIP_CODE.
		@return ZIP_CODE	  */
	public String getZIP_CODE () 
	{
		return (String)get_Value(COLUMNNAME_ZIP_CODE);
	}
}