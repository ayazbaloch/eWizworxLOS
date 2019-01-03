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

/** Generated Model for C_MOM_DISCUSSIONLINE
 *  @author Adempiere (generated) 
 *  @version Release 3.6.0LTS - $Id$ */
public class X_C_MOM_DISCUSSIONLINE extends PO implements I_C_MOM_DISCUSSIONLINE, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20130528L;

    /** Standard Constructor */
    public X_C_MOM_DISCUSSIONLINE (Properties ctx, int C_MOM_DISCUSSIONLINE_ID, String trxName)
    {
      super (ctx, C_MOM_DISCUSSIONLINE_ID, trxName);
      /** if (C_MOM_DISCUSSIONLINE_ID == 0)
        {
			setC_MOM_DISCUSSIONLINE_ID (0);
			setC_MOM_ID (0);
			setITEM_NBR (0);
        } */
    }

    /** Load Constructor */
    public X_C_MOM_DISCUSSIONLINE (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_C_MOM_DISCUSSIONLINE[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	public org.compiere.model.I_AD_User getAD_User() throws RuntimeException
    {
		return (org.compiere.model.I_AD_User)MTable.get(getCtx(), org.compiere.model.I_AD_User.Table_Name)
			.getPO(getAD_User_ID(), get_TrxName());	}

	/** Set Usuario.
		@param AD_User_ID 
		User within the system - Internal or Business Partner Contact
	  */
	public void setAD_User_ID (int AD_User_ID)
	{
		if (AD_User_ID < 1) 
			set_Value (COLUMNNAME_AD_User_ID, null);
		else 
			set_Value (COLUMNNAME_AD_User_ID, Integer.valueOf(AD_User_ID));
	}

	/** Get Usuario.
		@return User within the system - Internal or Business Partner Contact
	  */
	public int getAD_User_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_AD_User_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public I_C_MOMSTATUS getC_MOMSTATUS() throws RuntimeException
    {
		return (I_C_MOMSTATUS)MTable.get(getCtx(), I_C_MOMSTATUS.Table_Name)
			.getPO(getC_MOMSTATUS_ID(), get_TrxName());	}

	/** Set Status.
		@param C_MOMSTATUS_ID Status	  */
	public void setC_MOMSTATUS_ID (int C_MOMSTATUS_ID)
	{
		if (C_MOMSTATUS_ID < 1) 
			set_Value (COLUMNNAME_C_MOMSTATUS_ID, null);
		else 
			set_Value (COLUMNNAME_C_MOMSTATUS_ID, Integer.valueOf(C_MOMSTATUS_ID));
	}

	/** Get Status.
		@return Status	  */
	public int getC_MOMSTATUS_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_MOMSTATUS_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set MOM Discussion Line items.
		@param C_MOM_DISCUSSIONLINE_ID MOM Discussion Line items	  */
	public void setC_MOM_DISCUSSIONLINE_ID (int C_MOM_DISCUSSIONLINE_ID)
	{
		if (C_MOM_DISCUSSIONLINE_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_C_MOM_DISCUSSIONLINE_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_C_MOM_DISCUSSIONLINE_ID, Integer.valueOf(C_MOM_DISCUSSIONLINE_ID));
	}

	/** Get MOM Discussion Line items.
		@return MOM Discussion Line items	  */
	public int getC_MOM_DISCUSSIONLINE_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_MOM_DISCUSSIONLINE_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public I_C_MOM getC_MOM() throws RuntimeException
    {
		return (I_C_MOM)MTable.get(getCtx(), I_C_MOM.Table_Name)
			.getPO(getC_MOM_ID(), get_TrxName());	}

	/** Set Minutes of meeting detail.
		@param C_MOM_ID Minutes of meeting detail	  */
	public void setC_MOM_ID (int C_MOM_ID)
	{
		if (C_MOM_ID < 1) 
			set_Value (COLUMNNAME_C_MOM_ID, null);
		else 
			set_Value (COLUMNNAME_C_MOM_ID, Integer.valueOf(C_MOM_ID));
	}

	/** Get Minutes of meeting detail.
		@return Minutes of meeting detail	  */
	public int getC_MOM_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_MOM_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Discussion Item.
		@param DISCUSSION_DESC Discussion Item	  */
	public void setDISCUSSION_DESC (String DISCUSSION_DESC)
	{
		set_Value (COLUMNNAME_DISCUSSION_DESC, DISCUSSION_DESC);
	}

	/** Get Discussion Item.
		@return Discussion Item	  */
	public String getDISCUSSION_DESC () 
	{
		return (String)get_Value(COLUMNNAME_DISCUSSION_DESC);
	}

	/** Set Item#.
		@param ITEM_NBR Item#	  */
	public void setITEM_NBR (int ITEM_NBR)
	{
		set_Value (COLUMNNAME_ITEM_NBR, Integer.valueOf(ITEM_NBR));
	}

	/** Get Item#.
		@return Item#	  */
	public int getITEM_NBR () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ITEM_NBR);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}
}