package java_pratice_notes_Strings;

import java.util.Scanner;

public class Palindrome_Prgm {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter your  String ");
		String word=sc.next();
	
	char[] cword=word.toCharArray();
		int i=0;
		int j=0;
		
		while(i<=j) {
			
			for(i=0;i<cword.length;i++) {
				for(j=cword.length-1;j<0;j--) {
					if(cword[i]==cword[j]) {
						System.out.println("given word is palindrome");
						//continue;
						
					}
					else {
						System.out.println("given word is not a palindrome");
					}
				}
				
			}
			
		}
		
		
		
		
		
		

		
		
	}

			
	}

