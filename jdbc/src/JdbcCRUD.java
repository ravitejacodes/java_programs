import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class JdbcCRUD {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("1. REGISTER");
		System.out.println("2. LOGIN");
		System.out.println("Enter your choice");
		int choice = scan.nextInt();
		switch(choice) {
		case 1:register();
		break;

		case 2:login();
		break;
		}
	}

	static void register() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter name");
		String name = scan.nextLine();
		System.out.println("Enter user name");
		String username = scan.nextLine();
		try {
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_db", "root", "root");
			while(true) {
				String s1 = "select * from user where username=?";
				PreparedStatement pstmt1 = con.prepareStatement(s1);
				pstmt1.setString(1, username);
				ResultSet res = pstmt1.executeQuery();
				if(res.next()) {
					System.out.println("Username already exists. Re-enter username");
					username = scan.nextLine();
				}
				else {
					break;
				}
			}
			System.out.println("Enter the password");
			String password = scan.nextLine();
			System.out.println("Enter the Confirm password");
			String confirmPassword = scan.nextLine();
			//if password is not matching with confirm password
			while(!password.equals(confirmPassword)) {
				System.out.println("Password and confirm password are not matching");
				System.out.println("Enter the password");
				password = scan.nextLine();
				System.out.println("Enter the Confirm password");
				confirmPassword = scan.nextLine();
			}
			System.out.println("Enter the email");
			String email = scan.nextLine();
			String s = "insert into user values(?, ?, ?, ?)";
			PreparedStatement pstmt = con.prepareStatement(s);
			pstmt.setString(1, name);
			pstmt.setString(2, username);
			pstmt.setString(3, password);
			pstmt.setString(4, email);
			int rows = pstmt.executeUpdate();
			if(rows == 0) {
				System.out.println("Registration failure");
			}
			else {
				System.out.println("Registration success");
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

	static void login() {

		
		try {
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter user name");
			String username = scan.nextLine();
			System.out.println("Enter the password");
			String password = scan.nextLine();
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jstudent_db", "root", "Root");
			String s = "select * from user where username=?";
			PreparedStatement pstmt = con.prepareStatement(s);
			pstmt.setString(1, username);
			ResultSet res = pstmt.executeQuery();
			if(res.next()) {
				if(password.equals(res.getString(3))) {
					Scanner sc= new Scanner(System.in);
					System.out.println("login success");
					System.out.println("1. change password");
					System.out.println("2. Delete Account");
					System.out.println("enter your choice");
					int choice=sc.nextInt();
					switch(choice) {
					case 1:
						System.out.println("enter your updated password");
						 String updpassword=sc.next();
								String s1="update user set password=? where username=?";
										PreparedStatement pstmt1= con.prepareStatement(s1);
										pstmt1.setString(1,updpassword);
										pstmt1.setString(2,username);
										int rows1=pstmt1.executeUpdate();
										if(rows1==0) {
											System.out.println("password update failed");
									}
										else {
											System.out.println("password updated successfully");
								
							}
							
										 break;
										 
						
					case 2:
						String s2="delete from user  where username=?";
						PreparedStatement pstmt2= con.prepareStatement(s2);
						pstmt2.setString(1, username);
						int rows2=pstmt2.executeUpdate();
						if(rows2==0) {
							System.out.println("Account deletion failed");
						}
						else {
							System.out.println("Account deleted successfully");
						}
						break;
						
						
					
					}
					}
				else {
					System.out.println("invalid password");
				}
			}
			else {
				System.out.println("login failure");
			}

		
	}
		catch(Exception e) {
			
		}
	}
}