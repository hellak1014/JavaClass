package day11_3;

import java.util.HashMap;

public class Sample {

	public static void main(String[] args) {

		HashMap<String, String> map = new HashMap<>();
		map.put("people", "사람");
		map.put("base ball", "야구");
		
		System.out.println(map.get("people"));
		
	}

}
