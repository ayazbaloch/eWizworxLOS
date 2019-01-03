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

/** Generated Model for COL_DIVISION
 *  @author Adempiere (generated) 
 *  @version Release 3.7.0LTS - $Id$ */
public class X_COL_DIVISION extends PO implements I_COL_DIVISION, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20150105L;

    /** Standard Constructor */
    public X_COL_DIVISION (Properties ctx, int COL_DIVISION_ID, String trxName)
    {
      super (ctx, COL_DIVISION_ID, trxName);
      /** if (COL_DIVISION_ID == 0)
        {
			setCOL_DIVISION_ID (0);
			setCOL_STATE_ID (0);
			setName (null);
        } */
    }

    /** Load Constructor */
    public X_COL_DIVISION (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_COL_DIVISION[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set Division.
		@param COL_DIVISION_ID Division	  */
	public void setCOL_DIVISION_ID (int COL_DIVISION_ID)
	{
		if (COL_DIVISION_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_COL_DIVISION_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_COL_DIVISION_ID, Integer.valueOf(COL_DIVISION_ID));
	}

	/** Get Division.
		@return Division	  */
	public int getCOL_DIVISION_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_COL_DIVISION_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.ewizworx.model.I_COL_STATE getCOL_STATE() throws RuntimeException
    {
		return (org.ewizworx.model.I_COL_STATE)MTable.get(getCtx(), org.ewizworx.model.I_COL_STATE.Table_Name)
			.getPO(getCOL_STATE_ID(), get_TrxName());	}

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
}