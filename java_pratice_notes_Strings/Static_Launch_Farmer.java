package java_pratice_notes_Strings;

import java.util.Scanner;

class Farmer1{
	float p;
	float t;
	float r;
	static float si=2.5f;
	 void Accept_Input() {
		 Scanner sc= new Scanner(System.in);
		 System.out.println("enter your principle amount");
		 p=sc.nextInt();
		 System.out.println("enter time duration in years only.. ");
		 t=sc.nextInt();
	 }
	 void Compute() {
		 
		 si=p*t*r/100;
		 
	 }
	 void dispaly() {
		 System.out.println("simple interest is:"+si);
	 }
	
}

public class Static_Launch_Farmer {
	public static void main(String[] args) {
		Farmer1 f1= new Farmer1();
		Farmer1 f2= new Farmer1();
		f1.Accept_Input();
		f1.Compute();
		f1.dispaly();
		f2.Accept_Input();
		f2.Compute();
		f2.dispaly();
	
	}

}
