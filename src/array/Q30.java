package array;

public class Q30 {
	public static void main(String[] args) {
		
		int[] nums = {2,7,7,8,9};
		
		System.out.println(isSorted(nums));
	}
	
	public static String isSorted(int [] a) {
		
		for(int i =0;i<=a.length-1;i++) {
			
			if(a[i]<=a[i+1]) {
				return " Array is sorted";
			}
		}
		return "Array is not sorted";
	}
}
