package day10_9;

public class ExceptionEx9 {

	public static void main(String[] args) {
		
		try {
			Exception e = new Exception("고의로 발생시켰음.");
					throw e;										//예외를 강제로 발생시킴.
																	// throw new Exception("고의로 발생시켰음."); 위 두줄을 한줄로 줄여 쓸수있다.
		} catch (Exception e) {										
		System.out.println("에러 메세지 : " + e.getMessage());
			e.printStackTrace();
		 
		
	}
		
		System.out.println("프로그램이 정상 종료 되었음.");

}
}
