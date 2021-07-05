package kr.or.bit;

public class NoteBook {
    private String color;
    private int year;
    
    // 직접할당을 막고 간접할당을 하겠다.
    // 간접할당의 구현은 (함수) >> 특수한 목적(setter, getter)
    // 자동화 코드로 만들면 나중에 코드를 생략할 수 있는 이점이 생긴다.
    
    public void setYear(int y) { // setter함수
        if(y <= 0) {
            year = 1999;
        }else {
            year = y;
        }
    }    
    public int getYear() { // getter함수
        return year;
    }
    
    // 자동화
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    
    
    // 마우스를 가지고 있다.
    // 여러개의 속성과 기능
    // Mouse mouse;    
    public void handle(Mouse m) { //Mouse의 주소값을 받아서
        m.x = 100;
        m.y = 200;            
    }
    
    public void noteBookInfo() {
        System.out.println("color : " + color + "  year : " + year);
    }
}
