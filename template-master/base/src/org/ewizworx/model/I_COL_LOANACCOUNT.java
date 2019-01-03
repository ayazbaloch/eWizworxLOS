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

/** Generated Interface for COL_LOANACCOUNT
 *  @author Adempiere (generated) 
 *  @version Release 3.7.0LTS
 */
public interface I_COL_LOANACCOUNT 
{

    /** TableName=COL_LOANACCOUNT */
    public static final String Table_Name = "COL_LOANACCOUNT";

    /** AD_Table_ID=1000034 */
    public static final int Table_ID = MTable.getTable_ID(Table_Name);

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /** AccessLevel = 7 - System - Client - Org 
     */
    BigDecimal accessLevel = BigDecimal.valueOf(7);

    /** Load Meta Data */

    /** Column name ACMLT_DUE_AMT */
    public static final String COLUMNNAME_ACMLT_DUE_AMT = "ACMLT_DUE_AMT";

	/** Set ACMLT_DUE_AMT	  */
	public void setACMLT_DUE_AMT (BigDecimal ACMLT_DUE_AMT);

	/** Get ACMLT_DUE_AMT	  */
	public BigDecimal getACMLT_DUE_AMT();

    /** Column name ACMLT_DUE_MARKUP_AMT */
    public static final String COLUMNNAME_ACMLT_DUE_MARKUP_AMT = "ACMLT_DUE_MARKUP_AMT";

	/** Set ACMLT_DUE_MARKUP_AMT	  */
	public void setACMLT_DUE_MARKUP_AMT (BigDecimal ACMLT_DUE_MARKUP_AMT);

	/** Get ACMLT_DUE_MARKUP_AMT	  */
	public BigDecimal getACMLT_DUE_MARKUP_AMT();

    /** Column name ACMLT_DUE_PRINCIPLE_AMT */
    public static final String COLUMNNAME_ACMLT_DUE_PRINCIPLE_AMT = "ACMLT_DUE_PRINCIPLE_AMT";

	/** Set ACMLT_DUE_PRINCIPLE_AMT	  */
	public void setACMLT_DUE_PRINCIPLE_AMT (BigDecimal ACMLT_DUE_PRINCIPLE_AMT);

	/** Get ACMLT_DUE_PRINCIPLE_AMT	  */
	public BigDecimal getACMLT_DUE_PRINCIPLE_AMT();

    /** Column name ACMLT_PAID_AMT */
    public static final String COLUMNNAME_ACMLT_PAID_AMT = "ACMLT_PAID_AMT";

	/** Set ACMLT_PAID_AMT	  */
	public void setACMLT_PAID_AMT (BigDecimal ACMLT_PAID_AMT);

	/** Get ACMLT_PAID_AMT	  */
	public BigDecimal getACMLT_PAID_AMT();

    /** Column name ACMLT_PAID_MARKUP_AMT */
    public static final String COLUMNNAME_ACMLT_PAID_MARKUP_AMT = "ACMLT_PAID_MARKUP_AMT";

	/** Set ACMLT_PAID_MARKUP_AMT	  */
	public void setACMLT_PAID_MARKUP_AMT (BigDecimal ACMLT_PAID_MARKUP_AMT);

	/** Get ACMLT_PAID_MARKUP_AMT	  */
	public BigDecimal getACMLT_PAID_MARKUP_AMT();

    /** Column name ACMLT_PAID_PRINCIPLE_AMT */
    public static final String COLUMNNAME_ACMLT_PAID_PRINCIPLE_AMT = "ACMLT_PAID_PRINCIPLE_AMT";

	/** Set ACMLT_PAID_PRINCIPLE_AMT	  */
	public void setACMLT_PAID_PRINCIPLE_AMT (BigDecimal ACMLT_PAID_PRINCIPLE_AMT);

	/** Get ACMLT_PAID_PRINCIPLE_AMT	  */
	public BigDecimal getACMLT_PAID_PRINCIPLE_AMT();

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

    /** Column name APPLICATION_NO */
    public static final String COLUMNNAME_APPLICATION_NO = "APPLICATION_NO";

