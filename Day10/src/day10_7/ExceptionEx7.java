package day10_7;

public class ExceptionEx7 {

	public static void main(String[] args) {
		
		
		System.out.println(1);
		System.out.println(2);
		
		try {
			System.out.println(3);
			System.out.println(0/0); 						//0으로 나눠서 ArithmeticException 발생. 에러 발생.
			System.out.println(4); 							//실행되지 않는다. 
		} catch (ArithmeticException ae) {					 //ArithmeticException 이거 발생했는데 만약에
			if (ae instanceof ArithmeticException)		 	//instanceof ArithmeticException 이거 발생하면
				System.out.println("true"); 				//트루라고 말해
			System.out.println("ArithmeticException"); 		//이것도 말해
		} catch (Exception e) {								// ArithmeticException 걸리면 이건 출력 X
			System.out.println("Exception");
		}
		
		System.out.println(6);

	} //main 끝.

}
