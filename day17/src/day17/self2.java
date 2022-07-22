package day17;

import java.util.*;

public class self2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[]arr = new int[10];
		int i;
		
		System.out.println("숫자 10개를 입력해주세요.");
		for (i=0; i<arr.length; i++) {
			int no = sc.nextInt();
			arr[i] = no;
		}
		
		System.out.print("{");
		for (int j = 0; j <arr.length-1; j++) {
			System.out.print(arr[j] + ",");
		}
		System.out.print(arr[arr.length-1] + "}");
	}

}
