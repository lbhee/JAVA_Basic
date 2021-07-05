package day0119;

// 숙제1
// 사용자로부터 키와 몸무게를 입력받아서
// BMI 수치를 어느정도 형식에 맞추어 출력하시오
// BMI 계산 방법은 몸무게 / 키 / 키 입니다.

import java.util.Scanner;
public class Homework1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("키: ");
        int height = scanner.nextInt();
        System.out.print("몸무게: ");
        int weight = scanner.nextInt();
        
        double bmi = (double)weight / height / height;
        System.out.printf("당신의 BMI 수치는 %f입니다.\n", bmi);
                
        scanner.close();
    }
}
