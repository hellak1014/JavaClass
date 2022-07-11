package day8_1;

public class CaptionTv extends Tv {
	
	boolean caption; //캡션 상태 온오프
	void displayCaption(String text) {
		if (caption) { //캡션 상태가 on(true)일때만 text를 보여준다.
			System.out.println(text);
		}
	}

}
