package array;


public class Q26 {
	public static void main(String[] args) {
		int[] nums = {7,4,3,0,5,1,6};
		int n=7;
		int totalCount=(n*(n+1))/2;
		
		int sum =0;
		for(int x:nums) {
			sum+=x;
		}
		
		int missingNumber =totalCount -sum;
		
		System.out.println("the missing number is :" +missingNumber);
		
	}
}
