package demo;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		
		
	
	System.out.println("press 1-Addition");
	System.out.println("press 2-Subtraction");
	System.out.println("press 3-Multiplication");
	System.out.println("press 4-Division");
	System.out.println("please! enter your choice");
	Scanner scan = new Scanner(System.in);
	int choice = scan.nextInt();
	switch(choice) {
	case 1:
		System.out.println("enter a,b values");
		int a1=scan.nextInt();
		int b1= scan.nextInt();
		System.out.println("the Addition of " +a1+ "+"+b1+ "=" + (a1+b1));
		break;
	 
	case 2:
		System.out.println("enter a,b values");
		int a2=scan.nextInt();
		int b2= scan.nextInt();
		System.out.println("the Subtraction  of " +a2+ "-"+b2+ "=" + (a2-b2));
	     break;
	case 3:
		System.out.println("enter a,b values");
		int a3=scan.nextInt();
		int b3= scan.nextInt();
		System.out.println("the Multiplication of " +a3+ "*" +b3+ "=" +(a3*b3));
	     break;
	case 4:
		System.out.println("enter a,b values");
		int a4=scan.nextInt();
		int b4= scan.nextInt();
		System.out.println("the Division of " +a4+ "/"+b4+ "=" + (a4/b4));
		break;
		
	
		default:
			System.out.println("invalid input!...please enter your choice(1-4)");
	     
	
	}
	}
}
