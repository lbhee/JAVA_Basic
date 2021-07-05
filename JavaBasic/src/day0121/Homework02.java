package day0121;

// 별찍기 9번

import java.util.Scanner;

public class Homework02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("*****별찍기 9번*****");
        System.out.println("출력할 줄 수를 입력하세요");
        int userNumber = scanner.nextInt();
        
        // 윗부분 담당
        for(int i = 1; i <= userNumber - 1; i++) {
            String stars = new String();
            
            // 윗부분 공백 담당 
            for(int j = 1; j <= userNumber-i; j++) {
                stars += " ";
            }
            
            // 윗부분 별 담당
            for(int j = 1; j <= 2*i-1; j++) {
                stars += "*";
            }
            System.out.println(stars);
        }
        
        // 아랫부분 담당
        for(int i = userNumber; i >= 1; i--) {
            String stars = new String();
            
            // 아랫부분 공백 담당
            for(int j = 1; j <= userNumber-i; j++) {
                stars += " ";
            }
            
            // 아랫부분 별 담당
            for(int j = 1; j <= 2*i-1; j++) {
                stars += "*";
            }
            System.out.println(stars);
        }
        
        scanner.close();
    }

}
