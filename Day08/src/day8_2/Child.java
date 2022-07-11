package day8_2;

public class Child extends Parent {

	void method() {
		
		System.out.println("x=" + x); //자식은 부모걸 갖다 썼음. 
		System.out.println("this.x=" + this.x); 
		System.out.println("super.x="+ super.x); //super는 부모를 직접 가르킴. 
		
	}
	
	
}
