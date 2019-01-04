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

/** Generated Model for LOS_PRODUCT
 *  @author Adempiere (generated) 
 *  @version Release 3.9.0 - $Id$ */
public class X_LOS_PRODUCT extends PO implements I_LOS_PRODUCT, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20190104L;

    /** Standard Constructor */
    public X_LOS_PRODUCT (Properties ctx, int LOS_PRODUCT_ID, String trxName)
    {
      super (ctx, LOS_PRODUCT_ID, trxName);
      /** if (LOS_PRODUCT_ID == 0)
        {
			setIsDefault (false);
			setProductName (null);
			setUUID (null);
        } */
    }

    /** Load Constructor */
    public X_LOS_PRODUCT (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_LOS_PRODUCT[")
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

	/** Set LOS_PRODUCT_ID.
		@param LOS_PRODUCT_ID LOS_PRODUCT_ID	  */
	public void setLOS_PRODUCT_ID (int LOS_PRODUCT_ID)
	{
		if (LOS_PRODUCT_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_LOS_PRODUCT_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_LOS_PRODUCT_ID, Integer.valueOf(LOS_PRODUCT_ID));
	}

	/** Get LOS_PRODUCT_ID.
		@return LOS_PRODUCT_ID	  */
	public int getLOS_PRODUCT_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_LOS_PRODUCT_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Product Name.
		@param ProductName 
		Name of the Product
	  */
	public void setProductName (String ProductName)
	{
		set_Value (COLUMNNAME_ProductName, ProductName);
	}

	/** Get Product Name.
		@return Name of the Product
	  */
	public String getProductName () 
	{
		return (String)get_Value(COLUMNNAME_ProductName);
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