// 게임 : Unit()
// Unit의 공통기능 : 이동좌표, 이동, 멈춤 >> 추상화, 일반화된 자원
// Unit의 이동방법 : 각각 다르다. >> Unit마다 별도로 구현
// 추상클래스

abstract class Unit {
    int x, y;
    abstract void move(int x, int y); // 추상자원 //자식에게 강제구현시키는 것.
    void stop() {
        System.out.println("Unit Stop");
    }
}

// Tank
class Tank extends Unit {
    @Override
    void move(int x, int y) {
        this.x = x;
        this.y = y;
        System.out.println("Tank 이동 : " + this.x + "," + this.y);        
    }
    // Tank의 구체화 특수화된 특징
    void chaneMode() {
        System.out.println("탱크 변환 모드");
    }    
}

// Marine
class Marine extends Unit {
    @Override
    void move(int x, int y) {
        this.x = x;
        this.y = y;
        System.out.println("Marine 이동 : " + this.x + "," + this.y);         
    }
    // Marine의 구체화 특수화된 특징
    void stimpack() {
        System.out.println("스팀픽 기능");
    }    
}

// DropShip
class DropShip extends Unit {
    @Override
    void move(int x, int y) {
        this.x = x;
        this.y = y;
        System.out.println("Marine 이동 : " + this.x + "," + this.y);        
    }
    // DropShipe의 구체화 특수화된 특징
    void load() {
        System.out.println("Unit Load");
    }
    void unload() {
        System.out.println("Unit Unload");
    }    
}


public class Ex02_abstract_class {
    public static void main(String[] args) {
        Tank t = new Tank();
        t.move(500, 200);
        t.stop();
        t.chaneMode();
        
        Marine m = new Marine();
        m.move(500, 200);
        m.stop();
        m.stimpack();
        
        // 1. Tank 3대를 만들고 [같은 좌표]로 이동시키세요. (555,444) 
        Tank[] tanklist = {new Tank(), new Tank(), new Tank()};
            for(Tank tank : tanklist) {
                tank.move(500, 400);
            }
        
        // 2. Tank 1개, Marine 1개, DropShip 1개를 같은 좌표로 이동시키세요. (666,444)
        Unit[] unitlist = {new Tank(), new Marine(), new DropShip()};
            for(Unit unit : unitlist) {
                unit.move(666, 444);
            }
        
   }

}
