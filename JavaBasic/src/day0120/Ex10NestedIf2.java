package day0120;

// 사용자로부터
// 성별 - 나이 - 신체등급 순으로 입력받아서
// 현역 - 공익 - 면제를 출력하는 프로그램
// 1. 단 성별은 1은 남자, 2는 여자 int로 입력을 받되
//    여자일 경우 "여성에게는 국방의 의무가 부여되지 않습니다"
//    라는 메세지만 출력되고 프로그램이 종료되게 작성하시오.
// 2. 남자이지만 미성년자일 경우
//    "아직 미성년자에게는 신체등급이 부여되지 않습니다"
//    라는 메세지만 출력되고 프로그램이 종료되게 작성하시오.
// 3. 남자이고 성인일 경우에만 신체등급을 입력받아서
//    결과가 출력되게 만들어주세요.

import java.util.Scanner;
public class Ex10NestedIf2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("성별: (1은 남자 2는 여자)");
        int gender = scanner.nextInt();
        if(gender == 1) {
            // 남자이므로 나이를 입력받는다.
            System.out.print("나이: ");
            int age = scanner.nextInt();
            
            if(age > 18 ) {
                // 성인이므로 신체등급을 입력받는다.
                System.out.print("신체등급: ");
                int category = scanner.nextInt();
                
                if(category >= 3) {
                    System.out.println("현역입니다.");
                }else if(category == 4) {
                    System.out.println("공입입니다.");
                }else {
                    System.out.println("면제입니다.");
                }           
                
            }else {
                // 미성년자이므로 경고메세지만 출력한다.
                System.out.println("미성년자에게는 아직 신체등급이 부여되지 않습니다.");
            }
        }else {
            // 여성이므로 메세지만 출력한다.
            System.out.println("여성에게는 국방의 의무가 부여되지 않습니다.");
        }
        scanner.close();
        }
       
    }

