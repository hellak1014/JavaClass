package day702;

import java.util.ArrayList;

public class ex1 {
	public static void main(String[] args) {
		
		ArrayList<String> pocket = new ArrayList<String>();
		pocket.add("paper");
		pocket.add("handphone");
		pocket.add("money");
		
		if (pocket.contains("money")) {
			System.out.println("택시를 타고가라");
		} else {
			System.out.println("걸어가라");
		}
		
		
		
		
	}

}
