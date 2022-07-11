package sec01.exam02;

public class VariableUseExample {

	public static void main(String[] args) {
		
		
		int hour = 3; //변수 설정
		int minute = 5; //변수 설정
		System.out.println(hour + "시간 " + minute + "분"); //대입해서 출력
		
		int totalMinute = (hour*60) + minute; //totalminute의 변수 설정 및 hour에 저장된 값으로 대체후 totalminute의 값에 저장
		System.out.println("총 " + totalMinute + "분"); // 출력
		
	}
	
	
}
