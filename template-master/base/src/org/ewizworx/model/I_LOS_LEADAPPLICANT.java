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
package org.ewizworx.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.compiere.model.*;
import org.compiere.util.KeyNamePair;

/** Generated Interface for LOS_LEADAPPLICANT
 *  @author Adempiere (generated) 
 *  @version Release 3.9.0
 */
public interface I_LOS_LEADAPPLICANT 
{

    /** TableName=LOS_LEADAPPLICANT */
    public static final String Table_Name = "LOS_LEADAPPLICANT";

    /** AD_Table_ID=1000053 */
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

    /** Column name AddressLine */
    public static final String COLUMNNAME_AddressLine = "AddressLine";

	/** Set Address Line	  */
	public void setAddressLine (BigDecimal AddressLine);

	/** Get Address Line	  */
	public BigDecimal getAddressLine();

    /** Column name COLUMN3 */
    public static final String COLUMNNAME_COLUMN3 = "COLUMN3";

	/** Set COLUMN3	  */
	public void setCOLUMN3 (String COLUMN3);

	/** Get COLUMN3	  */
	public String getCOLUMN3();

    /** Column name COMPLETE_NM */
    public static final String COLUMNNAME_COMPLETE_NM = "COMPLETE_NM";

	/** Set Complete Name	  */
	public void setCOMPLETE_NM (String COMPLETE_NM);

	/** Get Complete Name	  */
	public String getCOMPLETE_NM();

    /** Column name ContactLine */
    public static final String COLUMNNAME_ContactLine = "ContactLine";

	/** Set Contact Line	  */
	public void setContactLine (BigDecimal ContactLine);

	/** Get Contact Line	  */
	public BigDecimal getContactLine();

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

    /** Column name DOE */
    public static final String COLUMNNAME_DOE = "DOE";

	/** Set DOE	  */
	public void setDOE (Timestamp DOE);

	/** Get DOE	  */
	public Timestamp getDOE();

    /** Column name EW_GREETING_ID */
    public static final String COLUMNNAME_EW_GREETING_ID = "EW_GREETING_ID";

	/** Set Greeting	  */
	public void setEW_GREETING_ID (int EW_GREETING_ID);

	/** Get Greeting	  */
	public int getEW_GREETING_ID();

    /** Column name FIRST_NM */
    public static final String COLUMNNAME_FIRST_NM = "FIRST_NM";

	/** Set First Name	  */
	public void setFIRST_NM (String FIRST_NM);

	/** Get First Name	  */
	public String getFIRST_NM();

    /** Column name Gender */
    public static final String COLUMNNAME_Gender = "Gender";

	/** Set Gender	  */
	public void setGender (String Gender);

	/** Get Gender	  */
	public String getGender();

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

	/** Set Last Name	  */
	public void setLAST_NM (String LAST_NM);

	/** Get Last Name	  */
	public String getLAST_NM();

    /** Column name LOS_LEADAPPLICANT_ID */
    public static final String COLUMNNAME_LOS_LEADAPPLICANT_ID = "LOS_LEADAPPLICANT_ID";

	/** Set LOS LEAD APPLICANT ID	  */
	public void setLOS_LEADAPPLICANT_ID (int LOS_LEADAPPLICANT_ID);

	/** Get LOS LEAD APPLICANT ID	  */
	public int getLOS_LEADAPPLICANT_ID();

    /** Column name LOS_Lead_ID */
    public static final String COLUMNNAME_LOS_Lead_ID = "LOS_Lead_ID";

	/** Set LOS Lead ID	  */
	public void setLOS_Lead_ID (int LOS_Lead_ID);

	/** Get LOS Lead ID	  */
	public int getLOS_Lead_ID();

    /** Column name MIDDLE_NM */
    public static final String COLUMNNAME_MIDDLE_NM = "MIDDLE_NM";

	/** Set Middle Name	  */
	public void setMIDDLE_NM (String MIDDLE_NM);

	/** Get Middle Name	  */
	public String getMIDDLE_NM();

    /** Column name STAKEHOLDERTYPE */
    public static final String COLUMNNAME_STAKEHOLDERTYPE = "STAKEHOLDERTYPE";

	/** Set STAKEHOLDERTYPE	  */
	public void setSTAKEHOLDERTYPE (String STAKEHOLDERTYPE);

	/** Get STAKEHOLDERTYPE	  */
	public String getSTAKEHOLDERTYPE();

    /** Column name UUID */
    public static final String COLUMNNAME_UUID = "UUID";

	/** Set Immutable Universally Unique Identifier.
	  * Immutable Universally Unique Identifier
	  */
	public void setUUID (String UUID);

	/** Get Immutable Universally Unique Identifier.
	  * Immutable Universally Unique Identifier
	  */
	public String getUUID();

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
