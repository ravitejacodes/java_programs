import java.sql.Connection;
import  java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


public class pract_db {
	public static void main(String[] args) {
		try {
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			System.out.println("Driver1 loaded sucessfully");
			
			Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/jstudent_db", "root","Root");
			System.out.println("connection established successfully");
			Scanner scan= new Scanner(System.in);
			System.out.println("press 1:register 2:login");
			int input1 = scan.nextInt();
			if(input1==1) {
			String s="insert into user values(?,?,?,?,?)";
			PreparedStatement pstmt= con.prepareStatement(s);
			

			System.out.println("enter the name");
			String name=scan.next();
			System.out.println("enter username");
			String username=scan.next();
			System.out.println("enter password");
			String password=scan.next();
			System.out.println("enter confirmpassword");
			String confirmpassword=scan.next();
			System.out.println("enter email");
			String email=scan.next();
			if(password==confirmpassword) {
				continue;
			}
			else(){
				System.out.println("password not matched");
			}
			pstmt.setString(1, name);
			pstmt.setString(2, username);
			pstmt.setString(3, password);
			pstmt.setString(4,confirmpassword);
			pstmt.setString(5, email);
			int rows=pstmt.executeUpdate();
			System.out.println(rows);
			int rows=pstmt.executeUpdate();
			System.out.println(rows);
			
			
			//ResultSet res= pstmt.executeQuery();
			
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	}
	

}
