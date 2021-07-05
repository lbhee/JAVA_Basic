import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/*
 * Collection FrameWork
 * 표준화
 * [나열된 자원에 대해서 순차적으로 접근해서 값을 리턴하는 표준] >> 인터페이스 설계
 * 
 * Iterator 인터페이스
 * >> hasNext() , Next() , remove() 추상함수
 * >> ArrayList가 Iterator 구현
 * 
 * public Iterator iterator() {
 *      return new A implements Iterator
 * }
 * 
 */
public class Ex08_Collection_iterator {

    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(100);
        list.add(200);
        list.add(300);
        
        // 출력(문제없지만 실수할 요지가 있음)
        for(int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        
        // 그러므로 표준화된 출력방식을 써라. (나열된 자원에 대해서만)
        // iterator 순차적으로 데이터가 있는지 조회하는 것.
        Iterator it = list.iterator(); 
        // ArrayList가 Collection인터페이스가 가지고 있는 추상함수를  
        // public Iterator iterator(); >> 이렇게 구현했다.
        while(it.hasNext()) { // 값을 가지고 있니?
            System.out.println(it.next()); // 값 출력
        }
        
        // 정수값만 넣을 수 있게 제너릭!
        ArrayList<Integer> intlist = new ArrayList<Integer>();
        intlist.add(10);
        intlist.add(11);
        intlist.add(12);
        
        Iterator<Integer> it2 = intlist.iterator();
        while(it2.hasNext()) { 
            System.out.println(it2.next());
        }
        
        System.out.println("*******************");
        // Iterator 인터페이스
        // 역방향 조회(조건 : 순방향 -> 다시 역방향)
        ListIterator<Integer> it3 = intlist.listIterator();
        
        // 순방향
        while(it3.hasNext()) {
            System.out.println(it3.next());
        }
        
        // 역방향
        while(it3.hasPrevious()) {
            System.out.println(it3.previous());
        }
    }

}
