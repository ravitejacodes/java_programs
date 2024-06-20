package arrays_prgms;

public class BinarySearch {
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7,8,9,10,11};
		int result=-1;
		int target=6;
		result =bsearch( a, target);
		if(result==-1) {
			System.out.println("element not found");
		}
		else {
			System.out.println("element found "+result+" index");
		}
	}





	static int  bsearch(int a[],int target) {
		int low=0;
		int high=a.length-1;
		int mid;
		while(low<=high) {
			mid=low+high/2;
			if(a[mid]==target) {
				return mid;
			}
			else if(a[mid]>target) {
				low=mid+1;
			}
			else {
				high=mid-1;
			}
		}
		return 0;
	}
}



