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

/** Generated Model for COL_TEHSIL
 *  @author Adempiere (generated) 
 *  @version Release 3.7.0LTS - $Id$ */
public class X_COL_TEHSIL extends PO implements I_COL_TEHSIL, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20150105L;

    /** Standard Constructor */
    public X_COL_TEHSIL (Properties ctx, int COL_TEHSIL_ID, String trxName)
    {
      super (ctx, COL_TEHSIL_ID, trxName);
      /** if (COL_TEHSIL_ID == 0)
        {
			setCOL_DISTRICT_ID (0);
			setCOL_TEHSIL_ID (0);
			setTEHSIL_NM (null);
        } */
    }

    /** Load Constructor */
    public X_COL_TEHSIL (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_COL_TEHSIL[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	public org.ewizworx.model.I_COL_DISTRICT getCOL_DISTRICT() throws RuntimeException
    {
		return (org.ewizworx.model.I_COL_DISTRICT)MTable.get(getCtx(), org.ewizworx.model.I_COL_DISTRICT.Table_Name)
			.getPO(getCOL_DISTRICT_ID(), get_TrxName());	}

	/** Set COL_DISTRICT_ID.
		@param COL_DISTRICT_ID COL_DISTRICT_ID	  */
	public void setCOL_DISTRICT_ID (int COL_DISTRICT_ID)
	{
		if (COL_DISTRICT_ID < 1) 
			set_Value (COLUMNNAME_COL_DISTRICT_ID, null);
		else 
			set_Value (COLUMNNAME_COL_DISTRICT_ID, Integer.valueOf(COL_DISTRICT_ID));
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

	/** Set COL_TEHSIL_ID.
		@param COL_TEHSIL_ID COL_TEHSIL_ID	  */
	public void setCOL_TEHSIL_ID (int COL_TEHSIL_ID)
	{
		if (COL_TEHSIL_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_COL_TEHSIL_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_COL_TEHSIL_ID, Integer.valueOf(COL_TEHSIL_ID));
	}

	/** Get COL_TEHSIL_ID.
		@return COL_TEHSIL_ID	  */
	public int getCOL_TEHSIL_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_COL_TEHSIL_ID);
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

	/** Set TEHSIL_NM.
		@param TEHSIL_NM TEHSIL_NM	  */
	public void setTEHSIL_NM (String TEHSIL_NM)
	{
		set_Value (COLUMNNAME_TEHSIL_NM, TEHSIL_NM);
	}

	/** Get TEHSIL_NM.
		@return TEHSIL_NM	  */
	public String getTEHSIL_NM () 
	{
		return (String)get_Value(COLUMNNAME_TEHSIL_NM);
	}
}