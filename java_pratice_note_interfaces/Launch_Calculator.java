package java_pratice_note_interfaces;

import java.util.Scanner;

interface Calculator{
	void add();
	void sub();
	void mul();
	void div();
}
   class Call1 implements Calculator{
	 public void add() {
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println("call 1 addiiton: " +c);
	}
	
	 public void sub() {
			int a=10;
			int b=20;
			int c=a-b;
			System.out.println("call 1 subtraction: " +c);
		}
		
	 public void mul() {
			int a=10;
			int b=20;
			int c=a*b;
			System.out.println("call 1 multiplication: " +c);
		}
		
	 public void div() {
			int a=10;
			int b=20;
			int c=a+b;
			System.out.println("call 1 division: " +c);
		}
		
}
 class Call2 implements Calculator{
	 public void add() {
		 Scanner scan = new Scanner(System.in);
		 System.out.println(" enter  a value");
		 int a=scan.nextInt();
		 System.out.println(" enter b value");
		 int b=scan.nextInt();
		 int c=a+b;
		 System.out.println("call2 addition is: "+c);
		 
	 }
	 public void sub() {
		 Scanner scan = new Scanner(System.in);
		 System.out.println(" enter  a value");
		 int a=scan.nextInt();
		 System.out.println(" enter b value");
		 int b=scan.nextInt();
		 int c=a-b;
		 System.out.println("call2 subtraction is: "+c);
		 
	 }
	 public void mul() {
		 Scanner scan = new Scanner(System.in);
		 System.out.println(" enter  a value");
		 int a=scan.nextInt();
		 System.out.println(" enter b value");
		 int b=scan.nextInt();
		 int c=a*b;
		 System.out.println("call2 multiplication is: "+c);
		 
	 }
	 public void div() {
		 Scanner scan = new Scanner(System.in);
		 System.out.println(" enter  a value");
		 int a=scan.nextInt();
		 System.out.println(" enter b value");
		 int b=scan.nextInt();
		 int c=a/b;
		 System.out.println("call2 division  is: "+c);
		 
	 }
	
 }
class Call3 implements Calculator{
	 public void add() {
		 Scanner scan = new Scanner(System.in);
		 System.out.println(" enter  a value");
		 int a=scan.nextInt();
		 System.out.println(" enter b value");
		 int b=scan.nextInt();
		 if(a<0||b<0) {
			 System.out.println("addition is not possible");
		 }
		 else {
			 int c=a+b;
			 System.out.println("call3 addition is: "+c);
			 }
		 
	 }
	 public void sub() {
		 Scanner scan = new Scanner(System.in);
		 System.out.println(" enter  a value");
		 int a=scan.nextInt();
		 System.out.println(" enter b value");
		 int b=scan.nextInt();
		 if(a<b) {
			 System.out.println("subtraction is not possible");
		 }
		 else {
			 int c=a-b;
			 System.out.println("call3 subtraction is: "+c);
			 }
		 
	 }
	 public void mul() {
		 Scanner scan = new Scanner(System.in);
		 System.out.println(" enter  a value");
		 int a=scan.nextInt();
		 System.out.println(" enter b value");
		 int b=scan.nextInt();
		 if(a==0||b==0) {
			 System.out.println("multiplication is not possible");
		 }
		 else {
			 int c=a*b;
			 System.out.println("call3 multiplication is: "+c);
			 }
		 
	 }
	 
	 public void div() {
		 Scanner scan = new Scanner(System.in);
		 System.out.println(" enter  a value");
		 int a=scan.nextInt();
		 System.out.println(" enter b value");
		 int b=scan.nextInt();
		 if(b==0||a==0) {
			 System.out.println("division is not possible");
		 }
		 else {
			 int c=a*b;
			 System.out.println("call3 division is: "+c);
			 }
		 
	 }

	
}
class Compute{
	void calculations(Calculator ref) {
		ref.add();
		ref.sub();
		ref.mul();
		ref.div();
	}
}

public class Launch_Calculator {

	public static void main(String[] args) {
		Call1 c1= new Call1();
		Call2 c2= new Call2();
		Call3 c3= new Call3();
		Compute cc= new Compute();
		cc.calculations(c1);
		cc.calculations(c2);
		cc.calculations(c3);
		

	}

}