	/** Set APPLICATION_NO	  */
	public void setAPPLICATION_NO (String APPLICATION_NO);

	/** Get APPLICATION_NO	  */
	public String getAPPLICATION_NO();

    /** Column name APPROVAL_DT */
    public static final String COLUMNNAME_APPROVAL_DT = "APPROVAL_DT";

	/** Set APPROVAL_DT	  */
	public void setAPPROVAL_DT (Timestamp APPROVAL_DT);

	/** Get APPROVAL_DT	  */
	public Timestamp getAPPROVAL_DT();

    /** Column name CLOSED_DT */
    public static final String COLUMNNAME_CLOSED_DT = "CLOSED_DT";

	/** Set CLOSED_DT	  */
	public void setCLOSED_DT (Timestamp CLOSED_DT);

	/** Get CLOSED_DT	  */
	public Timestamp getCLOSED_DT();

    /** Column name COL_BORROWERTYPE_ID */
    public static final String COLUMNNAME_COL_BORROWERTYPE_ID = "COL_BORROWERTYPE_ID";

	/** Set COL_BORROWERTYPE_ID	  */
	public void setCOL_BORROWERTYPE_ID (int COL_BORROWERTYPE_ID);

	/** Get COL_BORROWERTYPE_ID	  */
	public int getCOL_BORROWERTYPE_ID();

	public org.ewizworx.model.I_COL_BORROWERTYPE getCOL_BORROWERTYPE() throws RuntimeException;

    /** Column name COL_CLASSIFICATION_ID */
    public static final String COLUMNNAME_COL_CLASSIFICATION_ID = "COL_CLASSIFICATION_ID";

	/** Set COL_CLASSIFICATION	  */
	public void setCOL_CLASSIFICATION_ID (int COL_CLASSIFICATION_ID);

	/** Get COL_CLASSIFICATION	  */
	public int getCOL_CLASSIFICATION_ID();

	public org.ewizworx.model.I_COL_CLASSIFICATION getCOL_CLASSIFICATION() throws RuntimeException;

    /** Column name COL_FREQUENCY_ID */
    public static final String COLUMNNAME_COL_FREQUENCY_ID = "COL_FREQUENCY_ID";

	/** Set COL_FREQUENCY	  */
	public void setCOL_FREQUENCY_ID (int COL_FREQUENCY_ID);

	/** Get COL_FREQUENCY	  */
	public int getCOL_FREQUENCY_ID();

	public org.ewizworx.model.I_COL_FREQUENCY getCOL_FREQUENCY() throws RuntimeException;

    /** Column name COL_LOANACCOUNT_ID */
    public static final String COLUMNNAME_COL_LOANACCOUNT_ID = "COL_LOANACCOUNT_ID";

	/** Set COL_LOANACCOUNT	  */
	public void setCOL_LOANACCOUNT_ID (int COL_LOANACCOUNT_ID);

	/** Get COL_LOANACCOUNT	  */
	public int getCOL_LOANACCOUNT_ID();

    /** Column name COL_MODE_ID */
    public static final String COLUMNNAME_COL_MODE_ID = "COL_MODE_ID";

	/** Set COL_MODE	  */
	public void setCOL_MODE_ID (int COL_MODE_ID);

	/** Get COL_MODE	  */
	public int getCOL_MODE_ID();

	public org.ewizworx.model.I_COL_MODE getCOL_MODE() throws RuntimeException;

    /** Column name COL_PRODUCT_ID */
    public static final String COLUMNNAME_COL_PRODUCT_ID = "COL_PRODUCT_ID";

	/** Set COL_PRODUCT	  */
	public void setCOL_PRODUCT_ID (int COL_PRODUCT_ID);

	/** Get COL_PRODUCT	  */
	public int getCOL_PRODUCT_ID();

	public org.ewizworx.model.I_COL_PRODUCT getCOL_PRODUCT() throws RuntimeException;

    /** Column name COL_SECURITY_ID */
    public static final String COLUMNNAME_COL_SECURITY_ID = "COL_SECURITY_ID";

	/** Set COL_SECURITY	  */
	public void setCOL_SECURITY_ID (int COL_SECURITY_ID);

