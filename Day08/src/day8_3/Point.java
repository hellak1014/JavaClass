package day8_3;

public class Point {

	int x =10;
	int y = 20;
	
	Point (int x, int y) { //생성자 첫줄에서 다른 생성자를 호출하지 않기 때문에 컴파일러가 알아서 super();를 삽입했다
							// super();는 Point의 조상인 Object클래스의 기본 생성자인 Object()를 의미한다.
		this.x = x;
		this.y = y;
		
	}
	
	
}

//그럼 여기서 말하는 this는 Object를 말하는걸까요?