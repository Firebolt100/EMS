package demo_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Entry {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//TODO load and register JDBC driver
		
		String driver = "";
		Class.forName(driver); //loads and registers JDBC driver //required only for jdbc 3 or below
		
		
		//TODO get database connection using 'JDBC URL'
		String url="";
		Connection dbConnection ;
		
		dbConnection = DriverManager.getConnection(url);
		System.out.println("Connection successful ? "+ (dbConnection != null));
		
		
	}

}
