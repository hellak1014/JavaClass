package day10_10;

public class FinallyTest2 {

	public static void main(String[] args) {
		
		try {
			startInstall();							//프로그램 설치에 필요한 준비를 한다
			copyFiles();							// 파일들을 복사한다
		} catch (Exception e) {						// 근데 만약에 에러났어?
			e.printStackTrace();					// 왜 에러 났는지 적어봐
		} finally {									// 에러가 나던 안나던 결과적으로는
			deleteTempFiles();						//임시파일 지워버려.
		}
		
	}
						 
		
	
	static void startInstall() {}					//프로그램 설치에 필요한 코드 적기.
	
	static void copyFiles() {}						//파일 복사 코드
	static void deleteTempFiles() {}				//임시파일 지우는 코드
	

}
