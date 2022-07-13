package day10_5;

public class ExceptionEx4 {

	public static void main(String[] args) {
		
		
		System.out.println(1);
		System.out.println(2);

		
		try {
			System.out.println(3);
			System.out.println(4);
		} catch (Exception e) {
			System.out.println(5); //실행되지 않는다. 에러가 발생하면 5가 찍히는건데 에러가 없으니까.
		} //try catch 끝.
		
		System.out.println(6);
	} //main 끝
	
	
}
