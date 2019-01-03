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

/** Generated Interface for EW_INSTITUTE
 *  @author Adempiere (generated) 
 *  @version Release 3.7.0LTS
 */
public interface I_EW_INSTITUTE 
{

    /** TableName=EW_INSTITUTE */
    public static final String Table_Name = "EW_INSTITUTE";

    /** AD_Table_ID=1000025 */
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

    /** Column name AD_Language_ID */
    public static final String COLUMNNAME_AD_Language_ID = "AD_Language_ID";

	/** Set Language ID	  */
	public void setAD_Language_ID (int AD_Language_ID);

	/** Get Language ID	  */
	public int getAD_Language_ID();

	public org.compiere.model.I_AD_Language getAD_Language() throws RuntimeException;

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

    /** Column name COL_CITY_ID */
    public static final String COLUMNNAME_COL_CITY_ID = "COL_CITY_ID";

	/** Set COL_CITY	  */
	public void setCOL_CITY_ID (int COL_CITY_ID);

	/** Get COL_CITY	  */
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

	/** Set COL_STATE	  */
	public void setCOL_STATE_ID (int COL_STATE_ID);

	/** Get COL_STATE	  */
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

    /** Column name EMail */
    public static final String COLUMNNAME_EMail = "EMail";

	/** Set EMail Address.
	  * Electronic Mail Address
	  */
	public void setEMail (String EMail);

	/** Get EMail Address.
	  * Electronic Mail Address
	  */
	public String getEMail();

    /** Column name EW_INSTITUTE_ID */
    public static final String COLUMNNAME_EW_INSTITUTE_ID = "EW_INSTITUTE_ID";

	/** Set EW_INSTITUTE	  */
	public void setEW_INSTITUTE_ID (int EW_INSTITUTE_ID);

	/** Get EW_INSTITUTE	  */
	public int getEW_INSTITUTE_ID();

    /** Column name FAX_NO */
    public static final String COLUMNNAME_FAX_NO = "FAX_NO";

	/** Set FAX_NO	  */
	public void setFAX_NO (String FAX_NO);

	/** Get FAX_NO	  */
	public String getFAX_NO();

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

    /** Column name IsDefault */
    public static final String COLUMNNAME_IsDefault = "IsDefault";

	/** Set Default.
	  * Default value
	  */
	public void setIsDefault (boolean IsDefault);

	/** Get Default.
	  * Default value
	  */
	public boolean isDefault();

    /** Column name LAND_LINE_NO */
    public static final String COLUMNNAME_LAND_LINE_NO = "LAND_LINE_NO";

	/** Set LAND_LINE_NO	  */
	public void setLAND_LINE_NO (String LAND_LINE_NO);

	/** Get LAND_LINE_NO	  */
	public String getLAND_LINE_NO();

    /** Column name Name */
    public static final String COLUMNNAME_Name = "Name";

	/** Set Name.
	  * Alphanumeric identifier of the entity
	  */
	public void setName (String Name);

	/** Get Name.
	  * Alphanumeric identifier of the entity
	  */
	public String getName();

    /** Column name STREET_ADDRESS */
    public static final String COLUMNNAME_STREET_ADDRESS = "STREET_ADDRESS";

	/** Set STREET_ADDRESS	  */
	public void setSTREET_ADDRESS (String STREET_ADDRESS);

	/** Get STREET_ADDRESS	  */
	public String getSTREET_ADDRESS();

    /** Column name UAN_NO */
    public static final String COLUMNNAME_UAN_NO = "UAN_NO";

	/** Set UAN_NO	  */
	public void setUAN_NO (String UAN_NO);

	/** Get UAN_NO	  */
	public String getUAN_NO();

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

    /** Column name WEB_SITE */
    public static final String COLUMNNAME_WEB_SITE = "WEB_SITE";

	/** Set WEB_SITE	  */
	public void setWEB_SITE (String WEB_SITE);

	/** Get WEB_SITE	  */
	public String getWEB_SITE();

    /** Column name ZIP_CODE */
    public static final String COLUMNNAME_ZIP_CODE = "ZIP_CODE";

	/** Set ZIP_CODE	  */
	public void setZIP_CODE (String ZIP_CODE);

	/** Get ZIP_CODE	  */
	public String getZIP_CODE();
}
