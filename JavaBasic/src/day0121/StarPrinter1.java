package day0121;

// 번호 하나당 클래스 하나가 나온다
// 모든 별찍기는 사용자로부터 입력을 받아서
// 입력받은 수만큼의 줄 수가 출력된다.
// 가정 : 사용자가 5라고 입력

// 별찍기 1번

import java.util.Scanner;
public class StarPrinter1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("*****별찍기 1번*****");
        System.out.println("출력할 줄 수를 입력하세요");
        int userNumber = scanner.nextInt();
        
        // i for문은 총 몇줄이 출력될지 결정하게 된다.
        for(int i = 1; i <= userNumber; i++) {
            // 해당 줄의 출력내용을 저장할 String변수
            String stars = new String();
            
            // j for문은 해당 줄의 어떤 내용이 출력될지를 결정하게 된다.
            for(int j = 1; j <= i; j++) {
                stars += "*";
            }
            System.out.println(stars);
        }
        scanner.close();
        
    }

}
