package sec01.exam03;

public class VariableExchangeExample {

	public static void main(String[] args) {
		
		
		int x = 3;
		int y = 5;
		System.out.println("x :" + x + ", y :" + y);
		
		int temp = x; // x값을 temp에 저장. -> temp = 3
		x = y; // y값을 x에 저장. -> y-> x=5
		y = temp; //temp값을 y에 저장 temp -> y = 3
		System.out.println("x:" + x + ", y:" + y);
		
		
	}
	
	
}
