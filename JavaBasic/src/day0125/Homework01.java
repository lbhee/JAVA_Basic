package day0125;

// 숙제
// 가위바위보 게임을 만드세요
// 가위 : int 1
// 바위 : int 2
// 보 : int 3

// 예시 : 
// 가위바위보 중 하나를 선택해주세요(가위:1 바위:2 보:3)
// 5 -> 잘못입력하셨습니다.
// 가위바위보 중 하나를 선택해주세요(가위:1 바위:2 보:3)
// 2
// 사용자: 바위
// 컴퓨터: 가위
// 사용자 승!
// 현재전적 : 1승 3무 2패
// 1. 플레이 2. 현재전적보기 3.종료
// 2 -> 현재전적은 1승 3무 2패입니다. 승률은 16.6667퍼센트 입니다.
// 1. 플레이 2. 현재전적보기 3.종료
// 3. 3 -> 사용해주셔서 감사합니다.

import java.util.Scanner;
import java.util.Random;
public class Homework01 {
    static final int SCISSORS = 1;
    static final int ROCK = 2;
    static final int PAPER = 3;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        //전적
        int win = 0;
        int draw = 0;
        int loss = 0;
        
        while(true) {
            System.out.println("1.플레이 2.현재전적 보기 3.종료");
            int userChoice1 = scanner.nextInt();             
            
            //플레이
            if(userChoice1 == 1) {
                
            System.out.println("1:가위 2:바위 3:보");
            int userChoice2 = scanner.nextInt();                
            int computerChoice = random.nextInt(3) + 1;
                        
                // 무승부 
                if(userChoice2 == computerChoice) {
                    System.out.println("사용자: "+userChoice2);
                    System.out.println("컴퓨터: "+computerChoice);
                    System.out.println("무승부!");                    
                    draw++;                    
                    
                // 승    
                }else if(userChoice2 == SCISSORS && computerChoice == PAPER
                        || userChoice2 == ROCK && computerChoice == SCISSORS
                        || userChoice2 == PAPER && computerChoice == ROCK) {
                    System.out.println("사용자: "+userChoice2);
                    System.out.println("컴퓨터: "+computerChoice);
                    System.out.println("사용자 승!");                    
                    win++;                    
                    
                // 패    
                }else {
                    System.out.println("사용자: "+userChoice2);
                    System.out.println("컴퓨터: "+computerChoice);
                    System.out.println("컴퓨터 승!");                   
                    loss++;                    
                }
                
             // 현재전적 보기   
            }else if(userChoice1 == 2) {
                
                    double winningRate = (double)win/(win+draw+loss)*100;
                
                    if(win == 0 && draw == 0 && loss == 0) {
                        System.out.println("아직 플레이 기록이 없습니다.");                    
                    }else {
                        System.out.printf("%d승 %d무 %d패\n", win, draw, loss);
                        System.out.printf("승률은 %.4f퍼센트 입니다.\n", winningRate);
                    }
             
             // 종료       
            }else if(userChoice1 == 3) {
                  System.out.println("플레이해주셔서 감사합니다.");
                  break;
                }
            
        }        
        scanner.close();
    }
}
