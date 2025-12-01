package array;
public class Q33 {
	public static void main(String[] args) {
		int[] nums = {0,2,0,1,2,1,0,2};
	
		MoveZerosAndOne(nums);
		for(int sum:nums) {
			System.out.print(sum+" ");
		}
					
		
		
	}
	
	public static void MoveZerosAndOne(int[] a) {
		int countZero=0;
		int countOne=0;
		
		for(int x:a) {
			if(x==0)
				countZero++;
			else if(x==1)
				countOne++;
		}
		for(int i=0;i<a.length;i++) {
			if(i<countZero)
				a[i]=0;
			else if(i<countZero+countOne)
				a[i]=1;
			
			else
				a[i]=2;
			
		}
	}
	
}
