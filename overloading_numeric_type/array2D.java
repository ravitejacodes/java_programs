package overloading_numeric_type;

import java.util.Scanner;

public class array2D {

	public static void main(String[] args) {
		
		int a[][]=new int[3][];
		a[0]= new int[4];
		a[1]=new int[2];
		a[2]= new int[3];
		
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.println("enter the marks of the class"+i +"student"+j);
				a[i][j]=sc.nextInt();
			}
			
		}
			for(int i=0;i<a.length;i++) {
				for(int j=0;j<a[i].length;j++) {
					System.out.println("enter the marks of the class"+i +"student"+j);
			
			
		}
		
	}

}
}
