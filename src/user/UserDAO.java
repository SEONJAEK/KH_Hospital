package user;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserDAO {
	private Connection conn = null;
	
	
	public UserDAO() {
		try {
			//DriverManager에 해당 DBMS Driver 등록
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE"
															,"kh_hospital","password");
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	public int registerCheck(String userID) {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String SQL = "SELECT *FROM USERS WHERE USER_ID = ?";
		try {
			pstmt = conn.prepareStatement(SQL);
			pstmt.setString(1, userID);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				return 0; //이미 존재하는 회원
			}else {
				return 1; //가입 가능한 회원 아이디
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs !=null)
					rs.close();
				if(pstmt != null)
					pstmt.close();
			}catch (Exception e){
				e.printStackTrace();
			}
		}
		return -1; //데이터베이스 오류
	}
	
	public int register(String userID, String userPassword, String userName, String userGender, String userAge, String phone, String address, String userEmail) {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String SQL = "INSERT INTO USERS(USER_ID, USER_PW, USER_NAME, SEX, AGE,PHONE, ADDRESS, EMAIL ) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
		try {
			pstmt = conn.prepareStatement(SQL);
			pstmt.setString(1, userID);
			pstmt.setString(2, userPassword);
			pstmt.setString(3, userName);
			pstmt.setString(4, String.valueOf(userGender));
			pstmt.setInt(5, Integer.parseInt(userAge));
			pstmt.setString(6, phone);
			pstmt.setString(7, address);
			pstmt.setString(8, userEmail);
			return pstmt.executeUpdate();
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs !=null)
					rs.close();
				if(pstmt != null)
					pstmt.close();
			}catch (Exception e){
				e.printStackTrace();
			}
		}
		return -1; //데이터베이스 오류
	}
	
	}


