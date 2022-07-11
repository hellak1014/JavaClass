package day8_8;

public class CarExam {
	
	public static void main(String[] args) {
		
		Car car = new Car("포니", 1234);
		
		System.out.println("name: "+car.name);
		System.out.println("number: "+car.number); //뒤에 car.name이랑 car.number에서 에러. 왜냐면 여기는 다른 클래스라서. car에서 private로 막아버리면 넘어올수 없다. 
		
		
		
	}

}


//default, protect, public 모두 가능. 