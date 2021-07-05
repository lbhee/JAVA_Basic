import java.util.ArrayList;

/* Today Point !!
 * Generic jdk 1.5부터 나온 기능
 * c#, java >> 필수기능이 됨
 * 
 * Collection 클래스를 설계했을 때 >> 데이터 저장공간의 타입을 Object로 만들었다.
 * 막상 쓰고보니 Object 타입에 대한 저항이 생김 >> casting문제
 * 처음 객체를 생성할 때 타입을 강제하게 만들자 >> Generic
 * 타입의 안정성 보장. (타입 강제성)
 * 강제 형변환이 사라짐. (casting X) -> Car c = (Car)obj; (X)
 */

// 클래스 설계 (제너릭 적용하여 만들 수 있다.)
class MyGen<T> { // type parameter
    T obj;
    void add(T obj) {
        this.obj = obj;
    }
    T get() {
        return this.obj;
    }
}

class Person extends Object {
    int age = 100;
}

public class Ex06_Generic {
    public static void main(String[] args) {
        MyGen<String> mygen = new MyGen<String>();
        mygen.add("문자열");
        String str = mygen.get();
        System.out.println(str);
        
        // 제너릭 사용 X ------------------------------------------------------------------------------
        ArrayList list = new ArrayList();
        // 내부적인 저장공간의 타입 -> Object[] elements
        list.add(10);
        list.add(new Person());
        list.add("홍길동");
        
        for(Object obj : list) {
            // 방안에 있는 데이터들의 타입정보를 알아야 
            // 값타입, 객체타입 casting..
            if(obj instanceof Person) {
                Person p = (Person) obj;
                System.out.println(p.age);
            }else {
                System.out.println(obj);
            }
        }
        
        // 제너릭 사용 O ------------------------------------------------------------------------------
        ArrayList<Person> plist = new ArrayList<Person>();
        plist.add(new Person());
        plist.add(new Person());
        for(Person p : plist) {
            System.out.println(p.age);
        }
    }

}
