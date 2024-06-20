package java_pratice_notes_inheritance;

import java.util.Scanner;

abstract class shape{
	double area;
	abstract void AcceptInput();
	abstract void compute();
	void dispaly() {
		System.out.println(area);
	}
	
}
 class Rectangle extends shape{
	 float length;
	 float width;
	 void AcceptInput() {
		 Scanner sc= new Scanner(System.in);
		 System.out.println("enter length of a rectangle");
		 length=sc.nextFloat();
		 System.out.println("enter width of a rectangle");
		 width=sc.nextFloat(); 
	 }
	 void compute() {
		 area=length*width;
	 }
 }
class Triangle extends shape{
	float base;
	float height;
	void AcceptInput() {
		 Scanner sc= new Scanner(System.in);
		 System.out.println("enter the base");
		 base=sc.nextFloat();
		 System.out.println("enter the height");
		 height=sc.nextFloat();
	}
	void compute() {
	 area=0.5*(base*height);
	}
}
class circle extends shape{
	float radius;
	void AcceptInput() {
		 Scanner sc= new Scanner(System.in);
		 System.out.println("enter the radius");
		 radius=sc.nextFloat();
	}
	void compute() {
		area=3.14*radius*radius;
	}
	
}
class geometry{
	void result(shape ref) {
		ref.AcceptInput();
		ref.compute();
		ref.dispaly();
	}
}
public class Abstract_LaunchShape {
	public static void main(String[] args) {
		Rectangle r= new Rectangle();
		Triangle t= new Triangle();
		circle c= new circle();
		geometry g= new geometry();
		g.result(r);
		g.result(t);
		g.result(c);
	}

}
