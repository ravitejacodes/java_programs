package java_pratice_notes_Strings;

import java.util.Scanner;

public class Anagram_prgm {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter your First String ");
		String s1=sc.next();
		System.out.println("enter your second string");
		String s2=sc.next();
		 char[] cs1=s1.toCharArray();
		 char[] cs2=s2.toCharArray();
		 if(cs1.length==cs2.length) {
			int count=0;
			 for(int i=0;i<cs1.length;i++) {
				 for(int j=0;j<cs2.length;j++) {
					 if(cs1[i]==cs2[j]) {
						 count++;
						 System.out.println(count);
					 }
				 }
			 }
			 if(cs1.length==count) {
				 String Result = String.valueOf(cs1);

				 System.out.println( Result+ " is a Anagram");
			 }
		 }
		 else {
			 System.out.println("not a anagram..length not matched try again..!");
		 }
		 
	}

}
