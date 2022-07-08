package Day6_13javastudy;

public class Car {

	
		String name;
		int number;
		
	Car() {
		this ("이름없음", 0);
	}
		
	Car(String name) {
		this (name, 0);
	}
	
	Car (String name, int number) {
		this.name = name;
		this.number = number;
	}
	
	
}


//출력할게 3개니까 3개를 만들었어야해요 멍청아