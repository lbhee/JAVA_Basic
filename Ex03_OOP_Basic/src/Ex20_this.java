/*
 * 원칙 : 생성자는 객체생성시 1개만 호출 가능하다. Car c = new Car(); 또는 Car c = new Car(100);
 * 예외 : this를 활용하면 여러개의 생성자를 호출할 수 있다.
 */


/*
class Zcar {
    String color;
    String geartype;
    int door;
    
    
    // 값을 할당하는 부분이 중복적으로 보인다.. 에러는 안나지만!
    // 할당하는 부분을 한개로 표현할 순 없을까?
    
    // default constructor
    Zcar() {
        this.color = "red";
        this.geartype = "auto";
        this.door = 2;
    }
    
    // ovarloading constructor
    Zcar(String color, String geartype, int door) {
        this.color = color;
        this.geartype = geartype;
        this.door = door;        
    }
    
    void print() {
        System.out.println(this.door + "," + this.color + "," + this.geartype);
    }
}
*/


 class Zcar {
    String color;
    String geartype;
    int door;
    
    // default constructor (파라미터 3개짜리를 다시 호출해서 사용!)
    Zcar() {
        this("red", "auto", 2); // 생성자를 호출하는 this
      // = new Zcar("red", "auto", 2)와 같은 것.
        System.out.println("defualt constructor");
    }
    
    // overloading constructor
    Zcar(String color, String geartype, int door) {
        this.color = color;
        this.geartype = geartype;
        this.door = door;     
        System.out.println("ovarloading constructor");
    }
    
    void print() {
        System.out.println(this.door + "," + this.color + "," + this.geartype);
    }    
 } 
 
     
class Zcar2 {
    String color;
    String geartype;
    int door;
    
    Zcar2() {
        this("red", 1);
        System.out.println("default constructor");
    }
    
    Zcar2(String color, int door) {
        this(color, door, "auto");
        System.out.println("overloading constructor param 2개");
    }
    
    Zcar2(String color, int door, String geartype) {
        this.color = color;
        this.door = door;
        this.geartype = geartype;
        System.out.println("overloading constructor param 3개");
    }
    
    void print() {
        System.out.println(this.door + "," + this.color + "," + this.geartype);
    }
        
    }

public class Ex20_this {

    public static void main(String[] args) {
        // 디폴트 호출
        Zcar zcar = new Zcar();
        zcar.print();
        
        // 파라미터 3개짜리 호출
        Zcar zcar2 = new Zcar("print", "auto", 4);
        zcar2.print();
        
        // --------------------------------------------------------
        
        Zcar2 zcar3 = new Zcar2();
        zcar3.print();
        
        Zcar2 zcar4 = new Zcar2("gold", 2);
        zcar4.print();
        
        Zcar2 zcar5 = new Zcar2("red", 10, "stick");
        zcar5.print();
         
    }
}  
 
