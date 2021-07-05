/*
 * Thread : 프로세스에서 하나의 최소실행 단위(흐름) >> method
 * >> Stack >> 여러개 >> 함수를 동작
 * 
 * Thread 생성방법
 * 1. Thread 클래스 상속 >> class Test extends Thread >> 새로운 stack에 올라가서 놀거야.
 * >> run() 함수 >> 새로운 stack에서 가장 먼저 실행되는 함수.
 * 
 * >> Tread는 일반클래스(추상클래스였으면 에러로 오버라이딩 강제했을 것) >> Tread 스스로 객체생성이 가능하다는 것이다.
 * 
 * 2. Runnable 인터페이스 구현
 * >> why? >> 다중상속이 안되기 때문에 다른클래스를 상속했을 때 Thread는 상속할 수 없어서 인터페이스를 구현한 것이다.
 * 여기까지는 Test클래스가 스레드가 아니다. 
 * Thread thread = new Thread(new Test());
 * 이렇게 스레드에 객체주소값을 넘겨주어야 한다.
 * 
 *  
 */
class Thread_2 implements Runnable { // run()을 재정의 하도록 강제할 뿐이다.

    @Override
    public void run() {
        for(int i = 0; i < 10000; i++) {
            System.out.println("Tread_2  : " + i);
        }
        System.out.println("Thread_2 run() END.........");        
    }    
}

class Thread_1 extends Thread {
    @Override
    public void run() { // 이 함수는 main() 함수와 동일한 역할
        // 새로운 stack에 처음올라가서 실행되는 함수 run()
        for(int i = 0; i < 10000; i++) {
            System.out.println("Tread_1  : " + i + this.getName());
        }
        System.out.println("Thread_1 run() END.........");
    }
}


public class Ex02_Multi_Thread {
    public static void main(String[] args) {
        // 1번
        Thread_1 th = new Thread_1();
        th.start(); // memory에 새로운 call stack을 생성하고 run() 함수를 stack에 올려놓고 임무 끝(종료).
                    // 두개의 stack을 동시에 실행
        
        // 2번
        //Thread_2 th2 = new Thread_2(); // Thread가 아니다.
        //Thread thread = new Thread(th2);        
        Thread thread = new Thread(new Thread_2());
        thread.start();
        
        for(int i = 0; i < 10000; i++) {
            System.out.println("main  : " + i);
        }
        System.out.println("Main END");
    }
} 


