package array;

public class Q4 {
	public static void main(String[] args) {
		String [] names = {"roman","oggy","jack","pokemon"};
		String largest = names[0];
		for(int i =0; i< names.length;i++) {
			if(largest.length() < names[i].length()) {
				largest = names[i];
			}
		}
		System.out.println("Largest String is : " + largest);
	}
}
