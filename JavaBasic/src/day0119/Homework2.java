package day0119;

// 숙제2
// 사용자로부터 숫자 2개를 입력받아서 산술연산한 결과값을 출력하는 프로그램을 작성하세요

import java.util.Scanner;
public class Homework2 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("숫자를 두개 입력하세요.");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        
        System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
        System.out.println(num1 + " - " + num2 + " = " + (num1-num2));
        System.out.println(num1 + " * " + num2 + " = " + (num1*num2));
        System.out.println(num1 + " / " + num2 + " = " + (num1/num2));
        System.out.println(num1 + " % " + num2 + " = " + (num1%num2));
        
        scanner.close();
    }    
}
