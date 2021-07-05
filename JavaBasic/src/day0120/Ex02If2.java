package day0120;

// 예제
// 1. 사용자로부터 숫자를 입력받아서
//    홀수이면 "홀수입니다." 라고 출력되게 만드세요
// 2. 사용자로부터 나이를 입력받아서
//    성년이면 "성년입니다."를 출력되게 만드세요
// 3. 사용자로부터 아이디와 비밀번호를 입력받아서
//     아이디가 "admin"이고 비밀번호가 "12345"이면
//      "로그인 성공"이 출력되게 만드세요

import java.util.Scanner;
public class Ex02If2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("숫자를 입력하세요: ");
        int number = scanner.nextInt();
        if (number % 2 != 0) { // 또는 == 1
            System.out.println("홀수입니다.");
        }
       
        System.out.print("나이를 입력하세요: ");
        int age = scanner.nextInt();
        if (age >= 20) { //또는 > 19
            System.out.println("성년입니다.");
        }
        
        System.out.print("아이디: ");
        scanner.nextLine();       
        String id = scanner.nextLine();
        
        System.out.print("비밀번호: ");
        String password = scanner.nextLine();
        
        if (id.equals("admin") && password.equals("12345")) {
            System.out.println("로그인 성공");
        }
        
        scanner.close();
        
    }

}