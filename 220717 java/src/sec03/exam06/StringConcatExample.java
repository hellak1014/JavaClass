package sec03.exam06;

public class StringConcatExample {

	public static void main(String[] args) {
		
		
		int value = 10 + 2 + 8;
		System.out.println("value: " + value); //더한 값
		
		String str1 = 10 + 2 + "8";
		System.out.println("str1: " + str1); //10+2를 더하고 8을 글자로 인식
		
		String str2 = 10 + "2" + 8;
		System.out.println("str2: " + str2); //10에 2을 글자로 인식하고 8을 숫자로 인식
		
		String str3 = "10" + 2 + 8;
		System.out.println("str3: " + str3); 
		
		String str4 = "10" + (2 + 8);
		System.out.println("str4: " + str4); //10을 글자로 인식하고 2랑 8을 더해서 글자로 인식
	}
	
} //숫자를 글자로 인식 하고 있다. 
