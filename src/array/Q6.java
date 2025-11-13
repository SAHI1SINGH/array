package array;
import java.util.*;
public class Q6 {
	public static void main(String [] args) {
		int [] a = {2,5,4,3,6 };
		//int [] val= getResult(a);
		System.out.println(Arrays.toString(getResult(a)));
	}
	
	
	public static int getSum(int[] a) {
		int sum=0;
		for(int i=0 ;i<a.length;i++) {
			sum+=a[i];
		}
		return sum;
	}
	public static int[] getResult(int[]a) {
		int[] res=new int[a.length];
		int total=getSum(a);
		for(int i=0;i<a.length;i++) {
			res[i]=total -a[i];
		}
		return res;
	}
}
