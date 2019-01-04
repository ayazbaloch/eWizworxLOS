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

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.Properties;
import org.compiere.model.*;
import org.compiere.util.Env;

/** Generated Model for LOS_LEADAPPLICANT
 *  @author Adempiere (generated) 
 *  @version Release 3.9.0 - $Id$ */
public class X_LOS_LEADAPPLICANT extends PO implements I_LOS_LEADAPPLICANT, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20190104L;

    /** Standard Constructor */
    public X_LOS_LEADAPPLICANT (Properties ctx, int LOS_LEADAPPLICANT_ID, String trxName)
    {
      super (ctx, LOS_LEADAPPLICANT_ID, trxName);
      /** if (LOS_LEADAPPLICANT_ID == 0)
        {
			setDOB (new Timestamp( System.currentTimeMillis() ));
			setEW_GREETING_ID (0);
			setFIRST_NM (null);
			setGender (null);
			setLOS_LEADAPPLICANT_ID (0);
			setLOS_Lead_ID (0);
			setUUID (null);
        } */
    }

    /** Load Constructor */
    public X_LOS_LEADAPPLICANT (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_LOS_LEADAPPLICANT[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set Address Line.
		@param AddressLine Address Line	  */
	public void setAddressLine (BigDecimal AddressLine)
	{
		throw new IllegalArgumentException ("AddressLine is virtual column");	}

	/** Get Address Line.
		@return Address Line	  */
	public BigDecimal getAddressLine () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_AddressLine);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set COLUMN3.
		@param COLUMN3 COLUMN3	  */
	public void setCOLUMN3 (String COLUMN3)
	{
		set_Value (COLUMNNAME_COLUMN3, COLUMN3);
	}

	/** Get COLUMN3.
		@return COLUMN3	  */
	public String getCOLUMN3 () 
	{
		return (String)get_Value(COLUMNNAME_COLUMN3);
	}

	/** Set Complete Name.
		@param COMPLETE_NM Complete Name	  */
	public void setCOMPLETE_NM (String COMPLETE_NM)
	{
		set_Value (COLUMNNAME_COMPLETE_NM, COMPLETE_NM);
	}

	/** Get Complete Name.
		@return Complete Name	  */
	public String getCOMPLETE_NM () 
	{
		return (String)get_Value(COLUMNNAME_COMPLETE_NM);
	}

	/** Set Contact Line.
		@param ContactLine Contact Line	  */
	public void setContactLine (BigDecimal ContactLine)
	{
		throw new IllegalArgumentException ("ContactLine is virtual column");	}

	/** Get Contact Line.
		@return Contact Line	  */
	public BigDecimal getContactLine () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_ContactLine);
		if (bd == null)
			 return Env.ZERO;
		return bd;
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

	/** Set DOE.
		@param DOE DOE	  */
	public void setDOE (Timestamp DOE)
	{
		set_Value (COLUMNNAME_DOE, DOE);
	}

	/** Get DOE.
		@return DOE	  */
	public Timestamp getDOE () 
	{
		return (Timestamp)get_Value(COLUMNNAME_DOE);
	}

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

	/** Gender AD_Reference_ID=53612 */
	public static final int GENDER_AD_Reference_ID=53612;
	/** Female = F */
	public static final String GENDER_Female = "F";
	/** Male = M */
	public static final String GENDER_Male = "M";
	/** Set Gender.
		@param Gender Gender	  */
	public void setGender (String Gender)
	{

		set_Value (COLUMNNAME_Gender, Gender);
	}

	/** Get Gender.
		@return Gender	  */
	public String getGender () 
	{
		return (String)get_Value(COLUMNNAME_Gender);
	}

	/** Set Last Name.
		@param LAST_NM Last Name	  */
	public void setLAST_NM (String LAST_NM)
	{
		set_Value (COLUMNNAME_LAST_NM, LAST_NM);
	}

	/** Get Last Name.
		@return Last Name	  */
	public String getLAST_NM () 
	{
		return (String)get_Value(COLUMNNAME_LAST_NM);
	}

	/** Set LOS LEAD APPLICANT ID.
		@param LOS_LEADAPPLICANT_ID LOS LEAD APPLICANT ID	  */
	public void setLOS_LEADAPPLICANT_ID (int LOS_LEADAPPLICANT_ID)
	{
		if (LOS_LEADAPPLICANT_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_LOS_LEADAPPLICANT_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_LOS_LEADAPPLICANT_ID, Integer.valueOf(LOS_LEADAPPLICANT_ID));
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

	/** Set LOS Lead ID.
		@param LOS_Lead_ID LOS Lead ID	  */
	public void setLOS_Lead_ID (int LOS_Lead_ID)
	{
		if (LOS_Lead_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_LOS_Lead_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_LOS_Lead_ID, Integer.valueOf(LOS_Lead_ID));
	}

	/** Get LOS Lead ID.
		@return LOS Lead ID	  */
	public int getLOS_Lead_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_LOS_Lead_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Middle Name.
		@param MIDDLE_NM Middle Name	  */
	public void setMIDDLE_NM (String MIDDLE_NM)
	{
		set_Value (COLUMNNAME_MIDDLE_NM, MIDDLE_NM);
	}

	/** Get Middle Name.
		@return Middle Name	  */
	public String getMIDDLE_NM () 
	{
		return (String)get_Value(COLUMNNAME_MIDDLE_NM);
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