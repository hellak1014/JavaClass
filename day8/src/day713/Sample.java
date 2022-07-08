package day713;

public class Sample {
	void sayNick(String nick) {
		if("fool".equals(nick)) {
			return;
		}
		
		System.out.println("나의 별명은 "+nick+" 입니다.");
		
	}
	
	
	public static void main(String[] args) {
		Sample sample = new Sample();
		sample.sayNick("angel");
		sample.sayNick("fool"); //출력되지 않느다. 위에서 fool은 리턴처리 했기 때문에. 
	}
	
}
