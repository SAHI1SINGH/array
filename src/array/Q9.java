// Concatenation of array;
package array;
import java.util.*;
public class Q9 {
	public static void main(String[] args) {
		int[] nums = {1,2,3,4,5};
		System.out.println(Arrays.toString(getConcatination(nums)));
		
	}
	
	public static int[] getConcatination(int[] nums) {
		int[] b=new int[nums.length*2];
		for(int i=0;i<nums.length;i++) {
			b[i]=nums[i];
			b[nums.length+i]=nums[i];
		}
		return b;
	}
}
