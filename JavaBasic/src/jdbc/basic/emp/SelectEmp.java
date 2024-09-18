package jdbc.basic.emp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectEmp {

	public static void main(String[] args) {
		
		// 0. 필요한 변수
		String driver 	= "com.mysql.cj.jdbc.Driver";
		String url		= "jdbc:mysql://localhost:3306/basic";
		String user		= "scott";
		String pass		= "tiger";
	
		try {
			// 1. 드라이버 로딩
			Class.forName(driver);
			
			// 2. 연결객체 얻어오기 
			Connection con = DriverManager.getConnection(url, user, pass);
			
			// 3. sql 문장
			String sql = "SELECT ename, job, sal FROM emp";
			
			// 4. sql 전송객체 얻어오기
			Statement stmt = con.createStatement();
			
			// 5. 전송
			ResultSet rset = stmt.executeQuery(sql);
			while(rset.next()) {
				System.out.print(rset.getString("ENAME") + "/");
				System.out.print(rset.getString("JOB") + "/");
				System.out.println(rset.getInt("SAL"));
			}	
			
			
			// 6. 닫기
			rset.close();
			stmt.close();
			con.close();
		}catch(Exception ex) {
			System.out.println("실패:" + ex.getMessage());
		}

	}

}
