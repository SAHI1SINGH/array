package array;

public class Q5 {
		public static void main(String[] args) {
			String[] name= {"alpha","beta","gama","lambda","sahil"};
			int count =0 ;
			for(int i=0;i<=name.length;i++) {
					if( name[i].length() % 2==0) {
						System.out.println(name[i]);
						count++;
					}
			}
			System.out.println(count);
			
		}
}
