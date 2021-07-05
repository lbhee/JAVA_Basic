interface Irepairable {
    
}

// 유닛
class Unit2 {
    int hitpoint; // 기본 에너지
    final int MAX_HP; //최대 에너지
    Unit2(int hp) {
        this.MAX_HP = hp;        
    }
}

// 지상유닛
class GroundUnit extends Unit2 {
    GroundUnit(int hp) {
        super(hp);
    }    
}

// 공중유닛
class AirUnit extends Unit2 {
    AirUnit(int hp) {
        super(hp);        
    }    
}

// 건물
class CommandCenter implements Irepairable{
    
}

// 탱크
class Tank2 extends GroundUnit implements Irepairable{
    Tank2() {
        super(50);
        this.hitpoint = this.MAX_HP;
    }
    @Override
    public String toString() {
        return "[Tank2]";
    }      
}

// 마린
class Marine2 extends GroundUnit {
    Marine2() {
        super(50); 
        this.hitpoint = this.MAX_HP;
    }
    @Override
    public String toString() {
        return "[Marine2]";
    }
}

// Scv 자원채취 (광물, 치료.. 에너지)
class Scv extends GroundUnit implements Irepairable{
    Scv() {
        super(50);
        this.hitpoint = this.MAX_HP;
    }
    @Override
    public String toString() {
        return "[Scv]";
    }
    
    // Scv의 구체과 특수화된 기능 - repair(수리하다)
    
    /*
    void repair(Tank2 tank) {
        if(tank.hitpoint != tank.MAX_HP) {
            System.out.println("파손.....");
            tank.hitpoint += 5;
        }
    }
    
    void repair(Scv scv) {
        if(scv.hitpoint != scv.MAX_HP) {
            System.out.println("파손.....");
            scv.hitpoint += 5;
        }
    }
    */
    
    // 만일 Unit의 종류가 30개 있다면? 그 중 Scv가 25개를 치료할 수 있으면?
    // 위의 코드처럼 하면 25개의 함수를 다 만들어야 한다. 증가할때마다..
    
    // 그럼 하나의 함수가 Unit들을 repair하면 되지 않을까.
    // 전자제품했던 것 처럼 , 상속관계에서 부모타입은 자식타입의 주소값을 가질 수 있으니(다형성)
    
    /* void repair(Unit2 unit) {} -> 이렇게하면 Marine도 같이 치료하게됨. 마린은 리페어대상이 아님.
     * void repair(GroundUnit unit) {} -> 여기에도 Marine이 있음..
     * CommandCenter도 리페어 대상인데 유닛과 연관성이 아니것도 없음.
      
     * (고민) repair함수 하나로 Marine(x) , Scv(o), Tank2(o), CommandCenter(o) 이게 가능하려면..?
     *  >> 인터페이스 Irepairable를 부모로 만들어 볼까?
     * class CommandCenter             implements Irepairable  
     * class Scv extends GroundUnit    implements Irepairable
     * class Tank2 extends GroundUnit  implements Irepairable
     * 
     * Irepairable은 CommandCenter의 부모타입이다.
     * Irepairable은 Scv의 부모타입이다.
     * Irepairable은 Tank2의 부모타입이다.
     * 
     * 부모타입은 자식타입의 주소를 가질 수 있다.
     */
    
    void repair(Irepairable repairunit) {
        // repairunit parameter는 Irepairable 인터페이스를 구현하는 객체의 주소값이 올 수 있다.
        // void repair(new Tank2());
        // void repair(new CommendCenter());
        // void repair(new Scv());
        // 부모타입은 자식타입의 주소를 받을 수 있는데.. 부모것만 볼 수 있다.
        
        // 1. CommendCenter와 Tank2, Scv은 수리 방법이 다르다.
        // 2. Irepairable repairunit는 수리할 지원을 가지고 있지 않다.
        // 3. 그럼 Irepairable repairunit 통해서 위 3가지 Unit2 온다고 가정하고 분류해보자.
        
        // CommandCenter와 Tank2, Scv 구문점 Unit2이냐, 아니냐
        // 타입비교 연산자(instanceof) 사용 -> http://cafe.naever.com/bit2021/141
        if(repairunit instanceof Unit2) { //repairunit은 Unit2타입이니?
            // Tank2가 들어오면? 맞아요. 
            Unit2 unit = (Unit2)repairunit; //다운케스팅(리페어가 가진자원이 없으니 부모를 자식타입으로 변경)
            // Tank2에서 부모타입인 Unit2자원만 접근
            if(unit.hitpoint != unit.MAX_HP) {
                unit.hitpoint = unit.MAX_HP;
            }
        }else {
            // CommandCenter가 들어오면? 아니요.
            // 부모타입이 Unit2가 아닌것들은 여기에서 치료방식을 구현.
            System.out.println("다른 충전방식을 통해서 .. Unit2타입이 아니에요");
        }
    }

}
public class Ex04_Interface {
    public static void main(String[] args) {
        Tank2 tank = new Tank2();
        Marine2 marine = new Marine2();
        Scv scv = new Scv();
        
        // 전투
        tank.hitpoint -= 20;
        System.out.println("탱크 : " + tank.hitpoint);
        System.out.println("Scv 수리 요청");
        scv.repair(tank);
        System.out.println("탱크 수리 완료 : " + tank.hitpoint);
        
        scv.hitpoint -= 10;
        System.out.println("scv : " + scv.hitpoint);
        System.out.println("Scv 수리 요청");
        scv.repair(scv);
        System.out.println("scv 수리 완료 : " + scv.hitpoint);
        
        CommandCenter center = new CommandCenter();
        scv.repair(center);
        
        // scv.repair(marine); 컴파일조차 안됨.
    }
}
