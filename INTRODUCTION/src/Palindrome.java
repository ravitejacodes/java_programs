import java.util.Scanner; 

public class Palindrome {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a string");
		String str1=sc.next();
	
		StringBuilder str2= new StringBuilder(str1);
		StringBuilder str3=str2.reverse();
		if(str2.equals(str3)) {
			System.out.println("given string "+str3+" is a palindrome ");
		}
		else {
			System.out.println("not a palindrome");
		}
	}

}
