package array;
import java.util.*;
public class Q20 {
	public static void main(String[] args) {
		int [] nums= {10,20,30,40,50,60,70};
		int ele=35;
		int pos=3;
		int update[]=addElement(nums,ele,pos);
		
//		for (int i=0;i<update.length;i++) {
//			System.out.print(update[i]+" ");
//		}
		System.out.println(Arrays.toString(update));
	}
		public static int[]  addElement(int[] a,int ele, int pos) {
			int [] arr =new int[a.length+1];
			for(int i=0;i<pos;i++) {
				arr[i]=a[i];
			}
			arr[pos]=ele;
			
			for(int i=pos;i<a.length;i++) {
				arr[i+1]=a[i];
			}
			return arr;
		}
	
}
