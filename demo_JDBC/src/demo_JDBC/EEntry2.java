package demo_JDBC;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class EEntry2 {

	public static void main(String[] args) throws IOException, SQLException {
		
		//Todo load jdbc properties from file system
		
		Properties props = new Properties();
		FileInputStream fln = new FileInputStream("dbDetails.properties");
		
		props.load(fln);
		
		String driver = props.getProperty("jdbc.driver");
		
		String url = props.getProperty("jdbc.url");
		Connection dbConnection ;
		
		dbConnection = DriverManager.getConnection(url);
		System.out.println("Connection successful ? "+ (dbConnection != null));
		
		/*Statement insertStatement=null;
		
		try{
		insertStatement= dbConnection.createStatement();
		
		String insertQuery = props.getProperty("jdbc.query.insert");
		int rows; 
		rows=  insertStatement.executeUpdate(insertQuery);
		
		System.out.println(rows + "record is (are) added successfully");
		}finally{
			if(insertStatement !=null)
				insertStatement.close();
		}
		//instead of try finally, using try with arguments
		try(Statement selectStatement= dbConnection.createStatement()){
			String selectQuery = props.getProperty("jdbc.query.select");
			ResultSet result;
			result = selectStatement.executeQuery(selectQuery);
			
			while(result.next()){
				String message = result.getString(1);
				System.out.println(message);
			}
		}*/
		
		
		String insertQuery = props.getProperty("jdbc.query.insert");
		//prepared statement
		
		try(PreparedStatement insertStatement = dbConnection.prepareStatement(insertQuery)){
			String msg = "yeh hai JAVA";
			insertStatement.setString(1, msg);
			insertStatement.executeUpdate();
		}
		
		
		
	}
}
