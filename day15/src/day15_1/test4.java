package day15_1;

public class test4 {

	public static void main(String[] args) {
		
		int i = 0;
		int max = 0;
		
		int [] array = {12, 13, 11, 14, 10} ;
		
			for (i = 0; i<array.length; i++) {
				if (max<array[i]) {
					array[i]=max;
				}
		
	}
	
			System.out.println(max);
			
}
	
}
