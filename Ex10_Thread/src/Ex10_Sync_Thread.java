/*
 * Collection (vector, ArrayList)
 * 동기화보장/동기화를 보장안함 (안정성/ 성능)
 * 한강의 화장실 -> 공유자원 
 * 여러명의 사용자 -> 스레드
 * 
 * 화장실 1개 사람 10명 (Thread) >> 동시에 사용하면?
 * 
 * 문제점 : LOCK 장치가 없어서 다같이 들어온다.
 * 해결방안 : LOCK 만들기 (함수단위로) -> synchronized
 * 
 * 반대로 비빔밥축제는 자원을 보호할 필요가 없다.
 * 동시에 먹는것이 효율적이므로 LOCK이 필요없다.
 * 무조건 필요한 것이 아니라 상황마다 다르다.
 * 
 */
class Wroom {
    synchronized void openDoor(String name) {
        System.out.println(name + "님 화장실 입장");
        for(int i = 0; i < 100; i++) {
            System.out.println(name + "사용" + i);
            if(i==10) {
                System.out.println(name + "님 끙~~");
            }                
        }
        System.out.println("시원하시죠~^^!");
    }
}

class User extends Thread {
    Wroom wr; // 화장실 주소
    String who;
    User(String name, Wroom w) {
        this.who = name;
        this.wr = w;        
    }
    @Override
    public void run() {
        wr.openDoor(this.who);
    }
}
public class Ex10_Sync_Thread {
    public static void main(String[] args) {
        
        // 이곳은 한강입니다. 화장실이 하나 만들어집니다.
        Wroom w = new Wroom();
        
        // 사람들 (한명 한명이 스레드)
        User kim = new User("김씨", w);
        User park = new User("박씨", w);
        User lee = new User("이씨", w);
        
        // 배가아파요. 화장실로 다 뛰어간다.
        kim.start();
        park.start();
        lee.start();
        
    }
}
