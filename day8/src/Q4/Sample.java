package Q4;

import java.util.ArrayList;
import java.util.Arrays;

public class Sample {

	public static void main(String[] args) {
		
		int[] data1 = {1, 3, 5, 7, 9};
		Calculator cal = new Calculator();
		int result1 = cal.avg(data1);
		System.out.println(result1);
		
		
		ArrayList<Integer> data2 = new ArrayList<>(Arrays.asList(1, 3, 5, 7, 9));
		int result2 = cal.avg(data2);
		System.out.println(result2);
		
		
	}
	
	
}
