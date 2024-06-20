package arrays_prgms;

public class productExceptSelf {

	public static void main(String[] args) {
		int a[]= {4,2,1,7};
		int i=0;
		int prod=1;
		int j=1;
		while(a[j]!=a[i]) {
			System.out.println( prod*=a[i]);
		}
		for( i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	
		

	}

}
