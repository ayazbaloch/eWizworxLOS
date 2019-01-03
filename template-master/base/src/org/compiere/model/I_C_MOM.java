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
package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.compiere.util.KeyNamePair;

/** Generated Interface for C_MOM
 *  @author Adempiere (generated) 
 *  @version Release 3.6.0LTS
 */
public interface I_C_MOM 
{

    /** TableName=C_MOM */
    public static final String Table_Name = "C_MOM";

    /** AD_Table_ID=1000001 */
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

    /** Column name AD_User_ID */
    public static final String COLUMNNAME_AD_User_ID = "AD_User_ID";

	/** Set Usuario.
	  * User within the system - Internal or Business Partner Contact
	  */
	public void setAD_User_ID (int AD_User_ID);

	/** Get Usuario.
	  * User within the system - Internal or Business Partner Contact
	  */
	public int getAD_User_ID();

	public org.compiere.model.I_AD_User getAD_User() throws RuntimeException;

    /** Column name AGENDA */
    public static final String COLUMNNAME_AGENDA = "AGENDA";

	/** Set Agenda	  */
	public void setAGENDA (String AGENDA);

	/** Get Agenda	  */
	public String getAGENDA();

    /** Column name C_MOM_ID */
    public static final String COLUMNNAME_C_MOM_ID = "C_MOM_ID";

	/** Set Minutes of meeting detail	  */
	public void setC_MOM_ID (int C_MOM_ID);

	/** Get Minutes of meeting detail	  */
	public int getC_MOM_ID();

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

    /** Column name END_TIME */
    public static final String COLUMNNAME_END_TIME = "END_TIME";

	/** Set End Time	  */
	public void setEND_TIME (Timestamp END_TIME);

	/** Get End Time	  */
	public Timestamp getEND_TIME();

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

    /** Column name START_DATE */
    public static final String COLUMNNAME_START_DATE = "START_DATE";

	/** Set Start Date	  */
	public void setSTART_DATE (Timestamp START_DATE);

	/** Get Start Date	  */
	public Timestamp getSTART_DATE();

    /** Column name START_TIME */
    public static final String COLUMNNAME_START_TIME = "START_TIME";

	/** Set Start Time	  */
	public void setSTART_TIME (Timestamp START_TIME);

	/** Get Start Time	  */
	public Timestamp getSTART_TIME();

    /** Column name TAB_PARTICIPANTS */
    public static final String COLUMNNAME_TAB_PARTICIPANTS = "TAB_PARTICIPANTS";

	/** Set TAB_PARTICIPANTS	  */
	public void setTAB_PARTICIPANTS (int TAB_PARTICIPANTS);

	/** Get TAB_PARTICIPANTS	  */
	public int getTAB_PARTICIPANTS();

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

    /** Column name Value */
    public static final String COLUMNNAME_Value = "Value";

	/** Set Search Key.
	  * Search key for the record in the format required - must be unique
	  */
	public void setValue (String Value);

	/** Get Search Key.
	  * Search key for the record in the format required - must be unique
	  */
	public String getValue();
}
