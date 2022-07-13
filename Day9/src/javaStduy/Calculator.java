package javaStduy;

public interface Calculator {
	
	public int plus(int i, int j);
	public int multiple (int i, int j);
	
	//여기까진 추상 매서드도 가능함. 하지만 인터페이스는 구현도 가능하다. (아래)
	
//	default static int exec1(int i, int j) { 
//		return i*j;
	
	public static int exec2(int i, int j) { //static은 객체를 안찍고도 클래스로 접근이 가능하다. 
		return i*j;
	}

}
