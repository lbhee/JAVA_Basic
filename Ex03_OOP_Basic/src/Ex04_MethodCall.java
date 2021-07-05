import kr.or.bit.Car;
import kr.or.bit.Mouse;
import kr.or.bit.NoteBook;

public class Ex04_MethodCall {

    public static void main(String[] args) {

        NoteBook notebook = new NoteBook();
        notebook.setColor("red");
        notebook.setYear(-2000);
        
        System.out.println(notebook.getColor());
        System.out.println(notebook.getYear());

        Mouse mouse = new Mouse();
        notebook.handle(mouse);
        System.out.println(mouse.x);
        System.out.println(mouse.y);
        
        // notebook 3대 생성하고
        // 2000, red
        // 2010, blue
        // 2020, white
        // 라고 명시하고 정보를 출력하세요.
        
        // !!!!!!!!!!!!오늘의 포인트!!!!!!!!!!!!!
        // 객체배열은 [방 생성]과 [객체 생성] 2번 작업한다!!
        
        // [빈방 생성] - 배열의 notebook 객체의 주소를 담을 수 있는
        NoteBook[] notebooks = new NoteBook[3];
                
        // [객체 생성]
        notebooks[0] = new NoteBook();
        notebooks[1] = new NoteBook();
        notebooks[2] = new NoteBook();
        
        // 값 넣기 
        notebooks[0].setYear(2000);
        notebooks[0].setColor("red");
        notebooks[0].noteBookInfo();
        
        notebooks[1].setYear(2020);
        notebooks[1].setColor("blue");
        notebooks[1].noteBookInfo();

        notebooks[2].setYear(2020);
        notebooks[2].setColor("white");
        notebooks[2].noteBookInfo();
        
        for(int i = 0; i < notebooks.length; i++) {
            notebooks[i].noteBookInfo();
        }
        
        // 2번째 방법 int[] arr = new int[]{1, 2, 3}
        NoteBook[] notebook2 = new NoteBook[] 
                {new NoteBook(), new NoteBook(),new NoteBook()};
                
        
        // 3번째 방법 int[] arr = {1, 2, 3} -> 사용빈도높음!
        NoteBook[] notebook3 = {new NoteBook(), new NoteBook(), new NoteBook()};
        
        // 개선된 for문
        for(NoteBook no : notebooks) {
            no.noteBookInfo();
        }
        
        
        
        // -------------------------------------------------------------
        
        
        
        Car car = new Car();
        car.speedUp();
        car.speedUp();
        System.out.println(car.getSpeed());
        
        car.speedDown();
        car.speedDown();
        car.speedDown();
        car.speedDown();
        car.speedDown();
        System.out.println(car.getSpeed());
    }

}
