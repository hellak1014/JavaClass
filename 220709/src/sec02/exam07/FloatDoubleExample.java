package sec02.exam07;

public class FloatDoubleExample {

	public static void main(String[] args) {
		
		
		//실수값 저장
//		float var1 = 3.14; 반복되는 소수를 float으로 출력하면 자릿수가 넘기때문에 컴파일 에러가 뜬다
		float var2 = 3.14f; 
		double var3 = 3.14;
		
		
		//정밀도 테스트
		float var4 = 0.1234567890123456789f;
		double var5 = 0.1234567890123456789;
		
		System.out.println("var2: " + var2); //그래서 이렇게 끝에 f를 붙여서 float자리까지만 출력시켜야 한다.
		System.out.println("var3 " + var3);
		System.out.println("var4 " + var4);
		System.out.println("var5 " + var5); //float보다 2배이상 정말한 값으로 출력.
		
		
		
		//e사용하기
		double var6 = 3e6;
		float var7 = 3e6F;
		double var8 = 2e-3;
		
		System.out.println("var6 " + var6);
		System.out.println("var7 " + var7);
		System.out.println("var8 " + var8);
		
		

	}

}
