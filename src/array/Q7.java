package array;
import java.util.*;
public class Q7 {
	public static void main(String[] args) {
		int [] a = {2,5,4,3,6};
		System.out.println(Arrays.toString(getResult(a)));
	}
	
	public static int prod (int[]a) {
		int prod=1;
		for(int i=0;i<a.length;i++) {
			prod*=a[i];
		}
		return prod;
	}
	
	public static int[] getResult(int[] a) {
		int[] res =new int[a.length];
		int total =prod(a);
		for(int i=0;i<a.length;i++) {
			 res[i] =total/a[i];
		}
		return res;
		
	}
}
