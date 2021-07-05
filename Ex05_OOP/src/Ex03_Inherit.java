// Tv 설계도
class Tv{
    boolean power; // 디폴트값 false
    int ch;
    
    void power() {
        this.power = !this.power; // true로 바꿈
    }    
    void chUp() {
        this.ch++;
    }    
    void chDown() {
        this.ch--;
    }
}

// Vcr 설계도
class Vcr{ 
    boolean power;
    void power() {
        this.power = !this.power;
    }
    void play() {
        System.out.println("재생");
    }
    void stop() {
        System.out.println("정지하기");
    }
    void rew() {
        
    }
    void ff() {
        
    }
}

/*
 * Tv설계도 Vcr설계도
 * 
 * TvVcr이라는 제품을 만들자.
 * 
 * 1. class TvVcr extends Tv, Vcr >> 다중상속 금지
 * 2. class Tv extends Vcr..... TvVcr extends Tv >> 자원이름 충돌
 * 
 * 해결 : 
 * >> 하나는 상속하고, 하나는 포함하자!!
 * class TvVcr extends Tv {Vcr vcr}
 * class TvVcr extends Vcr {Tv tv}
 * 
 * >> 둘다 포함하자!!
 * class TvVcr {Tv tv; Vcr vcr}
 * 
 * Q : Tv를 상속하는게 좋을까? Vcr을 상속하는게 좋을까?
 * A : 둘중에 비중이 높은 것을 상속하라! (주기능,메인기능)
 *     나머지는 포함으로 빼라!   
 */

class TvVcr extends Tv {
    Vcr vcr;
    TvVcr() {
        vcr = new Vcr();
    }
}


public class Ex03_Inherit {

    public static void main(String[] args) {
        TvVcr t = new TvVcr();
        t.power(); // Tv전원
        System.out.println("전원 : " + t.power);
        t.chUp();
        System.out.println("채널 : " + t.ch);
        
        t.vcr.power(); // Vcr전원
        System.out.println("비디오전원 : " + t.vcr.power);
        t.vcr.play();
        t.vcr.stop();
        
        t.vcr.power();
        t.power();
        System.out.println("비디오전원 : " + t.vcr.power);
        System.out.println("전원 : " + t.power);

    }

}
