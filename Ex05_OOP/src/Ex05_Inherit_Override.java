import kr.or.bit.Emp;

class Test2 {
    int x = 100;
    void print() {
        System.out.println("부모함수 Test2");
    }
}

class Test3 extends Test2{
    int x = 300; // c#에서는 부모무시하기라고 한다.
                 // 문법적 문제는 없지만 이런식으로 쓰지마세요.
    @Override
    void print() {
        System.out.println("자식이 부모함수를 재정의");        
    }
    
    // overloading
    void print(String str) {
        System.out.println("나 오버로딩이야" + str);
    }
}

public class Ex05_Inherit_Override {
    public static void main(String[] args) {
        Test3 t3 = new Test3();
        System.out.println(t3.x);
        
        t3.print();
        t3.print("hello");
        
        ////////////////////////////////////////////////
        
        Emp emp = new Emp(1000,"홍길동");
        System.out.println(emp); // 조작된 주소
        System.out.println(emp.toString()); // 조작된 주소
        // emp라고 출력하면 사실은 toString()이 뒤에 숨어있다.
        // toString()은 object가 가지는 자원
        
        // emp에서 오버라이딩해주었더니 주소가 아닌 1000과 홍길동이 나온다.
        // toString을 재정의해서 emp에 값이 들어가 있구나라고 알 수 있다.
    }

}
