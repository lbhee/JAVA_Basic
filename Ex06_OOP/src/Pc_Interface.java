// 인터페이스
interface Touchable {
    boolean TouchPen = true;
    void Touching();
}

// Pc
class Pc {
    public int price;
    public String color = "black";
    public String brandName = "LG";
    
    Pc(int price) {
        this.price = price;            
    }
}

// Desktop
class Desktop extends Pc {    
    Desktop() {
        super(200);
    }
    public String mainBody;
    public boolean VGAport = true;        
}

// NoteBook
class NoteBook extends Pc {
    
    void folding() {
        System.out.println("노트북 폴딩기능");
    } 
    
    NoteBook(int price) {
        super(price);
        // TODO Auto-generated constructor stub
    }   
}

// ANoteBook
class ANoteBook extends NoteBook {
    ANoteBook() {
        super(50);
    }

    public boolean cdrom = true;
}

// BNoteBook
class BNoteBook extends NoteBook implements Touchable{
    BNoteBook() {
        super(70);
    }

    public boolean ssdcard = true;

    @Override
    public void Touching() {
        System.out.println("B노트북 터치기능");    
    }
}

// CNoteBook
class CNoteBook extends NoteBook implements Touchable{
    CNoteBook() {
        super(70);
    }

    public boolean ramExtendedSlot = true;

    @Override
    public void Touching() {
        System.out.println("C노트북 터치기능");    
    }
}

// smartPhone
class smartPhone implements Touchable{
    void call() {
        System.out.println("스마트폰 전화기능");

    }
    void message() {
        System.out.println("스마트폰 문자기능");
    }    
    @Override
    public void Touching() {
        System.out.println("스마트폰 터치기능");       
    }    
}



public class Pc_Interface {
    public static void main(String[] args) {
        Desktop desktop = new Desktop();
        ANoteBook anotebook = new ANoteBook();
        BNoteBook bnotebook = new BNoteBook();
        CNoteBook cnotebook = new CNoteBook();
        smartPhone phone = new smartPhone();
        
        anotebook.folding();
        bnotebook.folding();
        cnotebook.folding();
        
        bnotebook.Touching();
        cnotebook.Touching();
        phone.Touching();
        phone.call();
        phone.message();  
        
        System.out.println(desktop.brandName);
        System.out.println(cnotebook.color);
        System.out.println(anotebook.price);
        
    }
    
}
