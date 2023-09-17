package co.edureka.ems.configs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ResourceBundle;

public class ConnectionFactory {
	private static Connection con = null;
	
	public static Connection getDBConnection() throws Exception{
		if(con == null) {
			ResourceBundle bundle = ResourceBundle.getBundle("dbconfig");
			
			//String dc = bundle.getString("jdbc.driverclass");
			
			String url = bundle.getString("jdbc.url");
			String user = bundle.getString("jdbc.username");
			String pass = bundle.getString("jdbc.password");
			
			con = DriverManager.getConnection(url, user, pass);
		}
		return con;
	}
}
