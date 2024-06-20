package java_pratice_notes_inheritance;
class Demo1{
	int a;
	int b;
	Demo1(){
		a=10;
		b=20;
	}

}
class Demo2 extends Demo1{
	int c,d;
	Demo2(){
		 c=30;
		 d=40;
		
	}
	void dispaly() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
}

public class Constructer_Inheritance_Demo1 {
	public static void main(String[] args) {
		Demo2 x= new Demo2();
		x.dispaly();
		//when we create an object of Demo2,
		//Demo2() Constructor will be called&Demo2()Constructor will call super() method[the parent Constructor]
		// a and b values are initialized without creating the object to parent class
	}

}
