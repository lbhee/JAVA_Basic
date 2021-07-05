package day0126;

// 사용자로부터 로또 번호를 입력받는 프로그램
// 단 해당번호가 중복이거나 1~45를 벗어나는 값이면
// 다시 입력받도록 만드시오.

import java.util.Scanner;
public class Ex02LottoNumbers1 {
    
    static final int SIZE = 6;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] lottoNumbers = new int[SIZE];
        
        // 칸에 숫자 넣기
        for(int i = 0; i < lottoNumbers.length; i++) {
            System.out.print(i+"번째 숫자를 입력해주세요: ");
            int userNumber = scanner.nextInt();
            
            // 입력 숫자 범위
            while(userNumber < 1 || userNumber > 45) {
                System.out.println("1~45 사이의 값을 입력하세요.");
                System.out.print(i+"번째 숫자를 입력해주세요: ");
                userNumber = scanner.nextInt();
            }
            // 중복값 제거
            for(int j = 0; j < lottoNumbers.length; j++) {
                if(userNumber == lottoNumbers[j]) {
                    System.out.println("중복된 값입니다.");
                    
                    System.out.print(i+"번째 숫자를 입력해주세요: ");
                    userNumber = scanner.nextInt();
                    
                    while(userNumber < 1 || userNumber > 45) {
                        System.out.println("1~45 사이의 값을 입력하세요.");
                        System.out.print(i+"번째 숫자를 입력해주세요: ");
                        userNumber = scanner.nextInt();
                    }
                    
                    j = -1;
                }
            } 
            // 칸에 사용자 입력값 넣기
            lottoNumbers[i] = userNumber;
        }
        // 정렬
        for(int i = 0; i < lottoNumbers.length- 1 ; i++) {
            if(lottoNumbers[i] > lottoNumbers[i+1]) {
                int temp = lottoNumbers[i];
                lottoNumbers[i] = lottoNumbers[i+1];
                lottoNumbers[i+1] = temp;
                i = -1;
            }
        }
        // 출력
        for(int i = 0; i < lottoNumbers.length; i++) {
           System.out.print(lottoNumbers[i]+" ");
        }
        
        
        scanner.close();
    }
}
