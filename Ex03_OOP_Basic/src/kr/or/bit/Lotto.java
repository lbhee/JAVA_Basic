package kr.or.bit;
import java.util.Random;
import java.util.Scanner;

/*
1. 1~45까지의 난수를 발생시켜 6개의 배열에 담으세요
(int)(Math.random()*45 + 1)
lotto[0] = 44 , lotto[1] = 1 .... lotto[5] = 33
2. 배열에 담긴 6개의 배열값은 중복값이 나오면 안되요 (중복값 검증 :별찍기 비슷)
3. 배열에 있는 6개의 값은 낮은 순으로 정렬 시키세요 (정렬 : 자리바꿈)
4. 위 결과를 담고 있는 배열을 출력하세요 (화면 출력)
 */

public class Lotto {
    private int[] numbers;  //초기화 
    private Scanner scanner;
    private Random r; 

    public Lotto() { 
        numbers = new int[6]; 
        scanner = new Scanner(System.in);
        r = new Random();
    }
    public void selectLottoNumbers() {
        while (true) {
            //메뉴
            System.out.println("*************************");
            System.out.println("**1. 당첨 예상 번호 추출하기**");
            System.out.println("**2.    프로그램  종료    **");
            System.out.println("*************************");
            System.out.println("원하시는 메뉴 번호를 입력하세요 :");
            int Menu = scanner.nextInt();

            if(Menu == 1) {
                //로또 자동번호 생성과 정렬을 하는 코드
                for (int i = 0; i < numbers.length; i++) {
                    int randomNumber = r.nextInt(45) + 1;

                    for (int j = 0; j < numbers.length; j++) {
                        if (randomNumber == numbers[j]) {
                            randomNumber = r.nextInt(45) + 1;
                            j = -1;
                        }
                    }
                    numbers[i] = randomNumber;
                }
                for(int i = 0; i < numbers.length - 1; i++) {
                    if(numbers[i] > numbers[i + 1]) {
                        int temp = numbers[i];
                        numbers[i] = numbers[i + 1];
                        numbers[i + 1] = temp;
                        i = -1;
                    }

                }
            }else if(Menu == 2) {
                System.out.println("Good Lucky^^");
                break;
            }

            //로또 자동생성 번호의 평균값 구하는 코드
            int average = 0;
            for(int i : numbers){          
                average += i;
            }
            average = average/numbers.length;   

            System.out.printf("평균 : %d\n",average);

            //출력
            System.out.println("[선택한 Lotto 번호]");
            System.out.printf("[%d][%d][%d][%d][%d][%d]\n", 
                    numbers[0], numbers[1], numbers[2], 
                    numbers[3], numbers[4], numbers[5]);

        }

    }


}