package array;

public class Q31 {
	public static void main(String [] args) {
		int [] nums= {7,0,2,6,0,4};
		moveZerosToEnd(nums);
		for(int x:nums) {
			System.out.print((x +" "));
			
		}
	}
	public static void moveZerosToEnd(int[] nums) {
		for(int i=0 ,j=0 ;i<nums.length;i++) {
			if(nums[i] !=0 ) {
				int temp =nums[j];
				nums[j]=nums[i];
				nums[i]=temp;
				j++;
			}else {
			}
		}
	}
}
