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

/** Generated Model for COL_DISTRICT
 *  @author Adempiere (generated) 
 *  @version Release 3.7.0LTS - $Id$ */
public class X_COL_DISTRICT extends PO implements I_COL_DISTRICT, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20150105L;

    /** Standard Constructor */
    public X_COL_DISTRICT (Properties ctx, int COL_DISTRICT_ID, String trxName)
    {
      super (ctx, COL_DISTRICT_ID, trxName);
      /** if (COL_DISTRICT_ID == 0)
        {
			setCOL_DISTRICT_ID (0);
			setCOL_DIVISION_ID (0);
			setDISTRICT_NM (null);
        } */
    }

    /** Load Constructor */
    public X_COL_DISTRICT (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_COL_DISTRICT[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set COL_DISTRICT_ID.
		@param COL_DISTRICT_ID COL_DISTRICT_ID	  */
	public void setCOL_DISTRICT_ID (int COL_DISTRICT_ID)
	{
		if (COL_DISTRICT_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_COL_DISTRICT_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_COL_DISTRICT_ID, Integer.valueOf(COL_DISTRICT_ID));
	}

	/** Get COL_DISTRICT_ID.
		@return COL_DISTRICT_ID	  */
	public int getCOL_DISTRICT_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_COL_DISTRICT_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.ewizworx.model.I_COL_DIVISION getCOL_DIVISION() throws RuntimeException
    {
		return (org.ewizworx.model.I_COL_DIVISION)MTable.get(getCtx(), org.ewizworx.model.I_COL_DIVISION.Table_Name)
			.getPO(getCOL_DIVISION_ID(), get_TrxName());	}

	/** Set COL_DIVISION.
		@param COL_DIVISION_ID COL_DIVISION	  */
	public void setCOL_DIVISION_ID (int COL_DIVISION_ID)
	{
		if (COL_DIVISION_ID < 1) 
			set_Value (COLUMNNAME_COL_DIVISION_ID, null);
		else 
			set_Value (COLUMNNAME_COL_DIVISION_ID, Integer.valueOf(COL_DIVISION_ID));
	}

	/** Get COL_DIVISION.
		@return COL_DIVISION	  */
	public int getCOL_DIVISION_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_COL_DIVISION_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set DISTRICT_NM.
		@param DISTRICT_NM DISTRICT_NM	  */
	public void setDISTRICT_NM (String DISTRICT_NM)
	{
		set_Value (COLUMNNAME_DISTRICT_NM, DISTRICT_NM);
	}

	/** Get DISTRICT_NM.
		@return DISTRICT_NM	  */
	public String getDISTRICT_NM () 
	{
		return (String)get_Value(COLUMNNAME_DISTRICT_NM);
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
}