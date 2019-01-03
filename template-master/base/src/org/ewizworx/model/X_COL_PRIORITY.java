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

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.util.Properties;
import org.compiere.model.*;
import org.compiere.util.Env;

/** Generated Model for COL_PRIORITY
 *  @author Adempiere (generated) 
 *  @version Release 3.7.0LTS - $Id$ */
public class X_COL_PRIORITY extends PO implements I_COL_PRIORITY, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20150105L;

    /** Standard Constructor */
    public X_COL_PRIORITY (Properties ctx, int COL_PRIORITY_ID, String trxName)
    {
      super (ctx, COL_PRIORITY_ID, trxName);
      /** if (COL_PRIORITY_ID == 0)
        {
			setCOL_PRIORITY_ID (0);
			setDescription (null);
			setIsDefault (false);
			setPriority (Env.ZERO);
        } */
    }

    /** Load Constructor */
    public X_COL_PRIORITY (Properties ctx, ResultSet rs, String trxName)
    {
      super (ctx, rs, trxName);
    }

    /** AccessLevel
      * @return 4 - System 
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
      StringBuffer sb = new StringBuffer ("X_COL_PRIORITY[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set COL_PRIORITY.
		@param COL_PRIORITY_ID COL_PRIORITY	  */
	public void setCOL_PRIORITY_ID (int COL_PRIORITY_ID)
	{
		if (COL_PRIORITY_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_COL_PRIORITY_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_COL_PRIORITY_ID, Integer.valueOf(COL_PRIORITY_ID));
	}

	/** Get COL_PRIORITY.
		@return COL_PRIORITY	  */
	public int getCOL_PRIORITY_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_COL_PRIORITY_ID);
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

	/** Set Priority.
		@param Priority 
		Indicates if this request is of a high, medium or low priority.
	  */
	public void setPriority (BigDecimal Priority)
	{
		set_Value (COLUMNNAME_Priority, Priority);
	}

	/** Get Priority.
		@return Indicates if this request is of a high, medium or low priority.
	  */
	public BigDecimal getPriority () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Priority);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}
}