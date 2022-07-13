package day10_1;

class FoolException extends Exception{ //runtimeException은 실행중에 발생한 에러를 잡는것. -> 실행하다가 에러가 난 자리에서 멈춰버림.
									// Exception의 경우 아예 들어가지도 못함. 
	
}


public class Exam1 {
	
	public void sayNick(String nick) {
		try {
		if("fool".equals(nick)) {
			throw new FoolException(); //runtimeException의 경우 여기서 멈춰버림. Exception의 경우 걍 돌아가지 않음. 얘때문에. 
		}
		System.out.println("당신의 별명은 "+nick+" 입니다.");
	}catch(FoolException e) {
		System.err.println("FoolException이 발생했습니다.");
	}
	}
	
	public static void main(String[] args) {
		Exam1 ex = new Exam1();
		ex.sayNick("fool");
		ex.sayNick("genious");
	}

} // 이 경우 FoolException이 발생했습니다.당신의 별명은 genious 입니다. 라고 나와버림 -> 에러가 발생해서 fool이라고 나왔는데 자기 혼자서 지니어스를 진행해버림. 
//포장 안했는데 택배가 이동해버린 느낌. 오류가 생기면 작업이 멈춰야 한다. -> 이걸 트랜잭션이라고 한다. 