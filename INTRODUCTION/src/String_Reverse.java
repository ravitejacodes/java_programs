import java.util.Scanner;

public class String_Reverse {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a string");
		String str=sc.nextLine();
		
		char ch ;
		String nstr="";
		for(int i=str.length()-1;i>=0;i--) {
			ch=str.charAt(i);
			nstr=nstr+ch;
			
		}
		System.out.println(nstr);
	}

	
	
}
