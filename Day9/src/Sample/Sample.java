package Sample;


	
	interface Predator{
		String getFood();
	}

	
	class Animal{
		String name;
		
		void setName(String name) {
			this.name = name;
		}
	}
	
	class Tiger extends Animal implements Predator{
		public String getFood() {
			return "apple";
		}
	
}
	
	class Lion extends Animal implements Predator{
		public String getFood() {
			return "banana";
		}
		
	}
	
	class ZooKeeper{
		void feed(Predator predator) {//호랑이가 오면 사과를 던져준다.
		System.out.println("feed "+predator.getFood());
}
	}


	public class Sample {

	public static void main(String[] args) {
		
		ZooKeeper zooKeeper = new ZooKeeper();
		Tiger tiger = new Tiger();
		Lion lion = new Lion();
		zooKeeper.feed(tiger);
		zooKeeper.feed(lion);
	}
}
	
	//인터페이스는 명세표다 -> 너희 없애준 대신 나를 거치면 내 형식에 맞는 몸통을 만들어내라. 
	//인터페이스는 여러개의 클래스의 자료형을 하나로 받을 수 있다.
	//인터페이스... 잔상? 잔상에 맞춰서 클래스 작성?
	