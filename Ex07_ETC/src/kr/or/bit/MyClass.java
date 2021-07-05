package kr.or.bit;

import java.io.IOException;

// 설계도 == 타입 == 클래스 --

// 내 설계도를 사용하는 개발자가 [예외]를 처리했으면 좋겠는데..(강제)

// 생성자 함수같은 곳에서 강제로 예외를 처리할 수 있게


public class MyClass {
    public MyClass(String path) throws IOException , NullPointerException {
        System.out.println(path);
    }
}
