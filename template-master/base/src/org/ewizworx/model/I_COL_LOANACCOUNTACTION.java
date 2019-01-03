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

/** Generated Interface for COL_LOANACCOUNTACTION
 *  @author Adempiere (generated) 
 *  @version Release 3.8.0
 */
public interface I_COL_LOANACCOUNTACTION 
{

    /** TableName=COL_LOANACCOUNTACTION */
    public static final String Table_Name = "COL_LOANACCOUNTACTION";

    /** AD_Table_ID=1000045 */
    public static final int Table_ID = MTable.getTable_ID(Table_Name);

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /** AccessLevel = 7 - System - Client - Org 
     */
    BigDecimal accessLevel = BigDecimal.valueOf(7);

    /** Load Meta Data */

    /** Column name ACTIONMODE */
    public static final String COLUMNNAME_ACTIONMODE = "ACTIONMODE";

	/** Set ACTIONMODE	  */
	public void setACTIONMODE (String ACTIONMODE);

	/** Get ACTIONMODE	  */
	public String getACTIONMODE();

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

    /** Column name Amount */
    public static final String COLUMNNAME_Amount = "Amount";

	/** Set Amount.
	  * Amount in a defined currency
	  */
	public void setAmount (int Amount);

	/** Get Amount.
	  * Amount in a defined currency
	  */
	public int getAmount();

    /** Column name COL_ACTIONTYPE_ID */
    public static final String COLUMNNAME_COL_ACTIONTYPE_ID = "COL_ACTIONTYPE_ID";

	/** Set COL_ACTIONTYPE	  */
	public void setCOL_ACTIONTYPE_ID (int COL_ACTIONTYPE_ID);

	/** Get COL_ACTIONTYPE	  */
	public int getCOL_ACTIONTYPE_ID();

	public org.ewizworx.model.I_COL_ACTIONTYPE getCOL_ACTIONTYPE() throws RuntimeException;

    /** Column name COL_FREQUENCY_ID */
    public static final String COLUMNNAME_COL_FREQUENCY_ID = "COL_FREQUENCY_ID";

	/** Set COL_FREQUENCY	  */
	public void setCOL_FREQUENCY_ID (int COL_FREQUENCY_ID);

	/** Get COL_FREQUENCY	  */
	public int getCOL_FREQUENCY_ID();

	public org.ewizworx.model.I_COL_FREQUENCY getCOL_FREQUENCY() throws RuntimeException;

    /** Column name COL_LOANACCOUNTACTION_ID */
    public static final String COLUMNNAME_COL_LOANACCOUNTACTION_ID = "COL_LOANACCOUNTACTION_ID";

	/** Set COL_LOANACCOUNTACTION	  */
	public void setCOL_LOANACCOUNTACTION_ID (int COL_LOANACCOUNTACTION_ID);

	/** Get COL_LOANACCOUNTACTION	  */
	public int getCOL_LOANACCOUNTACTION_ID();

    /** Column name COL_LOANACCOUNT_ID */
    public static final String COLUMNNAME_COL_LOANACCOUNT_ID = "COL_LOANACCOUNT_ID";

	/** Set COL_LOANACCOUNT	  */
	public void setCOL_LOANACCOUNT_ID (int COL_LOANACCOUNT_ID);

	/** Get COL_LOANACCOUNT	  */
	public int getCOL_LOANACCOUNT_ID();

	public org.ewizworx.model.I_COL_LOANACCOUNT getCOL_LOANACCOUNT() throws RuntimeException;

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

    /** Column name DUETIME */
    public static final String COLUMNNAME_DUETIME = "DUETIME";

	/** Set DUETIME	  */
	public void setDUETIME (Timestamp DUETIME);

	/** Get DUETIME	  */
	public Timestamp getDUETIME();

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

    /** Column name DueDate */
    public static final String COLUMNNAME_DueDate = "DueDate";

	/** Set Due Date.
	  * Date when the payment is due
	  */
	public void setDueDate (Timestamp DueDate);

	/** Get Due Date.
	  * Date when the payment is due
	  */
	public Timestamp getDueDate();

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

    /** Column name LOAN_TITLE */
    public static final String COLUMNNAME_LOAN_TITLE = "LOAN_TITLE";

	/** Set LOAN_TITLE	  */
	public void setLOAN_TITLE (String LOAN_TITLE);

	/** Get LOAN_TITLE	  */
	public String getLOAN_TITLE();

    /** Column name Priority */
    public static final String COLUMNNAME_Priority = "Priority";

	/** Set Priority.
	  * Indicates if this request is of a high, medium or low priority.
	  */
	public void setPriority (BigDecimal Priority);

	/** Get Priority.
	  * Indicates if this request is of a high, medium or low priority.
	  */
	public BigDecimal getPriority();

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
