package array;
import java.util.*;
public class Q16 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array size");
		int size=sc.nextInt();
		int [] nums =new int[size];
		System.out.println("enter your array element");
		for(int i=0;i<size;i++) {
			nums[i]=sc.nextInt();
		}
		System.out.println("is Pallindrome ?"+isPallindrome(nums));
		
	}
		
		public static boolean isPallindrome(int[] nums) {
			int start =0;
			int end=nums.length-1;
			while(start<end) {
				if(nums[start]==nums[end])
				start++;
				end--;
				return true;
			}
			return false;
		}

}
