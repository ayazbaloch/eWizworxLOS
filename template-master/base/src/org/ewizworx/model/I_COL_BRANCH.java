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

/** Generated Interface for COL_BRANCH
 *  @author Adempiere (generated) 
 *  @version Release 3.7.0LTS
 */
public interface I_COL_BRANCH 
{

    /** TableName=COL_BRANCH */
    public static final String Table_Name = "COL_BRANCH";

    /** AD_Table_ID=1000014 */
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

    /** Column name BRANCH_NM */
    public static final String COLUMNNAME_BRANCH_NM = "BRANCH_NM";

	/** Set BRANCH_NM	  */
	public void setBRANCH_NM (String BRANCH_NM);

	/** Get BRANCH_NM	  */
	public String getBRANCH_NM();

    /** Column name COL_BRANCH_ID */
    public static final String COLUMNNAME_COL_BRANCH_ID = "COL_BRANCH_ID";

	/** Set COL_BRANCH	  */
	public void setCOL_BRANCH_ID (int COL_BRANCH_ID);

	/** Get COL_BRANCH	  */
	public int getCOL_BRANCH_ID();

    /** Column name COL_BR_REGION_ID */
    public static final String COLUMNNAME_COL_BR_REGION_ID = "COL_BR_REGION_ID";

	/** Set COL_BR_REGION	  */
	public void setCOL_BR_REGION_ID (int COL_BR_REGION_ID);

	/** Get COL_BR_REGION	  */
	public int getCOL_BR_REGION_ID();

	public org.ewizworx.model.I_COL_BR_REGION getCOL_BR_REGION() throws RuntimeException;

    /** Column name COL_DISTRICT_ID */
    public static final String COLUMNNAME_COL_DISTRICT_ID = "COL_DISTRICT_ID";

	/** Set COL_DISTRICT_ID	  */
	public void setCOL_DISTRICT_ID (int COL_DISTRICT_ID);

	/** Get COL_DISTRICT_ID	  */
	public int getCOL_DISTRICT_ID();

	public org.ewizworx.model.I_COL_DISTRICT getCOL_DISTRICT() throws RuntimeException;

    /** Column name COL_TEHSIL_ID */
    public static final String COLUMNNAME_COL_TEHSIL_ID = "COL_TEHSIL_ID";

	/** Set COL_TEHSIL_ID	  */
	public void setCOL_TEHSIL_ID (int COL_TEHSIL_ID);

	/** Get COL_TEHSIL_ID	  */
	public int getCOL_TEHSIL_ID();

	public org.ewizworx.model.I_COL_TEHSIL getCOL_TEHSIL() throws RuntimeException;

    /** Column name CONTACT_NO1 */
    public static final String COLUMNNAME_CONTACT_NO1 = "CONTACT_NO1";

	/** Set CONTACT_NO1	  */
	public void setCONTACT_NO1 (String CONTACT_NO1);

	/** Get CONTACT_NO1	  */
	public String getCONTACT_NO1();

    /** Column name CONTACT_NO2 */
    public static final String COLUMNNAME_CONTACT_NO2 = "CONTACT_NO2";

	/** Set CONTACT_NO2	  */
	public void setCONTACT_NO2 (String CONTACT_NO2);

	/** Get CONTACT_NO2	  */
	public String getCONTACT_NO2();

    /** Column name C_BPartner_ID */
    public static final String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";

	/** Set Business Partner .
	  * Identifies a Business Partner
	  */
	public void setC_BPartner_ID (int C_BPartner_ID);

	/** Get Business Partner .
	  * Identifies a Business Partner
	  */
	public int getC_BPartner_ID();

	public org.compiere.model.I_C_BPartner getC_BPartner() throws RuntimeException;

    /** Column name Category */
    public static final String COLUMNNAME_Category = "Category";

	/** Set Category	  */
	public void setCategory (String Category);

	/** Get Category	  */
	public String getCategory();

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

    /** Column name Description */
    public static final String COLUMNNAME_Description = "Description";

	/** Set Description.
	  * Optional short description of the record
	  */
	public void setDescription (String Description);

	/** Get Description.
	  * Optional short description of the record
	  */
	public String getDescription();

    /** Column name EMAIL1 */
    public static final String COLUMNNAME_EMAIL1 = "EMAIL1";

	/** Set EMAIL1	  */
	public void setEMAIL1 (String EMAIL1);

	/** Get EMAIL1	  */
	public String getEMAIL1();

    /** Column name EMAIL2 */
    public static final String COLUMNNAME_EMAIL2 = "EMAIL2";

	/** Set EMAIL2	  */
	public void setEMAIL2 (String EMAIL2);

	/** Get EMAIL2	  */
	public String getEMAIL2();

    /** Column name FAX_NO1 */
    public static final String COLUMNNAME_FAX_NO1 = "FAX_NO1";

	/** Set FAX_NO1	  */
	public void setFAX_NO1 (String FAX_NO1);

	/** Get FAX_NO1	  */
	public String getFAX_NO1();

    /** Column name FAX_NO2 */
    public static final String COLUMNNAME_FAX_NO2 = "FAX_NO2";

	/** Set FAX_NO2	  */
	public void setFAX_NO2 (String FAX_NO2);

	/** Get FAX_NO2	  */
	public String getFAX_NO2();

    /** Column name ISLAMIC_BANKING */
    public static final String COLUMNNAME_ISLAMIC_BANKING = "ISLAMIC_BANKING";

	/** Set ISLAMIC_BANKING	  */
	public void setISLAMIC_BANKING (boolean ISLAMIC_BANKING);

	/** Get ISLAMIC_BANKING	  */
	public boolean isLAMIC_BANKING();

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

    /** Column name REF_CODE */
    public static final String COLUMNNAME_REF_CODE = "REF_CODE";

	/** Set REF_CODE	  */
	public void setREF_CODE (String REF_CODE);

	/** Get REF_CODE	  */
	public String getREF_CODE();

    /** Column name SWIFT_CODE */
    public static final String COLUMNNAME_SWIFT_CODE = "SWIFT_CODE";

	/** Set SWIFT_CODE	  */
	public void setSWIFT_CODE (String SWIFT_CODE);

	/** Get SWIFT_CODE	  */
	public String getSWIFT_CODE();

    /** Column name Status */
    public static final String COLUMNNAME_Status = "Status";

	/** Set Status.
	  * Status of the currently running check
	  */
	public void setStatus (String Status);

	/** Get Status.
	  * Status of the currently running check
	  */
	public String getStatus();

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
