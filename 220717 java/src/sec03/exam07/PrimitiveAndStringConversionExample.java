package sec03.exam07;

public class PrimitiveAndStringConversionExample {

	public static void main(String[] args) {

		int value1 = Integer.parseInt("10");
		double value2 = Double.parseDouble("3.14");
		boolean value3 = Boolean.parseBoolean("true");
		
		System.out.println("value1: " + value1);
		System.out.println("value2: " + value2);
		System.out.println("value3: " + value3);
		
		
		String str1 = String.valueOf(10); //기본타입의 값을 문자열로 변경하는 경우도 있는데, 이때 String.valueOf를 사용한다. 
		String str2 = String.valueOf(3.14);
		String str3 = String.valueOf(true);
		
		System.out.println("str1: " + str1);
		System.out.println("str2: " + str2);
		System.out.println("str3: " + str3); // 여기 3개의 값은 모두 문자열로 출력된 값이다. 
		
		
	}

}
