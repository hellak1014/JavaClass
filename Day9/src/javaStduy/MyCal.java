package javaStduy;

public class MyCal implements Calculator {

	@Override //애너테이션
	public int plus(int i, int j) { //구조
		return i+j;					//가지고 나가야 하는 값
	}

	@Override
	public int multiple(int i, int j) {
		return i*j; 
	}

}
