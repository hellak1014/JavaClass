package Q4;

import java.util.ArrayList;
import java.util.Arrays;


public class Calculator {

	int value;
	
	Calculator() {
		this.value = 0;
	}
	
	void add (int val) {
		this.value += val;
	}
	
	int getValue() {
		return this.value;
	}
	
	
	int avg (int[] data) {
		 int total = 0; 
		 for (int num : data) {
			 total += num;
		 }
		 return total / data.length;
	}

	int avg (int[] ArrayList <Integer>data) {
		 int total = 0; 
		 for (int num : data) {
			 total += num;
		 }
		 return total / data.Size;
	}

	
	
}
