package array;

public class Q35 {
	public static void main(String[] args) {
		int [] nums= {40,32,45,21,63,17,5,5,3};
		int count =0;
		for(int a :nums) {
			if(isPrime(a)) {
				System.out.print(a+" ");
				count++;
			}
			
		}
		System.out.println("\nThe total number of prime number is:"+count);
		
	}
	public static boolean isPrime(int n) {
		if(n<2)
			return false;
		else if(n==2)
			return true;
		
		for(int i=3;i*i<=n;i++) {
			if(n%i==0) 
				return false;	
		}
		return true;
	
	}
}
