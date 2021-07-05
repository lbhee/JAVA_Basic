
import kr.or.bit.Keyboard;
import kr.or.bit.MainBody;
import kr.or.bit.Monitor;

class computer1{
    // 고유 속성
    public int price;
    public String brand;
    public int serialNum;
    public String color;

    public void Computer1(int price, int number, String brand, String color) {
        this.price= price;
        this.serialNum = number;
        this.brand = brand;
        this.color = color;
    }
    public void Computer1(){
        System.out.println("가격: "+this.price+",브랜드: "+this.brand+"시리얼넘버: "+this.serialNum+"색깔: "+this.color);
    }


    // 상태
    public int powerSaveingMode;

    public void saveOn() {
        this.powerSaveingMode = 1;
        System.out.println("절전모드입니다.");
    }
    public void saveOff() {
        this.powerSaveingMode = 0;
        System.out.println("절전모드가 해제되었습니다.");
    }

    // 사칙연산
    public int add(int a, int b) {
        return a + b;
    }
    public int minus(int a, int b) {
        return a - b;
    }
    public int multi(int a, int b) {
        return a * b;
    }
    public double divide(double a, double b) {
        return a / b;
    }
}


public class Computer { 
    public static void main(String[] args) {

        // 전원 on/off
        MainBody mainbody = new MainBody();        
        mainbody.powerOn();        
        mainbody.powerOff();

        // 절전모드 on/off
        computer1 computer = new computer1();        
        computer.saveOn();
        computer.saveOff();

        // 입출력 
        Keyboard keyboard = new Keyboard();
        keyboard.inputOutput();

        // 
        Monitor monitor = new Monitor();

        // 사칙연산
        computer1 test = new computer1();
        int result = test.add(7, 3);
        System.out.println(result);

        int result2 = test.minus(7, 3);
        System.out.println(result2);

        int result3 = test.multi(7, 3);
        System.out.println(result3);

        double result4 = test.divide(7, 3);
        System.out.printf("%.2f",result4);
    }

}
