import java.util.Scanner;

public class factorial_recursion {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		int res=factorical(n);
		System.out.println("factorial of "+n+" is=" +res );
		
		
	}

	public static int factorical(int n) {
	if(n==0||n==1) {
		return 1;
	}
	else {
		return (n*factorical(n-1));
	}
	
				
		
		
	}

	
}
