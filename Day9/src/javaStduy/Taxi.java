package javaStduy;

public class Taxi implements Meter {

	@Override
	public void start() {
		System.out.println("운행을 시작합니다.");

	}


	
	public int BASE_FARE = 3000;
	public int stop(int distance) {
		int fare = BASE_FARE + distance * 2;
		System.out.println("운행을 종료합니다. 요금은 " + fare + "원입니다.");
		return fare;
	}

}

//@Override -> 애너테이션. 사람도 읽고 컴퓨터도 읽는 주석. 나중에 웹개발 할때는 반드시 붙여야 하는거로 사용한다. 
//밑에서 나는 에러를 방지할 겸... 
//변수 다 적고 @Data하면 알아서 Geter seter 생성...

