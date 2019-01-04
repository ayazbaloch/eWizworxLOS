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

/** Generated Model for LOS_LEADAPPLICANTCONTACT
 *  @author Adempiere (generated) 
 *  @version Release 3.9.0 - $Id$ */
public class X_LOS_LEADAPPLICANTCONTACT extends PO implements I_LOS_LEADAPPLICANTCONTACT, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20190104L;

    /** Standard Constructor */
    public X_LOS_LEADAPPLICANTCONTACT (Properties ctx, int LOS_LEADAPPLICANTCONTACT_ID, String trxName)
    {
      super (ctx, LOS_LEADAPPLICANTCONTACT_ID, trxName);
      /** if (LOS_LEADAPPLICANTCONTACT_ID == 0)
        {
			setCONTACT (null);
			setLOS_LEADAPPLICANTCONTACT_ID (0);
			setType (null);
			setUUID (null);
        } */
    }

    /** Load Constructor */
    public X_LOS_LEADAPPLICANTCONTACT (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_LOS_LEADAPPLICANTCONTACT[")
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

	/** Set LOS LEAD APPLICANT CONTACT ID.
		@param LOS_LEADAPPLICANTCONTACT_ID LOS LEAD APPLICANT CONTACT ID	  */
	public void setLOS_LEADAPPLICANTCONTACT_ID (int LOS_LEADAPPLICANTCONTACT_ID)
	{
		if (LOS_LEADAPPLICANTCONTACT_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_LOS_LEADAPPLICANTCONTACT_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_LOS_LEADAPPLICANTCONTACT_ID, Integer.valueOf(LOS_LEADAPPLICANTCONTACT_ID));
	}

	/** Get LOS LEAD APPLICANT CONTACT ID.
		@return LOS LEAD APPLICANT CONTACT ID	  */
	public int getLOS_LEADAPPLICANTCONTACT_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_LOS_LEADAPPLICANTCONTACT_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set LOS LEAD APPLICANT ID.
		@param LOS_LEADAPPLICANT_ID LOS LEAD APPLICANT ID	  */
	public void setLOS_LEADAPPLICANT_ID (int LOS_LEADAPPLICANT_ID)
	{
		if (LOS_LEADAPPLICANT_ID < 1) 
			set_Value (COLUMNNAME_LOS_LEADAPPLICANT_ID, null);
		else 
			set_Value (COLUMNNAME_LOS_LEADAPPLICANT_ID, Integer.valueOf(LOS_LEADAPPLICANT_ID));
	}

	/** Get LOS LEAD APPLICANT ID.
		@return LOS LEAD APPLICANT ID	  */
	public int getLOS_LEADAPPLICANT_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_LOS_LEADAPPLICANT_ID);
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