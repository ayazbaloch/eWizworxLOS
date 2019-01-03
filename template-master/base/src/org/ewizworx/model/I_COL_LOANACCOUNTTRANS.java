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

/** Generated Interface for COL_LOANACCOUNTTRANS
 *  @author Adempiere (generated) 
 *  @version Release 3.7.0LTS
 */
public interface I_COL_LOANACCOUNTTRANS 
{

    /** TableName=COL_LOANACCOUNTTRANS */
    public static final String Table_Name = "COL_LOANACCOUNTTRANS";

    /** AD_Table_ID=1000047 */
    public static final int Table_ID = MTable.getTable_ID(Table_Name);

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /** AccessLevel = 7 - System - Client - Org 
     */
    BigDecimal accessLevel = BigDecimal.valueOf(7);

    /** Load Meta Data */

    /** Column name ACTUAL_OD */
    public static final String COLUMNNAME_ACTUAL_OD = "ACTUAL_OD";

	/** Set ACTUAL_OD	  */
	public void setACTUAL_OD (int ACTUAL_OD);

	/** Get ACTUAL_OD	  */
	public int getACTUAL_OD();

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

    /** Column name COL_CLASSIFICATION_ID */
    public static final String COLUMNNAME_COL_CLASSIFICATION_ID = "COL_CLASSIFICATION_ID";

	/** Set COL_CLASSIFICATION	  */
	public void setCOL_CLASSIFICATION_ID (int COL_CLASSIFICATION_ID);

	/** Get COL_CLASSIFICATION	  */
	public int getCOL_CLASSIFICATION_ID();

	public org.ewizworx.model.I_COL_CLASSIFICATION getCOL_CLASSIFICATION() throws RuntimeException;

    /** Column name COL_LOANACCOUNTTRANS_ID */
    public static final String COLUMNNAME_COL_LOANACCOUNTTRANS_ID = "COL_LOANACCOUNTTRANS_ID";

	/** Set COL_LOANACCOUNTTRANS	  */
	public void setCOL_LOANACCOUNTTRANS_ID (int COL_LOANACCOUNTTRANS_ID);

	/** Get COL_LOANACCOUNTTRANS	  */
	public int getCOL_LOANACCOUNTTRANS_ID();

    /** Column name COL_LOANACCOUNT_ID */
    public static final String COLUMNNAME_COL_LOANACCOUNT_ID = "COL_LOANACCOUNT_ID";

	/** Set COL_LOANACCOUNT	  */
	public void setCOL_LOANACCOUNT_ID (int COL_LOANACCOUNT_ID);

	/** Get COL_LOANACCOUNT	  */
	public int getCOL_LOANACCOUNT_ID();

	public org.ewizworx.model.I_COL_LOANACCOUNT getCOL_LOANACCOUNT() throws RuntimeException;

    /** Column name CURRENT_DPD */
    public static final String COLUMNNAME_CURRENT_DPD = "CURRENT_DPD";

	/** Set CURRENT_DPD	  */
	public void setCURRENT_DPD (int CURRENT_DPD);

	/** Get CURRENT_DPD	  */
	public int getCURRENT_DPD();

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

    /** Column name FUNDING_BAL */
    public static final String COLUMNNAME_FUNDING_BAL = "FUNDING_BAL";

	/** Set FUNDING_BAL	  */
	public void setFUNDING_BAL (int FUNDING_BAL);

	/** Get FUNDING_BAL	  */
	public int getFUNDING_BAL();

    /** Column name INSTALLMENT_DUE */
    public static final String COLUMNNAME_INSTALLMENT_DUE = "INSTALLMENT_DUE";

	/** Set INSTALLMENT_DUE	  */
	public void setINSTALLMENT_DUE (int INSTALLMENT_DUE);

	/** Get INSTALLMENT_DUE	  */
	public int getINSTALLMENT_DUE();

    /** Column name INSTALLMENT_PAID */
    public static final String COLUMNNAME_INSTALLMENT_PAID = "INSTALLMENT_PAID";

	/** Set INSTALLMENT_PAID	  */
	public void setINSTALLMENT_PAID (int INSTALLMENT_PAID);

	/** Get INSTALLMENT_PAID	  */
	public int getINSTALLMENT_PAID();

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

    /** Column name OS_AMT */
    public static final String COLUMNNAME_OS_AMT = "OS_AMT";

	/** Set OS_AMT	  */
	public void setOS_AMT (BigDecimal OS_AMT);

	/** Get OS_AMT	  */
	public BigDecimal getOS_AMT();

    /** Column name PAID_AMT */
    public static final String COLUMNNAME_PAID_AMT = "PAID_AMT";

	/** Set PAID_AMT	  */
	public void setPAID_AMT (BigDecimal PAID_AMT);

	/** Get PAID_AMT	  */
	public BigDecimal getPAID_AMT();

    /** Column name PAID_DT */
    public static final String COLUMNNAME_PAID_DT = "PAID_DT";

	/** Set PAID_DT	  */
	public void setPAID_DT (Timestamp PAID_DT);

	/** Get PAID_DT	  */
	public Timestamp getPAID_DT();

    /** Column name PAID_MARKUP */
    public static final String COLUMNNAME_PAID_MARKUP = "PAID_MARKUP";

	/** Set PAID_MARKUP	  */
	public void setPAID_MARKUP (int PAID_MARKUP);

	/** Get PAID_MARKUP	  */
	public int getPAID_MARKUP();

    /** Column name PAID_PRICIPLE */
    public static final String COLUMNNAME_PAID_PRICIPLE = "PAID_PRICIPLE";

	/** Set PAID_PRICIPLE	  */
	public void setPAID_PRICIPLE (int PAID_PRICIPLE);

	/** Get PAID_PRICIPLE	  */
	public int getPAID_PRICIPLE();

    /** Column name PERIOD */
    public static final String COLUMNNAME_PERIOD = "PERIOD";

	/** Set PERIOD	  */
	public void setPERIOD (String PERIOD);

	/** Get PERIOD	  */
	public String getPERIOD();

    /** Column name PREVIOUS_DPD */
    public static final String COLUMNNAME_PREVIOUS_DPD = "PREVIOUS_DPD";

	/** Set PREVIOUS_DPD	  */
	public void setPREVIOUS_DPD (int PREVIOUS_DPD);

	/** Get PREVIOUS_DPD	  */
	public int getPREVIOUS_DPD();

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
