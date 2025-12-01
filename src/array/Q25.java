package array;
import java.util.*;
public class Q25 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int[] nums = {1,2,3,4,5,6,7};
		System.out.println("enter the value of K");
		int  k =sc.nextInt();
		sc.close();
		System.out.println(Arrays.toString(reverseLeft(nums,k)));
		
	}
	public static int[] reverseLeft (int[] a, int k) {
		int n=a.length-1;
		k=k%n;
		rotate(a,0,n);
		rotate(a,a.length-2,n);
		rotate(a,0,n-2);
		
		return a;
	}
	
	public static void rotate(int[] a,int start,int end ) {
		while(start<end) {
			int temp=a[start];
			 a[start]=a[end];
			 a[end]=temp;;
			 start++;
			 end--;
			
		}
	}
	
}
