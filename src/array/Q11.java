package array;
public class Q11 {
	public static void main(String[] args) {
		int[] nums= {6,1,1,1,7,7,1,1,1,1};
		System.out.println(getMaxConsecutive(nums));
	}
	public static int getMaxConsecutive(int[] a) {
		int tempCount=0;
		int finalCount=0;
		for(int x:a) {
			if(x==1) {
				tempCount++;
			}
			else {
				if(tempCount>finalCount) {
					finalCount=tempCount;
				}
				tempCount=0;
			}
		}
			if(tempCount>finalCount) {
				finalCount=tempCount;
			}
			return finalCount;
		}
	}

