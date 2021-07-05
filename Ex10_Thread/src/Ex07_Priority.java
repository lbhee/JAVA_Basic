// 여러개의 Thread가 동작할 때 우선순위를 부여할 수 있다.
// 우선순위 : CPU를 점유할 수 있는 확률을 높여 주는 것
// 내부적으로 설정 값 : 5 (default) 공정하게 경쟁

class Pth extends Thread{
    @Override
    public void run() {
        for(int i =0; i < 1000 ; i++) {
            System.out.println("------------");
        }
    }
}
class Pth2 extends Thread{
    @Override
    public void run() {
        for(int i =0; i < 1000 ; i++) {
            System.out.println("|||||||||||||||||");
        }
    }
}

class Pth3 extends Thread{
    @Override
    public void run() {
        for(int i =0; i < 1000 ; i++) {
            System.out.println("*****************");
        }
    }
}


public class Ex07_Priority {

    public static void main(String[] args) {
        Pth pth = new Pth();
        Pth2 pth2 = new Pth2();
        Pth3 pth3 = new Pth3();
        
        pth.setPriority(10); // "------------"  먼저 끝나게 우선순위를 높인다
        pth2.setPriority(1); // 낮춘다
        pth3.setPriority(1); // 낮춘다
        
        System.out.println(pth.getPriority()); //5
        System.out.println(pth2.getPriority());//5
        System.out.println(pth3.getPriority());//5
        
        pth.start();
        pth2.start();
        pth3.start();
    }
}