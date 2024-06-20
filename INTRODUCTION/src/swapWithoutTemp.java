import java.util.Scanner;

public class swapWithoutTemp {
	
	public static void main(String[] args) {
		
	Scanner sc =new Scanner(System.in);
	System.out.println("enter your first element");
    int a=sc.nextInt();
    System.out.println("enter your second element");
    int b=sc.nextInt();
     swap(a,b);
     sc.close();
   
   
    
	}

	private static void swap(int a, int b) {
		 a=a+b;
		 b=a-b;
		 a=a-b;
		 System.out.println("a="+a+ "b=" +b);
			
	
	}
}
