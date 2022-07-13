package javaStduy;

public class LedExam {
	public static void main(String[] args) {
		
		Tv tv = new LedTV(); //명령서와 자료형 변경이 가능하다가 인터페이스의 핵심
		
		tv.turnOn();
		tv.changeVolume(8);
		tv.changeChannel(39);
		tv.turnOff();
		
	}

}


//참조변수의 타입으로 인터페이스를 사용할 수 있다.
//인터페이스가 가진 매서드만 사용할 수 있다. 