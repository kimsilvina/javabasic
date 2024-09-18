package jdbc.basic.emp;

import java.sql.*;
class InsertUpdateDeleteTest
{
	public static void main(String[] args) 
	{
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection(
				"jdbc:oracle:thin:@127.0.0.1:1521:orcl", "scott","tiger");

			String sql = "";
			//######################################################
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.executeUpdate();
			stmt.close();
				
			System.out.println("실행하였습니다.");
		} catch(Exception ex){
			System.out.println("에러 : " + ex.getMessage() );
		}
	}
}
