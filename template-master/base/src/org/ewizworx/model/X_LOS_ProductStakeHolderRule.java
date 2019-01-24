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

/** Generated Model for LOS_ProductStakeHolderRule
 *  @author Adempiere (generated) 
 *  @version Release 3.9.0 - $Id$ */
public class X_LOS_ProductStakeHolderRule extends PO implements I_LOS_ProductStakeHolderRule, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20190123L;

    /** Standard Constructor */
    public X_LOS_ProductStakeHolderRule (Properties ctx, int LOS_ProductStakeHolderRule_ID, String trxName)
    {
      super (ctx, LOS_ProductStakeHolderRule_ID, trxName);
      /** if (LOS_ProductStakeHolderRule_ID == 0)
        {
			setLOS_PRODUCT_ID (0);
			setLOS_ProductStakeHolderRule_ID (0);
			setMaxValue (0);
			setMinValue (0);
			setUUID (null);
        } */
    }

    /** Load Constructor */
    public X_LOS_ProductStakeHolderRule (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_LOS_ProductStakeHolderRule[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** BUSINESSSIGMENT AD_Reference_ID=1000048 */
	public static final int BUSINESSSIGMENT_AD_Reference_ID=1000048;
	/** Consumer = Consumer */
	public static final String BUSINESSSIGMENT_Consumer = "Consumer";
	/** Commercial = Commercial */
	public static final String BUSINESSSIGMENT_Commercial = "Commercial";
	/** Corporate = Corporate */
	public static final String BUSINESSSIGMENT_Corporate = "Corporate";
	/** Set BUSINESSSIGMENT.
		@param BUSINESSSIGMENT BUSINESSSIGMENT	  */
	public void setBUSINESSSIGMENT (String BUSINESSSIGMENT)
	{

		set_Value (COLUMNNAME_BUSINESSSIGMENT, BUSINESSSIGMENT);
	}

	/** Get BUSINESSSIGMENT.
		@return BUSINESSSIGMENT	  */
	public String getBUSINESSSIGMENT () 
	{
		return (String)get_Value(COLUMNNAME_BUSINESSSIGMENT);
	}

	public org.ewizworx.model.I_LOS_LOANENTITYTYPE getLOS_LOANENTITYTYPE() throws RuntimeException
    {
		return (org.ewizworx.model.I_LOS_LOANENTITYTYPE)MTable.get(getCtx(), org.ewizworx.model.I_LOS_LOANENTITYTYPE.Table_Name)
			.getPO(getLOS_LOANENTITYTYPE_ID(), get_TrxName());	}

	/** Set LOS Loan Entity Type ID.
		@param LOS_LOANENTITYTYPE_ID LOS Loan Entity Type ID	  */
	public void setLOS_LOANENTITYTYPE_ID (int LOS_LOANENTITYTYPE_ID)
	{
		if (LOS_LOANENTITYTYPE_ID < 1) 
			set_Value (COLUMNNAME_LOS_LOANENTITYTYPE_ID, null);
		else 
			set_Value (COLUMNNAME_LOS_LOANENTITYTYPE_ID, Integer.valueOf(LOS_LOANENTITYTYPE_ID));
	}

	/** Get LOS Loan Entity Type ID.
		@return LOS Loan Entity Type ID	  */
	public int getLOS_LOANENTITYTYPE_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_LOS_LOANENTITYTYPE_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.ewizworx.model.I_LOS_PRODUCT getLOS_PRODUCT() throws RuntimeException
    {
		return (org.ewizworx.model.I_LOS_PRODUCT)MTable.get(getCtx(), org.ewizworx.model.I_LOS_PRODUCT.Table_Name)
			.getPO(getLOS_PRODUCT_ID(), get_TrxName());	}

	/** Set LOS_PRODUCT_ID.
		@param LOS_PRODUCT_ID LOS_PRODUCT_ID	  */
	public void setLOS_PRODUCT_ID (int LOS_PRODUCT_ID)
	{
		if (LOS_PRODUCT_ID < 1) 
			set_Value (COLUMNNAME_LOS_PRODUCT_ID, null);
		else 
			set_Value (COLUMNNAME_LOS_PRODUCT_ID, Integer.valueOf(LOS_PRODUCT_ID));
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

	/** Set LOS Product Stakeholder Rule ID.
		@param LOS_ProductStakeHolderRule_ID LOS Product Stakeholder Rule ID	  */
	public void setLOS_ProductStakeHolderRule_ID (int LOS_ProductStakeHolderRule_ID)
	{
		if (LOS_ProductStakeHolderRule_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_LOS_ProductStakeHolderRule_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_LOS_ProductStakeHolderRule_ID, Integer.valueOf(LOS_ProductStakeHolderRule_ID));
	}

	/** Get LOS Product Stakeholder Rule ID.
		@return LOS Product Stakeholder Rule ID	  */
	public int getLOS_ProductStakeHolderRule_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_LOS_ProductStakeHolderRule_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Max Value.
		@param MaxValue Max Value	  */
	public void setMaxValue (int MaxValue)
	{
		set_Value (COLUMNNAME_MaxValue, Integer.valueOf(MaxValue));
	}

	/** Get Max Value.
		@return Max Value	  */
	public int getMaxValue () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_MaxValue);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Min Value.
		@param MinValue Min Value	  */
	public void setMinValue (int MinValue)
	{
		set_Value (COLUMNNAME_MinValue, Integer.valueOf(MinValue));
	}

	/** Get Min Value.
		@return Min Value	  */
	public int getMinValue () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_MinValue);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** STAKEHOLDERTYPE AD_Reference_ID=1000051 */
	public static final int STAKEHOLDERTYPE_AD_Reference_ID=1000051;
	/** Borrower = Borrower */
	public static final String STAKEHOLDERTYPE_Borrower = "Borrower";
	/** Guarantor = Guarantor */
	public static final String STAKEHOLDERTYPE_Guarantor = "Guarantor";
	/** Reference = Reference */
	public static final String STAKEHOLDERTYPE_Reference = "Reference";
	/** Director = Director */
	public static final String STAKEHOLDERTYPE_Director = "Director";
	/** Set STAKEHOLDERTYPE.
		@param STAKEHOLDERTYPE STAKEHOLDERTYPE	  */
	public void setSTAKEHOLDERTYPE (String STAKEHOLDERTYPE)
	{

		set_Value (COLUMNNAME_STAKEHOLDERTYPE, STAKEHOLDERTYPE);
	}

	/** Get STAKEHOLDERTYPE.
		@return STAKEHOLDERTYPE	  */
	public String getSTAKEHOLDERTYPE () 
	{
		return (String)get_Value(COLUMNNAME_STAKEHOLDERTYPE);
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