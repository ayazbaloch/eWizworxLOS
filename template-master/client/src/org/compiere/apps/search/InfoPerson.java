package org.compiere.apps.search;

import java.awt.Frame;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.compiere.util.Env;
import org.compiere.util.Msg;

public class InfoPerson extends Info implements ActionListener {

	protected InfoPerson(Frame frame, boolean modal, int WindowNo, String tableName, String keyColumn,
			boolean multiSelection, boolean saveResults, String whereClause) {
		super(frame, modal, WindowNo, "EW_PERSON", "EW_PERSON_ID", multiSelection, saveResults, whereClause);
		// TODO Auto-generated constructor stub
		
		setTitle(Msg.getMsg(Env.getCtx(), "InfoPerson"));
	}

	@Override
	protected String getSQLWhere() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected void setParameters(PreparedStatement pstmt, boolean forCount) throws SQLException {
		// TODO Auto-generated method stub

	}

}
