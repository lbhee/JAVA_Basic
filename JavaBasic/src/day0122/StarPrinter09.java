package day0122;

import java.util.Scanner;

public class StarPrinter09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("*****별 찍기 9번*****");
        System.out.print("출력할 줄 수를 입력해주세요: ");
        int userNumber = scanner.nextInt();
        
        for(int i = 1; i <= 2 * userNumber - 1; i++) {
           String stars = new String();
        
           if(i <= userNumber - 1) {   
               
               // 윗부분
               
               // 공백을 담당
               for(int j = 1; j <= userNumber - i; j++) {
                   stars += " ";
               }    
               // 별을 담당    
               for(int j = 1; j <= 2 * i - 1; j++) {
                   stars += "*";
               }               
               
          }else {
              // 아랫부분
              // i -> 5 6 7 8 9
              //   -> 5 4 3 2 1
              // 2 * userNumber - i              
              int lowerI = 2 * userNumber - i;
              
              //  공백을 담당
              for(int j = 1; j <= userNumber - lowerI; j++) {
                  stars += " ";
              }
              
              // 별을 담당
              for(int j = 1; j <= 2 * lowerI - 1; j++) {
                  stars += "*";
              }
          }
          System.out.println(stars); 
        
        }
        scanner.close();
     }
}