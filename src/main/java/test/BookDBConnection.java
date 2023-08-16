package test;
import java.sql.*;
public class BookDBConnection 
{
	private static Connection con=null;
	private BookDBConnection() {}
	
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			  con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","system","wahidur");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static Connection getCon() {
		return con;
	}
	
}
