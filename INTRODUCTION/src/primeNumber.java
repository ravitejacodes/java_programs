import java.util.Scanner;

public class primeNumber {
	public static void main(String[] args) {
		int count=0;
		int i=1;
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("enter a number");
			int num= sc.nextInt();
			for(i=1;i<=num;i++) {
				if(num%i==0) {
					//System.out.println(i);
					count=count++;
				}
			}
			
			if(count==2) {
				System.out.println(+num+ " is a prime number");
			}
			else {
				System.out.println(+num+" not a prime number");
			}

			sc.close();
		}
		
	}
	



}
