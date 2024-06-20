package java_pratice_notes_inheritance;
class Demo1111{
	int a;
	int b;
	Demo1111(){
		System.out.println("zero par  parent constructor entered ");
		a=10;
		b=20;
		System.out.println("zero par parent  constructor exited ");

	}
	Demo1111(int a,int b){
		this();
		System.out.println("2 parameterzied parent constructor entered");
		this.a=a;
		this.b=b;
		System.out.println("2 parameterzied parent constructor exited");

	}

}
class Demo2222 extends Demo1111{
	int c,d;
	Demo2222(){
		this(11,22);
		System.out.println("zero par  child constructor entered ");
		 c=30;
		 d=40;
		System.out.println("zero par  child constructor exited ");

		
	}
	Demo2222(int c, int d){
		super(111,222);
		System.out.println("2 parameterzied child constructor entered");
		this.c=c;
		this.d=d;
		System.out.println("2 parameterzied child constructor exited");

	}
	void dispaly() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
}

public class Constructer_Inheritance_Demo4 {
	public static void main(String[] args) {
		Demo2222 x= new Demo2222();
		x.dispaly();
	
	}
	

}
/*Note:
 /1/: one constructor calling another constructor within same class called local chaining.it can be achieved by using this()method.

/2/: a child constructor calling the parent constructor is called Constructor chaining.it can be achieved by using super() method.

/3/: in any constructor we can  have either super() method or this()method .but not both

/4/: if super()method is present in the constructor it has to be in the first line in the constructor like wise this() method also..

/5/: since super()method &this()method have same exceptation.we cannot have both super()&this() method call in a single constructor*/

