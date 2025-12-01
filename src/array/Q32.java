package array;

public class Q32 {
	public static void main(String[] args) {
		int [] a= {0,1,1,0,0,1,0,0};
		moveZeros(a);
		for(int x :a) {
			System.out.print(x+" ");
		}
	}

		public static void moveZeros(int[] a) {
			for(int i=0,j=0;i<a.length;i++) {
				if(a[i]==0) {
				int temp=a[j];
				a[j]=a[i];
				a[i]=temp;
				j++;
				}
			}
	}
}
