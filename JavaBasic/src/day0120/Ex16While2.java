package day0120;

// 사용자로부터 "자연수"만 입력받는 프로그램.
// 만약 사용자가 자연수가 아닌 숫자를 입력하면?
// 자연수를 입력할 때까지 다시 입력을 받는다.

import java.util.Scanner;
public class Ex16While2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("자연수를 입력하세요: ");
        int number = scanner.nextInt();
        
        
        while(number < 0) {
            System.out.println("자연수가 아닙니다. 다시 입력해주세요.");
            System.out.println("자연수를 입력하세요: ");
            number = scanner.nextInt();
        }
        
        System.out.println("사용자가 입력한 자연수: " +number);
        
        scanner.close();
    }
}