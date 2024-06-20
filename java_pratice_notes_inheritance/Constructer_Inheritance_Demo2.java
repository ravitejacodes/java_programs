package java_pratice_notes_inheritance;
class Demo11{
	int a;
	int b;
	Demo11(){
		a=10;
		b=20;
	}
	Demo11(int a,int b){
		this.a=a;
		this.b=b;
	}

}
class Demo22 extends Demo11{
	int c,d;
	Demo22(){
		 c=30;
		 d=40;
		
	}
	Demo22(int c, int d){
		this.c=c;
		this.d=d;
	}
	void dispaly() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
}

public class Constructer_Inheritance_Demo2 {
	public static void main(String[] args) {
		Demo22 x= new Demo22(11,22);
		x.dispaly();
		
	}

}
