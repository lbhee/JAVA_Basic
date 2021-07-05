import kr.or.bit.Card;

public class Ex07_Static_CardMake {
    public static void main(String[] args) {
        // Care 53장 만들기
        // heap메모리에 만드는 것(객체니까)
        Card c = new Card();
        c.number = 1;
        c.kind = "heart";
        c.h = 80;
        c.w = 50;
        c.cardInfo();
        
        Card c2 = new Card();
        c2.number = 2;
        c2.kind = "heart";
        c2.cardInfo();
        
        // 고객변심 -> 카드가 작아요! h=80 w=50으로 해주세요!
        // 해결방안은 ?
        // 53장의 카드값을 일일이 변경하지말고,
        // 설계도를 한번에 변경해라.
        // >> 한번에 변경가능하도록 처음부터 static변수로 만들어라!
        
       
        
       
        
    }

}
