import  java.sql.DriverManager;
import java.sql.SQLException;

public class demo2 {
	public static void main(String[] args) {
		try {
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			System.out.println("Driver1 loaded sucessfully");
			
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	}
	

}
