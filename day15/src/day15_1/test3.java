package day15_1;

import java.util.*;

public class test3 {

	public static void main(String[] args) {
		
		int sum = 0;
		int i = 0;
		
		int [] array = {12, 13, 11, 14, 10} ;
		
		for (i=0; i<array.length; i++) {
			sum += array[i];
		}
		
		System.out.println("sum :" +sum);
		
	}
	
}
