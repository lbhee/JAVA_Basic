package day0119;

// 숙제3
// 사용자로부터 생년, 생월, 생일을 따로따로 입력 받아서
// 형식에 맞추어 출력해보도록 합니다.
// 심화과정: 사용자가 생년, 생월, 생일을 따로따로 입력하면
//         주민등록번호의 앞자리처럼 처리를 해봅시다.

import java.util.Scanner;
public class Homework3 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("생년: ");
        int year = scanner.nextInt();
        System.out.println("생월: ");
        int month = scanner.nextInt();
        System.out.println("생일: ");
        int day = scanner.nextInt();
        
        System.out.printf("당신은 %d년 %d월 %d일 생입니다.\n", year, month, day);
        System.out.printf("주민등록번호 : %d%d%d - ", year%100, month, day);    
        
        scanner.close();
    }
}
