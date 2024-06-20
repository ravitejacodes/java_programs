import java.util.Scanner;

public class Str_Rev_Builder {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println(" enter a String");
		String str1=sc.next();
		StringBuilder str=new StringBuilder(str1);
		str.reverse();
		System.out.println(str);
		
	}

}
