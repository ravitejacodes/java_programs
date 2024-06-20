package java_pratice_notes_Strings;

import java.util.Scanner;

class Farmer{
	float p;
	float t;
	float r;
	float si;
	 void Accept_Input() {
		 Scanner sc= new Scanner(System.in);
		 System.out.println("enter your principle amount");
		 p=sc.nextInt();
		 System.out.println("enter time duration in years only.. ");
		 t=sc.nextInt();
	 }
	 void Compute() {
		 r=2.5f;
		 si=p*t*r/100;
		 
	 }
	 void dispaly() {
		 System.out.println("simple interest is:"+si);
	 }
	
}

public class Launch_Farmer {
	public static void main(String[] args) {
		Farmer f1= new Farmer();
		Farmer f2= new Farmer();
		f1.Accept_Input();
		f1.Compute();
		f1.dispaly();
		f2.Accept_Input();
		f2.Compute();
		f2.dispaly();
	
	}

}
