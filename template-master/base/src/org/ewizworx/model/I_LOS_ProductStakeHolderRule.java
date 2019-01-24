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

/** Generated Interface for LOS_ProductStakeHolderRule
 *  @author Adempiere (generated) 
 *  @version Release 3.9.0
 */
public interface I_LOS_ProductStakeHolderRule 
{

    /** TableName=LOS_ProductStakeHolderRule */
    public static final String Table_Name = "LOS_ProductStakeHolderRule";

    /** AD_Table_ID=1000066 */
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

    /** Column name BUSINESSSIGMENT */
    public static final String COLUMNNAME_BUSINESSSIGMENT = "BUSINESSSIGMENT";

	/** Set BUSINESSSIGMENT	  */
	public void setBUSINESSSIGMENT (String BUSINESSSIGMENT);

	/** Get BUSINESSSIGMENT	  */
	public String getBUSINESSSIGMENT();

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

    /** Column name LOS_LOANENTITYTYPE_ID */
    public static final String COLUMNNAME_LOS_LOANENTITYTYPE_ID = "LOS_LOANENTITYTYPE_ID";

	/** Set LOS Loan Entity Type ID	  */
	public void setLOS_LOANENTITYTYPE_ID (int LOS_LOANENTITYTYPE_ID);

	/** Get LOS Loan Entity Type ID	  */
	public int getLOS_LOANENTITYTYPE_ID();

	public org.ewizworx.model.I_LOS_LOANENTITYTYPE getLOS_LOANENTITYTYPE() throws RuntimeException;

    /** Column name LOS_PRODUCT_ID */
    public static final String COLUMNNAME_LOS_PRODUCT_ID = "LOS_PRODUCT_ID";

	/** Set LOS_PRODUCT_ID	  */
	public void setLOS_PRODUCT_ID (int LOS_PRODUCT_ID);

	/** Get LOS_PRODUCT_ID	  */
	public int getLOS_PRODUCT_ID();

	public org.ewizworx.model.I_LOS_PRODUCT getLOS_PRODUCT() throws RuntimeException;

    /** Column name LOS_ProductStakeHolderRule_ID */
    public static final String COLUMNNAME_LOS_ProductStakeHolderRule_ID = "LOS_ProductStakeHolderRule_ID";

	/** Set LOS Product Stakeholder Rule ID	  */
	public void setLOS_ProductStakeHolderRule_ID (int LOS_ProductStakeHolderRule_ID);

	/** Get LOS Product Stakeholder Rule ID	  */
	public int getLOS_ProductStakeHolderRule_ID();

    /** Column name MaxValue */
    public static final String COLUMNNAME_MaxValue = "MaxValue";

	/** Set Max Value	  */
	public void setMaxValue (int MaxValue);

	/** Get Max Value	  */
	public int getMaxValue();

    /** Column name MinValue */
    public static final String COLUMNNAME_MinValue = "MinValue";

	/** Set Min Value	  */
	public void setMinValue (int MinValue);

	/** Get Min Value	  */
	public int getMinValue();

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
