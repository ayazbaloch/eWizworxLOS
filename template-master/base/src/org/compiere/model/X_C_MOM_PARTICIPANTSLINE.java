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

/** Generated Model for C_MOM_PARTICIPANTSLINE
 *  @author Adempiere (generated) 
 *  @version Release 3.6.0LTS - $Id$ */
public class X_C_MOM_PARTICIPANTSLINE extends PO implements I_C_MOM_PARTICIPANTSLINE, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20130528L;

    /** Standard Constructor */
    public X_C_MOM_PARTICIPANTSLINE (Properties ctx, int C_MOM_PARTICIPANTSLINE_ID, String trxName)
    {
      super (ctx, C_MOM_PARTICIPANTSLINE_ID, trxName);
      /** if (C_MOM_PARTICIPANTSLINE_ID == 0)
        {
			setCOMPANY (null);
			setC_MOM_ID (0);
			setC_MOM_PARTICIPANTSLINE_ID (0);
        } */
    }

    /** Load Constructor */
    public X_C_MOM_PARTICIPANTSLINE (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_C_MOM_PARTICIPANTSLINE[")
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

	/** Set Company.
		@param COMPANY Company	  */
	public void setCOMPANY (String COMPANY)
	{
		set_Value (COLUMNNAME_COMPANY, COMPANY);
	}

	/** Get Company.
		@return Company	  */
	public String getCOMPANY () 
	{
		return (String)get_Value(COLUMNNAME_COMPANY);
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

	/** Set MOM Participant detail.
		@param C_MOM_PARTICIPANTSLINE_ID MOM Participant detail	  */
	public void setC_MOM_PARTICIPANTSLINE_ID (int C_MOM_PARTICIPANTSLINE_ID)
	{
		if (C_MOM_PARTICIPANTSLINE_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_C_MOM_PARTICIPANTSLINE_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_C_MOM_PARTICIPANTSLINE_ID, Integer.valueOf(C_MOM_PARTICIPANTSLINE_ID));
	}

	/** Get MOM Participant detail.
		@return MOM Participant detail	  */
	public int getC_MOM_PARTICIPANTSLINE_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_MOM_PARTICIPANTSLINE_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}
}