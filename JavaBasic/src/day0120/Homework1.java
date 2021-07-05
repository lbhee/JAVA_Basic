package day0120;

// 숙제 1
// BMI 계산기를 만들어서 사용자의 BMI 수치와 
// 현재 체중 상태를 출력하는 프로그램을 작성하시오.
// 단, 사용자가 잘못된 키나 몸무게를 입력하면 
// 올바른 값을 입력할 때까지 다시 입력을 받으세요.

import java.util.Scanner;
public class Homework1 {
    
    static final double LOW_WEIGHT = 18.5;
    static final int NOMAL_WEIGHT = 23;
    static final int OVER_WEIGHT = 25;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("키를 m단위로 입력하세요: ");
        double height = scanner.nextDouble();
        
        while(height <= 0 || height >= 2.72) {
            System.out.println("키를 잘못입력하였습니다.");
            System.out.println("키를 m단위로 다시 입력하세요: ");
            height = scanner.nextDouble();
        }       
        
        System.out.println("몸무게를 kg단위로 입력하세요: ");
        double weight = scanner.nextDouble();       
        while(weight <= 0 || weight >= 465) {
            System.out.println("몸무게를 잘못입력하였습니다. ");
            System.out.println("몸무게를 kg단위로 다시 입력하세요: ");
            weight = scanner.nextDouble();
        }           
       
        double bmi = weight / height / height;
        System.out.printf("당신의 BMI: %.1f입니다.\n", bmi);  
            
        if(bmi < LOW_WEIGHT) {
            System.out.println("저체중");           
        }else if(bmi < NOMAL_WEIGHT) {
            System.out.println("정상체중");
        }else if(bmi < OVER_WEIGHT) {
            System.out.println("과체중");
        }else {
            System.out.println("비만");
        }              
                  
        scanner.close();        
    }
}
