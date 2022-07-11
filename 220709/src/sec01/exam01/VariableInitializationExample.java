package sec01.exam01;

public class VariableInitializationExample {
	public static void main(String[] args) {
		
		int value; //변수 value 선언
		
		int result = value + 10; //변수 value값에 10을 더하는 연산 실행. 이 값을 result에 저장.
		
		System.out.println(result); //결과값 산출
		
	}
}


// 이 경우, 위에서 value를 설정했지만 선언만 했을뿐 초기화를 하지 않았기 때문에 2라인의 value가 존재하지 않았다. 그래서 에러가 발생하는것. 

// 올바른 코딩

// int value = 30;
// int result = value +10;