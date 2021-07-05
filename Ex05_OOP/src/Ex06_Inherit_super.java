/*
 * this : 객체 자신을 가르키는 this (this.empno, this.ename)
 * this : 생성자를 호출하는 this (this(100,"red"))
 * 
 * 상속
 * 부모 (super)
 * 자식 (this)
 *  
 * super (현재 자식이 부모의 접근 주소값을 가지는 것) : 상속관계에서 부모에게 접근
 * 자식입장에서 super는 부모객체의 주소이다.
 * 1. super >> 상속관계에서 자식이 부모에게 접근하는 방법
 * 2. super >> 상속관계에서 부모의 생성자를 호출 할 수 있다. (명시적으로)
 * 
 * Tip) super()를 c#에서는 base()라고 한다.
 */

class Base {
    String basename;
    Base() {
        System.out.println("Base 기본 생성자 함수");
    }
    Base(String basename) {
        this.basename = basename;
        System.out.println("basename :" + this.basename);
    }
    void method() {
        System.out.println("나 부모 method");
    }
}

class Derived extends Base{
    String dname;
    Derived() {
        System.out.println("Derived 기본 생성자 함수");
    }
    Derived(String dname) {        
        super(dname); // 부모의 생성자를 호출(상속관계)
        this.dname = dname;
        System.out.println("dname :" + this.dname);
    }    
        
    
    @Override
    void method() {
        // TODO Auto-generated method stub
        // super.method();
        System.out.println("부모함수 재정의");
    }
    
    // 어노테이션을 지우지 않고 다시 부모함수에 접근할때는 super를 사용!
    // 상속관계에서 부모메소드를 자식이 재정의 했다. 
    // 그 후에 다시 부모의 메소드에 접근하고 싶으면
    // 메소드를 하나 더 만들어서 super를 사용해서 접근한다!
    void parent_method() {
        super.method();
    }
}

public class Ex06_Inherit_super {

    public static void main(String[] args) {
        // Derived d = new Derived(); // 나기본, 부모기본 호출
        Derived d = new Derived("홍길동"); // super를 쓰기전엔 나 오버로딩, 부모기본 호출
                                         // super를 쓰면 나 오버로딩, 부모 오버로딩 호출
        d.method(); // 부모의 함수
        d.parent_method();
    }

}
