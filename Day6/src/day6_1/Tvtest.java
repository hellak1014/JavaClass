package day6_1;

public class Tvtest {

	public static void main(String[] args) {
		
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		
		t1.channel = 7; //tv에서 선언한 채널을 번호 7로 초기화. 변수 사용
		t1.channelDown();// channel변경 하나 내림. 7-> 6. 매서드 사용

		t2.channel = 11;
		t2.channelUp();
		
		System.out.println("현재 채널:" + t1.channel);
		System.out.println("현재 채널:" + t2.channel);

		//객체가 다르면 모두 다른 성질을 각각 유지한다. 
		
	}
}
