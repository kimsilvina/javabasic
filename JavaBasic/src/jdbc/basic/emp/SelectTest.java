package jdbc.basic.emp;

import java.sql.*;

class SelectTest
{
	public static void main(String[] args) 
	{
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection(
				"jdbc:oracle:thin:@127.0.0.1:1521:xe", "scott","tiger");
			
			//----------------------------------------------------------------------------------
			String sql = "SELECT * FROM emp";
			//----------------------------------------------------------------------------------
			
			PreparedStatement stmt = con.prepareStatement(sql);

			ResultSet rset = stmt.executeQuery();
			while( rset.next() ){
				System.out.print( rset.getString("EMPNO") + "\t");
				System.out.print( rset.getString("ENAME") + "\t");
				System.out.print( rset.getString("JOB") + "\t");
				System.out.print( rset.getString("SAL") + "\t");
				System.out.println( rset.getString("DEPTNO") + "\t");
			}
			
			rset.close();
			stmt.close();
			con.close();
		} catch(Exception ex){
			System.out.println("에러 : " + ex.getMessage() );
		}
	}
}
