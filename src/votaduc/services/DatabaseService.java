package votaduc.services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseService{  
	
 public static Connection getConnection(){
 Connection conn = null;
 String loginUser = "postgres";
        String loginPasswd = "123";
        String loginUrl = "jdbc:postgresql://localhost/test";
        try{
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection(loginUrl, loginUser, loginPasswd);
        }
        catch (ClassNotFoundException ex){
            System.err.println("ClassNotFoundException: " + ex.getMessage());
        }
        catch (SQLException ex){
            System.err.println("SQLException: " + ex.getMessage());
        }    
     return conn;
 	}
 
 	public static void closeQuietly(Connection conn) {
		try {
	            conn.close();
		} 
		catch (Exception e) {
		}
	}
	 
	public static void rollbackQuietly(Connection conn) {
		try {
			conn.rollback();
		} catch (Exception e) {
		}
	}
}

