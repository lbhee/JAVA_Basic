package kr.or.bit;
// <싱글톤>
// 디자인패턴(생성패턴) >> new(객체)
// 객체 하나를 만들어서 공유.
// 의도 : 하나의 객체를 만들어서 공유하겠다. 
//       직접 new를 못하게 생성자를 막자 -> private 생성자.
//       별도의 특정자원을 통해서 한개의 객체만을 쓰도록 강제하겠다.

// 활용 -> 공유프린터, 공유와이파이 (JDBC에서 활용예제할 것)

public class Singleton {
    private static Singleton p;
    private Singleton() {
        // private를 쓰면서 직접 객체 생성 불가(new못함)
        // heap객체 생성 못함(생성자를 통해서)
    }
    public static Singleton getInstance() {
        if(p == null) {
            p = new Singleton(); // 생성자 호출해서 객체 만드는 것.
        }
        return p;
    }
}

// 클래스 내부에서는 private도 쓸 수 있기 때문에 
// 여기서 new해서 객체를 생성하고
// p를 return하여 쓴다.