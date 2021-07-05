package day0120;

import java.util.Scanner;

public class Ex04IfElse2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 1. 숫자를 입력받아 홀수와 짝수를 구분하는 코드를 작성하세요.
        System.out.print("숫자를 입력하세요: ");
        int number = scanner.nextInt();
        if (number % 2 != 0) { // 또는 == 1
            System.out.println("홀수입니다.");
        } else {
            System.out.println("짝수입니다.");
        }
        
        // 2. 나이를 입력받아 성인과 미성년을 구분하는 코드를 작성하세요.
        System.out.print("나이를 입력하세요: ");
        int age = scanner.nextInt();
        if (age >= 20) { //또는 > 19
            System.out.println("성인입니다.");
        } else {
            System.out.println("미성년자입니다");
        }
        
        //3. 아이디와 비밀번호를 입력받아 맞으면 로그인 성공
        //    그 외에는 로그인실패가 출력되는 코드를 작성하세요.
        System.out.print("아이디: ");
        scanner.nextLine();       
        String id = scanner.nextLine();
        
        System.out.print("비밀번호: ");
        String password = scanner.nextLine();
        
        if (id.equals("admin") && password.equals("12345")) {
            System.out.println("로그인 성공");
        } else {
            System.out.println("로그인 실패");
        }
        
        scanner.close();
        
    }

}
