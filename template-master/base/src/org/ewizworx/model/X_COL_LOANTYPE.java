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

/** Generated Model for COL_LOANTYPE
 *  @author Adempiere (generated) 
 *  @version Release 3.7.0LTS - $Id$ */
public class X_COL_LOANTYPE extends PO implements I_COL_LOANTYPE, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20150105L;

    /** Standard Constructor */
    public X_COL_LOANTYPE (Properties ctx, int COL_LOANTYPE_ID, String trxName)
    {
      super (ctx, COL_LOANTYPE_ID, trxName);
      /** if (COL_LOANTYPE_ID == 0)
        {
			setCOL_LOANTYPE_ID (0);
			setIsDefault (false);
			setTYPE_CD (null);
			setType (null);
        } */
    }

    /** Load Constructor */
    public X_COL_LOANTYPE (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_COL_LOANTYPE[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set COL_LOANTYPE.
		@param COL_LOANTYPE_ID COL_LOANTYPE	  */
	public void setCOL_LOANTYPE_ID (int COL_LOANTYPE_ID)
	{
		if (COL_LOANTYPE_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_COL_LOANTYPE_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_COL_LOANTYPE_ID, Integer.valueOf(COL_LOANTYPE_ID));
	}

	/** Get COL_LOANTYPE.
		@return COL_LOANTYPE	  */
	public int getCOL_LOANTYPE_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_COL_LOANTYPE_ID);
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

	/** Set TYPE_CD.
		@param TYPE_CD TYPE_CD	  */
	public void setTYPE_CD (String TYPE_CD)
	{
		set_Value (COLUMNNAME_TYPE_CD, TYPE_CD);
	}

	/** Get TYPE_CD.
		@return TYPE_CD	  */
	public String getTYPE_CD () 
	{
		return (String)get_Value(COLUMNNAME_TYPE_CD);
	}

	/** Set Type.
		@param Type 
		Type of Validation (SQL, Java Script, Java Language)
	  */
	public void setType (String Type)
	{
		set_Value (COLUMNNAME_Type, Type);
	}

	/** Get Type.
		@return Type of Validation (SQL, Java Script, Java Language)
	  */
	public String getType () 
	{
		return (String)get_Value(COLUMNNAME_Type);
	}

	/** Set Purchase Order.
		@param btnOpenForm Purchase Order	  */
	public void setbtnOpenForm (String btnOpenForm)
	{
		set_Value (COLUMNNAME_btnOpenForm, btnOpenForm);
	}

	/** Get Purchase Order.
		@return Purchase Order	  */
	public String getbtnOpenForm () 
	{
		return (String)get_Value(COLUMNNAME_btnOpenForm);
	}
}