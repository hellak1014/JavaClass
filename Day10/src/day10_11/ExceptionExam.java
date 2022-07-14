package day10_11;

public class ExceptionExam {

	public static void main(String[] args) {
		
		
		try {
			int[] array = new int [10];
			array[20] = 5;
		} catch (Exception e) { 								//에러가 생겼어요
			System.out.println("배열의 범위를 지나쳤어요.");
		}

		System.out.println("성공");
		
	}
	
}
