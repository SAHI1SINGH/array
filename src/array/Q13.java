package array;
import java.util.*;
public class Q13 {
	public static void main(String[] args) {
		int[] nums= {10,20,30,40,50,60,70};
		int temp=nums[1];
	    nums[1]=nums[nums.length-2];
	    nums[nums.length-2 ]=temp;
	    
	    System.out.println(Arrays.toString(nums));
		
	}
}
