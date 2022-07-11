package day8_3;

public class Point3D extends Point {

	int z = 30;
	
	Point3D() {
		this (100, 200, 300); //Point3D(int x, int y, int z)를 호출한다. 매소드 오버로딩. 메인에서 객체가 3개니까 여기로온거다. 
	}							// 2개였음 Point로 넘어갔겠지. 
	
	Point3D (int x, int y, int z) {
		super(x, y); //Point (int x, int y)를 호출한다. 아무래도 아빠 부르는게 super이니까.
		this.z = z;
	}
	
	
}
