package java_pratice_notes_Strings;

import java.util.Scanner;

public class PowerofTwo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number to check a number is power of 2 or not");
		int num=sc.nextInt();
		while(num%2==0) {
			num=num/2;
		}
		if(num==1) {
			System.out.println("given number is a power of 2 ");
		}
		else {
			System.out.println("given number is not a power of 2 ");
		}
		
		sc.close();
	}

}
