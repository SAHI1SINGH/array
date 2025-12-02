package array;

public class Q36 {
	public static void main(String [] args) {
		int [] nums = { 2,4,3,5,9,7,11,13,17,23,27,31,29};
		int sum=0;
		
		for(int a : nums) {
			if(isPrime(a)) {
				System.out.println(a);
				sum+=a;
			}
		}
		System.out.println("\ntotal sum of all prime number is:"+sum);
	}
	
	public static boolean isPrime(int n) {
		if(n<=1)
			return false;
		else if(n==2 || n==3)
			return true;
		
		for(int i=2;i*i<=n;i++) {
			if(n%i==0)
				return false;	
		}
		return true;
	}
}
