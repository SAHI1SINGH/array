package array;

import java.util.*;

public class Q22 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value you want to change position");
		int[] nums= {1,2,3,4,5,6,7};
		int k=sc.nextInt();
		int start =nums[0];
		int end=nums[nums.length-1];
		
		sc.close();
		System.out.println(Arrays.toString(returnKPositionToRight(nums,k)));
	}
	public static int[] returnKPositionToRight(int[] a,int k) {
		int n=a.length;
		 k=k%n;
		 Reverse(a,0,n-1);
		 Reverse(a,0,k-1);
		 Reverse(a,k,n-1);
		 return a;
		
	}
	public static void Reverse(int [] a,int start,int end) {
		while(start<end) {
			int temp =a[start];
			a[start] =a[end];
			 a[end]=temp;
			 start++;
			 end--;
		}
	}
}
