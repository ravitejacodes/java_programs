import java.util.Scanner;

public class Quadratic_Roots {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a value");
		double a= sc.nextDouble();
		System.out.println("enter b value");
		double b= sc.nextDouble();
		System.out.println("enter c value");
		double c= sc.nextDouble();
		
		double d= b*b-4*(a*c);
		if(d<0) {
			System.out.println("no real roots");	
		}
		else if(d>0) {
			System.out.println(" has 2  distinct roots");
			double root1=-b+Math.sqrt(d)/2*a;
			double root2=-b-Math.sqrt(d)/2*a;
			System.out.println(root1);
			System.out.println(root2);
			
		}
		else if(d==0){
			double root=-b/2*a;
			System.out.println(root);
			
		}
		
		
	}

}
