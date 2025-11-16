package array;

public class Q12 {
	public static void main(String[] args) {
		int[] nums = {6,1,1,1,7,7,1,7,1,1};
		int n=7;
		System.out.println(getMaxConsecutive(nums,n));
	}
	public static int getMaxConsecutive(int[] a,int k) {
		int tempCount=0;
		int finalCount=0;
		for(int x:a) {
			if(x==k) {
				
					tempCount++;
			}
			else {
				if(tempCount>finalCount) {
					finalCount=tempCount;
				   
				}
				 tempCount=0;
				
			}
		}
		if(tempCount>finalCount) {
			finalCount=tempCount;
		}
		return finalCount;
	}
}
