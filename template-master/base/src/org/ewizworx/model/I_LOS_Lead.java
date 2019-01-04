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

/** Generated Interface for LOS_Lead
 *  @author Adempiere (generated) 
 *  @version Release 3.9.0
 */
public interface I_LOS_Lead 
{

    /** TableName=LOS_Lead */
    public static final String Table_Name = "LOS_Lead";

    /** AD_Table_ID=1000052 */
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

    /** Column name CHANNEL */
    public static final String COLUMNNAME_CHANNEL = "CHANNEL";

	/** Set CHANNEL	  */
	public void setCHANNEL (String CHANNEL);

	/** Get CHANNEL	  */
	public String getCHANNEL();

    /** Column name COL_BRANCH_ID */
    public static final String COLUMNNAME_COL_BRANCH_ID = "COL_BRANCH_ID";

	/** Set COL_BRANCH	  */
	public void setCOL_BRANCH_ID (int COL_BRANCH_ID);

	/** Get COL_BRANCH	  */
	public int getCOL_BRANCH_ID();

    /** Column name COL_PRIORITY_ID */
    public static final String COLUMNNAME_COL_PRIORITY_ID = "COL_PRIORITY_ID";

	/** Set Priority	  */
	public void setCOL_PRIORITY_ID (int COL_PRIORITY_ID);

	/** Get Priority	  */
	public int getCOL_PRIORITY_ID();

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

    /** Column name LEAD_DATE */
    public static final String COLUMNNAME_LEAD_DATE = "LEAD_DATE";

	/** Set LEAD_DATE	  */
	public void setLEAD_DATE (Timestamp LEAD_DATE);

	/** Get LEAD_DATE	  */
	public Timestamp getLEAD_DATE();

    /** Column name LOS_LOANENTITYTYPE_ID */
    public static final String COLUMNNAME_LOS_LOANENTITYTYPE_ID = "LOS_LOANENTITYTYPE_ID";

	/** Set LOS Loan Entity Type ID	  */
	public void setLOS_LOANENTITYTYPE_ID (int LOS_LOANENTITYTYPE_ID);

	/** Get LOS Loan Entity Type ID	  */
	public int getLOS_LOANENTITYTYPE_ID();

	public org.ewizworx.model.I_LOS_LOANENTITYTYPE getLOS_LOANENTITYTYPE() throws RuntimeException;

    /** Column name LOS_Lead_ID */
    public static final String COLUMNNAME_LOS_Lead_ID = "LOS_Lead_ID";

	/** Set LOS Lead ID	  */
	public void setLOS_Lead_ID (int LOS_Lead_ID);

	/** Get LOS Lead ID	  */
	public int getLOS_Lead_ID();

    /** Column name Processed */
    public static final String COLUMNNAME_Processed = "Processed";

	/** Set Processed.
	  * The document has been processed
	  */
	public void setProcessed (boolean Processed);

	/** Get Processed.
	  * The document has been processed
	  */
	public boolean isProcessed();

    /** Column name SOURCE */
    public static final String COLUMNNAME_SOURCE = "SOURCE";

	/** Set SOURCE	  */
	public void setSOURCE (String SOURCE);

	/** Get SOURCE	  */
	public String getSOURCE();

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
