package ex01;

import java.util.*;
public class ex01 {
    public static void main(String[] args) {
    	
        int input = 0, answer = 0;

        answer = (int)(Math.random() * 100) + 1;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("1~100 number? >");
            input = scanner.nextInt();

            if(input > answer) {
                System.out.println("low");
            } else if(input<answer) {
                System.out.println("more big");
            }
        } while(input!=answer);
        System.out.println("succes.");
    }
    
}