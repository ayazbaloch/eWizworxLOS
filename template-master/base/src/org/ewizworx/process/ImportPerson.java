package org.ewizworx.process;

import java.sql.SQLException;

import org.compiere.process.SvrProcess;
import org.compiere.util.DB;

public class ImportPerson extends SvrProcess {

	
	protected void prepare() {
		// TODO Auto-generated method stub

	}

	
	protected String doIt() throws Exception {
		StringBuffer sql=null;
		int no = 0;
		int totalrecords=0;
		
		totalrecords = DB.getSQLValue(get_TrxName(),
				"SELECT COUNT(*) FROM I_PERSON");
		
		//TRY
		try
		{
		//Update Greeting ID
		sql=new StringBuffer("UPDATE I_PERSON "
				+ "SET GREETING=(SELECT EW_GREETING_ID " 
				+					"FROM EW_GREETING g "
				+					"WHERE UPPER(g.GREETING)=UPPER(I_PERSON.GREETING)),"
				+ "PROCESSING='Y'"
				+	"WHERE EXISTS "
				+		"(SELECT GREETING FROM EW_GREETING g "
				+		"WHERE UPPER(g.GREETING)=UPPER(I_PERSON.GREETING))");
		
		no = DB.executeUpdate(sql.toString(), get_TrxName());
		log.info("Updated of GREETING=" + no);
		
		
		if (totalrecords!=no){
			sql=new StringBuffer("UPDATE I_PERSON "
					+ 	"SET I_ERRORMSG=DECODE(I_ERRORMSG,NULL,'') || ' Greetin not configure in EW_GREETING table;'  " 
					+	"WHERE NOT EXISTS "
					+	"(SELECT GREETING FROM EW_GREETING g "
					+	"WHERE UPPER(g.GREETING)=UPPER(I_PERSON.GREETING)) "
					+	"AND PROCESSING='N'");
			
			no = DB.executeUpdate(sql.toString(), get_TrxName());
			log.info("Greeting errors=" + no);
		}
		
		//Reset processed flag
		sql=new StringBuffer("UPDATE I_PERSON "
				+ 	"SET PROCESSING='N'");
		no = DB.executeUpdate(sql.toString(), get_TrxName());
		log.info("Processed Falg reset =" + no);
		
		//Check Gender Code either exists or not
		sql=new StringBuffer("UPDATE I_PERSON "
				+ 	"SET I_ERRORMSG=DECODE(I_ERRORMSG,NULL,'') || ' Invalid Gender code;'  " 
				+	"WHERE NOT EXISTS "
				+	"(SELECT GENDER FROM EW_GENDER g "
				+	"WHERE UPPER(g.GENDER)=UPPER(I_PERSON.GENDER)) "
				+	"AND PROCESSING='N'");
		
		no = DB.executeUpdate(sql.toString(), get_TrxName());
		log.info("Gender errors=" + no);
		
		
		//Update Current City ID
		sql=new StringBuffer("UPDATE I_PERSON "
				+ "SET C_CITY=(SELECT COL_CITY_ID " 
				+					"FROM COL_CITY c "
				+					"WHERE UPPER(c.NAME)=UPPER(I_PERSON.C_CITY)),"
				+ "PROCESSING='Y'"
				+	"WHERE EXISTS "
				+		"(SELECT NAME FROM COL_CITY c "
				+		"WHERE UPPER(c.NAME)=UPPER(I_PERSON.C_CITY))");
		
		no = DB.executeUpdate(sql.toString(), get_TrxName());
		log.info("Updated of C_CITY=" + no);
		
		
		if (totalrecords!=no){
			sql=new StringBuffer("UPDATE I_PERSON "
					+ 	"SET I_ERRORMSG=DECODE(I_ERRORMSG,NULL,'') || ' City not configure in COL_CITY table;'  " 
					+	"WHERE NOT EXISTS "
					+	"(SELECT NAME FROM COL_CITY c "
					+	"WHERE UPPER(c.NAME)=UPPER(I_PERSON.C_CITY)) "
					+	"AND PROCESSING='N'");
			
			no = DB.executeUpdate(sql.toString(), get_TrxName());
			log.info("Current City errors=" + no);
		}
		
		//Reset processed flag
		sql=new StringBuffer("UPDATE I_PERSON "
				+ 	"SET PROCESSING='N'");
		no = DB.executeUpdate(sql.toString(), get_TrxName());
		log.info("Processed Falg reset =" + no);
		
		
		
		//Update Current State/Province ID
		sql=new StringBuffer("UPDATE I_PERSON "
				+ "SET C_PROVINCE=(SELECT COL_STATE_ID " 
				+					"FROM COL_STATE s "
				+					"WHERE UPPER(s.NAME)=UPPER(I_PERSON.C_PROVINCE)),"
				+ "PROCESSING='Y'"
				+	"WHERE EXISTS "
				+		"(SELECT NAME FROM COL_STATE s "
				+		"WHERE UPPER(s.NAME)=UPPER(I_PERSON.C_PROVINCE))");
		
		no = DB.executeUpdate(sql.toString(), get_TrxName());
		log.info("Updated of C_PROVINCE=" + no);
		
		
		if (totalrecords!=no){
			sql=new StringBuffer("UPDATE I_PERSON "
					+ 	"SET I_ERRORMSG=DECODE(I_ERRORMSG,NULL,'') || ' Province not configure in COL_STATE table;'  " 
					+	"WHERE NOT EXISTS "
					+	"(SELECT NAME FROM COL_STATE s "
					+	"WHERE UPPER(s.NAME)=UPPER(I_PERSON.C_PROVINCE)) "
					+	"AND PROCESSING='N'");
			
			no = DB.executeUpdate(sql.toString(), get_TrxName());
			log.info("Current Province errors=" + no);
		}
		
		//Reset processed flag
		sql=new StringBuffer("UPDATE I_PERSON "
				+ 	"SET PROCESSING='N'");
		no = DB.executeUpdate(sql.toString(), get_TrxName());
		log.info("Processed Falg reset =" + no);
		
		//Update Current Country ID
		sql=new StringBuffer("UPDATE I_PERSON "
				+ "SET C_COUNTRY=(SELECT COL_COUNTRY_ID " 
				+					"FROM COL_COUNTRY c "
				+					"WHERE UPPER(c.NAME)=UPPER(I_PERSON.C_COUNTRY)),"
				+ "PROCESSING='Y'"
				+	"WHERE EXISTS "
				+		"(SELECT NAME FROM COL_COUNTRY c "
				+		"WHERE UPPER(c.NAME)=UPPER(I_PERSON.C_COUNTRY))");
		
		no = DB.executeUpdate(sql.toString(), get_TrxName());
		log.info("Updated of C_COUNTRY=" + no);
		
		
		if (totalrecords!=no){
			sql=new StringBuffer("UPDATE I_PERSON "
					+ 	"SET I_ERRORMSG=DECODE(I_ERRORMSG,NULL,'') || ' Country not configure in COL_COUNTRY table;'  " 
					+	"WHERE NOT EXISTS "
					+	"(SELECT NAME FROM COL_COUNTRY c "
					+	"WHERE UPPER(c.NAME)=UPPER(I_PERSON.C_COUNTRY)) "
					+	"AND PROCESSING='N'");
			
			no = DB.executeUpdate(sql.toString(), get_TrxName());
			log.info("Current Country errors=" + no);
		}
		
		//Reset processed flag
		sql=new StringBuffer("UPDATE I_PERSON "
				+ 	"SET PROCESSING='N'");
		no = DB.executeUpdate(sql.toString(), get_TrxName());
		log.info("Processed Falg reset =" + no);
		
		
		
		
		//Update Permanent City ID
		sql=new StringBuffer("UPDATE I_PERSON "
				+ "SET P_CITY=(SELECT COL_CITY_ID " 
				+					"FROM COL_CITY c "
				+					"WHERE UPPER(c.NAME)=UPPER(I_PERSON.P_CITY)),"
				+ "PROCESSING='Y'"
				+	"WHERE EXISTS "
				+		"(SELECT NAME FROM COL_CITY c "
				+		"WHERE UPPER(c.NAME)=UPPER(I_PERSON.P_CITY))");
		
		no = DB.executeUpdate(sql.toString(), get_TrxName());
		log.info("Updated of P_CITY=" + no);
		
		
		if (totalrecords!=no){
			sql=new StringBuffer("UPDATE I_PERSON "
					+ 	"SET I_ERRORMSG=DECODE(I_ERRORMSG,NULL,'') || ' City not configure in COL_CITY table;'  " 
					+	"WHERE NOT EXISTS "
					+	"(SELECT NAME FROM COL_CITY c "
					+	"WHERE UPPER(c.NAME)=UPPER(I_PERSON.P_CITY)) "
					+	"AND PROCESSING='N'");
			
			no = DB.executeUpdate(sql.toString(), get_TrxName());
			log.info("Permanent City errors=" + no);
		}
		
		//Reset processed flag
		sql=new StringBuffer("UPDATE I_PERSON "
				+ 	"SET PROCESSING='N'");
		no = DB.executeUpdate(sql.toString(), get_TrxName());
		log.info("Processed Falg reset =" + no);
		
		
		
		
		//Update Permanent State/Province ID
		sql=new StringBuffer("UPDATE I_PERSON "
				+ "SET P_PROVINCE=(SELECT COL_STATE_ID " 
				+					"FROM COL_STATE s "
				+					"WHERE UPPER(s.NAME)=UPPER(I_PERSON.P_PROVINCE)),"
				+ "PROCESSING='Y'"
				+	"WHERE EXISTS "
				+		"(SELECT NAME FROM COL_STATE s "
				+		"WHERE UPPER(s.NAME)=UPPER(I_PERSON.P_PROVINCE))");
		
		no = DB.executeUpdate(sql.toString(), get_TrxName());
		log.info("Updated of P_PROVINCE=" + no);
		
		
		if (totalrecords!=no){
			sql=new StringBuffer("UPDATE I_PERSON "
					+ 	"SET I_ERRORMSG=DECODE(I_ERRORMSG,NULL,'') || ' Province not configure in COL_STATE table;'  " 
					+	"WHERE NOT EXISTS "
					+	"(SELECT NAME FROM COL_STATE s "
					+	"WHERE UPPER(s.NAME)=UPPER(I_PERSON.P_PROVINCE)) "
					+	"AND PROCESSING='N'");
			
			no = DB.executeUpdate(sql.toString(), get_TrxName());
			log.info("Permanent Province errors=" + no);
		}
		
		//Reset processed flag
		sql=new StringBuffer("UPDATE I_PERSON "
				+ 	"SET PROCESSING='N'");
		no = DB.executeUpdate(sql.toString(), get_TrxName());
		log.info("Processed Falg reset =" + no);
		
		//Update Permanent Country ID
		sql=new StringBuffer("UPDATE I_PERSON "
				+ "SET P_COUNTRY=(SELECT COL_COUNTRY_ID " 
				+					"FROM COL_COUNTRY c "
				+					"WHERE UPPER(c.NAME)=UPPER(I_PERSON.P_COUNTRY)),"
				+ "PROCESSING='Y'"
				+	"WHERE EXISTS "
				+		"(SELECT NAME FROM COL_COUNTRY c "
				+		"WHERE UPPER(c.NAME)=UPPER(I_PERSON.P_COUNTRY))");
		
		no = DB.executeUpdate(sql.toString(), get_TrxName());
		log.info("Updated of P_COUNTRY=" + no);
		
		
		if (totalrecords!=no){
			sql=new StringBuffer("UPDATE I_PERSON "
					+ 	"SET I_ERRORMSG=DECODE(I_ERRORMSG,NULL,'') || ' Country not configure in COL_COUNTRY table;'  " 
					+	"WHERE NOT EXISTS "
					+	"(SELECT NAME FROM COL_COUNTRY c "
					+	"WHERE UPPER(c.NAME)=UPPER(I_PERSON.P_COUNTRY)) "
					+	"AND PROCESSING='N'");
			
			no = DB.executeUpdate(sql.toString(), get_TrxName());
			log.info("Permanent Country errors=" + no);
		}
		
		//Reset processed flag
		sql=new StringBuffer("UPDATE I_PERSON "
				+ 	"SET PROCESSING='N'");
		no = DB.executeUpdate(sql.toString(), get_TrxName());
		log.info("Processed Falg reset =" + no);
		
		int EW_PERSON_ID=0;
		EW_PERSON_ID = DB.getSQLValue(get_TrxName(), "SELECT CURRENTNEXT FROM AD_SEQUENCE WHERE NAME='EW_PERSON'");
		EW_PERSON_ID--;
		//Insert Person Records into EW_PERSON Table which are not exists
		sql=new StringBuffer("INSERT INTO EW_PERSON "
							+ "(EW_PERSON_ID,AD_CLIENT_ID,AD_ORG_ID,CREATEDBY,UPDATEDBY,"
							+ "SOCIAL_SECURITY_NO,EW_GREETING_ID,FIRST_NM,MIDDLE_NM,LAST_NM,GENDER,DOB) "
							+ "SELECT "+ EW_PERSON_ID +"+ROWNUM,AD_CLIENT_ID,AD_ORG_ID,CREATEDBY,UPDATEDBY," 
							+ "SSN,GREETING,FIRST_NM,MIDDLE_NM,LAST_NM,GENDER,DOB "
							+ "FROM I_PERSON IP "
							+ "WHERE IP.I_ERRORMSG IS NULL "
							+ "AND IP.PROCESSING='N' "
							+ "AND NOT EXISTS (SELECT SOCIAL_SECURITY_NO "
							+ 					"FROM EW_PERSON  P "
							+					"WHERE P.SOCIAL_SECURITY_NO=IP.SSN) " 
							+ "AND I_PERSON_ID IN (SELECT MIN(I_PERSON_ID) " //this condition ensures that first row is selected if SSN is duplicate 
                            +						"FROM I_PERSON "
                            +						"GROUP BY SSN)");
		
		no = DB.executeUpdate(sql.toString(), get_TrxName());
		if (no<0){
			throw new Exception();
		}
		log.info("Inserted of EW_PERSON=" + no);
		
		//Update EW_PERSON Sequence ID
		//sql=new StringBuffer("UPDATE AD_SEQUENCE "
		//		+ "SET CURRENTNEXT=(SELECT MAX(EW_PERSON_ID)+1 FROM EW_PERSON)"
		//		+ "WHERE NAME='EW_PERSON'");
		
		sql=new StringBuffer("UPDATE AD_SEQUENCE "
						+ "SET CURRENTNEXT="+((++EW_PERSON_ID)+no)+" "
						+ "WHERE NAME='EW_PERSON'");

		no = DB.executeUpdate(sql.toString(), get_TrxName());
		if (no<0){
			throw new Exception();
		}
		log.info("Update of EW_PERSON Sequence Number=" + no);
		
		
		int EW_PERSON_ADDRESS_ID=0;
		EW_PERSON_ADDRESS_ID = DB.getSQLValue(get_TrxName(), "SELECT CURRENTNEXT FROM AD_SEQUENCE WHERE NAME='EW_PERSON_ADDRESS'");
		EW_PERSON_ADDRESS_ID--;
		//Insert Addresses Records into EW_PERSON_ADDRESS Table which are not exists
		sql=new StringBuffer("INSERT INTO EW_PERSON_ADDRESS "
							+ "(EW_PERSON_ADDRESS_ID,AD_CLIENT_ID,AD_ORG_ID,CREATEDBY,UPDATEDBY," 
							+ "EW_PERSON_ID,ADDRESS1,ADDRESS2,ADDRESS3,"
							+ "COL_COUNTRY_ID,COL_STATE_ID,COL_CITY_ID,POST_CD,EW_ADDRESSTYPE_ID) "
							+ ""
							+ "SELECT "+EW_PERSON_ADDRESS_ID+ "+ROWNUM,"
							+ "A.AD_CLIENT_ID,A.AD_ORG_ID,A.CREATEDBY,A.UPDATEDBY," 
							+ "A.EW_PERSON_ID, A.ADRESS1,A.ADRESS2,A.ADRESS3,"
							+ "A.C_COUNTRY,A.C_PROVINCE,A.C_CITY,A.C_POST_CD,A.ADDRESSTYPE "
							+ "FROM " 
							+ "(SELECT IP.AD_CLIENT_ID,IP.AD_ORG_ID,IP.CREATEDBY,IP.UPDATEDBY," 
							+ "EP.EW_PERSON_ID, NVL(SUBSTR(IP.C_ADDRESS,0, 80),'UNKNOWN ADDRESS') ADRESS1,SUBSTR(IP.C_ADDRESS,81, 160) ADRESS2,SUBSTR(IP.C_ADDRESS,161, 240) ADRESS3,"
							+ "IP.C_COUNTRY,IP.C_PROVINCE,IP.C_CITY,IP.C_POST_CD,1000000 ADDRESSTYPE "
							+ "FROM I_PERSON IP, EW_PERSON EP "
							+ "WHERE IP.PROCESSING='N' "
							+ "AND IP.SSN=EP.SOCIAL_SECURITY_NO "
							+ "AND IP.I_ERRORMSG IS NULL "
							+ "AND NOT EXISTS (SELECT EW_PERSON_ID "
							+ 					"FROM EW_PERSON_ADDRESS A, EW_ADDRESSTYPE T "
							+					"WHERE A.EW_PERSON_ID=EP.EW_PERSON_ID "
							+					"AND A.EW_ADDRESSTYPE_ID=T.EW_ADDRESSTYPE_ID "
							+					"AND UPPER(T.ADDRESSTYPE)='CURRENT') " 
							+ "UNION "
							+ "SELECT IP.AD_CLIENT_ID,IP.AD_ORG_ID,IP.CREATEDBY,IP.UPDATEDBY," 
							+ "EP.EW_PERSON_ID, NVL(SUBSTR(IP.P_ADDRESS,0, 80),'UNKNOWN ADDRESS') ADRESS1,SUBSTR(IP.P_ADDRESS,81, 160) ADRESS2,SUBSTR(IP.P_ADDRESS,161, 240) ADRESS3,"
							+ "IP.P_COUNTRY,IP.P_PROVINCE,IP.P_CITY,IP.P_POST_CD,1000001 ADDRESSTYPE "
							+ "FROM I_PERSON IP, EW_PERSON EP "
							+ "WHERE IP.PROCESSING='N' "
							+ "AND IP.SSN=EP.SOCIAL_SECURITY_NO "
							+ "AND IP.I_ERRORMSG IS NULL "
							+ "AND NOT EXISTS (SELECT EW_PERSON_ID "
							+ 					"FROM EW_PERSON_ADDRESS A, EW_ADDRESSTYPE T "
							+					"WHERE A.EW_PERSON_ID=EP.EW_PERSON_ID "
							+					"AND A.EW_ADDRESSTYPE_ID=T.EW_ADDRESSTYPE_ID "
							+					"AND UPPER(T.ADDRESSTYPE)='PERMANENT') "
							+ ") A");
		
		no = DB.executeUpdate(sql.toString(), get_TrxName());
		if (no<0){
			throw new Exception();
		}
		log.info("Inserted of EW_PERSON_ADDRESS=" + no);
		
		//Update EW_PERSON_ADDRESS Sequence ID
		//sql=new StringBuffer("UPDATE AD_SEQUENCE "
		//		+ "SET CURRENTNEXT=(SELECT MAX(EW_PERSON_ADDRESS_ID)+1 FROM EW_PERSON_ADDRESS)"
		//		+ "WHERE NAME='EW_PERSON_ADDRESS'");
		
		sql=new StringBuffer("UPDATE AD_SEQUENCE "
						+ "SET CURRENTNEXT="+((++EW_PERSON_ADDRESS_ID)+no) + " "
						+ "WHERE NAME='EW_PERSON_ADDRESS'");
		
		
		no = DB.executeUpdate(sql.toString(), get_TrxName());
		if (no<0){
			throw new Exception();
		}
		log.info("Update of EW_PERSON_ADDRESS Sequence Number=" + no);
		
		
		int EW_PERSON_CONTACT_ID=0;
		EW_PERSON_CONTACT_ID = DB.getSQLValue(get_TrxName(), "SELECT CURRENTNEXT FROM AD_SEQUENCE WHERE NAME='EW_PERSON_CONTACT'");
		EW_PERSON_CONTACT_ID--;
		//Insert Person Records into EW_PERSON Table which are not exists
		sql=new StringBuffer("INSERT INTO EW_PERSON_CONTACT (EW_PERSON_CONTACT_ID,AD_CLIENT_ID,AD_ORG_ID,CREATEDBY,UPDATEDBY,EW_PERSON_ID,CONTACT,Type) "
				+	"SELECT "+ EW_PERSON_CONTACT_ID + "+ROWNUM CONTACTID,C.AD_CLIENT_ID,C.AD_ORG_ID,C.CREATEDBY,C.UPDATEDBY,C.EW_PERSON_ID,C.CONTACT,C.Type "
				+	"FROM "
				+	"( "
				+	"SELECT IP.AD_CLIENT_ID,IP.AD_ORG_ID,IP.CREATEDBY, IP.UPDATEDBY,EP.EW_PERSON_ID, IP.HOME_NO1 CONTACT, 'Home' Type "
				+	"FROM I_PERSON IP, EW_PERSON EP "
				+	"WHERE IP.PROCESSING='N' "
				+	"AND IP.SSN=EP.SOCIAL_SECURITY_NO AND IP.HOME_NO1 IS NOT NULL "  
				+	"UNION "
				+	"SELECT IP.AD_CLIENT_ID,IP.AD_ORG_ID,IP.CREATEDBY, IP.UPDATEDBY,EP.EW_PERSON_ID, IP.MOBILE_NO1 CONTACT, 'Mobile' Type "
				+	"FROM I_PERSON IP, EW_PERSON EP "
				+	"WHERE IP.PROCESSING='N' "
				+	"AND IP.SSN=EP.SOCIAL_SECURITY_NO AND IP.MOBILE_NO1 IS NOT NULL "
				+	"UNION "
				+	"SELECT IP.AD_CLIENT_ID,IP.AD_ORG_ID,IP.CREATEDBY, IP.UPDATEDBY,EP.EW_PERSON_ID, IP.OFFICE_NO1 CONTACT, 'Work' Type "
				+	"FROM I_PERSON IP, EW_PERSON EP "
				+	"WHERE IP.PROCESSING='N' "
				+	"AND IP.SSN=EP.SOCIAL_SECURITY_NO AND IP.OFFICE_NO1 IS NOT NULL "
				+	"UNION "
				+	"SELECT IP.AD_CLIENT_ID,IP.AD_ORG_ID,IP.CREATEDBY, IP.UPDATEDBY,EP.EW_PERSON_ID, IP.FAX_NO1 CONTACT, 'Fax' Type "
				+	"FROM I_PERSON IP, EW_PERSON EP "
				+	"WHERE IP.PROCESSING='N' "
				+	"AND IP.SSN=EP.SOCIAL_SECURITY_NO AND IP.FAX_NO1 IS NOT NULL "
				+	"UNION "
				+	"SELECT IP.AD_CLIENT_ID,IP.AD_ORG_ID,IP.CREATEDBY, IP.UPDATEDBY,EP.EW_PERSON_ID, IP.EMAIL1 CONTACT, 'eMail' Type "
				+	"FROM I_PERSON IP, EW_PERSON EP "
				+	"WHERE IP.PROCESSING='N' "
				+	"AND IP.SSN=EP.SOCIAL_SECURITY_NO AND IP.EMAIL1 IS NOT NULL "
				+	") C "
				+	"WHERE NOT EXISTS(SELECT EW_PERSON_ID "
                +	"			  FROM EW_PERSON_CONTACT EC "
                +	"			  WHERE EC.EW_PERSON_ID=C.EW_PERSON_ID "
                +	"			  AND EC.CONTACT=C.CONTACT)");
		
		no = DB.executeUpdate(sql.toString(), get_TrxName());
		if (no<0){
			throw new Exception();
		}
		log.info("Inserted of EW_PERSON=" + no);
		
		sql=new StringBuffer("UPDATE AD_SEQUENCE "
						+ "SET CURRENTNEXT="+((++EW_PERSON_CONTACT_ID)+no)+" "
						+ "WHERE NAME='EW_PERSON_CONTACT'");

		no = DB.executeUpdate(sql.toString(), get_TrxName());
		if (no<0){
			throw new Exception();
		}
		log.info("Update of EW_PERSON Sequence Number=" + no);
		
		
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
		
		return "Successfully Person imported";
	}

}
