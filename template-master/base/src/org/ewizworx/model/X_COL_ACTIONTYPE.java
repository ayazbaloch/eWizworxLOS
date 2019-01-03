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

/** Generated Model for COL_ACTIONTYPE
 *  @author Adempiere (generated) 
 *  @version Release 3.7.0LTS - $Id$ */
public class X_COL_ACTIONTYPE extends PO implements I_COL_ACTIONTYPE, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20150105L;

    /** Standard Constructor */
    public X_COL_ACTIONTYPE (Properties ctx, int COL_ACTIONTYPE_ID, String trxName)
    {
      super (ctx, COL_ACTIONTYPE_ID, trxName);
      /** if (COL_ACTIONTYPE_ID == 0)
        {
			setACTIONCODE (null);
			setACTIONMODE (null);
// Action
			setACTIONTYPE (null);
			setCOL_ACTIONTYPE_ID (0);
        } */
    }

    /** Load Constructor */
    public X_COL_ACTIONTYPE (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_COL_ACTIONTYPE[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set ACTIONCODE.
		@param ACTIONCODE ACTIONCODE	  */
	public void setACTIONCODE (String ACTIONCODE)
	{
		set_Value (COLUMNNAME_ACTIONCODE, ACTIONCODE);
	}

	/** Get ACTIONCODE.
		@return ACTIONCODE	  */
	public String getACTIONCODE () 
	{
		return (String)get_Value(COLUMNNAME_ACTIONCODE);
	}

	/** ACTIONMODE AD_Reference_ID=1000033 */
	public static final int ACTIONMODE_AD_Reference_ID=1000033;
	/** Action = Action */
	public static final String ACTIONMODE_Action = "Action";
	/** Contact = Contact */
	public static final String ACTIONMODE_Contact = "Contact";
	/** Set ACTIONMODE.
		@param ACTIONMODE ACTIONMODE	  */
	public void setACTIONMODE (String ACTIONMODE)
	{

		set_Value (COLUMNNAME_ACTIONMODE, ACTIONMODE);
	}

	/** Get ACTIONMODE.
		@return ACTIONMODE	  */
	public String getACTIONMODE () 
	{
		return (String)get_Value(COLUMNNAME_ACTIONMODE);
	}

	/** Set ACTIONTYPE.
		@param ACTIONTYPE ACTIONTYPE	  */
	public void setACTIONTYPE (String ACTIONTYPE)
	{
		set_Value (COLUMNNAME_ACTIONTYPE, ACTIONTYPE);
	}

	/** Get ACTIONTYPE.
		@return ACTIONTYPE	  */
	public String getACTIONTYPE () 
	{
		return (String)get_Value(COLUMNNAME_ACTIONTYPE);
	}

	/** Set COL_ACTIONTYPE.
		@param COL_ACTIONTYPE_ID COL_ACTIONTYPE	  */
	public void setCOL_ACTIONTYPE_ID (int COL_ACTIONTYPE_ID)
	{
		if (COL_ACTIONTYPE_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_COL_ACTIONTYPE_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_COL_ACTIONTYPE_ID, Integer.valueOf(COL_ACTIONTYPE_ID));
	}

	/** Get COL_ACTIONTYPE.
		@return COL_ACTIONTYPE	  */
	public int getCOL_ACTIONTYPE_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_COL_ACTIONTYPE_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}
}