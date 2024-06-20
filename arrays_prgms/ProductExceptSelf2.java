package arrays_prgms;

public class ProductExceptSelf2 {

	public static void main(String[] args) {
		int prod=1;
		int produ[]=new int[4];
		int a[]= {4,2,1,7};
		for(int i=0;i<a.length;i++) {
			a[i]=1;
			for(int j=0;j<a.length;j++) {
			if(a[i]==a[j]) {
				a[j]=1;
				
				}
			for(int i1=0;i1<produ.length;i1++) {
				produ[i1]=prod*a[j];
			}
			
			}
			
			
		}
		for(int i=0;i<produ.length;i++) {
			System.out.println(produ[i]);
		}
}
}