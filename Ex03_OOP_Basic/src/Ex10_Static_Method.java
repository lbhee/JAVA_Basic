
public class Ex10_Static_Method {
    int number; // 일반변수
    
    public void print() { // 일반함수
        System.out.println("일반함수 number : " + number);
    }
    
    public static void method() { //static함수
        System.out.println("static함수");
    }

    public static void main(String[] args) {
        // static함수끼리니까 객체생성없이 그냥 사용가능!
        // Ex10_Static_Method.method();
        // 같은 클래스이니까 생략해서
        method(); 
        
        // 일반함수를 쓰려면 객체생성!
        Ex10_Static_Method ex10 = new Ex10_Static_Method();
        ex10.print();
        
        
    }
}
