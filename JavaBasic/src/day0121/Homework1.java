package day0121;

// 별찍기 8번

import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("*****별찍기 8번*****");
        System.out.println("출력할 줄 수를 입력하세요");
        int userNumber = scanner.nextInt();
        
        // 윗부분 담당
        for(int i = 1; i <= userNumber - 1; i++) {
            String stars = new String(); // -> stars = "";
            
            // 윗부분 공백 담당
            for(int j = 1; j <= userNumber - i; j++) {
                stars += " "; 
            }
            // 윗부분 별 담당
            for(int j = 1; j <= i; j++) {
                stars += "*";
            }
            System.out.println(stars);
        }
        
            
         // 아랫부분을 담당  
         for(int i = 1; i <= userNumber; i++) {
             String stars = new String();
             
             // 아랫부분 공백 담당
             for(int j = 1; j <= i - 1; j++) {
                 stars += " ";
             }        
             // 아랫부분 별 담당
             for(int j = i; j <= userNumber; j++) {
                 stars += "*";
             }
             System.out.println(stars);
         }
         
         scanner.close();
    }
}
