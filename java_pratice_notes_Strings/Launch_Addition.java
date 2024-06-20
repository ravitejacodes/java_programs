package java_pratice_notes_Strings;
//import java.util.Arrays;
class sum{

	int a=10;
	int b=20;
	int c=30;
	int d=40;
	void add(int a,int b) {
		int sum=a+b;
		System.out.println(sum);
	}
	void add(int a,int b,int c) {
		int sum=a+b+c;
		
		System.out.println(sum);
	}

	void add(int a,int b,int c,int d) {
		int sum=a+b;
		System.out.println(sum);
	}

}

public class Launch_Addition {

	public static void main(String[] args) {
		sum s= new sum();
		s.add(10,20);
		s.add(10, 20,30);
		s.add(10, 20,30,40);
		
		
		
	}


}
