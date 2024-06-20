import java.util.Scanner;

public class Fibonaaci_Series { 
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter  a number for fibnacci");
		float num=sc.nextFloat();
		int a=0;
		int b=1;
		int c;
		for(int i=0;i<num;i++) {
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
			
			
		}
	}

}
