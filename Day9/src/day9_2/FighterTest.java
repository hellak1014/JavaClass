package day9_2;

public class FighterTest {
	
	public static void main(String[] args) {
		
		Fighter f = new Fighter();
		
		if (f instanceof Unit) //unit의 객체니? 맞다. 상속받음. (자손)
			System.out.println("f는 Unit클래서의 자손입니다.");
		if (f instanceof Fightable) //Fightable의 객체니? 응 
			System.out.println("f는 Fightable인터페이스를 구현했습니다.");
		if (f instanceof Movable) //마즘
			System.out.println("f는 Movable인터페이스를 구현했습니다.");
		if (f instanceof Attackable)//마즘
			System.out.println("f는 Attackable인터페이스를 구현했습니다.");
		if (f instanceof Object) //단군할아버지
			System.out.println("f는 Object클래스의 자손입니다.");
		
	}

}
