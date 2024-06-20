import  java.sql.DriverManager;

public class demo1 {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver loaded sucessfully");
			
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	

}
