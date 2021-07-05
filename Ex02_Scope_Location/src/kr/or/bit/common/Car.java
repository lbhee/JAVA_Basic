package kr.or.bit.common;

public class Car {
    int door; // 클래스는 public이지만 int는 default이기 때문에 같은폴더만 가능.
    public int window; // 다른폴더에서 사용가능하다.
    private int handle; // 간접할당 setter, getter와 함께써라.        
}
