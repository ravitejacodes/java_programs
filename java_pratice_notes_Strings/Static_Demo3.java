package java_pratice_notes_Strings;
class Demo3{
	int a,b,c;
	static int x,y,z;
	{
		System.out.println("non-static method entered");
		a=10;
		b=20;
		c=30;
		System.out.println("non-static method exited");

	}
	static{
		System.out.println("static method entered");

		x=11;
		y=22;
		z=33;
		System.out.println("static method exited");

		
	}
	Demo3(){
		System.out.println("zero parameter constructer entered");

		a=100;
		b=200;
		c=300;
		System.out.println("zero parameter constructer exited");
		
	}
	Demo3(int a,int b,int c){
		System.out.println("3 parameter constructer entered");
		this.a=a;
		this.b=b;
		this.c=c;
		System.out.println("3 parameter constructer exited");
	}
	void dispaly1() {
		System.out.println("non-static display method entered");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println("non-static display method exited");
	}
	static void display2() {
		System.out.println("static display method entered");
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		System.out.println("static display method exited");
	}
}

public class Static_Demo3 {
	public static void main(String[] args) {
		Demo3 d1 = new Demo3();
		d1.dispaly1();
		Demo3 d2= new Demo3(1000,2000,3000);
		d2.dispaly1();
		Demo3.display2();
	}

}
