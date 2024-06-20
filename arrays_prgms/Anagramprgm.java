package arrays_prgms;

import java.util.Scanner;

public class Anagramprgm {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the first string");
	String str1= sc.next();
	System.out.println(" enter the second string");
	String str2= sc.next();
	char s1[]=str1.toCharArray();
	char s2[]=str2.toCharArray();
	for(int i=0;i<s1.length;i++) {
		for(int j=0;j<s2.length;j++) {
			if(s1[i]==s2[j]) {
				s2[j]=0;
			}
		}
		
		
	}
	 int count=0;
	 for(int i=0;i<s2.length-1;i++) {
		 if(s2[i]==0) {
			 count++;
	
		 }
		 if(count==s2.length-1) {
			 System.out.println("Anagram");
		 }
		 else {
			 System.out.println(" not an Anagram");
			 break;
		 
	 }
	

	}

}
}
