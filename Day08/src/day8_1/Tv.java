package day8_1;

public class Tv {
	
	boolean power; //전원상태 온오프
	int channel; //채널
	
	void power() {power = !power;}
	void channelUp() {++channel;}
	void channelDown() {--channel;}
	
	

}
