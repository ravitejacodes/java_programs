package arrays_prgms;

public class arrayex1 {

	public static void main(String[] args) {
		int nums[]= {4,1,2,1,2};
		int res = singlenumber(nums);
		System.out.println(res);
		}
	public static int singlenumber(int nums[]) {
		int a=0;
		for(int i=0;i<nums.length;i++) {
			a=a^nums[i];
		}
		return a;
	}
}
