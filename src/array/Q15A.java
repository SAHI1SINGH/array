package array;
import java.util.*;
public class Q15A {
 public static void main(String[] args) {
	 int [] nums = {10,20,30,40,50,60,70};
	 int n=nums.length;
	 int mid =n/2;
	 for(int i=mid-1;i>=0;i--) {
		 System.out.print(nums[i]+" ");
	 }
	 
	 for(int i=n-1; i>=mid;i--) {
		 System.out.print(nums[i]+" ");
	 }
	 int temp=nums[0];
	  nums[0]=nums[3];
	  nums[3]=temp;
	  
	System.out.print(Arrays.toString(nums));
 }
}