	/** Get COL_SECURITY	  */
	public int getCOL_SECURITY_ID();

	public org.ewizworx.model.I_COL_SECURITY getCOL_SECURITY() throws RuntimeException;

    /** Column name COL_STATUS_ID */
    public static final String COLUMNNAME_COL_STATUS_ID = "COL_STATUS_ID";

	/** Set COL_STATUS	  */
	public void setCOL_STATUS_ID (int COL_STATUS_ID);

	/** Get COL_STATUS	  */
	public int getCOL_STATUS_ID();

	public org.ewizworx.model.I_COL_STATUS getCOL_STATUS() throws RuntimeException;

    /** Column name COL_UNIT_ID */
    public static final String COLUMNNAME_COL_UNIT_ID = "COL_UNIT_ID";

	/** Set COL_UNIT	  */
	public void setCOL_UNIT_ID (int COL_UNIT_ID);

	/** Get COL_UNIT	  */
	public int getCOL_UNIT_ID();

	public org.ewizworx.model.I_COL_UNIT getCOL_UNIT() throws RuntimeException;

    /** Column name CURRENT_DPD */
    public static final String COLUMNNAME_CURRENT_DPD = "CURRENT_DPD";

	/** Set CURRENT_DPD	  */
	public void setCURRENT_DPD (BigDecimal CURRENT_DPD);

	/** Get CURRENT_DPD	  */
	public BigDecimal getCURRENT_DPD();

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

    /** Column name DILINQUENT_DT */
    public static final String COLUMNNAME_DILINQUENT_DT = "DILINQUENT_DT";

	/** Set DILINQUENT_DT	  */
	public void setDILINQUENT_DT (Timestamp DILINQUENT_DT);

	/** Get DILINQUENT_DT	  */
	public Timestamp getDILINQUENT_DT();

    /** Column name DISBURSED_AMT */
    public static final String COLUMNNAME_DISBURSED_AMT = "DISBURSED_AMT";

	/** Set DISBURSED_AMT	  */
	public void setDISBURSED_AMT (BigDecimal DISBURSED_AMT);

	/** Get DISBURSED_AMT	  */
	public BigDecimal getDISBURSED_AMT();

    /** Column name DISBURSED_DT */
    public static final String COLUMNNAME_DISBURSED_DT = "DISBURSED_DT";

	/** Set DISBURSED_DT	  */
	public void setDISBURSED_DT (Timestamp DISBURSED_DT);

	/** Get DISBURSED_DT	  */
	public Timestamp getDISBURSED_DT();

    /** Column name EW_INSTITUTE_ID */
    public static final String COLUMNNAME_EW_INSTITUTE_ID = "EW_INSTITUTE_ID";

	/** Set EW_INSTITUTE	  */
	public void setEW_INSTITUTE_ID (int EW_INSTITUTE_ID);

	/** Get EW_INSTITUTE	  */
	public int getEW_INSTITUTE_ID();

	public org.ewizworx.model.I_EW_INSTITUTE getEW_INSTITUTE() throws RuntimeException;

    /** Column name EW_PERSON_ID */
    public static final String COLUMNNAME_EW_PERSON_ID = "EW_PERSON_ID";

	/** Set EW_PERSON	  */
	public void setEW_PERSON_ID (int EW_PERSON_ID);

	/** Get EW_PERSON	  */
	public int getEW_PERSON_ID();

	public org.ewizworx.model.I_EW_PERSON getEW_PERSON() throws RuntimeException;

    /** Column name IMSTALMENT_AMT */
    public static final String COLUMNNAME_IMSTALMENT_AMT = "IMSTALMENT_AMT";

	/** Set IMSTALMENT_AMT	  */
	public void setIMSTALMENT_AMT (BigDecimal IMSTALMENT_AMT);

	/** Get IMSTALMENT_AMT	  */
	public BigDecimal getIMSTALMENT_AMT();

    /** Column name INTEREST_RATE */
    public static final String COLUMNNAME_INTEREST_RATE = "INTEREST_RATE";

	/** Set INTEREST_RATE	  */
	public void setINTEREST_RATE (BigDecimal INTEREST_RATE);

