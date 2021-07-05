import kr.or.bit.Pclass;

/*
 * private , default , public , protected
 * 
 * 상속관계에서 protected
 *  : 박쥐(양면성) -> 상황마다 default, public 바뀐다
 *  
 *  >> 상속이 없는 클래스 안에서 protected 접근자는 default와 같다. 쓸이유가없다.
 *  >> 결국에는 상속관계에서만 의미를 가진다.
 *   
 */

class Dcalss {
    public int i;
    private int p;
    int s; // default
    protected int k; // 상속이 아니기 때문에 일반클래스에서는 default와 똑같음. 사용할 이유가 없다.
}

class Child2 extends Pclass {
    void method() {
        this.k = 100; // 상속관계에서 protected는 public처럼 쓰인다. // default는 여기서 쓸 수 없다.
        System.out.println(this.k);
    }
}
// 그냥 public을 쓰면되지 왜 protected를 쓸까?
// 일단 만들어 놓는데 쓰는사람이 재정의해서 바꿔서 쓰기를 바라는 마음.

public class Ex08_Inherit_Protected {

    public static void main(String[] args) {
        Child2 ch = new Child2();
        ch.method();

    }

}
