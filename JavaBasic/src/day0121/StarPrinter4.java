package day0121;

// 별찍기 4번

import java.util.Scanner;
public class StarPrinter4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("*****별찍기 4번*****");
        System.out.println("출력할 수를 입력하세요.");
        int userNumber = scanner.nextInt();
        
        for(int i = 1; i <= userNumber; i++) {
            String stars = new String();
            
            // 공백을 담당하는 j for 문
            for(int j = 1; j <= i - 1; j++) {
                stars += " ";
            }
            
            // 별을 담당하는 j for 문
            for(int j = i; j <= userNumber; j++) {
                stars += "*";
            }
            System.out.println(stars);
        }
        
        scanner.close();
    }
}
