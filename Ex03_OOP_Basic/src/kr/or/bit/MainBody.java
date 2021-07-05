package kr.or.bit;

public class MainBody {

    // 고유 속성
    public int price;
    public int brand;
    public int serialNumber;
    public int cpuNum;
    public int memorySize;


    // 상태(전원on/off)
    public int power;

    public void powerOn() {        
        this.power = 1;
        System.out.println("전원이 켜졌습니다.");
    }
    public void powerOff() {        
        this.power = 0;
        System.out.println("전원이 꺼졌습니다.");
    }
}
