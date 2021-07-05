import kr.or.bit.Bird;

// Bird 상속받아서 public처럼 사용하는 것
class Bi extends Bird {    
    @Override
    protected void moveFast() { // 빠르다. 날라다녀서(그대로사용해도 됨)
        super.moveFast();
    }
}

class Ostrich extends Bird {
    // 구체화특수화 된 내용. 뛴다.
    void run() {
        System.out.println("run^^");
    }
    @Override
    protected void moveFast() { // 빠르다. 뛰어서(재정의해서 사용해야 함)
        run();
    }
}

public class Ex09_Inherit_Protected {

    public static void main(String[] args) {
        Bi bi = new Bi();
        bi.fly(); // public이니까 가능        
        // bi.moveFast();는 안보인다. 지금은 default.
        
        bi.moveFast(); // protected는 상속관계에서 Override해준후에는 사용가능.
        
        Ostrich o = new Ostrich();
        o.run();
        o.moveFast(); // Override해준후 재정의하고 사용.
    }

}