	/** Get INTEREST_RATE	  */
	public BigDecimal getINTEREST_RATE();

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

    /** Column name LAST_PAYMENT_DT */
    public static final String COLUMNNAME_LAST_PAYMENT_DT = "LAST_PAYMENT_DT";

	/** Set LAST_PAYMENT_DT	  */
	public void setLAST_PAYMENT_DT (Timestamp LAST_PAYMENT_DT);

	/** Get LAST_PAYMENT_DT	  */
	public Timestamp getLAST_PAYMENT_DT();

    /** Column name LOAN_NO */
    public static final String COLUMNNAME_LOAN_NO = "LOAN_NO";

	/** Set LOAN_NO	  */
	public void setLOAN_NO (String LOAN_NO);

	/** Get LOAN_NO	  */
	public String getLOAN_NO();

    /** Column name LOAN_TENURE */
    public static final String COLUMNNAME_LOAN_TENURE = "LOAN_TENURE";

	/** Set LOAN_TENURE	  */
	public void setLOAN_TENURE (BigDecimal LOAN_TENURE);

	/** Get LOAN_TENURE	  */
	public BigDecimal getLOAN_TENURE();

    /** Column name LOAN_TITLE */
    public static final String COLUMNNAME_LOAN_TITLE = "LOAN_TITLE";

	/** Set LOAN_TITLE	  */
	public void setLOAN_TITLE (String LOAN_TITLE);

	/** Get LOAN_TITLE	  */
	public String getLOAN_TITLE();

    /** Column name MATURITY_DT */
    public static final String COLUMNNAME_MATURITY_DT = "MATURITY_DT";

	/** Set MATURITY_DT	  */
	public void setMATURITY_DT (Timestamp MATURITY_DT);

	/** Get MATURITY_DT	  */
	public Timestamp getMATURITY_DT();

    /** Column name NEXT_PAYMENT_DT */
    public static final String COLUMNNAME_NEXT_PAYMENT_DT = "NEXT_PAYMENT_DT";

	/** Set NEXT_PAYMENT_DT	  */
	public void setNEXT_PAYMENT_DT (Timestamp NEXT_PAYMENT_DT);

	/** Get NEXT_PAYMENT_DT	  */
	public Timestamp getNEXT_PAYMENT_DT();

    /** Column name OS_MARKUP_AMT */
    public static final String COLUMNNAME_OS_MARKUP_AMT = "OS_MARKUP_AMT";

	/** Set OS_MARKUP_AMT	  */
	public void setOS_MARKUP_AMT (BigDecimal OS_MARKUP_AMT);

	/** Get OS_MARKUP_AMT	  */
	public BigDecimal getOS_MARKUP_AMT();

    /** Column name OS_PRINCIPLE_AMT */
    public static final String COLUMNNAME_OS_PRINCIPLE_AMT = "OS_PRINCIPLE_AMT";

	/** Set OS_PRINCIPLE_AMT	  */
	public void setOS_PRINCIPLE_AMT (BigDecimal OS_PRINCIPLE_AMT);

	/** Get OS_PRINCIPLE_AMT	  */
	public BigDecimal getOS_PRINCIPLE_AMT();

    /** Column name PREVIOUS_DPD */
    public static final String COLUMNNAME_PREVIOUS_DPD = "PREVIOUS_DPD";

	/** Set PREVIOUS_DPD	  */
	public void setPREVIOUS_DPD (BigDecimal PREVIOUS_DPD);

	/** Get PREVIOUS_DPD	  */
	public BigDecimal getPREVIOUS_DPD();

    /** Column name REF_CODE */
    public static final String COLUMNNAME_REF_CODE = "REF_CODE";

	/** Set REF_CODE	  */
	public void setREF_CODE (String REF_CODE);

	/** Get REF_CODE	  */
	public String getREF_CODE();

    /** Column name TYPE_CD */
    public static final String COLUMNNAME_TYPE_CD = "TYPE_CD";

	/** Set TYPE_CD	  */
	public void setTYPE_CD (String TYPE_CD);

	/** Get TYPE_CD	  */
	public String getTYPE_CD();

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
