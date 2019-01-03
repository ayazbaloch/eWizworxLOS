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

/** Generated Model for COL_AGENT
 *  @author Adempiere (generated) 
 *  @version Release 3.7.0LTS - $Id$ */
public class X_COL_AGENT extends PO implements I_COL_AGENT, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20150105L;

    /** Standard Constructor */
    public X_COL_AGENT (Properties ctx, int COL_AGENT_ID, String trxName)
    {
      super (ctx, COL_AGENT_ID, trxName);
      /** if (COL_AGENT_ID == 0)
        {
			setAD_User_ID (0);
			setCOL_AGENT_ID (0);
			setCOL_DUNNINGLEVEL_ID (0);
        } */
    }

    /** Load Constructor */
    public X_COL_AGENT (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_COL_AGENT[")
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

	/** Set COL_AGENT.
		@param COL_AGENT_ID COL_AGENT	  */
	public void setCOL_AGENT_ID (int COL_AGENT_ID)
	{
		if (COL_AGENT_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_COL_AGENT_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_COL_AGENT_ID, Integer.valueOf(COL_AGENT_ID));
	}

	/** Get COL_AGENT.
		@return COL_AGENT	  */
	public int getCOL_AGENT_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_COL_AGENT_ID);
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
}