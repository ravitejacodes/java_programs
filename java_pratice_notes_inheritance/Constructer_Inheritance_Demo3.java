package java_pratice_notes_inheritance;
class Demo111{
	int a;
	int b;
	Demo111(){
		a=10;
		b=20;
	}
	Demo111(int a,int b){
		this.a=a;
		this.b=b;
	}

}
class Demo222 extends Demo11{
	int c,d;
	Demo222(){
		 c=30;
		 d=40;
		
	}
	Demo222(int c, int d){
		super(111,222);
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

public class Constructer_Inheritance_Demo3 {
	public static void main(String[] args) {
		Demo222 x= new Demo222(11,22);
		x.dispaly();
		
	}

}
