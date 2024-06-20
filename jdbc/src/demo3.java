import java.sql.Connection;
import  java.sql.DriverManager;
import java.sql.SQLException;

public class demo3 {
	public static void main(String[] args) {
		try {
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			System.out.println("Driver1 loaded sucessfully");
			
			Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/jstudent_db", "root","Root");
			System.out.println("connection established successfully");
			
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	}
	

}
