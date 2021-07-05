package day0120;

// 숙제 2
// 사용자로부터 점수를 입력받아 A, B, C, D, F 를 출력하는 프로그램을 작성하세요.
// 단, 잘못된 점수가 입력되면 올바른 점수가 입력될때까지 다시 입력을 받으세요.

import java.util.Scanner;
public class Homework2 {
    
    static final int CUT_LINE_A = 90;
    static final int CUT_LINE_B = 80;
    static final int CUT_LINE_C = 70;
    static final int CUT_LINE_D = 60;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("점수: ");
        int score = scanner.nextInt();
        
        while(score < 0) {
            System.out.println("점수를 다시 입력해주세요.");
            System.out.println("점수: ");
            score = scanner.nextInt();
        }
        
        if(score >= CUT_LINE_A) {
            System.out.println("A");
        }else if(score >= CUT_LINE_B) {
            System.out.println("B");           
        }else if(score >= CUT_LINE_C) {
            System.out.println("C");
        }else if(score >= CUT_LINE_D) {
            System.out.println("D");
        }else {
            System.out.println("F");
        }      
        
        scanner.close();
    }
}
