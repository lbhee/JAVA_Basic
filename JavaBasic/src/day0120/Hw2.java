package day0120;

// 숙제2 확인
// 사용자로부터 숫자 2개를 입력받아서 산술연산한 결과값을 출력하는 프로그램을 작성하세요

import java.util.Scanner;
public class Hw2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("첫 번째 숫자 입력 : ");
        int num1 = scanner.nextInt();
        System.out.println("두 번째 숫자 입력 : ");
        int num2 = scanner.nextInt();
        System.out.println("첫 번째 숫자 더하기 두 번째 숫자 : " + (num1 + num2));
        System.out.println("첫 번째 숫자 빼기 두 번째 숫자 : " + (num1 - num2));
        System.out.println("첫 번째 숫자 곱하기 두 번째 숫자 : " + (num1 * num2));
        System.out.println("첫 번째 숫자 나누기 두 번째 숫자 : " + ((double)num1 / (double)num2));
        System.out.println("첫 번째 숫자 나누기 두 번째 숫자의 나머지 : " + (num1 % num2));
        
        scanner.close();
        
    }

}
