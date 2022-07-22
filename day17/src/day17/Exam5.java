package day17;

import java.util.*;

public class Exam5 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("요소수 :");
		
		int no = sc.nextInt();
		
		int[]arr = new int[no];
		
		for(int i = 0; i<no; i++) {
			System.out.print("a[" + i + "] =");
			int arrno = sc.nextInt();
			
			arr[i] = arrno;
		}
		System.out.print("a = {");
		for (int i = 0; i <arr.length-1; i++) {
			System.out.print(arr[i] +" ,");
			}
		System.out.print( arr[arr.length-1] + "}");
	}

}
