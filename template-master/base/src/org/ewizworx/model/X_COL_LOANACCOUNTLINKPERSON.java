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

/** Generated Model for COL_LOANACCOUNTLINKPERSON
 *  @author Adempiere (generated) 
 *  @version Release 3.7.0LTS - $Id$ */
public class X_COL_LOANACCOUNTLINKPERSON extends PO implements I_COL_LOANACCOUNTLINKPERSON, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20150105L;

    /** Standard Constructor */
    public X_COL_LOANACCOUNTLINKPERSON (Properties ctx, int COL_LOANACCOUNTLINKPERSON_ID, String trxName)
    {
      super (ctx, COL_LOANACCOUNTLINKPERSON_ID, trxName);
      /** if (COL_LOANACCOUNTLINKPERSON_ID == 0)
        {
			setCOL_LOANACCOUNTLINKPERSON_ID (0);
			setCOL_LOANACCOUNT_ID (0);
			setRELATIONTYPE (null);
			setSOCIAL_SECURITY_NO (null);
        } */
    }

    /** Load Constructor */
    public X_COL_LOANACCOUNTLINKPERSON (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_COL_LOANACCOUNTLINKPERSON[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set COL_LOANACCOUNTLINKPERSON.
		@param COL_LOANACCOUNTLINKPERSON_ID COL_LOANACCOUNTLINKPERSON	  */
	public void setCOL_LOANACCOUNTLINKPERSON_ID (int COL_LOANACCOUNTLINKPERSON_ID)
	{
		if (COL_LOANACCOUNTLINKPERSON_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_COL_LOANACCOUNTLINKPERSON_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_COL_LOANACCOUNTLINKPERSON_ID, Integer.valueOf(COL_LOANACCOUNTLINKPERSON_ID));
	}

	/** Get COL_LOANACCOUNTLINKPERSON.
		@return COL_LOANACCOUNTLINKPERSON	  */
	public int getCOL_LOANACCOUNTLINKPERSON_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_COL_LOANACCOUNTLINKPERSON_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.ewizworx.model.I_COL_LOANACCOUNT getCOL_LOANACCOUNT() throws RuntimeException
    {
		return (org.ewizworx.model.I_COL_LOANACCOUNT)MTable.get(getCtx(), org.ewizworx.model.I_COL_LOANACCOUNT.Table_Name)
			.getPO(getCOL_LOANACCOUNT_ID(), get_TrxName());	}

	/** Set COL_LOANACCOUNT.
		@param COL_LOANACCOUNT_ID COL_LOANACCOUNT	  */
	public void setCOL_LOANACCOUNT_ID (int COL_LOANACCOUNT_ID)
	{
		if (COL_LOANACCOUNT_ID < 1) 
			set_Value (COLUMNNAME_COL_LOANACCOUNT_ID, null);
		else 
			set_Value (COLUMNNAME_COL_LOANACCOUNT_ID, Integer.valueOf(COL_LOANACCOUNT_ID));
	}

	/** Get COL_LOANACCOUNT.
		@return COL_LOANACCOUNT	  */
	public int getCOL_LOANACCOUNT_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_COL_LOANACCOUNT_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set RELATIONTYPE.
		@param RELATIONTYPE RELATIONTYPE	  */
	public void setRELATIONTYPE (String RELATIONTYPE)
	{
		set_Value (COLUMNNAME_RELATIONTYPE, RELATIONTYPE);
	}

	/** Get RELATIONTYPE.
		@return RELATIONTYPE	  */
	public String getRELATIONTYPE () 
	{
		return (String)get_Value(COLUMNNAME_RELATIONTYPE);
	}

	/** Set SOCIAL_SECURITY_NO.
		@param SOCIAL_SECURITY_NO SOCIAL_SECURITY_NO	  */
	public void setSOCIAL_SECURITY_NO (String SOCIAL_SECURITY_NO)
	{
		set_Value (COLUMNNAME_SOCIAL_SECURITY_NO, SOCIAL_SECURITY_NO);
	}

	/** Get SOCIAL_SECURITY_NO.
		@return SOCIAL_SECURITY_NO	  */
	public String getSOCIAL_SECURITY_NO () 
	{
		return (String)get_Value(COLUMNNAME_SOCIAL_SECURITY_NO);
	}
}