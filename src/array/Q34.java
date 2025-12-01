package array;

public class Q34 {
	public static void main(String[] args) {
		int[] a= {1,2,3,4,5,6};
		int [] b= {1,2,3,4,5,6};
		System.out.println(isArraySame(a,b));
		
	}
	
	public static boolean isArraySame(int[] a , int [] b) {
		for(int i=0;i<a.length;i++) {
				if(a[i]==b[i])
					return true;
		}
		return false;
	}
}
