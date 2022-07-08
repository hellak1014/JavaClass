package day6_2;

public class cardtest {

	public static void main(String[] args) {
		// 클래스 변수는 객체 생성 없이도 바로 호출 가능하다.하지만 잘 쓰진 않음. 
		System.out.println("card width = " + card.width);
		System.out.println("card height = " + card.height);
		
		//인스턴스 변수는 개겣를 생성해야만 호출 가능하다.
		card c1 = new card();
		c1.kind = "Heart";
		c1.number = 7;
		
		card c2 = new card();
		c2.kind = "Spade";
		c2.number = 4;
		
		//찍은 객체마다 변수를 다르게 유지 할수 있다는게 포인트. 
		
		
		System.out.println("c1은" + c1.kind + ", " + c1.number + "이며 크기는 (" + c1.width + ", " + c1.height + ")");
				
		System.out.println("c2은" + c2.kind + ", " + c2.number + "이며 크기는 (" + c2.width + ", " + c2.height + ")");
		
		System.out.println("c1의 width와 height을 50, 80으로 변경");
		c1.width = 50;
		c1.height = 80;
		
		System.out.println("c1은" + c1.kind + ", " + c1.number + "이며 크기는 (" + c1.width + ", " + c1.height + ")");
		
		System.out.println("c2은" + c2.kind + ", " + c2.number + "이며 크기는 (" + c2.width + ", " + c2.height + ")");
		
		//이 경우, 클래스 변수를 변경했기 때문에 c2도 같이 출력 값이 변경된다.
		
	}

}
