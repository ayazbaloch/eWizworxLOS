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
package org.compiere.model;

import java.sql.ResultSet;
import java.util.Properties;


/** Generated Model for EW_GREETING
 *  @author Adempiere (generated) 
 *  @version Release 3.7.0LTS - $Id$ */
public class X_EW_GREETING extends PO implements I_EW_GREETING, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20140326L;

    /** Standard Constructor */
    public X_EW_GREETING (Properties ctx, int EW_GREETING_ID, String trxName)
    {
      super (ctx, EW_GREETING_ID, trxName);
      /** if (EW_GREETING_ID == 0)
        {
			setEW_GREETING_ID (0);
			setGreeting (null);
			setIsDefault (false);
        } */
    }

    /** Load Constructor */
    public X_EW_GREETING (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_EW_GREETING[")
        .append(get_ID()).append("]");
      return sb.toString();
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

	/** Set EW_GREETING.
		@param EW_GREETING_ID EW_GREETING	  */
	public void setEW_GREETING_ID (int EW_GREETING_ID)
	{
		if (EW_GREETING_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_EW_GREETING_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_EW_GREETING_ID, Integer.valueOf(EW_GREETING_ID));
	}

	/** Get EW_GREETING.
		@return EW_GREETING	  */
	public int getEW_GREETING_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_EW_GREETING_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Greeting.
		@param Greeting 
		For letters, e.g. "Dear {0}" or "Dear Mr. {0}" - At runtime, "{0}" is replaced by the name
	  */
	public void setGreeting (String Greeting)
	{
		set_Value (COLUMNNAME_Greeting, Greeting);
	}

	/** Get Greeting.
		@return For letters, e.g. "Dear {0}" or "Dear Mr. {0}" - At runtime, "{0}" is replaced by the name
	  */
	public String getGreeting () 
	{
		return (String)get_Value(COLUMNNAME_Greeting);
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
}