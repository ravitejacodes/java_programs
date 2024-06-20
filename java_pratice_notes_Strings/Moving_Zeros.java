package java_pratice_notes_Strings;

import java.util.Arrays;

public class Moving_Zeros {

	public static void main(String[] args) {
		int nums[]= {0,6,0,9,11};
		System.out.println(Arrays.toString(nums));
		
      nums=Zeros(nums);
       System.out.println(Arrays.toString(nums));
       
		
		
		
		
		
		
		
		

	}

	static int[] Zeros(int[] nums) {
	    int j = 0;
	    for (int i = 0; i < nums.length; i++) {
	        if (nums[i] != 0) {
	            nums[j] = nums[i];
	            j++;
	        }
	    }
	    // Fill the remaining positions with zeros
	    while (j < nums.length) {
	        nums[j] = 0;
	        j++;
	    }
	    return nums;
	

			
			 
			
	}

}
