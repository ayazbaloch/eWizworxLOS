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
package org.ewizworx.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.compiere.model.*;
import org.compiere.util.KeyNamePair;

/** Generated Interface for EW_PERSON
 *  @author Adempiere (generated) 
 *  @version Release 3.7.0LTS
 */
public interface I_EW_PERSON 
{

    /** TableName=EW_PERSON */
    public static final String Table_Name = "EW_PERSON";

    /** AD_Table_ID=1000021 */
    public static final int Table_ID = MTable.getTable_ID(Table_Name);

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /** AccessLevel = 7 - System - Client - Org 
     */
    BigDecimal accessLevel = BigDecimal.valueOf(7);

    /** Load Meta Data */

    /** Column name AD_Client_ID */
    public static final String COLUMNNAME_AD_Client_ID = "AD_Client_ID";

	/** Get Client.
	  * Client/Tenant for this installation.
	  */
	public int getAD_Client_ID();

    /** Column name AD_Org_ID */
    public static final String COLUMNNAME_AD_Org_ID = "AD_Org_ID";

	/** Set Organization.
	  * Organizational entity within client
	  */
	public void setAD_Org_ID (int AD_Org_ID);

	/** Get Organization.
	  * Organizational entity within client
	  */
	public int getAD_Org_ID();

    /** Column name Created */
    public static final String COLUMNNAME_Created = "Created";

	/** Get Created.
	  * Date this record was created
	  */
	public Timestamp getCreated();

    /** Column name CreatedBy */
    public static final String COLUMNNAME_CreatedBy = "CreatedBy";

	/** Get Created By.
	  * User who created this records
	  */
	public int getCreatedBy();

    /** Column name DOB */
    public static final String COLUMNNAME_DOB = "DOB";

	/** Set DOB	  */
	public void setDOB (Timestamp DOB);

	/** Get DOB	  */
	public Timestamp getDOB();

    /** Column name EW_GREETING_ID */
    public static final String COLUMNNAME_EW_GREETING_ID = "EW_GREETING_ID";

	/** Set Greeting	  */
	public void setEW_GREETING_ID (int EW_GREETING_ID);

	/** Get Greeting	  */
	public int getEW_GREETING_ID();

	public org.ewizworx.model.I_EW_GREETING getEW_GREETING() throws RuntimeException;

    /** Column name EW_PERSON_ID */
    public static final String COLUMNNAME_EW_PERSON_ID = "EW_PERSON_ID";

	/** Set Person ID	  */
	public void setEW_PERSON_ID (int EW_PERSON_ID);

	/** Get Person ID	  */
	public int getEW_PERSON_ID();

    /** Column name FIRST_NM */
    public static final String COLUMNNAME_FIRST_NM = "FIRST_NM";

	/** Set First Name	  */
	public void setFIRST_NM (String FIRST_NM);

	/** Get First Name	  */
	public String getFIRST_NM();

    /** Column name Full_Name */
    public static final String COLUMNNAME_Full_Name = "Full_Name";

	/** Set Full Name	  */
	public void setFull_Name (String Full_Name);

	/** Get Full Name	  */
	public String getFull_Name();

    /** Column name GENDER */
    public static final String COLUMNNAME_GENDER = "GENDER";

	/** Set Gender	  */
	public void setGENDER (String GENDER);

	/** Get Gender	  */
	public String getGENDER();

    /** Column name IsActive */
    public static final String COLUMNNAME_IsActive = "IsActive";

	/** Set Active.
	  * The record is active in the system
	  */
	public void setIsActive (boolean IsActive);

	/** Get Active.
	  * The record is active in the system
	  */
	public boolean isActive();

    /** Column name LAST_NM */
    public static final String COLUMNNAME_LAST_NM = "LAST_NM";

	/** Set LAST_NM	  */
	public void setLAST_NM (String LAST_NM);

	/** Get LAST_NM	  */
	public String getLAST_NM();

    /** Column name MIDDLE_NM */
    public static final String COLUMNNAME_MIDDLE_NM = "MIDDLE_NM";

	/** Set MIDDLE_NM	  */
	public void setMIDDLE_NM (String MIDDLE_NM);

	/** Get MIDDLE_NM	  */
	public String getMIDDLE_NM();

    /** Column name SOCIAL_SECURITY_NO */
    public static final String COLUMNNAME_SOCIAL_SECURITY_NO = "SOCIAL_SECURITY_NO";

	/** Set SOCIAL_SECURITY_NO	  */
	public void setSOCIAL_SECURITY_NO (String SOCIAL_SECURITY_NO);

	/** Get SOCIAL_SECURITY_NO	  */
	public String getSOCIAL_SECURITY_NO();

    /** Column name Updated */
    public static final String COLUMNNAME_Updated = "Updated";

	/** Get Updated.
	  * Date this record was updated
	  */
	public Timestamp getUpdated();

    /** Column name UpdatedBy */
    public static final String COLUMNNAME_UpdatedBy = "UpdatedBy";

	/** Get Updated By.
	  * User who updated this records
	  */
	public int getUpdatedBy();
}
