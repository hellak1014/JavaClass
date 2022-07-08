package FactorialTest;

public class FactorialTest {
	public static void main(String[] args) {
		
		int result = factorial(4);
		
		System.out.println(result);
	
}
	
	static int factorial(int n) {
		int result = 0;
		
		if (n == 1)
			result = 1;
		else
			result = n * factorial(n-1);
		
		return result;
	}
	
}


/* n이 1이 될때까지 팩토리얼 돌리기.
근데 이제 자기 자신을 넣어서 돌리는것. 


모든 인스턴스에 공통된 값을 유지해야 하는게 있으면 static을 사용하는걸 고려해봐라.
*/