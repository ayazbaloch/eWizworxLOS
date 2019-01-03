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

/** Generated Model for EW_PERSON_CONTACT
 *  @author Adempiere (generated) 
 *  @version Release 3.7.0LTS - $Id$ */
public class X_EW_PERSON_CONTACT extends PO implements I_EW_PERSON_CONTACT, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20150105L;

    /** Standard Constructor */
    public X_EW_PERSON_CONTACT (Properties ctx, int EW_PERSON_CONTACT_ID, String trxName)
    {
      super (ctx, EW_PERSON_CONTACT_ID, trxName);
      /** if (EW_PERSON_CONTACT_ID == 0)
        {
			setCONTACT (null);
			setEW_PERSON_CONTACT_ID (0);
			setEW_PERSON_ID (0);
			setType (null);
// 'Home'
        } */
    }

    /** Load Constructor */
    public X_EW_PERSON_CONTACT (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_EW_PERSON_CONTACT[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set CONTACT.
		@param CONTACT CONTACT	  */
	public void setCONTACT (String CONTACT)
	{
		set_Value (COLUMNNAME_CONTACT, CONTACT);
	}

	/** Get CONTACT.
		@return CONTACT	  */
	public String getCONTACT () 
	{
		return (String)get_Value(COLUMNNAME_CONTACT);
	}

	/** Set EW_PERSON_CONTACT.
		@param EW_PERSON_CONTACT_ID EW_PERSON_CONTACT	  */
	public void setEW_PERSON_CONTACT_ID (int EW_PERSON_CONTACT_ID)
	{
		if (EW_PERSON_CONTACT_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_EW_PERSON_CONTACT_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_EW_PERSON_CONTACT_ID, Integer.valueOf(EW_PERSON_CONTACT_ID));
	}

	/** Get EW_PERSON_CONTACT.
		@return EW_PERSON_CONTACT	  */
	public int getEW_PERSON_CONTACT_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_EW_PERSON_CONTACT_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.ewizworx.model.I_EW_PERSON getEW_PERSON() throws RuntimeException
    {
		return (org.ewizworx.model.I_EW_PERSON)MTable.get(getCtx(), org.ewizworx.model.I_EW_PERSON.Table_Name)
			.getPO(getEW_PERSON_ID(), get_TrxName());	}

	/** Set EW_PERSON.
		@param EW_PERSON_ID EW_PERSON	  */
	public void setEW_PERSON_ID (int EW_PERSON_ID)
	{
		if (EW_PERSON_ID < 1) 
			set_Value (COLUMNNAME_EW_PERSON_ID, null);
		else 
			set_Value (COLUMNNAME_EW_PERSON_ID, Integer.valueOf(EW_PERSON_ID));
	}

	/** Get EW_PERSON.
		@return EW_PERSON	  */
	public int getEW_PERSON_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_EW_PERSON_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Type AD_Reference_ID=1000015 */
	public static final int TYPE_AD_Reference_ID=1000015;
	/** Home = Home */
	public static final String TYPE_Home = "Home";
	/** Work = Work */
	public static final String TYPE_Work = "Work";
	/** Mobile = Mobile */
	public static final String TYPE_Mobile = "Mobile";
	/** Fax = Fax */
	public static final String TYPE_Fax = "Fax";
	/** eMail = eMail */
	public static final String TYPE_EMail = "eMail";
	/** Set Type.
		@param Type 
		Type of Validation (SQL, Java Script, Java Language)
	  */
	public void setType (String Type)
	{

		set_Value (COLUMNNAME_Type, Type);
	}

	/** Get Type.
		@return Type of Validation (SQL, Java Script, Java Language)
	  */
	public String getType () 
	{
		return (String)get_Value(COLUMNNAME_Type);
	}
}