package day0122;

import java.util.Scanner;

public class Hw1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //사용자 숫자 입력
        System.out.println("*****별 찍기 8번*****");
        System.out.print("출력할 줄 수를 입력해주세요 > ");
        int userNumber = scanner.nextInt();
        
        //위 삼각형 담당
        for(int i = 1; i <= userNumber - 1; i++) {
            String stars = new String();
            for(int j = 1; j <= userNumber - i; j++) {
                stars+=" ";
            }
            for(int j = 1; j <= i; j++) {
                stars += "*";
            }
            System.out.println(stars);
        }
        //아래 삼각형 담당
        for(int i = 1; i <= userNumber; i++) {
            String stars = new String();
            for(int j = 1; j <= i - 1; j++) {
                stars += " ";
            }
            for(int j = i; j<= userNumber; j++) {
                stars += "*";
            }
            System.out.println(stars);
        }
        scanner.close();
    }// 메인함수 종료
}
