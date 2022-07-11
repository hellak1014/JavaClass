package day8_3;

public class PointTest2 {

	public static void main(String[] args) {
		
		Point3D p3 = new Point3D();
		
		System.out.println("p3.x=" + p3.x);
		System.out.println("p3.y=" + p3.y);
		System.out.println("p3.z=" + p3.z);
		
		//보이는건 3d에서 오버로딩 되었지만 z는 자식에서 처리되고 x랑y는 부모한테 산술식만 처리.값은 자식이 가지고 있는 값에서 처리. 
	}
	
	
}
