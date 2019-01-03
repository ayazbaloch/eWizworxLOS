package org.compiere.model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.Properties;
import java.util.logging.Level;

import org.compiere.util.DB;
import org.compiere.util.Env;

/**
 * 
 * 
 * @author Ayaz Baloch (ayazbaloch@hotmail.com)
 *
 */


public class CalloutMom extends CalloutEngine {
/**
 * Return the next item number available for a MOM
 * @param ctx	Context
 * @param WindowNo	current Window No
 * @param mTab	Model Tab
 * @param mField	Model Field
 * @param value		The new value
 * @return	Error message or ""
 */
	public String getNextItemNbr (Properties ctx, int WindowNo,
			GridTab mTab, GridField mFiled, Object value)
	{
		Integer momid=(Integer)mTab.getValue("C_MOM_ID");
		String sql="SELECT MAX(ITEM_NBR) "
				+ "FROM C_MOM_DISCUSSIONLINE "
				+ "WHERE C_MOM_ID=?";
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try
		{
			pstmt=DB.prepareStatement(sql,null);
			pstmt.setInt(1,momid);
			rs=pstmt.executeQuery();
			Integer maxItemNbr=0;
			if (rs.next())
			{
				maxItemNbr=rs.getInt(1);
				Env.setContext(ctx, WindowNo, "item_nbr",maxItemNbr+1);
				mTab.setValue("item_nbr", maxItemNbr+1);
			}
			DB.close(rs,pstmt);
			rs=null;
			pstmt=null;
		}
		catch (SQLException e)
		{
			log.log(Level.SEVERE, sql, e);
			return e.getLocalizedMessage();
		}
		finally
		{
			DB.close(rs,pstmt);
			rs=null;
			pstmt=null;
		}
		
		return "";
	}
	
	
}
