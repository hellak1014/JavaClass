
public class Exam1Java {

	public static void main(String[] args) {
//		int a = 4 / 0; //by zero
//		//정수를 0으로 나누면 에러가 나지만 실수로 나누면 에러가 안난다. 
		
		try {
		int[] a = {1, 2, 3};
		System.out.println(a[3]);
		} catch(ArrayIndexOutOfBoundsException e) { //에러명
			System.out.println("에러가 발생했습니다."); //해줘야 할일. 
		} finally {
			System.out.println("에러가 생기든 안생기든 항상 처리된다."); //finally는 에러 유무에 상관 없이 항상 처리된다. 
		}
		
	
	
}
	
}
