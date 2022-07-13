package day10_4;

public class ExceptionEx3 {

	public static void main(String[] args) {
		
		int number = 100;
		int result = 0;
		
		for(int i=0; i<10; i++) {
			try {
				result = number / (int)(Math.random() * 10);
				System.out.println(result);
			} catch (ArithmeticException e) {
				System.out.println("0");
			}
		}

	}

}


//day10_3 ExceptionEx2의 에러가 발생할 경우 무시하고 진행하는 것. 