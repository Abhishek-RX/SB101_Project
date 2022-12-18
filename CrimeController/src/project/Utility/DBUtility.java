package project.Utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class DBUtility{
	
	private static String drivername;
	private static String url;
	private static String username;
	private static String password;
	
	
	static {
		ResourceBundle rb = ResourceBundle.getBundle("dbDetails");
		drivername =rb.getString("db.drivername"); 
		url = rb.getString("db.url");
		username=rb.getString("db.username");
		password = rb.getString("db.password");
	}
	

public static  Connection provideConnection() {

	Connection conn = null;
	
	try {
		Class.forName(drivername);
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	}
	
	try {
		conn = DriverManager.getConnection(url,username,password);
	} catch (SQLException e) {
		e.printStackTrace();
	}
	
	
	return conn ;
}	
}

