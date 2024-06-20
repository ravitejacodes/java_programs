package arrays_prgms;

public class Linear_search {

	public static void main(String[] args) {
		int arr[]= {1,4,5,2,3};
		boolean found=false;
		int target=3;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==target) {
				found=true;	
			}	
		}
		if(found==true) {
			System.out.println("element found");
			
		}
		else {
			System.out.println("element not found");
		}
		

	}

}
