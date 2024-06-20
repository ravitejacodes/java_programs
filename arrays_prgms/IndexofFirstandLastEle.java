package arrays_prgms;

public class IndexofFirstandLastEle {
	public static void main(String[] args) {
		int a[]= {1,4,7,8,8,11,11,11,11,12,13,13};
		int target=11;
		
		Searchpos( a, target) ;
			
		}

	private static void Searchpos(int[] a, int target) {
		int i=0;
		int j=a.length-1;
		int firstpos=-1;
		int lastpos=-1;
		while(i<j) {
			for(i=0;i<a.length;i++) {
				if(a[i]==target) {
					 firstpos=i;
				}
			for(j=a.length-1;j>0;j--) {
				if(a[j]==target) {
					lastpos=j;
				}
				 
			}
			
			}
			if(firstpos==-1) {
				System.out.println("element not found");
			}
			else {
				System.out.println("element found at"+firstpos);
			}
			if(lastpos==-1) {
				System.out.println("element not found");
			}
			else {
				System.out.println("element found at" +lastpos);
				}
	}
}
}

	


