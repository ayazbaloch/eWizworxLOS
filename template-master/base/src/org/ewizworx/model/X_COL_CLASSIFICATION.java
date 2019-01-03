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

/** Generated Model for COL_CLASSIFICATION
 *  @author Adempiere (generated) 
 *  @version Release 3.7.0LTS - $Id$ */
public class X_COL_CLASSIFICATION extends PO implements I_COL_CLASSIFICATION, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20150105L;

    /** Standard Constructor */
    public X_COL_CLASSIFICATION (Properties ctx, int COL_CLASSIFICATION_ID, String trxName)
    {
      super (ctx, COL_CLASSIFICATION_ID, trxName);
      /** if (COL_CLASSIFICATION_ID == 0)
        {
			setCOL_CLASSIFICATION_ID (0);
			setCOL_PRODUCT_ID (0);
			setClassification (null);
			setDPD_FROM (Env.ZERO);
			setDPT_TO (Env.ZERO);
			setIsDefault (false);
			setLVL (0);
			setPROVISION (Env.ZERO);
        } */
    }

    /** Load Constructor */
    public X_COL_CLASSIFICATION (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_COL_CLASSIFICATION[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set COL_CLASSIFICATION.
		@param COL_CLASSIFICATION_ID COL_CLASSIFICATION	  */
	public void setCOL_CLASSIFICATION_ID (int COL_CLASSIFICATION_ID)
	{
		if (COL_CLASSIFICATION_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_COL_CLASSIFICATION_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_COL_CLASSIFICATION_ID, Integer.valueOf(COL_CLASSIFICATION_ID));
	}

	/** Get COL_CLASSIFICATION.
		@return COL_CLASSIFICATION	  */
	public int getCOL_CLASSIFICATION_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_COL_CLASSIFICATION_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.ewizworx.model.I_COL_PRODUCT getCOL_PRODUCT() throws RuntimeException
    {
		return (org.ewizworx.model.I_COL_PRODUCT)MTable.get(getCtx(), org.ewizworx.model.I_COL_PRODUCT.Table_Name)
			.getPO(getCOL_PRODUCT_ID(), get_TrxName());	}

	/** Set COL_PRODUCT.
		@param COL_PRODUCT_ID COL_PRODUCT	  */
	public void setCOL_PRODUCT_ID (int COL_PRODUCT_ID)
	{
		if (COL_PRODUCT_ID < 1) 
			set_Value (COLUMNNAME_COL_PRODUCT_ID, null);
		else 
			set_Value (COLUMNNAME_COL_PRODUCT_ID, Integer.valueOf(COL_PRODUCT_ID));
	}

	/** Get COL_PRODUCT.
		@return COL_PRODUCT	  */
	public int getCOL_PRODUCT_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_COL_PRODUCT_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Classification.
		@param Classification 
		Classification for grouping
	  */
	public void setClassification (String Classification)
	{
		set_Value (COLUMNNAME_Classification, Classification);
	}

	/** Get Classification.
		@return Classification for grouping
	  */
	public String getClassification () 
	{
		return (String)get_Value(COLUMNNAME_Classification);
	}

	/** Set DPD_FROM.
		@param DPD_FROM DPD_FROM	  */
	public void setDPD_FROM (BigDecimal DPD_FROM)
	{
		set_Value (COLUMNNAME_DPD_FROM, DPD_FROM);
	}

	/** Get DPD_FROM.
		@return DPD_FROM	  */
	public BigDecimal getDPD_FROM () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_DPD_FROM);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set DPT_TO.
		@param DPT_TO DPT_TO	  */
	public void setDPT_TO (BigDecimal DPT_TO)
	{
		set_Value (COLUMNNAME_DPT_TO, DPT_TO);
	}

	/** Get DPT_TO.
		@return DPT_TO	  */
	public BigDecimal getDPT_TO () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_DPT_TO);
		if (bd == null)
			 return Env.ZERO;
		return bd;
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

	/** Set LVL.
		@param LVL LVL	  */
	public void setLVL (int LVL)
	{
		set_Value (COLUMNNAME_LVL, Integer.valueOf(LVL));
	}

	/** Get LVL.
		@return LVL	  */
	public int getLVL () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_LVL);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set PROVISION.
		@param PROVISION PROVISION	  */
	public void setPROVISION (BigDecimal PROVISION)
	{
		set_Value (COLUMNNAME_PROVISION, PROVISION);
	}

	/** Get PROVISION.
		@return PROVISION	  */
	public BigDecimal getPROVISION () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_PROVISION);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}
}