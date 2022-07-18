package sec03.exam02;

public class CastingExample {
	
	public static void main(String[] args) {
		
		
		int intValue = 44032; //44032에 맞는 문자형으로 변환(유니코드)
		char charValue = (char) intValue;
		System.out.println(charValue);
		
		long longValue = 500; //long(긴 정수형)이지만 길이가 int에도 맞아서 변환 없이 입력. 
		intValue = (int) longValue;
		System.out.println(intValue);
		
		double doubleValue = 3.14; // double(실수형)을 int(정수형)으로 변환함. 
		intValue = (int) doubleValue;
		System.out.println(intValue);
	}

}
