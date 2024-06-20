package java_pratice_notes_Strings;
class Demo{
	int a=10;
	int b=20;
	int c=30;
	static int x=11;
	static int y=22;
	static int z=33;
	 void display() {
		 System.out.println(a);
		 System.out.println(b);
		 System.out.println(c);
	 }
	 static void display1() {
		 System.out.println(x);
		 System.out.println(y);
		 System.out.println(z);
		 
	 }
}

public class Static_Launch_Demo1 {
	public static void main(String[] args) {
		Demo d1= new Demo();
		d1.display();
		Demo.display1();
	}

}
