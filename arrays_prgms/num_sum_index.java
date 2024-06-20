package arrays_prgms;

public class num_sum_index {

	public static void main(String[] args) {
		int nums[]= {2,7,11,15};
		int count=0;
		int target=9;
		int pos[][];
		for(int i=0;i<nums.length;i++) {
			for(int j=i+1;j<nums.length;j++) {
				if(nums[i]+nums[j]==target) {
					count++;
			      
				}
			}
		}
		if(count==1){
			System.out.println("target found"  );
		}
			
	else {
		System.out.println("target not found");
	}

	}
}

