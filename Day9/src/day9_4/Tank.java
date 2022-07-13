package day9_4;

public class Tank extends GroundUnit implements Repairable{


	Tank() {
		super(150); //tank의 HP는 150이다. 
		hitPoint = MAX_HP;
	}
	
	public String toString() {
		return "Tank";
}

}