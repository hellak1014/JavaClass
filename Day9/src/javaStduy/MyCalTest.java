package javaStduy;

public class MyCalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Calculator cal = new MyCal();
//			cal.plus(3, 4);
			
			
			System.out.println(cal.plus(3, 4)); //인터페이스로 구현된 값
//cal에 있는 디폴트 매서드를 구현 시켜보자.
//			System.out.println(cal.exec(5, 6)); //디폴트로 구현된 값
//		
			System.out.println(Calculator.exec2(5, 6));
			//인터페이스에 static매서드를 사용하면 간단한 기능을 가진
			//유딜리티 성격의 인터페이스로 사용할 수 있다. 
	}
	
	
	}
	


