package org.ewizworx.process;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import org.adempiere.exceptions.DBException;
import org.compiere.process.SvrProcess;
import org.compiere.util.DB;

public class ImportLoanAccount extends SvrProcess {

	
	protected void prepare() {
		// TODO Auto-generated method stub

	}

	
	protected String doIt() throws Exception {
		StringBuffer sql=null;
		int no = 0;
		int totalrecords=0;
		String maxPeriod="";
		String currentPeriod="";
		
		maxPeriod=getPeriod("SELECT MAX(PERIOD) FROM COL_LOANACCOUNTTRANS");
		currentPeriod=getPeriod("SELECT PERIOD FROM I_LOANACCOUNT WHERE ROWNUM=1");
		 
		//return "Exit withod performing task MaxPeriod='" +maxPeriod + "'" + " CurrentPeriod='" +currentPeriod +"'";
		
		
		
		totalrecords = DB.getSQLValue(get_TrxName(),
				"SELECT COUNT(*) FROM I_LOANACCOUNT");
		
		
		//TRY
		try
		{
		
		sql=new StringBuffer("UPDATE I_LOANACCOUNT "
				+ "SET COL_PRODUCT=(SELECT COL_PRODUCT_ID " 
				+					"FROM COL_PRODUCT p "
				+					"WHERE p.PRODUCT=I_LOANACCOUNT.COL_PRODUCT),"
				+ "PROCESSING='Y'"
				+	"WHERE EXISTS "
				+		"(SELECT PRODUCT FROM COL_PRODUCT P "
				+		"WHERE p.PRODUCT=I_LOANACCOUNT.COL_PRODUCT)");
		
		no = DB.executeUpdate(sql.toString(), get_TrxName());
		
		if (no<0){
			throw new Exception();
		}
		
		log.info("Updated of COL_PRODUCT=" + no);
		
		if (totalrecords!=no){
			sql=new StringBuffer("UPDATE I_LOANACCOUNT "
					+ 	"SET I_ERRORMSG=DECODE(I_ERRORMSG,NULL,'') || ' product not configure in COL_PRODUCT table;'  " 
					+	"WHERE NOT EXISTS "
					+	"(SELECT PRODUCT FROM COL_PRODUCT p "
					+	"WHERE p.PRODUCT=I_LOANACCOUNT.COL_PRODUCT) "
					+	"AND PROCESSING IN ('N',NULL)");
			
			no = DB.executeUpdate(sql.toString(), get_TrxName());
			
			if (no<0){
				throw new Exception();
			}
			
			log.info("Product errors=" + no);
		}
		
		//Reset processed flag
		sql=new StringBuffer("UPDATE I_LOANACCOUNT "
				+ 	"SET PROCESSING='N'");
		no = DB.executeUpdate(sql.toString(), get_TrxName());
		
		if (no<0){
			throw new Exception();
		}
		
		log.info("Processed Falg reset =" + no);
		
		//Processing for Borrower Type
		sql=new StringBuffer("UPDATE I_LOANACCOUNT "
				+ "SET COL_BORROWERTYPE=(SELECT COL_BORROWERTYPE_ID " 
				+					"FROM COL_BORROWERTYPE b "
				+					"WHERE UPPER(b.BORROWERTYPE)=UPPER(I_LOANACCOUNT.COL_BORROWERTYPE)), "
				+ "PROCESSING='Y'"
				+	"WHERE EXISTS "
				+		"(SELECT BORROWERTYPE FROM COL_BORROWERTYPE b "
				+		"WHERE UPPER(b.BORROWERTYPE)=UPPER(I_LOANACCOUNT.COL_BORROWERTYPE))");
		
		no = DB.executeUpdate(sql.toString(), get_TrxName());
		
		if (no<0){
			throw new Exception();
		}
		
		log.info("Updated of COL_BORROWERTYPE=" + no);
		
		if (totalrecords!=no){
			sql=new StringBuffer("UPDATE I_LOANACCOUNT "
					+ 	"SET I_ERRORMSG=DECODE(I_ERRORMSG,NULL,'') || ' Borrower Type not configure in COL_BORROWERTYPE table;'  " 
					+	"WHERE NOT EXISTS "
					+	"(SELECT BORROWERTYPE FROM COL_BORROWERTYPE b "
					+	"WHERE UPPER(b.BORROWERTYPE)=UPPER(I_LOANACCOUNT.COL_BORROWERTYPE)) "
					+	"AND PROCESSING IN ('N',NULL)");
			
			no = DB.executeUpdate(sql.toString(), get_TrxName());
			
			if (no<0){
				throw new Exception();
			}
			
			log.info("Borrower Types errors=" + no);
		}
		
		//Reset processed flag
		sql=new StringBuffer("UPDATE I_LOANACCOUNT "
				+ 	"SET PROCESSING='N'");
		no = DB.executeUpdate(sql.toString(), get_TrxName());
		
		if (no<0){
			throw new Exception();
		}
		
		log.info("Processed Falg reset =" + no);
		
		
		//Processing for Classification ID
		
		//the following query is updating classification desription according 
		//to provide by source system, but this has error some time invalid classification marking
				
		sql=new StringBuffer("UPDATE I_LOANACCOUNT "
				+ "SET COL_CLASSIFICATION=(SELECT COL_CLASSIFICATION_ID " 
				+						"FROM COL_CLASSIFICATION c "
				+						"WHERE UPPER(c.CLASSIFICATION)=UPPER(I_LOANACCOUNT.COL_CLASSIFICATION) " 
				+						"AND c.COL_PRODUCT_ID=I_LOANACCOUNT.COL_PRODUCT) , "
				+ "PROCESSING='Y'"
				+	"WHERE EXISTS "
				+		"(SELECT CLASSIFICATION FROM COL_CLASSIFICATION c "
				+		"WHERE UPPER(c.CLASSIFICATION)=UPPER(I_LOANACCOUNT.COL_CLASSIFICATION) " 
				+		"AND c.COL_PRODUCT_ID=I_LOANACCOUNT.COL_PRODUCT)");
		
		
		//New query is now
		/*
		sql=new StringBuffer("UPDATE I_LOANACCOUNT IL "
							+ "SET IL.COL_CLASSIFICATION= "
							+ "(" 
							+  "SELECT C.COL_CLASSIFICATION_ID "
							+  "FROM  COL_CLASSIFICATION C "
							+  "INNER JOIN COL_PRODUCT P "
							+  "ON C.COL_PRODUCT_ID=P.COL_PRODUCT_ID "
							+  "WHERE (IL.CURRENT_DPD  BETWEEN C.DPD_FROM AND C.DPT_TO "
							+  "    AND IL.COL_PRODUCT=P.PRODUCT))");
		*/
		no = DB.executeUpdate(sql.toString(), get_TrxName());
		
		if (no<0){
			throw new Exception();
		}
		
		log.info("Updated of COL_CLASSIFICATION=" + no);
		
		if (totalrecords!=no){
			sql=new StringBuffer("UPDATE I_LOANACCOUNT "
					+ 	"SET I_ERRORMSG=DECODE(I_ERRORMSG,NULL,'') || ' Classification not configure in COL_CLASSIFICATION table;'  " 
					+	"WHERE NOT EXISTS "
					+	"(SELECT CLASSIFICATION FROM COL_CLASSIFICATION c "
					+	"WHERE UPPER(c.CLASSIFICATION)=UPPER(I_LOANACCOUNT.COL_CLASSIFICATION) "
					+	"AND c.COL_PRODUCT_ID=I_LOANACCOUNT.COL_PRODUCT) "
					+	"AND PROCESSING IN ('N',NULL)");
			
			no = DB.executeUpdate(sql.toString(), get_TrxName());
			
			if (no<0){
				throw new Exception();
			}
			
			log.info("Classification Types errors=" + no);
		}
		
		//Reset processed flag
		sql=new StringBuffer("UPDATE I_LOANACCOUNT "
				+ 	"SET PROCESSING='N'");
		no = DB.executeUpdate(sql.toString(), get_TrxName());
		
		if (no<0){
			throw new Exception();
		}
		
		log.info("Processed Falg reset =" + no);
		
		
		//Processing for Mode Type
		sql=new StringBuffer("UPDATE I_LOANACCOUNT "
				+ "SET COL_MODE=(SELECT COL_MODE_ID " 
				+					"FROM COL_MODE m "
				+					"WHERE UPPER(m.NAME)=UPPER(I_LOANACCOUNT.COL_MODE)), "
				+ "PROCESSING='Y'"
				+	"WHERE EXISTS "
				+		"(SELECT NAME FROM COL_MODE m "
				+		"WHERE UPPER(m.NAME)=UPPER(I_LOANACCOUNT.COL_MODE))");
		
		no = DB.executeUpdate(sql.toString(), get_TrxName());
		
		if (no<0){
			throw new Exception();
		}
		
		log.info("Updated of COL_MODE=" + no);
		
		if (totalrecords!=no){
			sql=new StringBuffer("UPDATE I_LOANACCOUNT "
					+ 	"SET I_ERRORMSG=DECODE(I_ERRORMSG,NULL,'') || ' Mode type not configure in COL_MODE table;'  " 
					+	"WHERE NOT EXISTS "
					+	"(SELECT NAME FROM COL_MODE m "
					+	"WHERE UPPER(m.NAME)=UPPER(I_LOANACCOUNT.COL_MODE)) "
					+	"AND PROCESSING IN ('N',NULL)");
			
			no = DB.executeUpdate(sql.toString(), get_TrxName());
			
			if (no<0){
				throw new Exception();
			}
			
			log.info("Mode Types errors=" + no);
		}
		
		//Reset processed flag
		sql=new StringBuffer("UPDATE I_LOANACCOUNT "
				+ 	"SET PROCESSING='N'");
		no = DB.executeUpdate(sql.toString(), get_TrxName());
		
		if (no<0){
			throw new Exception();
		}
		
		log.info("Processed Falg reset =" + no);
		
		
		
		//Processing for Status Type
		sql=new StringBuffer("UPDATE I_LOANACCOUNT "
				+ "SET COL_STATUS=(SELECT COL_STATUS_ID " 
				+					"FROM COL_STATUS s "
				+					"WHERE UPPER(s.STATUS)=UPPER(I_LOANACCOUNT.COL_STATUS)), "
				+ "PROCESSING='Y'"
				+	"WHERE EXISTS "
				+		"(SELECT STATUS FROM COL_STATUS s "
				+		"WHERE UPPER(s.STATUS)=UPPER(I_LOANACCOUNT.COL_STATUS))");
		
		no = DB.executeUpdate(sql.toString(), get_TrxName());
		
		if (no<0){
			throw new Exception();
		}
		
		log.info("Updated of COL_STATUS=" + no);
		
		if (totalrecords!=no){
			sql=new StringBuffer("UPDATE I_LOANACCOUNT "
					+ 	"SET I_ERRORMSG=DECODE(I_ERRORMSG,NULL,'') || ' Status type not configure in COL_STATUS table;'  " 
					+	"WHERE NOT EXISTS "
					+	"(SELECT STATUS FROM COL_STATUS s "
					+	"WHERE UPPER(S.STATUS)=UPPER(I_LOANACCOUNT.COL_STATUS)) "
					+	"AND PROCESSING IN ('N',NULL)");
			
			no = DB.executeUpdate(sql.toString(), get_TrxName());
			
			if (no<0){
				throw new Exception();
			}
			
			log.info("Mode Types errors=" + no);
		}
		
		//Reset processed flag
		sql=new StringBuffer("UPDATE I_LOANACCOUNT "
				+ 	"SET PROCESSING='N'");
		no = DB.executeUpdate(sql.toString(), get_TrxName());
		
		if (no<0){
			throw new Exception();
		}
		
		log.info("Processed Falg reset =" + no);
		
		
		//Processing for Security Type
		sql=new StringBuffer("UPDATE I_LOANACCOUNT "
				+ "SET COL_SECURITY=(SELECT COL_SECURITY_ID " 
				+					"FROM COL_SECURITY s "
				+					"WHERE UPPER(s.SECURITY)=UPPER(I_LOANACCOUNT.COL_SECURITY)), "
				+ "PROCESSING='Y'"
				+	"WHERE EXISTS "
				+		"(SELECT SECURITY FROM COL_SECURITY s "
				+		"WHERE UPPER(s.SECURITY)=UPPER(I_LOANACCOUNT.COL_SECURITY))");
		
		no = DB.executeUpdate(sql.toString(), get_TrxName());
		
		if (no<0){
			throw new Exception();
		}
		
		log.info("Updated of COL_SECURITY=" + no);
		
		if (totalrecords!=no){
			sql=new StringBuffer("UPDATE I_LOANACCOUNT "
					+ 	"SET I_ERRORMSG=DECODE(I_ERRORMSG,NULL,'') || ' Security type not configure in COL_SECURITY table;'  " 
					+	"WHERE NOT EXISTS "
					+	"(SELECT SECURITY FROM COL_SECURITY s "
					+	"WHERE UPPER(S.SECURITY)=UPPER(I_LOANACCOUNT.COL_SECURITY)) "
					+	"AND PROCESSING IN ('N',NULL)");
			
			no = DB.executeUpdate(sql.toString(), get_TrxName());
			
			if (no<0){
				throw new Exception();
			}
			
			log.info("Security Types errors=" + no);
		}
		
		//Reset processed flag
		sql=new StringBuffer("UPDATE I_LOANACCOUNT "
				+ 	"SET PROCESSING='N'");
		no = DB.executeUpdate(sql.toString(), get_TrxName());
		
		if (no<0){
			throw new Exception();
		}
		
		log.info("Processed Falg reset =" + no);
		
		
		int ROWID=0;
		ROWID = DB.getSQLValue(get_TrxName(), "SELECT CURRENTNEXT FROM AD_SEQUENCE WHERE NAME='COL_LOANACCOUNT'");
		ROWID--;
		//Insert Into LoanAccount Data
		sql=new StringBuffer("INSERT INTO COL_LOANACCOUNT "
							+ "(COL_LOANACCOUNT_ID,AD_CLIENT_ID,AD_ORG_ID,CREATEDBY,UPDATEDBY, "
							+	"APPLICATION_NO,EW_INSTITUTE_ID,LOAN_NO,TYPE_CD,REF_CODE, "
							+	"COL_PRODUCT_ID,EW_PERSON_ID,LOAN_TITLE,APPROVAL_DT,DISBURSED_DT, "
							+	"DISBURSED_AMT,INTEREST_RATE,LOAN_TENURE,COL_UNIT_ID, "
							+	"COL_FREQUENCY_ID,MATURITY_DT,CURRENT_DPD,PREVIOUS_DPD, "
							+	"ACMLT_PAID_AMT,ACMLT_DUE_AMT,IMSTALMENT_AMT, "
							+	"ACMLT_PAID_PRINCIPLE_AMT,ACMLT_PAID_MARKUP_AMT, "
							+	"ACMLT_DUE_PRINCIPLE_AMT,ACMLT_DUE_MARKUP_AMT,OS_PRINCIPLE_AMT, "
							+	"OS_MARKUP_AMT,LAST_PAYMENT_DT,NEXT_PAYMENT_DT,COL_BORROWERTYPE_ID, "
							+	"COL_CLASSIFICATION_ID,DILINQUENT_DT,COL_MODE_ID,COL_STATUS_ID,COL_SECURITY_ID) "
							+	""
							+	"SELECT " +ROWID+"+ROWNUM,ILA.AD_CLIENT_ID,ILA.AD_ORG_ID,ILA.CREATEDBY,ILA.UPDATEDBY, "
							+	"APPLICATION_NO,EW_INSTITUTE_ID,LOAN_NO,TYPE_CD,REF_CODE, "
							+	"COL_PRODUCT,EWP.EW_PERSON_ID,LOAN_TITLE,APPROVAL_DT,DISBURSED_DT, "
							+	"DISBURSED_AMT,INTEREST_RATE,LOAN_TENURE,COL_UNIT_ID, "
							+	"COL_FREQUENCY_ID,MATURITY_DT,CURRENT_DPD,PREVIOUS_DPD, "
							+	"ACMLT_PAID_AMT,ACMLT_DUE_AMT,IMSTALMENT_AMT, "
							+	"ACMLT_PAID_PRINCIPLE_AMT,ACMLT_PAID_MARKUP_AMT, "
							+	"ACMLT_DUE_PRINCIPLE_AMT,ACMLT_DUE_MARKUP_AMT,OS_PRINCIPLE_AMT, "
							+	"OS_MARKUP_AMT,LAST_PAYMENT_DT,NEXT_PAYMENT_DT,COL_BORROWERTYPE, "
							+	"COL_CLASSIFICATION,DILINQUENT_DT,COL_MODE,COL_STATUS,COL_SECURITY "
							+	"FROM I_LOANACCOUNT ILA,EW_PERSON EWP "
							+	"WHERE ILA.SSN=EWP.SOCIAL_SECURITY_NO "
							+	"AND ILA.I_ERRORMSG IS NULL  "
							+	"AND ILA.PROCESSING='N' "
							+	"AND NOT EXISTS  (SELECT APPLICATION_NO "
							+				"FROM  COL_LOANACCOUNT CLA "
							+				"WHERE CLA.APPLICATION_NO=ILA.APPLICATION_NO)");
		
		no = DB.executeUpdate(sql.toString(), get_TrxName());
		
		if (no<0){
			throw new Exception();
		}
		
		log.info("Insertion of COL_LOANACCOUNT=" + no);
		
		sql=new StringBuffer("UPDATE AD_SEQUENCE "
				+ "SET CURRENTNEXT="+(++ROWID+no)+" "
				+ "WHERE NAME='COL_LOANACCOUNT'");

		no = DB.executeUpdate(sql.toString(), get_TrxName());
		
		if (no<0){
			throw new Exception();
		}
		
		log.info("Update of COL_LOANACCOUNT Sequence Number=" + no);

		
		//UPDATE DATA OF LOANACCOUNT WHICH ARE ALREADY INSERTED
		sql=new StringBuffer("UPDATE COL_LOANACCOUNT CL "
							+	"SET (UPDATED, "
						  +		"INTEREST_RATE, "
						  +		"CURRENT_DPD, "
						  +		"PREVIOUS_DPD, "
						  +		"ACMLT_PAID_AMT, "
						  +		"ACMLT_DUE_AMT, "
						  +		"IMSTALMENT_AMT, "
						  +		"ACMLT_PAID_PRINCIPLE_AMT, "
						  +		"ACMLT_PAID_MARKUP_AMT, "
						  +		"ACMLT_DUE_PRINCIPLE_AMT, "
						  +		"ACMLT_DUE_MARKUP_AMT, "
						  +		"OS_PRINCIPLE_AMT, "
						  +		"OS_MARKUP_AMT, "
						  +		"LAST_PAYMENT_DT, "
						  +		"NEXT_PAYMENT_DT, "
						  +		"COL_CLASSIFICATION_ID, "
						  +		"DILINQUENT_DT) "
						  
						  +		"= "
						  +		"(SELECT SYSDATE, "
						  +		"INTEREST_RATE, "
						  +		"CURRENT_DPD, "
						  +		"PREVIOUS_DPD, "
						  +		"ACMLT_PAID_AMT, "
						  +		"ACMLT_DUE_AMT, "
						  +		"IMSTALMENT_AMT, "
						  +		"ACMLT_PAID_PRINCIPLE_AMT, "
						  +		"ACMLT_PAID_MARKUP_AMT, "
						  +		"ACMLT_DUE_PRINCIPLE_AMT, "
						  +		"ACMLT_DUE_MARKUP_AMT, "
						  +		"OS_PRINCIPLE_AMT, "
						  +		"OS_MARKUP_AMT, "
						  +		"LAST_PAYMENT_DT, "
						  +		"NEXT_PAYMENT_DT, "
						  +		"COL_CLASSIFICATION, "
						  +		"DILINQUENT_DT "
						  +		"FROM I_LOANACCOUNT IL "
						  +		"WHERE IL.APPLICATION_NO=CL.APPLICATION_NO) " 
						  +		"WHERE EXISTS (SELECT 'A' FROM I_LOANACCOUNT A WHERE A.APPLICATION_NO = CL.APPLICATION_NO)");

		no = DB.executeUpdate(sql.toString(), get_TrxName());
		
		if (no<0){
			throw new Exception();
		}
		
		log.info("Updated of C_LOANACCOUNT=" + no);
		
		
		
		ROWID = DB.getSQLValue(get_TrxName(), "SELECT CURRENTNEXT FROM AD_SEQUENCE WHERE NAME='COL_LOANACCOUNTLINKPERSON'");
		ROWID--;
		//Insert Into LoanAccountLinkPerson Data
		sql=new StringBuffer("INSERT INTO COL_LOANACCOUNTLINKPERSON "
						+	"(COL_LOANACCOUNTLINKPERSON_ID,AD_CLIENT_ID,AD_ORG_ID,CREATEDBY, " 
						+	"UPDATEDBY,COL_LOANACCOUNT_ID,SOCIAL_SECURITY_NO,RELATIONTYPE) "
						+	"SELECT "+ROWID + "+ROWNUM,IP.AD_CLIENT_ID,IP.AD_ORG_ID,IP.CREATEDBY, "
						+	"IP.UPDATEDBY,CLA.COL_LOANACCOUNT_ID,IP.SSN, "
						+	"  CASE "
						+	"      WHEN IP.TYPE='A' THEN 'BORROWER' "
						+	"      WHEN IP.TYPE='G' THEN 'GUARANTOR' "
						+	"      WHEN IP.TYPE='R1' THEN 'REFRENCE1' "
						+	"      WHEN IP.TYPE='R2' THEN 'REFRENCE2' "
						+	"  END AS RELATIONTYPE "
						+	""      
						+	"FROM COL_LOANACCOUNT CLA,I_PERSON IP "
						+	"WHERE CLA.APPLICATION_NO=IP.APPLICATION_NO "
						+	"AND IP.I_ERRORMSG IS NULL  "
						+	"AND NOT EXISTS (SELECT LP.COL_LOANACCOUNT_ID "
						+	"                FROM COL_LOANACCOUNTLINKPERSON LP "
						+	"                WHERE CLA.COL_LOANACCOUNT_ID=LP.COL_LOANACCOUNT_ID "
						+	"                AND LP.SOCIAL_SECURITY_NO=IP.SSN)");
		
		no = DB.executeUpdate(sql.toString(), get_TrxName());
		
		if (no<0){
			throw new Exception();
		}
		
		log.info("Insertion of COL_LOANACCOUNTLINKPERSON=" + no);
		
		sql=new StringBuffer("UPDATE AD_SEQUENCE "
				+ "SET CURRENTNEXT="+(++ROWID+no)+" "
				+ "WHERE NAME='COL_LOANACCOUNTLINKPERSON'");

		no = DB.executeUpdate(sql.toString(), get_TrxName());
		
		if (no<0){
			throw new Exception();
		}
		
		log.info("Insert of COL_LOANACCOUNTLINKPERSON Sequence Number=" + no);
		
		
		
		//Insert Data into Loan Account Transaction
	
		ROWID = DB.getSQLValue(get_TrxName(), "SELECT CURRENTNEXT FROM AD_SEQUENCE WHERE NAME='COL_LOANACCOUNTTRANS'");
		ROWID--;

		sql=new StringBuffer("INSERT INTO COL_LOANACCOUNTTRANS " +
							"(COL_LOANACCOUNTTRANS_ID,AD_CLIENT_ID,AD_ORG_ID,CREATEDBY,UPDATEDBY, " +
							"COL_LOANACCOUNT_ID,APPLICATION_NO, " +
							"PAID_AMT,PAID_DT,PAID_PRICIPLE,PAID_MARKUP,OS_AMT, " +
							"INSTALLMENT_DUE,INSTALLMENT_PAID,COL_CLASSIFICATION_ID, " +
							"CURRENT_DPD,PREVIOUS_DPD,FUNDING_BAL," +
							"ACTUAL_OD,ACTUAL_OD_VARIABLE,PERIOD) " +
							"SELECT "+ ROWID + "+ROWNUM,ILA.AD_CLIENT_ID,ILA.AD_ORG_ID,ILA.CREATEDBY,ILA.UPDATEDBY, " +
							"LA.COL_LOANACCOUNT_ID,ILA.APPLICATION_NO, " +
							"ILA.PAID_AMT,ILA.PAID_DT,ILA.PAID_PRICIPLE,ILA.PAID_MARKUP,ILA.OS_AMT, " +
							"ILA.INSTALLMENT_DUE,ILA.INSTALLMENT_PAID,ILA.COL_CLASSIFICATION, " +
							"ILA.CURRENT_DPD,ILA.PREVIOUS_DPD,ILA.FUNDING_BAL, " +
							"ILA.ACTUAL_OD,ILA.ACTUAL_OD,ILA.PERIOD " +
							"FROM I_LOANACCOUNT ILA,EW_PERSON EWP,COL_LOANACCOUNT LA " +
							"WHERE ILA.SSN=EWP.SOCIAL_SECURITY_NO " +
							"AND ILA.APPLICATION_NO=LA.APPLICATION_NO " +
							"AND ILA.I_ERRORMSG IS NULL  " +
							"AND ILA.PROCESSING='N'  " +
							"AND NOT EXISTS  (SELECT APPLICATION_NO " +
                    						"FROM  COL_LOANACCOUNTTRANS LAT " +
                    						"WHERE LAT.APPLICATION_NO=ILA.APPLICATION_NO " +
                    						"AND LAT.PERIOD=ILA.PERIOD)");
		
		no = DB.executeUpdate(sql.toString(), get_TrxName());
		
		if (no<0){
			throw new Exception();
		}
		
		log.info("Insertion of COL_LOANACCOUNTTRANS=" + no);
		
		sql=new StringBuffer("UPDATE AD_SEQUENCE "
				+ "SET CURRENTNEXT="+(++ROWID+no)+" "
				+ "WHERE NAME='COL_LOANACCOUNTTRANS'");

		no = DB.executeUpdate(sql.toString(), get_TrxName());
		
		if (no<0){
			throw new Exception();
		}
		
		log.info("Update of COL_LOANACCOUNTTRANS Sequence Number=" + no);
		
		
		
		
		//UPDATE DATA OF LOANACCOUNTTRANS WHICH ARE ALREADY INSERTED
		sql=new StringBuffer("UPDATE COL_LOANACCOUNTTRANS CLT " +
					"SET (UPDATED, " +
				  		"PAID_AMT, " +
				  		"PAID_DT, " +
				  		"PAID_PRICIPLE," + 
				  		"PAID_MARKUP, " +
				  		"OS_AMT, " +
				  		"INSTALLMENT_DUE," + 
				  		"INSTALLMENT_PAID, " +
				  		"COL_CLASSIFICATION_ID," + 
				  		"CURRENT_DPD," +
				  		"FUNDING_BAL," +
				  		"ACTUAL_OD_VARIABLE)"  +
				  		"	= " + 
				  		"(SELECT SYSDATE," + 
				  		"IL.PAID_AMT, " +
				  		"IL.PAID_DT, " +
				  		"IL.PAID_PRICIPLE," + 
				  		"IL.PAID_MARKUP, " +
				  		"IL.OS_AMT, " +
				  		"IL.INSTALLMENT_DUE," + 
				  		"IL.INSTALLMENT_PAID, " +
				  		"IL.COL_CLASSIFICATION, " +
				  		"IL.CURRENT_DPD, " +
				  		"IL.FUNDING_BAL, " +
				  		"IL.ACTUAL_OD " +
				  		"FROM I_LOANACCOUNT IL " + 
				  		"WHERE IL.APPLICATION_NO=CLT.APPLICATION_NO " +
		                	"AND IL.INSTALLMENT_DUE<>CLT.INSTALLMENT_DUE " +
		                	"AND IL.PERIOD=CLT.PERIOD) " +
                	"WHERE EXISTS (SELECT 'A' FROM I_LOANACCOUNT A " +
                				"WHERE A.APPLICATION_NO = CLT.APPLICATION_NO " +
                				"AND A.PERIOD=CLT.PERIOD " +
                				"AND CLT.INSTALLMENT_DUE>0 " +
                				"AND A.INSTALLMENT_DUE<>CLT.INSTALLMENT_DUE)");
		
		

		
		
		no = DB.executeUpdate(sql.toString(), get_TrxName());
		
		if (no<0){
			throw new Exception();
		}

		log.info("Updated of C_LOANACCOUNTTRANS=" + no);
		
		
		
		//Dequeue from the assigned list
		sql=new StringBuffer("UPDATE COL_LOANACCOUNTASSIGNED " +
							"SET ISACTIVE='N' " +
							"WHERE APPLICATION_NO IN (SELECT APPLICATION_NO " + 
							"						FROM COL_LOANACCOUNTTRANS " +
							"						WHERE ACTUAL_OD_VARIABLE=0 " +
							"						AND PERIOD='" + maxPeriod + "'" + ") " +
							"AND PERIOD='" + maxPeriod + "'");
		no = DB.executeUpdate(sql.toString(), get_TrxName());
		
		if (no<0){
			throw new Exception();
		}
		
		log.info("UPDATE of COL_LOANACCOUNTASSIGNED rows=" + no);
		
		//End of Dequeue
		
		//Queue again of the assigned list
		sql=new StringBuffer("UPDATE COL_LOANACCOUNTASSIGNED " +
							"SET ISACTIVE='Y' " +
							"WHERE APPLICATION_NO IN (SELECT APPLICATION_NO " + 
							"						FROM COL_LOANACCOUNTTRANS " +
							"						WHERE ACTUAL_OD_VARIABLE<>0 " +
							"						AND PERIOD='" + maxPeriod + "'" +") " +
							"AND PERIOD='" + maxPeriod + "'");
		no = DB.executeUpdate(sql.toString(), get_TrxName());
		
		if (no<0){
			throw new Exception();
		}
		
		log.info("UPDATE of COL_LOANACCOUNTASSIGNED rows=" + no);
		
		//End of Queue
		
		
		//compare currentPeriod is greater than maxPaeriod
		//if yes then update previous period DPD to Current Period
		int i=0;
		//maxPeriod="20150930";
		//currentPeriod="20151031";
		i=currentPeriod.compareTo(maxPeriod);
		if (i>0) {
			
			sql=new StringBuffer("UPDATE COL_LOANACCOUNTTRANS A " +
								"SET A.PREVIOUS_DPD=(SELECT B.CURRENT_DPD " + 
								"					FROM COL_LOANACCOUNTTRANS B " +
								"					WHERE B.APPLICATION_NO=A.APPLICATION_NO " +
								"					AND B.PERIOD='" + maxPeriod + "') " +
								"WHERE A.PERIOD='" + currentPeriod + "'");
			no = DB.executeUpdate(sql.toString(), get_TrxName());
			
			if (no<0){
				throw new Exception();
			}
			
			log.info("UPDATE of COL_LOANACCOUNTTRANS rows=" + no);
			
			//JOptionPane.showMessageDialog(null, "Current Period is > maxPeriod");
		}
		
		
		sql=new StringBuffer("DELETE FROM I_LOANACCOUNT");
		no = DB.executeUpdate(sql.toString(), get_TrxName());
		
		if (no<0){
			throw new Exception();
		}
		
		log.info("Deleted of I_LOANACCOUNT rows=" + no);
		
		commitEx();
		
		}
		
		catch (SQLException ex)	{
			rollback();
			log.warning("Error occured - " + ex.toString());
			return	ex.toString();
		}
		catch(Exception ex){
			rollback();
			log.warning("Error occured - " + ex.toString());
			return	ex.toString();
		}
				
		
		//FINALLY
		
		return "Successfully Loan Data imported";
		
		
	}
	
	
	private String getPeriod(String selectQuery){
		
		final String sql = selectQuery;//"SELECT MAX(PERIOD) FROM COL_LOANACCOUNTTRANS";
		String maxPeriod="";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		 try
		 {
		      pstmt = DB.prepareStatement(sql, get_TrxName());
		     
		      rs = pstmt.executeQuery();
		      while(rs.next())
		      {
		    	  maxPeriod=rs.getString(1);
		      }
		 }
		 // If your method is not throwing Exception or SQLException you need this block to catch SQLException
		 // and convert them to unchecked DBException
		 catch (SQLException e)
		 {
		      throw new DBException(e, sql);
		 }
		 // '''ALWAYS''' close your ResultSet in a finally statement
		 finally
		 {
		      DB.close(rs, pstmt);
		      rs = null; pstmt = null;
		 }
		return maxPeriod;
	}

}


