package kr.or.bit;
/*
생성자가 있는 설계도 만들기 QUIZ 입니다 아래 요구사항에 맞는 설계도를 만들어보세요
 
책은 책이름을 가지고 있고 가격을 가지고 있다 
책이 출판되면 반드시 책이름과 책의 가격을 가지고 있어야 한다
책의 이름과 가격 정보는 특정 기능을 통해서만 볼수 있고 , 출판된 이후에서 수정할 수 없다  
책이름과 가격정보는 각각확인 할 수 있다.
*/

public class Book {
    // 책이름과 가격 정보는 특정기능을 통해서만 볼 수 있다. (숨기기)
    private String bname;
    private int price;
    
    // 책이름과 가격정보는 각각 확인할 수 있다.
    public String getBname() {
        return bname;
    }

    public int getPrice() {
        return price;
    }
    
    // 반드시 책이 출판될떄 이름과 가격을 가진다.
    // public Book() {} (x) ..default(x) 강제해야하기 때문에 
    public Book(String name, int money) {
        bname = name;
        price = money;
    }
        
    public void bookInfo() {
        System.out.println("책 정보 : " + bname + "," + price);
    }

}
