import java.util.Scanner;

public class fact_nomal {
	private static final int sum = 0;

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);		
		System.out.println("enter a number for factorial");
		int num=sc.nextInt();
		int res=factorial( num);
		System.out.println(res);

	}

	static int factorial(int num) {
	    for(int i=num;i>=1;i--){
	        int sum=1;
	        int fact=1;
	        fact=i*(i-1);
	        sum=sum+fact;
	        System.out.println(sum);
	        
	}
	return sum;
}
}
