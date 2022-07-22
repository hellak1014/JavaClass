package day17;

import java.util.*;

public class self3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int[]arr = new int[10];
		int i;
		
		System.out.print("숫자 10개를 입력해주세요.");
		
			for (i=0; i<arr.length; i++) {
				int no = sc.nextInt();
				arr [i] = no;
			}
			
			System.out.println("3, 5, 10번째 숫자를 출력합니다.");
			System.out.println(arr[2]+ ", " + arr[4]+ ", "+ arr[9]);
		
			
			

	}

}
