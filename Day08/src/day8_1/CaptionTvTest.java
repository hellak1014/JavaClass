package day8_1;

public class CaptionTvTest {
	public static void main(String[] args) {
		
		CaptionTv ctv = new CaptionTv(); //자식으로 객체 생성.
		ctv.channel = 10; //조상클래스로부터 상속받은 멤버. 자식에는 없지만 조상에는 있어서 채널 변수를 갖다 씀.
		ctv.channelUp(); //조상클래스로부터 상속받은 멤버. 자식에는 없지만 조상에는 있어서 채널업 변수를 갖다 씀. 
		System.out.println(ctv.channel); //출력.
		
		ctv.displayCaption("Hello, World"); //자식한테 있음.
		ctv.caption = true; //캡션(자막) 기능을 true일때 켠다. 
		ctv.displayCaption("Hello, World");
		
	}

}
