package day9_4;

public class RapairableTest {

	public static void main(String[] args) {
	
				Tank tank = new Tank();
				Dropship dropship = new Dropship();
				
				Marine marine = new Marine();
				SCV scv = new SCV();
				
			scv.repair(tank);
			scv.repair(dropship);
//			scv.repair(marine); //scv가 마린을 고치는걸 허락받지 못했다. 
				
	}
	
}
