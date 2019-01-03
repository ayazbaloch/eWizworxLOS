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

/** Generated Model for EW_PERSON
 *  @author Adempiere (generated) 
 *  @version Release 3.7.0LTS - $Id$ */
public class X_EW_PERSON extends PO implements I_EW_PERSON, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20140326L;

    /** Standard Constructor */
    public X_EW_PERSON (Properties ctx, int EW_PERSON_ID, String trxName)
    {
      super (ctx, EW_PERSON_ID, trxName);
      /** if (EW_PERSON_ID == 0)
        {
			setEW_PERSON_ID (0);
			setFIRST_NM (null);
			setGENDER (null);
			setSOCIAL_SECURITY_NO (null);
        } */
    }

    /** Load Constructor */
    public X_EW_PERSON (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_EW_PERSON[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set Full Name.
		@param "Full Name" Full Name	  */
	public void setFull_Name (String Full_Name)
	{
		throw new IllegalArgumentException ("Full Name is virtual column");	}

	/** Get Full Name.
		@return Full Name	  */
	public String getFull_Name () 
	{
		return (String)get_Value(COLUMNNAME_Full_Name);
	}

	/** Set DOB.
		@param DOB DOB	  */
	public void setDOB (Timestamp DOB)
	{
		set_Value (COLUMNNAME_DOB, DOB);
	}

	/** Get DOB.
		@return DOB	  */
	public Timestamp getDOB () 
	{
		return (Timestamp)get_Value(COLUMNNAME_DOB);
	}

	public org.compiere.model.I_EW_GREETING getEW_GREETING() throws RuntimeException
    {
		return (org.compiere.model.I_EW_GREETING)MTable.get(getCtx(), org.compiere.model.I_EW_GREETING.Table_Name)
			.getPO(getEW_GREETING_ID(), get_TrxName());	}

	/** Set Greeting.
		@param EW_GREETING_ID Greeting	  */
	public void setEW_GREETING_ID (int EW_GREETING_ID)
	{
		if (EW_GREETING_ID < 1) 
			set_Value (COLUMNNAME_EW_GREETING_ID, null);
		else 
			set_Value (COLUMNNAME_EW_GREETING_ID, Integer.valueOf(EW_GREETING_ID));
	}

	/** Get Greeting.
		@return Greeting	  */
	public int getEW_GREETING_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_EW_GREETING_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Person ID.
		@param EW_PERSON_ID Person ID	  */
	public void setEW_PERSON_ID (int EW_PERSON_ID)
	{
		if (EW_PERSON_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_EW_PERSON_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_EW_PERSON_ID, Integer.valueOf(EW_PERSON_ID));
	}

	/** Get Person ID.
		@return Person ID	  */
	public int getEW_PERSON_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_EW_PERSON_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set First Name.
		@param FIRST_NM First Name	  */
	public void setFIRST_NM (String FIRST_NM)
	{
		set_Value (COLUMNNAME_FIRST_NM, FIRST_NM);
	}

	/** Get First Name.
		@return First Name	  */
	public String getFIRST_NM () 
	{
		return (String)get_Value(COLUMNNAME_FIRST_NM);
	}

	/** GENDER AD_Reference_ID=1000010 */
	public static final int GENDER_AD_Reference_ID=1000010;
	/** Male = M */
	public static final String GENDER_Male = "M";
	/** Female = F */
	public static final String GENDER_Female = "F";
	/** Set Gender.
		@param GENDER Gender	  */
	public void setGENDER (String GENDER)
	{

		set_Value (COLUMNNAME_GENDER, GENDER);
	}

	/** Get Gender.
		@return Gender	  */
	public String getGENDER () 
	{
		return (String)get_Value(COLUMNNAME_GENDER);
	}

	/** Set LAST_NM.
		@param LAST_NM LAST_NM	  */
	public void setLAST_NM (String LAST_NM)
	{
		set_Value (COLUMNNAME_LAST_NM, LAST_NM);
	}

	/** Get LAST_NM.
		@return LAST_NM	  */
	public String getLAST_NM () 
	{
		return (String)get_Value(COLUMNNAME_LAST_NM);
	}

	/** Set MIDDLE_NM.
		@param MIDDLE_NM MIDDLE_NM	  */
	public void setMIDDLE_NM (String MIDDLE_NM)
	{
		set_Value (COLUMNNAME_MIDDLE_NM, MIDDLE_NM);
	}

	/** Get MIDDLE_NM.
		@return MIDDLE_NM	  */
	public String getMIDDLE_NM () 
	{
		return (String)get_Value(COLUMNNAME_MIDDLE_NM);
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

	/** Set btnOpenForm.
		@param btnOpenForm btnOpenForm	  */
	public void setbtnOpenForm (String btnOpenForm)
	{
		set_Value (COLUMNNAME_btnOpenForm, btnOpenForm);
	}

	/** Get btnOpenForm.
		@return btnOpenForm	  */
	public String getbtnOpenForm () 
	{
		return (String)get_Value(COLUMNNAME_btnOpenForm);
	}
}