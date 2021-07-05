package day0122;

import java.util.Scanner;

public class StarPrinter08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //사용자 숫자 입력
        System.out.println("*****별 찍기 8번*****");
        System.out.print("출력할 줄 수를 입력해주세요: ");
        int userNumber = scanner.nextInt();
        
        // 윗부분 아랫부분 나누지 않고 한번에 총 9줄이 나와야하므로 
        for(int i = 1; i <= 2 * userNumber - 1; i++) {
            String stars = new String();
            
            // if else문을 사용해서 윗부분과 아랫부분을 나눈다
            if(i <= userNumber - 1) {
                // 윗부분
                
                // 공백을 담당하는 j for문
                for(int j = 1; j <= userNumber - i; j++) {
                    stars += " ";
                }
                
                // 별을 담당하는 j for문
                for(int j = 1; j <= i; j++) {
                    stars += "*";
                }                
                
        }else {
                // 5가 되어 else로 넘어온 i를
                // 1, 2, 3, 4, 5로 쓰기위해 변수를 하나 더 만들어줌
                int lowerI = i - userNumber + 1;
                
                // 공백을 담당하는 j for문
                for(int j = 1; j <= lowerI - 1; j++) {
                    stars += " ";
                }
                
                // 별을 담당하는 j for문
                for(int j = lowerI; j <= userNumber; j++) {
                    stars += "*";
                }                
            }
            System.out.println(stars);
            
        }//  i for문 종료
        scanner.close();
        
    }//  메인함수 종료
}// 클레스 종료