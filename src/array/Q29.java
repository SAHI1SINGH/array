package array;

public class Q29 {
	public static void main(String[] args) {
		
		int[] nums = {2,3,7,8,9};
		System.out.println(isIncreasing(nums));
		
	}
		
		public static boolean isIncreasing(int [] a) {
			
			for(int i=0;i<=a.length-1;i++) {
				if(a[i]<a[i+1]) {
					return true;
				}
			}
			return false;
		}
		
}
