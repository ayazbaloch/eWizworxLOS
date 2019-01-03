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

/** Generated Model for COL_DISTRIBUTIONRULE
 *  @author Adempiere (generated) 
 *  @version Release 3.7.0LTS - $Id$ */
public class X_COL_DISTRIBUTIONRULE extends PO implements I_COL_DISTRIBUTIONRULE, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20150105L;

    /** Standard Constructor */
    public X_COL_DISTRIBUTIONRULE (Properties ctx, int COL_DISTRIBUTIONRULE_ID, String trxName)
    {
      super (ctx, COL_DISTRIBUTIONRULE_ID, trxName);
      /** if (COL_DISTRIBUTIONRULE_ID == 0)
        {
			setCOL_DISTRIBUTIONRULE_ID (0);
			setCOL_DUNNINGLEVEL_ID (0);
			setDISTRIBUTIONRULE (null);
			setVersion (Env.ZERO);
        } */
    }

    /** Load Constructor */
    public X_COL_DISTRIBUTIONRULE (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_COL_DISTRIBUTIONRULE[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set COL_DISTRIBUTIONRULE.
		@param COL_DISTRIBUTIONRULE_ID COL_DISTRIBUTIONRULE	  */
	public void setCOL_DISTRIBUTIONRULE_ID (int COL_DISTRIBUTIONRULE_ID)
	{
		if (COL_DISTRIBUTIONRULE_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_COL_DISTRIBUTIONRULE_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_COL_DISTRIBUTIONRULE_ID, Integer.valueOf(COL_DISTRIBUTIONRULE_ID));
	}

	/** Get COL_DISTRIBUTIONRULE.
		@return COL_DISTRIBUTIONRULE	  */
	public int getCOL_DISTRIBUTIONRULE_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_COL_DISTRIBUTIONRULE_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.ewizworx.model.I_COL_DUNNINGLEVEL getCOL_DUNNINGLEVEL() throws RuntimeException
    {
		return (org.ewizworx.model.I_COL_DUNNINGLEVEL)MTable.get(getCtx(), org.ewizworx.model.I_COL_DUNNINGLEVEL.Table_Name)
			.getPO(getCOL_DUNNINGLEVEL_ID(), get_TrxName());	}

	/** Set COL_DUNNINGLEVEL.
		@param COL_DUNNINGLEVEL_ID COL_DUNNINGLEVEL	  */
	public void setCOL_DUNNINGLEVEL_ID (int COL_DUNNINGLEVEL_ID)
	{
		if (COL_DUNNINGLEVEL_ID < 1) 
			set_Value (COLUMNNAME_COL_DUNNINGLEVEL_ID, null);
		else 
			set_Value (COLUMNNAME_COL_DUNNINGLEVEL_ID, Integer.valueOf(COL_DUNNINGLEVEL_ID));
	}

	/** Get COL_DUNNINGLEVEL.
		@return COL_DUNNINGLEVEL	  */
	public int getCOL_DUNNINGLEVEL_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_COL_DUNNINGLEVEL_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set DISTRIBUTIONRULE.
		@param DISTRIBUTIONRULE DISTRIBUTIONRULE	  */
	public void setDISTRIBUTIONRULE (String DISTRIBUTIONRULE)
	{
		set_Value (COLUMNNAME_DISTRIBUTIONRULE, DISTRIBUTIONRULE);
	}

	/** Get DISTRIBUTIONRULE.
		@return DISTRIBUTIONRULE	  */
	public String getDISTRIBUTIONRULE () 
	{
		return (String)get_Value(COLUMNNAME_DISTRIBUTIONRULE);
	}

	/** Set Version.
		@param Version 
		Version of the table definition
	  */
	public void setVersion (BigDecimal Version)
	{
		set_Value (COLUMNNAME_Version, Version);
	}

	/** Get Version.
		@return Version of the table definition
	  */
	public BigDecimal getVersion () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Version);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}
}