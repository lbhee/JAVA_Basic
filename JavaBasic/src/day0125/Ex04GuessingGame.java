package day0125;

// 컴퓨터가 만들어낸 1~100 사이의 랜덤한 숫자를
// 사용자가 몇번만에 맞추는지 기록하는 
// 숫자맞추기 게임
// 조건1. 무한루프를 사용해서 사용자가 
//       1을 누르면 게임시작
//       2를 누르면 최고점수 보기
//       3을 누르면 게임종료가 될수 있도록
//       프로그램을 작성하시오.
//       단 최고점수는 가장 적은 횟수로 숫자를 맞춘 횟수이다.
//       사용자가 입력한 숫자가 컴퓨터의 숫자보다 크면 DOWN, 작으면 UP 출력
//       사용자가 컴퓨터의 숫자를 맞출때까지 계속 입력을 받도록 합니다.
// 힌트1. 최고점수는 어떻게 기록해야할까?
//       최고점수는 맨 처음 플레이하면 어떤게 최고점수가 될까?
// 힌트2. random.nextInt(최대값)을 입력하면
//       0부터 최대값-1 까지의 값이 랜덤하게 나온다.
//       그렇다면 어떻게해야 1~최대값의 범위가 나오게 만들수 있을까?
//       random.nextInt(10) -> 0 1 2 3 4 5 6 7 8 9
//       random.nextInt(10) + 1 -> 1 2 3 4 5 6 7 8 9 10

import java.util.Scanner;
import java.util.Random;
public class Ex04GuessingGame {
    static final int MAX = 100;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        // 최고기록을 저장할 int변수
        int bestScore = 0;
        
        while(true) {
            System.out.println("1.플레이 2.최고기록 보기 3.종료");
            int userChoice = scanner.nextInt();
            if(userChoice == 1) {
                // 플레이
                
                // 사용자의 이번 점수를 저장할 int 변수 선언
                int currentScore = 1;
                
                System.out.print("숫자를 입력하세요: ");
                int userNumber = scanner.nextInt();
                
                // random 을 사용하여 1~100 사이의 난수 생성
                int computerNumber = random.nextInt(MAX) + 1;
                
                while(userNumber != computerNumber) {
                    
                    if(userNumber > computerNumber) {
                        System.out.println("DOWN");
                    }else {
                        System.out.println("UP");
                    }
                    
                    System.out.print("숫자를 입력하세요: ");
                    userNumber = scanner.nextInt();
                    currentScore++;
                }
                System.out.println("정답!");
                System.out.println("이번 플레이의 점수는 "+currentScore+"입니다.");
                
                // 최고기록을 확인하여 필요하다면
                // 현재점수로 최고기록을 바꿔준다.
                // 최고기록을 현재기록으로 바꿔주는건 2가지 경우이다.
                // 1. 처음 플레이 할 때
                // 2. 최고기록이 현재기록보다 클 때
                if(bestScore == 0 || bestScore > currentScore) {
                    bestScore = currentScore;
                    System.out.println("신기록입니다.");
                    }
                
            }else if(userChoice == 2) {
                // 최고기록 보기
                    if(bestScore == 0) {
                        System.out.println("아직 플레이 기록이 없습니다.");                    
                    }else {
                        System.out.println("현재 최고 기록: "+bestScore);
                    }
                    
            }else if(userChoice == 3) {
                  System.out.println("플레이해주셔서 감사합니다.");
                  break;
                }
            
        }        
        scanner.close();
    }
}
