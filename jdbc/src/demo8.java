import java.sql.Connection;
import  java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


public class demo8 {
	public static void main(String[] args) {
		try {
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			System.out.println("Driver1 loaded sucessfully");
			
			Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/jstudent_db", "root","Root");
			System.out.println("connection established successfully");
			String s="insert into student values(?,?,?,?,?)";
			PreparedStatement pstmt= con.prepareStatement(s);
			Scanner scan= new Scanner(System.in);
			System.out.println("enter the id");
			int id= scan.nextInt();
			pstmt.setInt(1, id);
			System.out.println("enter the name");
			String name=scan.next();
			System.out.println("enter Marks1");
			int marks1=scan.nextInt();
			System.out.println("enter marks2");
			int marks2=scan.nextInt();
			System.out.println("enter marks3");
			int marks3=scan.nextInt();
			pstmt.setInt(1, id);
			pstmt.setString(2, name);
			pstmt.setInt(3, marks1);
			pstmt.setInt(4,marks2);
			pstmt.setInt(5, marks3);
			int rows=pstmt.executeUpdate();
			System.out.println(rows);
			
			
			//ResultSet res= pstmt.executeQuery();
			
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	}
	

}
