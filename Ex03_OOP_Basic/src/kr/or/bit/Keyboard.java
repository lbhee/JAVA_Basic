package kr.or.bit;

import java.util.Scanner;
public class Keyboard {
    // 입력 옵션값
    static final int OPTION_INSERT = 1;
    // 출력 옵션값
    static final int OPTION_PRINT = 2;
    // 종료 옵션값
    static final int OPTION_END = 3;   

    // 고유속성
    public String button;
    public String led;
    public String brand;

    // 입출력 기능
    public void inputOutput() {
        Scanner scanner = new Scanner(System.in);

        String text = null;

        while(true) {
            System.out.println("1.입력 2.출력 3.종료");
            int userChoice = scanner.nextInt();



            if(userChoice == OPTION_INSERT) {
                System.out.println("입력하세요.");
                scanner.nextLine();
                text = scanner.nextLine();                
            }else if(userChoice == OPTION_PRINT) {
                System.out.println(text);
            }else if(userChoice == OPTION_END) {
                System.out.println("종료되었습니다.");
                break;
            }else {
                System.out.println("잘못입력하셨습니다.");
            }

        }

    }
}