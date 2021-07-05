/*
 * this
 * 1. 객체 자신을 가르키는 this(앞으로 생설될 객체의 주소를 담을 곳이라고 가정)
 * 2. this 객체 자신(생성자 호출) >> 원칙 : 생성자는 객체를 만들 때 한번만 호출
 *    하지만, this를 사용하면 그 원칙을 깨고 여러개의 생성자를 호출할 수 있다.
 * 
 */

class Test5{
    int i;
    int j;
    
    Test5(){
        
    }
    
    /* i와 j가 변수인지 파라미터인지 헷갈린다.
    Test5(int i, int j){
        i = i;
        j = j;
    }
    */
    
    /* 파라미터의 이름으로 변수를 예측할 수가 없다.
    Test5(int k, int z){
        i = k;
        j = z;
    }
    */
    
    Test5(int i, int j){
        // this는 class Test5를 가르킨다. this.i -> member field i
        this.i = i;
        this.j = j;
    }    
}

class Book2 {
    String bookname;
    
    Book2(String bookname) {
        this.bookname = bookname;
    }
}

// 오늘의 포인트!!!!!!!!
class Socar {
    String color;
    String geartype;
    int door;
    
    public Socar() {
        this.color = "red";
        this.geartype = "auto";
        this.door = 2;
    }
    public Socar(String color, String geartype, int door) {
        this.color = color;
        this.geartype = geartype;
        this.door = door;
    }
    
    void print() {
        System.out.println(this.color + "/" + this.geartype + "/" + this.door);
    }
}

public class Ex19_this {
    public static void main(String[] args) {
        Test5 test5 = new Test5(10, 10);
        System.out.println(test5.i);
        System.out.println(test5.j); 
       
        Socar socar = new Socar("red", "auto", 6);
        socar.print();
    }
}
