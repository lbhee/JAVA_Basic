package kr.or.bit;

public class Program {

    public static void main(String[] args) {
        Pclass pc = new Pclass();
        pc.k = 10; // 상속관계가 아니라면 protected와 
        pc.p = 11; // default가 똑같다. 같은패키지에서 사용 가능하다.
        

    }

}
