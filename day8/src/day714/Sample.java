package day714;

public class Sample {
	void varTest(int a) {
		a++;
		
	}
	
	
	public static void main(String[] args) {
		int a = 1;
		Sample sample = new Sample();
		sample.varTest(a);
		System.out.println(a);
	}
	
} //답이 2가 아닌 이유 : 위에 a++에서 중괄호가 닫혀서 ++값을 가지고 나올 수가 없다. -> 답은 1
