/******************************************************************************
 * Product: ADempiere ERP & CRM Smart Business Solution                       *
 * Copyright (C) 2006-2017 ADempiere Foundation, All Rights Reserved.         *
 * This program is free software, you can redistribute it and/or modify it    *
 * under the terms version 2 of the GNU General Public License as published   *
 * or (at your option) any later version.										*
 * by the Free Software Foundation. This program is distributed in the hope   *
 * that it will be useful, but WITHOUT ANY WARRANTY, without even the implied *
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.           *
 * See the GNU General Public License for more details.                       *
 * You should have received a copy of the GNU General Public License along    *
 * with this program, if not, write to the Free Software Foundation, Inc.,    *
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.                     *
 * For the text or an alternative of this public license, you may reach us    *
 * or via info@adempiere.net or http://www.adempiere.net/license.html         *
 *****************************************************************************/
/** Generated Model - DO NOT CHANGE */
package org.ewizworx.model;

import java.sql.ResultSet;
import java.util.Properties;
import org.compiere.model.*;

/** Generated Model for LOS_PURPOSE
 *  @author Adempiere (generated) 
 *  @version Release 3.9.0 - $Id$ */
public class X_LOS_PURPOSE extends PO implements I_LOS_PURPOSE, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20190104L;

    /** Standard Constructor */
    public X_LOS_PURPOSE (Properties ctx, int LOS_PURPOSE_ID, String trxName)
    {
      super (ctx, LOS_PURPOSE_ID, trxName);
      /** if (LOS_PURPOSE_ID == 0)
        {
			setIsDefault (false);
			setLOS_PURPOSECATEGORY_ID (0);
			setLOS_PURPOSESUBCATEGORY_ID (0);
			setLOS_PURPOSE_ID (0);
			setPURPOSE (null);
			setUUID (null);
        } */
    }

    /** Load Constructor */
    public X_LOS_PURPOSE (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_LOS_PURPOSE[")
        .append(get_ID()).append("]");
      return sb.toString();
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

	public org.ewizworx.model.I_LOS_PURPOSECATEGORY getLOS_PURPOSECATEGORY() throws RuntimeException
    {
		return (org.ewizworx.model.I_LOS_PURPOSECATEGORY)MTable.get(getCtx(), org.ewizworx.model.I_LOS_PURPOSECATEGORY.Table_Name)
			.getPO(getLOS_PURPOSECATEGORY_ID(), get_TrxName());	}

	/** Set LOS PURPOSE CATEGORY ID.
		@param LOS_PURPOSECATEGORY_ID LOS PURPOSE CATEGORY ID	  */
	public void setLOS_PURPOSECATEGORY_ID (int LOS_PURPOSECATEGORY_ID)
	{
		if (LOS_PURPOSECATEGORY_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_LOS_PURPOSECATEGORY_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_LOS_PURPOSECATEGORY_ID, Integer.valueOf(LOS_PURPOSECATEGORY_ID));
	}

	/** Get LOS PURPOSE CATEGORY ID.
		@return LOS PURPOSE CATEGORY ID	  */
	public int getLOS_PURPOSECATEGORY_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_LOS_PURPOSECATEGORY_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.ewizworx.model.I_LOS_PURPOSESUBCATEGORY getLOS_PURPOSESUBCATEGORY() throws RuntimeException
    {
		return (org.ewizworx.model.I_LOS_PURPOSESUBCATEGORY)MTable.get(getCtx(), org.ewizworx.model.I_LOS_PURPOSESUBCATEGORY.Table_Name)
			.getPO(getLOS_PURPOSESUBCATEGORY_ID(), get_TrxName());	}

	/** Set LOS PURPOSE SUB CATEGORY ID.
		@param LOS_PURPOSESUBCATEGORY_ID LOS PURPOSE SUB CATEGORY ID	  */
	public void setLOS_PURPOSESUBCATEGORY_ID (int LOS_PURPOSESUBCATEGORY_ID)
	{
		if (LOS_PURPOSESUBCATEGORY_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_LOS_PURPOSESUBCATEGORY_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_LOS_PURPOSESUBCATEGORY_ID, Integer.valueOf(LOS_PURPOSESUBCATEGORY_ID));
	}

	/** Get LOS PURPOSE SUB CATEGORY ID.
		@return LOS PURPOSE SUB CATEGORY ID	  */
	public int getLOS_PURPOSESUBCATEGORY_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_LOS_PURPOSESUBCATEGORY_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set LOS_PURPOSE_ID.
		@param LOS_PURPOSE_ID LOS_PURPOSE_ID	  */
	public void setLOS_PURPOSE_ID (int LOS_PURPOSE_ID)
	{
		if (LOS_PURPOSE_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_LOS_PURPOSE_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_LOS_PURPOSE_ID, Integer.valueOf(LOS_PURPOSE_ID));
	}

	/** Get LOS_PURPOSE_ID.
		@return LOS_PURPOSE_ID	  */
	public int getLOS_PURPOSE_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_LOS_PURPOSE_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set PURPOSE.
		@param PURPOSE PURPOSE	  */
	public void setPURPOSE (String PURPOSE)
	{
		set_Value (COLUMNNAME_PURPOSE, PURPOSE);
	}

	/** Get PURPOSE.
		@return PURPOSE	  */
	public String getPURPOSE () 
	{
		return (String)get_Value(COLUMNNAME_PURPOSE);
	}

	/** Set Immutable Universally Unique Identifier.
		@param UUID 
		Immutable Universally Unique Identifier
	  */
	public void setUUID (String UUID)
	{
		set_Value (COLUMNNAME_UUID, UUID);
	}

	/** Get Immutable Universally Unique Identifier.
		@return Immutable Universally Unique Identifier
	  */
	public String getUUID () 
	{
		return (String)get_Value(COLUMNNAME_UUID);
	}
}