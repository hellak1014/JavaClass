package day717;

public class Animal {

	String name;
	
	void setName(String name) {
		this.name = name;
	}
}


class Dog extends Animal {
	void sleep() {
		System.out.println(this.name + " zzz");
	}
}

class HouseDog extends Dog {
	HouseDog(String name) {
		this.setName(name); //글자 생성자
	}
	
	HouseDog(int type) { //숫자 생성자
		if (type == 1) {
			this.setName("yorkshire");
		} else if (type == 2) {
			this.setName("bulldog");
		}
	}
	
	
	void sleep() {
		System.out.println(this.name + " zzz in house:");
	}
	
	
	void sleep(int hour) {
		System.out.println(this.name + " zzz in house for " + hour + " hours");
	}
}
	
