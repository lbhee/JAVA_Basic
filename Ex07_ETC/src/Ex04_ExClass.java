import java.io.IOException;

import kr.or.bit.MyClass;

public class Ex04_ExClass {
    public static void main(String[] args) {
        try {
            MyClass my = new MyClass("C:\\Temp");
        } catch (NullPointerException | IOException e) {
            e.printStackTrace();
        }
    }
    
   // MyClass my = new MyClass("C:\\Temp"); 이것만 썼을땐 에러
   // 예외를 쓰도록 강제했기 때문에 try~catch문으로 예외를 써주어야 한다.
}
