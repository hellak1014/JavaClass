package day8;

import java.util.Scanner;

public class DoWhileExam {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int value = 0;
		int sum = 0;
		
		
		do {
			value = scan.nextInt();
			sum += value;
		} while (value < 100);
		
		System.out.println("sum:" + sum);
		
		scan.close();

	}
	
	

}
	

