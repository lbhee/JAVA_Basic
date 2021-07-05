package day0120;

// 2. 사용자로부터 나이를 입력받아서
//      ~5: 영아
//      ~13: 어린이
//      ~18: 청소년
//      19~: 성인
//    이 출력되는 프로그램

import java.util.Scanner;
public class Ex07IfElseIf3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.err.print("나이: ");
        int age = scanner.nextInt();
        
        if(age <= 5) {
            System.out.println("영아");
        }else if(age <= 13) {
            System.out.println("어린이");
        }else if(age <= 18) {
            System.out.println("청소년");
        }else if(age >= 19) {
            System.out.println("성인");
        }
        
        scanner.close();
    }
}
