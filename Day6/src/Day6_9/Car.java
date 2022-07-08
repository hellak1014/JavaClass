package Day6_9;

public class Car {

	String color; //색상
	String gearType; //연속기 종류
	int door; //문의 개수
	
	Car() {} //생성자 생성 -> 기본 생성자. 안에 데이터가 없으니까.
	Car(String c, String g, int d) {
		color = c;
		gearType = g;
		door = d;
	}
	
}
