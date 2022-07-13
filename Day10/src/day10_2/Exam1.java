package day10_2;

class FoolException extends Exception{ //runtimeException은 실행중에 발생한 에러를 잡는것. -> 실행하다가 에러가 난 자리에서 멈춰버림.
									// Exception의 경우 아예 들어가지도 못함. 
	
}


public class Exam1 {
	
	public void sayNick(String nick) throws FoolException {
//		try {							
		if("fool".equals(nick)) {
			throw new FoolException(); 
		}
		System.out.println("당신의 별명은 "+nick+" 입니다.");
//	}catch(FoolException e) {
//		System.err.println("FoolException이 발생했습니다."); //에러가 발생 한걸 호출한 곳으로 던져버리기. -> sayNick으로 던짐.
//	}
	}
	
	public static void main(String[] args) {
		Exam1 ex = new Exam1();
		
		try {
		ex.sayNick("fool");
		ex.sayNick("genious");
	} catch (FoolException e) {
		System.err.println("FoolException이 발생했습니다.");
	}
	}

} // day10_1에서 에러가 나도 genious가 출력되는 것을 고침. try catch문이 수행되면 catch로 빠지는 것을 이용해서 sayNick에서 try구문을 처리하는것이 아닌 
// 메인 메소드에서 처리를 함으로서 발생하는 순간 처리가 되도록 함. 