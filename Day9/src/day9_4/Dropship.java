package day9_4;

class Dropship extends AirUnit implements Repairable{
	Dropship() {
		super(125); //Dropship의 Hp는 125다.
		hitPoint = MAX_HP;
	}
	
	public String toString() {
		return "Dropship";
	}
	
}
