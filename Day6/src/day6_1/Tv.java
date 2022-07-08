package day6_1;

public class Tv {


	String color;
	boolean power;
	int channel;
	
	void power(){ //void는 반환 타입. 리턴이 없는 매서드의 수행.
		power = !power;
	}
	void channelUp() {
		++channel;
	}
	void channelDown() {
		--channel;
	}

}
