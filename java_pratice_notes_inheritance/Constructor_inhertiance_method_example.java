package java_pratice_notes_inheritance;
class exmp1{
	int a=10;
	
}
class exmp2 extends exmp1{
	int a=100;
	void dispaly() {
		int a=1000;
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(super.a);
	}
}

public class Constructor_inhertiance_method_example {
	public static void main(String[] args) {
		exmp2 e= new exmp2();
		e.dispaly();
	}

}
