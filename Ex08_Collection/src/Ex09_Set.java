import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// Set 인터페이스를 구현하는 클래스
// Set -> 원 안에 들어가세요. (순서보장X , 중복허용X)
// : 순서가 없고 중복을 허락하지 않는 데이터의 집합 -> 로또
// HashSet, TreeSet
public class Ex09_Set {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<Integer>();
        hs.add(1);
        hs.add(100);
        boolean bo2 = hs.add(55);
        System.out.println(bo2); // true 정상적으로 값이 들어갔다.
        bo2 = hs.add(1); 
        System.out.println(bo2); // false 중복값이므로 들어가지 못한다.
        
        System.out.println(hs.toString()); // 배열아님!! 그냥 자루안에 들어가있는 것이다.
        
        hs.add(2);
        System.out.println(hs); // 2가 자동으로 중간에 낄 수도 있음. 순서가 보장되지 않음(배열이 아니니까)
        
        HashSet<String> hs2 = new HashSet<String>();
        hs2.add("b");
        hs2.add("A");
        hs2.add("F");
        hs2.add("c");
        hs2.add("Z");
        hs2.add("A");
        hs2.add("A");
        hs2.add("A");
        System.out.println(hs2.toString()); // 중복없이 출력.
        
        String[] obj = {"A", "B", "C", "D", "D", "A"};
        HashSet<String> hs3 = new HashSet<String>();
        for(int i = 0; i < obj.length; i++) {
            hs3.add(obj[i]); // 여기서 중복을 걸러줌.
        }
        System.out.println(hs3.toString());
        
        // Quiz 
        // HashSet을 사용해서 1~45 난수 6개를 넣으세요.        
        // 내가쓴 답
        HashSet<Integer> lotto = new HashSet<Integer>();        
        for(int i = 0; i < 6; i++) {
            lotto.add((int)(Math.random()*45 +1));
        }
        System.out.println(lotto);   
        
        // 강사님 답1
        HashSet<Integer> lotto2 = new HashSet<Integer>();
        for(int i = 0; lotto.size() < 6; i++) {
            int num = (int)(Math.random()*45 +1);            
        }
        System.out.println(lotto);
        
        // 강사님 답2 -> 다형성 Set 인터페이스 받기
        Set set2 = new HashSet();
        while(set2.size() < 6) {
            int num = (int)(Math.random()*45 +1);
            set2.add(num);
        }
        System.out.println(set2);
        
        // ---------------------------------------------------------------------------------------
        
        HashSet<String> set3 = new HashSet<String>();
        set3.add("AA");
        set3.add("DD");
        set3.add("ABC");
        set3.add("FFF");
        System.out.println(set3.toString());
        
        // iterator로 출력하기
        Iterator<String> iter = set3.iterator();
        while(iter.hasNext()) {
            System.out.println(iter.next()); // Set은 배열이 아니니까 순서를 보장할 순 없지만,
                                             // 순차적으로 데이터 출력이 가능하다.
        };
        
    }
    

}
