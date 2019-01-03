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

/** Generated Model for COL_CITY
 *  @author Adempiere (generated) 
 *  @version Release 3.7.0LTS - $Id$ */
public class X_COL_CITY extends PO implements I_COL_CITY, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20150105L;

    /** Standard Constructor */
    public X_COL_CITY (Properties ctx, int COL_CITY_ID, String trxName)
    {
      super (ctx, COL_CITY_ID, trxName);
      /** if (COL_CITY_ID == 0)
        {
			setAREA_CD (null);
			setCOL_CITY_ID (0);
			setCOL_STATE_ID (0);
			setName (null);
        } */
    }

    /** Load Constructor */
    public X_COL_CITY (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_COL_CITY[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set Area Code.
		@param AREA_CD Area Code	  */
	public void setAREA_CD (String AREA_CD)
	{
		set_Value (COLUMNNAME_AREA_CD, AREA_CD);
	}

	/** Get Area Code.
		@return Area Code	  */
	public String getAREA_CD () 
	{
		return (String)get_Value(COLUMNNAME_AREA_CD);
	}

	/** Set COL_CITY.
		@param COL_CITY_ID COL_CITY	  */
	public void setCOL_CITY_ID (int COL_CITY_ID)
	{
		if (COL_CITY_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_COL_CITY_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_COL_CITY_ID, Integer.valueOf(COL_CITY_ID));
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

	/** Set City Name.
		@param Name 
		Alphanumeric identifier of the entity
	  */
	public void setName (String Name)
	{
		set_Value (COLUMNNAME_Name, Name);
	}

	/** Get City Name.
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
}