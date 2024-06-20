package java_pratice_notes_Strings;

import java.util.Arrays;

public class Parity_Sorting {
	public static void main(String[] args) {
		int[] digits= {1,3,10,4,5,13,7,8};
		
		digits=parity_sorting(digits);
		System.out.println(Arrays.toString(digits));
	}

	 static int[] parity_sorting(int[] digits) {
		 int j=0;
		 for(int i=0;i<digits.length;i++) {
			 if(digits[i]%2==0) {
				 int temp=digits[i];
				 digits[i]=digits[j];
				 digits[j]=temp;
				 j++;
			 }
			 
		 }
		 
		 
		 
		 
		 
		 
		return digits;
		 
		 
	}
	 

}
