package day8_9;

public class CarExam {

	public static void main(String[] args) {
		
		Car car = new Car();
		car.run();
		car.stop(); //스탑이 Car에서 private로 막혀있기 때문에 동작이 안됨 그래서 private가 아닌 나머지로 돌려야함.
		
		
		
	}
	
}
