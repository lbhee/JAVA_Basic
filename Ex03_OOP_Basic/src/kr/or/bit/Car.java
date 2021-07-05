package kr.or.bit;

// 자동차는 창문의 수를 가지고 있다.
// 자동차는 속도를 가지고 있다.
// 2가지 속성은 캡슐화해라.
// 속도는 마이너스 값이 오면 0으로 초기화 한다.

// 속도를 10씩 올리거나 감소하는 기능을 만들어라.
// 속도가 마이너스 값을 가지면 0으로 초기화하라.

public class Car {
    private int window;
    private int speed;
    
    // 자동화
    public int getWindow() {
        return window;
    }
    public void setWindow(int window) {
        this.window = window;
    }
    
    // 자동화
    // 파라미터의 스피드(speed)와 멤버필드의 스피드(this.speed) 구별 
    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        if(speed < 0) {
            this.speed = 0; 
        }else {
            this.speed = speed;
        }
    }
    
    // 속도기능
    public void speedUp() {
        this.speed += 10;
    }
    
    public void speedDown() {
        if(this.speed > 0) {
            this.speed -= 10;
        }else {
            this.speed = 0;
        }
        
    
    
    
    }   
}
