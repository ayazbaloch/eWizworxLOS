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

/** Generated Interface for EW_PERSON_ADDRESS
 *  @author Adempiere (generated) 
 *  @version Release 3.7.0LTS
 */
public interface I_EW_PERSON_ADDRESS 
{

    /** TableName=EW_PERSON_ADDRESS */
    public static final String Table_Name = "EW_PERSON_ADDRESS";

    /** AD_Table_ID=1000023 */
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

    /** Column name Address1 */
    public static final String COLUMNNAME_Address1 = "Address1";

	/** Set Address 1.
	  * Address line 1 for this location
	  */
	public void setAddress1 (String Address1);

	/** Get Address 1.
	  * Address line 1 for this location
	  */
	public String getAddress1();

    /** Column name Address2 */
    public static final String COLUMNNAME_Address2 = "Address2";

	/** Set Address 2.
	  * Address line 2 for this location
	  */
	public void setAddress2 (String Address2);

	/** Get Address 2.
	  * Address line 2 for this location
	  */
	public String getAddress2();

    /** Column name Address3 */
    public static final String COLUMNNAME_Address3 = "Address3";

	/** Set Address 3.
	  * Address Line 3 for the location
	  */
	public void setAddress3 (String Address3);

	/** Get Address 3.
	  * Address Line 3 for the location
	  */
	public String getAddress3();

    /** Column name COL_CITY_ID */
    public static final String COLUMNNAME_COL_CITY_ID = "COL_CITY_ID";

	/** Set City	  */
	public void setCOL_CITY_ID (int COL_CITY_ID);

	/** Get City	  */
	public int getCOL_CITY_ID();

	public org.ewizworx.model.I_COL_CITY getCOL_CITY() throws RuntimeException;

    /** Column name COL_COUNTRY_ID */
    public static final String COLUMNNAME_COL_COUNTRY_ID = "COL_COUNTRY_ID";

	/** Set Country	  */
	public void setCOL_COUNTRY_ID (int COL_COUNTRY_ID);

	/** Get Country	  */
	public int getCOL_COUNTRY_ID();

	public org.ewizworx.model.I_COL_COUNTRY getCOL_COUNTRY() throws RuntimeException;

    /** Column name COL_STATE_ID */
    public static final String COLUMNNAME_COL_STATE_ID = "COL_STATE_ID";

	/** Set Province	  */
	public void setCOL_STATE_ID (int COL_STATE_ID);

	/** Get Province	  */
	public int getCOL_STATE_ID();

	public org.ewizworx.model.I_COL_STATE getCOL_STATE() throws RuntimeException;

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

    /** Column name EW_ADDRESSTYPE_ID */
    public static final String COLUMNNAME_EW_ADDRESSTYPE_ID = "EW_ADDRESSTYPE_ID";

	/** Set Type	  */
	public void setEW_ADDRESSTYPE_ID (int EW_ADDRESSTYPE_ID);

	/** Get Type	  */
	public int getEW_ADDRESSTYPE_ID();

	public org.ewizworx.model.I_EW_ADDRESSTYPE getEW_ADDRESSTYPE() throws RuntimeException;

    /** Column name EW_PERSON_ADDRESS_ID */
    public static final String COLUMNNAME_EW_PERSON_ADDRESS_ID = "EW_PERSON_ADDRESS_ID";

	/** Set EW_PERSON_ADDRESS	  */
	public void setEW_PERSON_ADDRESS_ID (int EW_PERSON_ADDRESS_ID);

	/** Get EW_PERSON_ADDRESS	  */
	public int getEW_PERSON_ADDRESS_ID();

    /** Column name EW_PERSON_ID */
    public static final String COLUMNNAME_EW_PERSON_ID = "EW_PERSON_ID";

	/** Set EW_PERSON	  */
	public void setEW_PERSON_ID (int EW_PERSON_ID);

	/** Get EW_PERSON	  */
	public int getEW_PERSON_ID();

	public org.ewizworx.model.I_EW_PERSON getEW_PERSON() throws RuntimeException;

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

    /** Column name POST_CD */
    public static final String COLUMNNAME_POST_CD = "POST_CD";

	/** Set Post Code	  */
	public void setPOST_CD (String POST_CD);

	/** Get Post Code	  */
	public String getPOST_CD();

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
