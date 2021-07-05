package day0121;

// 별찍기 10번

import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("*****별찍기 10번*****");
        System.out.println("출력할 줄 수를 입력하세요");
        int userNumber = scanner.nextInt();
        
        // 1번째 줄 별 담당
        for(int i = 1; i < 10; i++) {
            System.out.print("*");            
        }
        System.out.println();
        
        // 2번~4번째 줄 수 담당
        for(int i = 1; i <= userNumber - 2; i++) {
            String stars = new String();
            
            // 2번~4번째 줄 왼쪽 별 담당
            for(int j = i; j <= userNumber - 1; j++) {
                stars += "*";                
            }
            
            // 2번~4번째 줄 공백 담당
            for(int j = 1; j <= 2*i-1; j++) {
                stars += " ";
            }            
            
            // 2번~4번째 줄 오른쪽 별 담당
            for(int j = i; j <= userNumber - 1; j++) {
                stars += "*";
            }
            System.out.println(stars);
        }
        
        int k = 4;
        
        // 5번~8번째 줄 수 담당
        for(int i = 1; i <= userNumber - 1; i++) {            
            String stars = new String();
            
            // 5번~8번째 줄 왼쪽 별 담당
            for(int j = 1; j <= i; j++) {
                stars += "*";
            }
            
            // 5번~8번째 줄 공백 담당   
            k--;
            for(int j = 1; j <= 2*k+1; j++) {
                
                stars += " ";
            }            
            
            // 5번~8번째 줄 오른쪽 별 담당
            for(int j = 1; j <= i; j++) {
                stars += "*";
            }            
            System.out.println(stars);            
        }
        // 9번째 줄 별 담당
        for(int i = 1; i < 10; i++) {
            System.out.print("*");            
        }
        
        scanner.close();
        }
    }

