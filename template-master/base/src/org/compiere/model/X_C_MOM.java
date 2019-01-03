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
import java.sql.Timestamp;
import java.util.Properties;
import org.compiere.util.KeyNamePair;

/** Generated Model for C_MOM
 *  @author Adempiere (generated) 
 *  @version Release 3.6.0LTS - $Id$ */
public class X_C_MOM extends PO implements I_C_MOM, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20130528L;

    /** Standard Constructor */
    public X_C_MOM (Properties ctx, int C_MOM_ID, String trxName)
    {
      super (ctx, C_MOM_ID, trxName);
      /** if (C_MOM_ID == 0)
        {
			setC_MOM_ID (0);
        } */
    }

    /** Load Constructor */
    public X_C_MOM (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_C_MOM[")
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

	/** Set Agenda.
		@param AGENDA Agenda	  */
	public void setAGENDA (String AGENDA)
	{
		set_Value (COLUMNNAME_AGENDA, AGENDA);
	}

	/** Get Agenda.
		@return Agenda	  */
	public String getAGENDA () 
	{
		return (String)get_Value(COLUMNNAME_AGENDA);
	}

	/** Set Minutes of meeting detail.
		@param C_MOM_ID Minutes of meeting detail	  */
	public void setC_MOM_ID (int C_MOM_ID)
	{
		if (C_MOM_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_C_MOM_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_C_MOM_ID, Integer.valueOf(C_MOM_ID));
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

	/** Set End Time.
		@param END_TIME End Time	  */
	public void setEND_TIME (Timestamp END_TIME)
	{
		set_Value (COLUMNNAME_END_TIME, END_TIME);
	}

	/** Get End Time.
		@return End Time	  */
	public Timestamp getEND_TIME () 
	{
		return (Timestamp)get_Value(COLUMNNAME_END_TIME);
	}

	/** Set Name.
		@param Name 
		Alphanumeric identifier of the entity
	  */
	public void setName (String Name)
	{
		set_Value (COLUMNNAME_Name, Name);
	}

	/** Get Name.
		@return Alphanumeric identifier of the entity
	  */
	public String getName () 
	{
		return (String)get_Value(COLUMNNAME_Name);
	}

    /** Get Record ID/ColumnName
        @return ID/ColumnName pair
      */
    public KeyNamePair getKeyNamePair() 
    {
        return new KeyNamePair(get_ID(), getName());
    }

	/** Set Start Date.
		@param START_DATE Start Date	  */
	public void setSTART_DATE (Timestamp START_DATE)
	{
		set_Value (COLUMNNAME_START_DATE, START_DATE);
	}

	/** Get Start Date.
		@return Start Date	  */
	public Timestamp getSTART_DATE () 
	{
		return (Timestamp)get_Value(COLUMNNAME_START_DATE);
	}

	/** Set Start Time.
		@param START_TIME Start Time	  */
	public void setSTART_TIME (Timestamp START_TIME)
	{
		set_Value (COLUMNNAME_START_TIME, START_TIME);
	}

	/** Get Start Time.
		@return Start Time	  */
	public Timestamp getSTART_TIME () 
	{
		return (Timestamp)get_Value(COLUMNNAME_START_TIME);
	}

	/** Set TAB_PARTICIPANTS.
		@param TAB_PARTICIPANTS TAB_PARTICIPANTS	  */
	public void setTAB_PARTICIPANTS (int TAB_PARTICIPANTS)
	{
		set_Value (COLUMNNAME_TAB_PARTICIPANTS, Integer.valueOf(TAB_PARTICIPANTS));
	}

	/** Get TAB_PARTICIPANTS.
		@return TAB_PARTICIPANTS	  */
	public int getTAB_PARTICIPANTS () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_TAB_PARTICIPANTS);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Search Key.
		@param Value 
		Search key for the record in the format required - must be unique
	  */
	public void setValue (String Value)
	{
		set_Value (COLUMNNAME_Value, Value);
	}

	/** Get Search Key.
		@return Search key for the record in the format required - must be unique
	  */
	public String getValue () 
	{
		return (String)get_Value(COLUMNNAME_Value);
	}
}