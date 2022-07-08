package Q3;

public class Calculator {

	int value;
	
	
	Calculator() {
		this.value = 0;
	}
	
	void add(int val) {
		this.value += val;
	}
	
	int getValue() {
		return this.value;
	}
	
	
	boolean isOdd(int num) {
		return num % 2 == 1;
	}
	
	
	
	
	
}
