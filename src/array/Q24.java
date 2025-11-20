package array;
import java.util.*;
public class Q24 {
	public static void main(String [] args) {
		int[] nums = {10,20,30,40,50,60,70};
		System.out.println(Arrays.toString(reverse(nums)));
	}
	public static int [] reverse(int[] a) {
		int temp=a[0];
		for(int i=0;i<a.length-1;i++) {
			a[i]=a[i+1];
			
		}
		a[a.length-1]=temp;
		return a;
	}
}
