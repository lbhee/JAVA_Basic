/*
 * 추상클래스
 * >> 미완성클래스(완성되지 않은 설계도)
 * 1. 완성된 코드 + 미완성된 코드
 * 2. 완성(실행블럭이 있는 함수: void run(){};) + 미완성(실행블럭이 없는 함수: void run();)
 * 3. 완성된 클래스는 new가능 <-> 미완성 클래스는 스스로 객체생성 불가능
 * 
 * 정리
 * 1. 추상클래스(미완성) : 스스로 객체 생성이 불가능(new 사용불가)
 * 2. 추상클래스는 결국, 완성된 클래스로 만드는 것이 목적이다.(상속을 통해서)
 * 3. 상속관계애서 미완성된 자원(추상함수)을 완성해라(구현) >> 재정의(추상자원을 override)
 * 
 * 설계자입장에서 숨은 의도는?
 * >> 상속하면 반드시 재정의 해라 >> 반드시 강제적 구현을 해라
 * 
 */

class Car {
    void run() {} // 강제성이 없다.
}

class Hcar extends Car {
    // Hcar입장에서는 run()을 재정의 해도되고, 안해도 문제가 없다.
}

//////////////////////////////////////////////////////////

abstract class AbClass { // abstract클래스 안에 최소 1개의 추상자원을 만들겠다.
    // 완성된 코드
    int pos;
    void run() {
        ++pos;
    }
    // 미완성된 코드
    abstract void stop(); // 실행블록{}이 없다. >> 추상함수 >> 자식클래스에게 반드시 재정의해서 사용하라고.
}

class Child extends AbClass {

    @Override
    void stop() { // 강제구현, 내용은 마음대로
        this.pos = 0;
        System.out.println("stop : " + this.pos);        
    } 
}

class Child2 extends AbClass {

    @Override
    void stop() {
        this.pos = -1;
        System.out.println("stop : " + this.pos);
        
    }
}

public class Ex01_abstract_class {

    public static void main(String[] args) {
        Child ch = new Child();
        ch.run();
        ch.run();
        System.out.println(ch.pos);
        ch.stop();
        
        Child2 ch2 = new Child2();
        ///////////////////////////////
        // 다형성
        AbClass ab = ch;
        // 부모타입의 참조변수는 자식타입 객체의 주소를 가질 수 있다.(다형성 - 전자제품매장의 Buy함수)
        // 단, 부모는 자기타입의 자원만 볼 수 있다. 
        ab.run();
        ab.stop(); // 재정의
        // 부모타입접근..추상함수 실행안된다. 재정의(자식) 함수호출(예외적으로)
        

    }

}
