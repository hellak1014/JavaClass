package sec01.p58;

public class ex {
	public static void main(String[] args) {
		

	
	int v1 = 0;
	
	if (true) {
		int v2 = 0;
		if (true) {
			int v3 = 0;
			v1 = 1;
			v2 = 1;
			v3 = 1;
		}
		v1 = v2+ v3; //v3를 if 안에서 선언 했기 때문에 v3가 if 안 지역 변수로 읽히면서 인식이 안됨 -> 컴파일에러.
		
	}
	
		System.out.pritnln(v1);
	
	
	}

