package Day6_10;

public class CarTest2 {
	public static void main(String[] args) {
	
		Car c1 = new Car(); //암것도 없어서 바로 17번으로 가서 출력
		Car c2 = new Car("blue"); //1개짜리 친구 이기 때문에 Car 13번으로 가서 컬러 거쳤다가 17번으로 가서 출력
		
		System.out.println("c1의 color=" + c1.color + ", gearType=" + c1.gearType+ ", door="+c1.door);
		System.out.println("c2의 color=" + c2.color + ", gearType=" + c2.gearType+ ", door="+c2.door);
}
}
