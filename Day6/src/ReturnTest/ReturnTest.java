package ReturnTest;

public class ReturnTest {
	public static void main(String[] args) {
		
		ReturnTest r = new ReturnTest(); //객체생성. 
		
		
		int result = r.add(3,5); //add 매서드. add값 2개.
		System.out.println(result); //
		
		int[] result2 = {0}; //배열을 생성하고 result2[0]의 값을 0으로 초기화.
		r.add(3,5,result2); //배열을 add메서드의 매개변수로 전달.
		System.out.println(result2[0]);
		
	}
	
	int add(int a, int b) { //와야하는 값이 2개. 
		return a + b;
	}
	
	void add(int a, int b, int[] result) { //와야 하는 값이 3개이기 때문에 13열의 값이 이곳으로 옴.
		result[0] = a + b; //
	}
	
}

	
	//매서드 오버로딩. 자료형의 갯수에 따라 다른곳에 떨어지게끔 하는것. 오버라이딩(덮어쓰기)도 잇는데 헷갈리지 않게 조심. 