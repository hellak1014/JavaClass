package day17;

public class Exam4 {
	
	public static void main(String[] args) {
		
		int[]a = new int[5];
		
		for (int j=0; j<a.length;j++) {
			a[j]=5-j;
		}
		
		for (int i=0; i<a.length;i++) {
			System.out.println("a["+i+"]="+a[i]);
		}
	

	}
}
