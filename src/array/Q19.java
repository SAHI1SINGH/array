package array;
import java.util.*;
public class Q19 {
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the position to remove");
		int x=sc.nextInt();
		int [] nums= {10,20,30,40,50,60,70};
		System.out.println(Arrays.toString(getRemove(nums,x)));
	}
		public static int[] getRemove(int[]a, int x) {
			
			int [] b=new int[a.length-1];
			for(int i=0;i<b.length;i++) {
				if(i<x) {
					b[i]=a[i];
				}
				else {
					b[i]=a[i+1];
				}
			}
			return b;
		}
	
}
