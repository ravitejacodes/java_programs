import java.sql.Connection;
import  java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


public class demo9 {
	public static void main(String[] args) {
		try {
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			System.out.println("Driver1 loaded sucessfully");
			
			Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/jstudent_db", "root","Root");
			System.out.println("connection established successfully");
			String s="delete from student where id=?";
			PreparedStatement pstmt= con.prepareStatement(s);
			Scanner scan= new Scanner(System.in);
			System.out.println("enter the id of the student");
			int id= scan.nextInt();
			pstmt.setInt(1, id);
			
			int rows=pstmt.executeUpdate();
			System.out.println(rows);
			
			
			//ResultSet res= pstmt.executeQuery();
			
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	}
	

}
