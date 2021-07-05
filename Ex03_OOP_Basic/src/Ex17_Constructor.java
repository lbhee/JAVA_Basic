/*
자동차 영업소 입니다.
영업사원은 고객에게 자동차를 팔려고 합니다.
고객은 자동차의 기본 사양을 살 수 도 있고 ..여러가지 선택 옵션을 선택 할 수 있습니다.
자동차의 기본은
문의 개수 4개 , 자동차의 색상 기본은 red 기본 입니다
그런데 고객은
문의 개수만 변경 가능하고  자동차의 색상 기본은 red  으로 할 수 있고
문의 개수는 기본으로 하고 자동차의 색상 변경 가능하고
문의 개수와 자동차의 색상 모든 변경 하여 차를 구매할 수 있습니다

자동차 구매
1. 기본 사양 : 문 4개, 색상 red 
2. 옵션 : 문 변경 , 자동차의 색상 기본
3. 옵션 : 문 기본, 자동차의 색상 변경
4. 옵션 : 문 변경, 자동차의 색상 변경 
 */

// 기본사양
class Car6{
    
    int door; 
    String color;
    
    public Car6() {
        door = 4;
        color = "red";
    }
    
    public Car6(int d) {
        door = d;
        color = "red";
    }
    
    public Car6(String s) {
        door = 4;
        color = s;
    }
    
    public Car6(int d, String s) {
        door = d;
        color = s;
    }

    public void carInfo() {
        System.out.println("door :" + door + ", color : " + color);
    }
}

// 좋은 코드가 아닌 이유?
// 1. 파라미터의 이름이 모호하다. 원래는 멤버필드명과 같은 이름을 쓴다. >> this
// 2. 개발자는 반복을 싫어한다. >> this

public class Ex17_Constructor {

    public static void main(String[] args) {
        Car6 car = new Car6();
        car.carInfo();
        
        Car6 car2 = new Car6("Pink");
        car2.carInfo();
        
        Car6 car3 = new Car6(2, "gold");
        car3.carInfo();
        
    }
}
