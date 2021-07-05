package day0120;

// if조건문3 - if - else if 구조
// 만약 어떠한 조건식이 false가 나오면
// 다시 다른 조건을 체크해서 실행여부를 결정해야 한다면
// 우리는 if - else if 구조를 사용하게 된다.
// 우리가 배웠던 if - else 구조처럼
// if - else if 구조도 조건식이 true가 나오는 맨 처음 코드블락만 실행이 된다.
// 제일 마지막에는 모든 if, else if 의 조건식이 false가 나왔을 때를 대비해서
// else를 만들어 줄 수도 있다.

public class Ex05IfElseIf {
    public static void main(String[] args) {
        int number = 5;
        
        if(number > 0) {
            System.out.println("양의 정수입니다.");
        } else if(number == 0) {
            System.out.println("0 입니다.");
        } else {
            System.out.println("음의 정수입니다.");
        }
    }
}
