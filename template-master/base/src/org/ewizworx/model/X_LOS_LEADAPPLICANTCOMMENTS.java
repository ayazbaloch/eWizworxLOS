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
/** Generated Model - DO NOT CHANGE */
package org.ewizworx.model;

import java.sql.ResultSet;
import java.util.Properties;
import org.compiere.model.*;

/** Generated Model for LOS_LEADAPPLICANTCOMMENTS
 *  @author Adempiere (generated) 
 *  @version Release 3.9.0 - $Id$ */
public class X_LOS_LEADAPPLICANTCOMMENTS extends PO implements I_LOS_LEADAPPLICANTCOMMENTS, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20190104L;

    /** Standard Constructor */
    public X_LOS_LEADAPPLICANTCOMMENTS (Properties ctx, int LOS_LEADAPPLICANTCOMMENTS_ID, String trxName)
    {
      super (ctx, LOS_LEADAPPLICANTCOMMENTS_ID, trxName);
      /** if (LOS_LEADAPPLICANTCOMMENTS_ID == 0)
        {
			setComments (null);
			setLOS_LEADAPPLICANTCOMMENTS_ID (0);
			setSUBTYPE (null);
			setType (null);
			setUUID (null);
        } */
    }

    /** Load Constructor */
    public X_LOS_LEADAPPLICANTCOMMENTS (Properties ctx, ResultSet rs, String trxName)
    {
      super (ctx, rs, trxName);
    }

    /** AccessLevel
      * @return 7 - System - Client - Org 
      */
    protected int get_AccessLevel()
    {
      return accessLevel.intValue();
    }

    /** Load Meta Data */
    protected POInfo initPO (Properties ctx)
    {
      POInfo poi = POInfo.getPOInfo (ctx, Table_ID, get_TrxName());
      return poi;
    }

    public String toString()
    {
      StringBuffer sb = new StringBuffer ("X_LOS_LEADAPPLICANTCOMMENTS[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set Comments.
		@param Comments 
		Comments or additional information
	  */
	public void setComments (String Comments)
	{
		set_Value (COLUMNNAME_Comments, Comments);
	}

	/** Get Comments.
		@return Comments or additional information
	  */
	public String getComments () 
	{
		return (String)get_Value(COLUMNNAME_Comments);
	}

	/** Set LOS LEAD APPLICANT COMMENTS ID.
		@param LOS_LEADAPPLICANTCOMMENTS_ID LOS LEAD APPLICANT COMMENTS ID	  */
	public void setLOS_LEADAPPLICANTCOMMENTS_ID (int LOS_LEADAPPLICANTCOMMENTS_ID)
	{
		if (LOS_LEADAPPLICANTCOMMENTS_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_LOS_LEADAPPLICANTCOMMENTS_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_LOS_LEADAPPLICANTCOMMENTS_ID, Integer.valueOf(LOS_LEADAPPLICANTCOMMENTS_ID));
	}

	/** Get LOS LEAD APPLICANT COMMENTS ID.
		@return LOS LEAD APPLICANT COMMENTS ID	  */
	public int getLOS_LEADAPPLICANTCOMMENTS_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_LOS_LEADAPPLICANTCOMMENTS_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set SUBTYPE.
		@param SUBTYPE SUBTYPE	  */
	public void setSUBTYPE (String SUBTYPE)
	{
		set_Value (COLUMNNAME_SUBTYPE, SUBTYPE);
	}

	/** Get SUBTYPE.
		@return SUBTYPE	  */
	public String getSUBTYPE () 
	{
		return (String)get_Value(COLUMNNAME_SUBTYPE);
	}

	/** Type AD_Reference_ID=101 */
	public static final int TYPE_AD_Reference_ID=101;
	/** SQL = S */
	public static final String TYPE_SQL = "S";
	/** Java Language = J */
	public static final String TYPE_JavaLanguage = "J";
	/** Java Script = E */
	public static final String TYPE_JavaScript = "E";
	/** Set Type.
		@param Type 
		Type of Validation (SQL, Java Script, Java Language)
	  */
	public void setType (String Type)
	{

		set_Value (COLUMNNAME_Type, Type);
	}

	/** Get Type.
		@return Type of Validation (SQL, Java Script, Java Language)
	  */
	public String getType () 
	{
		return (String)get_Value(COLUMNNAME_Type);
	}

	/** Set Immutable Universally Unique Identifier.
		@param UUID 
		Immutable Universally Unique Identifier
	  */
	public void setUUID (String UUID)
	{
		set_Value (COLUMNNAME_UUID, UUID);
	}

	/** Get Immutable Universally Unique Identifier.
		@return Immutable Universally Unique Identifier
	  */
	public String getUUID () 
	{
		return (String)get_Value(COLUMNNAME_UUID);
	}
}