package java_pratice_notes_Strings;

import java.util.Arrays;

public class Reverse_Array { 
public  static void main(String[] args) {
	int arr[]= {1,7,8,9};
	System.out.println("Original String is:"+Arrays.toString(arr));
	 
 arr=rev_arr(arr);
 System.out.println("Reversed String is:"+Arrays.toString(arr));
}

 static int[] rev_arr(int[] arr) {
	 int i=0;
	 int j=arr.length-1;
	 while(i<j) {
		 int temp=arr[i];
		 arr[i]=arr[j];
		 arr[j]=temp;
		 j--;
		 i++;
		 
	 }
	 return arr;
		
}

 


}
