import java.sql.Connection;
import  java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


public class demo6 {
	public static void main(String[] args) {
		try {
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			System.out.println("Driver1 loaded sucessfully");
			
			Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/jstudent_db", "root","Root");
			System.out.println("connection established successfully");
			String s="select * from Student where id=?";
			PreparedStatement pstmt= con.prepareStatement(s);
			Scanner scan= new Scanner(System.in);
			System.out.println("enter the id");
			int temp= scan.nextInt();
			pstmt.setInt(1, temp);
			ResultSet res= pstmt.executeQuery();
			while(res.next()) {
				int id=res.getInt(1);
				String name= res.getString(2);
				int marks1=res.getInt(3);
				int marks2=res.getInt(4);
				int marks3=res.getInt(5);
				System.out.println(id+" "+name+"   "+marks1+" "+marks2+" "+marks3);
				
				
			}
			
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	}
	

}
