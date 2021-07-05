package kr.or.bit;

// 새(공통-일반화/추상화) >> 새는 날 수 있다. 새는 빠르다.

public class Bird {
    // 공통기능
    public void fly() {
        System.out.println("flying");
    }
    
    // 설계자..타조는 못날잖아.. fly가 필요없으니까..
    // 나를 상속하는 당신은 moveFast()를 필요에 따라서 재정의해서 쓰길.. 상속관계에서!
    protected void moveFast() {
        fly();
    }
}
