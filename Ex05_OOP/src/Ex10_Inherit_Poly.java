/*
 * Tip) c# 에서는 overloading, override도 다형성으로 봄. java는 아니다.
 * 
 * Java 다형성 : [상속관계]에서 [하나의 참조변수]가 [여러개의 타입]을 가질 수 있다.
 * [하나의 참조변수] >> 부모타입
 * 
 * 부모클래스 타입의 참조변수가 여러개의 자식클래스 객체를 담을 수 있다.
 */

class Tv2 {
    boolean power;
    int ch;
    void pewor() {
        this.power = !this.power;
    }
    void chUp() {
       this.ch++; 
    }
    void chDown() {
        this.ch--;
    }    
}

// 자막이 있는 tv
class CapTv extends Tv2 { 
    // 특수화구체화된 자원 >> 자막
    String text;
    String captionText() {
        return this.text = "현재 자막 처리중 ....";
    }    
}


public class Ex10_Inherit_Poly {

    public static void main(String[] args) {
        CapTv captv = new CapTv();
        captv.pewor();
        System.out.println("전원 : " + captv.power);
        captv.chUp();
        System.out.println("채널 : " + captv.ch);
        System.out.println(captv.captionText());
        // 기존 배운 내용
        
        
        // Car c = new Car();
        // Car c2 = c;
        
        Tv2 tv2 = captv;
        // 상속관계에서 [부모타입]은 [자식타입]의 [주소]를 가질 수 있다. (다형성)
        // 단, 부모는 자신의 자원만 접근 가능하다.
        // 단, 재정의를 제외하면..
        // 프로그램 세계에서는 자식은 부모에게 조건없이 준다. (주소) 어차피 부모는 자식것을 못보니까.
        System.out.println(tv2.toString()); // 둘의 주소는 같다. 하지만 부모는 자신것만 볼 수 있고,
        System.out.println(captv.toString()); // 둘의 주소는 같다. 자식은 자신것과 부모것을 다 볼 수 있다.
        
        // 자식것은 접근 불가
        // tv2.text;
        // tv2.captionText();
        tv2.pewor(); // 내것은 접근 가능
        
    }

}
