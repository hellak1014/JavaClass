package day10;

class FoolException extends Exception{ //runtimeException은 실행중에 발생한 에러를 잡는것. -> 실행하다가 에러가 난 자리에서 멈춰버림.
									// Exception의 경우 아예 들어가지도 못함. 
	
}


public class Exam1 {
	
	public void sayNick(String nick) {
		if("fool".equals(nick)) {
			throw new FoolException(); //runtimeException의 경우 여기서 멈춰버림. Exception의 경우 걍 돌아가지 않음. 얘때문에. 
		}
		System.out.println("당신의 별명은 "+nick+" 입니다.");
	}
	
	public static void main(String[] args) {
		Exam1 ex = new Exam1();
		ex.sayNick("fool");
		ex.sayNick("genious");
	}

} //sayNick메소드는 fool이라는 문자열이 입력되면 return으로 메소드를 종료해 별명이 출력되지 못하도록 하고있다. 
//