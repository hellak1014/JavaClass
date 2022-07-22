package day17;

import java.util.*;

public class self1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[5];
		int i;
		
		System.out.print("숫자 5개를 입력해주세요.");
			for (i=0; i<arr.length; i++) {
				int no = sc.nextInt();
				arr[i] = no;
			}
			
				for (int j = 0; j<arr.length; j++) {
					System.out.print(arr[j]);
				}

	}

}
