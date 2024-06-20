package java_pratice_notes_inheritance;
class Example1{
	void  display(){
		System.out.println("parent non-static ");
		}
	static void display1() {
		System.out.println("parent -static");
	}
}
class Example2 extends Example1{
	void display() {
		System.out.println("child non-static");
		
			}
	static void display1() {
		System.out.println("child - static");
	}
}

public class Method_Overriding3 {
	public static void main(String[] args) {
		Example1 e1= new Example1();
		Example2 e2= new Example2();
		

		e2.display();
		Example2.display1();
		e1.display();
		Example1.display1();
		
	}
	
}
