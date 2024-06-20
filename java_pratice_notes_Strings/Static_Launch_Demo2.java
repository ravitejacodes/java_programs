package java_pratice_notes_Strings;
class Demo1{
	int a=10;
	int b=20;
	int c=30;
	static int x=11;
	static int y=22;
	static int z=33;
	 void display() {
		 System.out.println("---non-static method---");
		 System.out.println(a);
		 System.out.println(b);
		 System.out.println(c);
		 System.out.println(x);
		 System.out.println(y);
		 System.out.println(z);
	 }
	 static void display1() {
		 System.out.println("---static method---");
		 System.out.println(x);
		 System.out.println(y);
		 System.out.println(z);
		 //System.out.println(a);
		// System.out.println(b);
		// System.out.println(c);
	 }
}

public class Static_Launch_Demo2 {
	public static void main(String[] args) {
		Demo1 d1= new Demo1();
		d1.display();
		Demo1.display1();
	}

}
