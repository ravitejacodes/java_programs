
public class Second_Largest_Number {
	public static void main(String[] args) {
		int a[]= {6,7,9,45,35,43,98,49,5};
		int temp;
		for(int i=0;i<a.length-1;i++) {
			for(int j=i+1;j<a.length;j++) {//not working if j=1..?
				if(a[i]<a[j] ){
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				
					
				}
				
			}
		}
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);	
		}
		int sec=a[1];
		System.out.println("second largest number is:"+sec);
		
	}

}
