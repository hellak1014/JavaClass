package DowhileExam;
import java.util.Scanner;

public class DoWhileExam {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int value = 0;
		int sum = 0;
		
		
		do {
			value = sc.nextInt();
			sum += value;
		} while (value < 100);
		
		System.out.println("sum:" + sum);
		
	}
	

}
	

