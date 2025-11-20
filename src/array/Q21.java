package array;

import java.util.Arrays;

public class Q21 {
	public static void main(String [] args) {
		int[] nums = {10,20,30,40,50,60,70};
		System.out.println(Arrays.toString(reverse(nums)));
	}
	public static int[] reverse(int[] a) {
		int temp =a[a.length-1];
		for(int i=a.length-2;i>=0;i--) {
			a[i+1]=a[i];
		}
		a[0]=temp;
		return a;
	}
}
