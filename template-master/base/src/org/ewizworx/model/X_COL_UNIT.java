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

/** Generated Model for COL_UNIT
 *  @author Adempiere (generated) 
 *  @version Release 3.7.0LTS - $Id$ */
public class X_COL_UNIT extends PO implements I_COL_UNIT, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20150105L;

    /** Standard Constructor */
    public X_COL_UNIT (Properties ctx, int COL_UNIT_ID, String trxName)
    {
      super (ctx, COL_UNIT_ID, trxName);
      /** if (COL_UNIT_ID == 0)
        {
			setCOL_UNIT_ID (0);
			setIsDefault (false);
			setUNIT (null);
        } */
    }

    /** Load Constructor */
    public X_COL_UNIT (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_COL_UNIT[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set COL_UNIT.
		@param COL_UNIT_ID COL_UNIT	  */
	public void setCOL_UNIT_ID (int COL_UNIT_ID)
	{
		if (COL_UNIT_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_COL_UNIT_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_COL_UNIT_ID, Integer.valueOf(COL_UNIT_ID));
	}

	/** Get COL_UNIT.
		@return COL_UNIT	  */
	public int getCOL_UNIT_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_COL_UNIT_ID);
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

	/** Set UNIT.
		@param UNIT UNIT	  */
	public void setUNIT (String UNIT)
	{
		set_Value (COLUMNNAME_UNIT, UNIT);
	}

	/** Get UNIT.
		@return UNIT	  */
	public String getUNIT () 
	{
		return (String)get_Value(COLUMNNAME_UNIT);
	}
}