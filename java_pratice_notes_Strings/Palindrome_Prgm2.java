package java_pratice_notes_Strings;

import java.util.Scanner;

public class Palindrome_Prgm2 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter your  String ");
		String word=sc.next();
		String rev=rev_String(word);
		if(word.equals(rev)) {
			System.out.println("given word "+word+" is palindrome");
		}
		else {
			System.out.println("given word is not a palindrome");
		}
	
	  
		
		
		
		

		
		
	}

	public static String rev_String(String word) {
		 char[] cword=word.toCharArray();
		 String rev="";
		 for(int i=cword.length-1;i>=0;i--) {
			 rev+=cword[i];
		 }
		
		return rev;
	}

			
	}

