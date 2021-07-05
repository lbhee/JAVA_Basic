package day0121;

// 힌트 : 5번과 6번은 변수의 선언 위치를 고민해보시오.

import java.util.Scanner;
public class Ex02For2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 1번. 1부터 10까지 출력되는 for문        
        System.out.println("------ 1번 -----"); 
        
        int start = 1;
        int end = 10;        
        for(int i = start; i <= end; i++) {
            System.out.println(i);
        }
                
        // 2번. 8부터 3까지 출력되는 for문
        System.out.println("------ 2번 -----");
        
        start = 8;
        end = 3;
        for(int i = start; i >= end; i--) {
            System.out.println(i);
        }
                
        // 3번. 사용자로부터 시작되는 숫자와 끝 숫자를 입력받아서 차례대로
        System.out.println("------ 3번 -----");
        
        System.out.println("시작 지점: ");
        start = scanner.nextInt();
        System.out.println("끝 지점: ");
        end = scanner.nextInt();      
        if(start <= end) {
           for(int i = start; i <= end; i++) {
               System.out.println(i);
           }
        }else {
            for(int i = start; i >= end; i--) {
                System.out.println(i);
            }
        }
        
        // 4번. 사용자로부터 숫자를 하나 입력받아서 1부터 그 수까지의 홀수
        System.out.println("------ 4번 -----");
        
        start = 1;
        System.out.println("숫자를 입력해주세요: ");
        end = scanner.nextInt();
        for(int i = start; i <= end; i += 2) {
            System.out.println(i);
        }// i++, if(i % 2 == 1)를 사용해도 된다.        
        
        // 5번. 사용자로부터 숫자를 하나 입력받아서 1부터 그 수까지의 합
        System.out.println("------ 5번 -----");
        
        start = 1;
        System.out.println("숫자: ");
        end = scanner.nextInt();
        int sum = 0;
        for(int i = start; i <= end; i++) {
            sum += i;
        }
        System.out.printf("1부터 %d 까지의 합: %d\n", end, sum);
        
        // 6번. 사용자로부터 숫자를 하나 입력받아서 1부터 그 수 까지 곱
        System.out.println("------ 6번 -----");
        
        start = 1;
        System.out.print("숫자: ");
        end = scanner.nextInt();
        int factorial = 1;
        
        if(end >= 13) {
            System.out.println("오버플로우가 발생하여 정확한 결과를 출력할 수 없습니다.");
        }else {                    
            for(int i = start; i <= end; i++) {
                factorial *= i;
            }
            System.out.printf("1부터 %d까지의 곱: %d\n", end, factorial);
        }
        
        
        
        scanner.close(); 
        }
       
            
       
             
        
        
        
        
    }

