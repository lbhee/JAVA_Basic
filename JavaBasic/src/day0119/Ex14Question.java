package day0119;

import java.util.Scanner;

//숙제1. 사용자로부터 키와 몸무게를 입력받아서
//BMI 수치를 어느정도 형식에 맞추어 출력하시오
//BMI 계산 방법은 몸무게 / 키 / 키 입니다.

//숙제2. 사용자로부터 숫자 2개를 입력받아서 산술연산한 결과값을 출력하는
//프로그램을 작성하세요

//숙제3. 사용자로부터 생년, 생월, 생일을 따로따로 입력 받아서
//형식에 맞추어 출력해보도록 합니다.
//심화과정: 사용자가 생년, 생월, 생일을 따로따로 입력하면
//      주민등록번호의 앞자리처럼 처리를 해봅시다.

public class Ex14Question {
    public static void main(String[] args) {
        // 숙제1
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("키: ");
        int height = scanner.nextInt();
        System.out.print("몸무게: ");
        int weight = scanner.nextInt();
        
        double bmi = (double)weight / height / height;
        System.out.printf("당신의 BMI 수치는 %f입니다.\n", bmi);
        
        System.out.println();
        System.out.println("=================================");
        System.out.println();
        
        // 숙제 2
        System.out.println("숫자를 두개 입력하세요.");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        
        System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
        System.out.println(num1 + " - " + num2 + " = " + (num1-num2));
        System.out.println(num1 + " * " + num2 + " = " + (num1*num2));
        System.out.println(num1 + " / " + num2 + " = " + (num1/num2));
    
        System.out.println();
        System.out.println("=================================");
        System.out.println();
        
        // 숙제 3
        System.out.println("생년: ");
        int year = scanner.nextInt();
        System.out.println("생월: ");
        int month = scanner.nextInt();
        System.out.println("생일: ");
        int day = scanner.nextInt();
        
        System.out.printf("당신은 %d년 %d월 %d일 생입니다.\n", year, month, day);
        System.out.printf("주민등록번호 : %d%d%d - ", year%100, month, day);
    }
}
