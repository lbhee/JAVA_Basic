package kr.or.bit;
/* 
 * Tv 설계도 요구사항 정의
 * 채널정보를 가지고 있다. (예를 들면 1 ~ 200 값을 가질 수 있다)
 * 브랜드 이름을 가지고 있다 (예를 들면 엘지, 삼성)
 * 채널 전환기능을 가지고 있다 (채널은 한 채널씩 이동이 가능하다)
 * 채널을 증가시키는 기능을 가지고 있다
 * 채널을 감소시키는 기능을 가지고 있다
 */

public class Tv {
    
    public int channel; // default 0
    public String brand; // default null
    
    public void channel_Up() { // void는 값을 돌려주지 않을 때
        channel++;
    }
    
    public void channel_Down() {
        channel--;
    }
    
    // 채널정보, 브랜드 이름 출력기능
    public void tv_Info() {
        System.out.printf("[%s] ,  [%d]\n" , brand , channel);
    }

}
