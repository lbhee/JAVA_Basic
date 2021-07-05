import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Ex11_Set_Tree {
    public static void main(String[] args) {
        // Set 인터페이스 : 순서(X), 중복(X)
        HashSet<String> hs = new HashSet<String>();
        
        hs.add("G");
        hs.add("B");
        hs.add("F");
        hs.add("D");
        hs.add("E");
        hs.add("A");
        hs.add("C");
        hs.add("D");
        hs.add("S");
        System.out.println(hs.toString()); // 정렬되서 나오지 않음.
        
        // TreeSet
        // 순서(X), 중복(X), 정렬(O)
        // 검색과 정렬에 유리한 자료구조(데이터 집합)
        
        // 1. 이진트리구조
        // 2. 데이터가 저장될 때 정렬된다.(부메랑모양)
        // 로또
        Set<Integer> lotto = new TreeSet<Integer> ();
        for(int i = 0; lotto.size() < 6; i++) {
            lotto.add((int)(Math.random()*45 + 1));
        }
        System.out.println(lotto.toString());
    }

}
