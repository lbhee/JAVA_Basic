import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Today Point!!!!!!!!!!!!!!!!!!

public class Ex02_ArrayList {

    public static void main(String[] args) {
        // List 인터페이스 구현 : 순서O , 중복허용 데이터집합을 다룰 때 쓰는 클래스
        ArrayList arraylist = new ArrayList();        
        // Object 타입을 가지는 정적배열 heap 생성
        
        arraylist.add(100);
        arraylist.add(200);
        arraylist.add(300);
        
        for(int i = 0; i < arraylist.size(); i++) {
            System.out.println(arraylist.get(i));
        }
        
        System.out.println(arraylist.toString()); // 배열 값 전체 출력
        
        System.out.println(arraylist.get(0)); // 0번째 위치 데이터 값 출력
        
        // 순차적인 데이터를 다루는 것의 장단점
        // 장점 -> 순서대로 나열하기 쉽다.
        // 단점 -> 비순차적인 데이터추가/삭제가 어렵다.(중간에 데이터를 끼워넣으려면 다 밀어야한다, 삭제하면 다 떙겨야한다)
        // >> 따라서 arraylist는 순서가 있는 데이터의 집합들을 다룰때 사용해야 좋다. 
        
        arraylist.add(0, 111); // 0번쨰방에 111을 넣는다. 한칸씩 밀린다.
        System.out.println(arraylist);
        
        arraylist.add(400); // 다음방에 넣는다.
        System.out.println(arraylist);
        
        // arraylist.remove(100); // 에러! 100번째 방 없음.
        arraylist.remove(1); // 1번째 방의 값을 지운다.
        System.out.println(arraylist);
        
        System.out.println(arraylist.contains(200)); // 배열안에 200이라는 값을 가지고 있니?
        System.out.println(arraylist.contains(2000)); // 20000 ?
        
        arraylist.clear(); // 데이터만 삭제하고 공간은 유지!
        System.out.println(arraylist.size());
        System.out.println(arraylist.isEmpty()); // 데이터공간이 비워져 있니?
        
        arraylist.add(101); // 다시 0번째 방부터 순차적으로 저장
        arraylist.add(102);
        arraylist.add(103);
        System.out.println(arraylist.isEmpty());
        
        System.out.println("삭제전" + arraylist.size());
        Object value = arraylist.remove(0); // 0번째방의 값을 삭제..추후 복원을 위해 object에서 그 값을 보관가능(return) 
        System.out.println("value : " + value);
        System.out.println("삭제후" + arraylist.size());
        System.out.println(arraylist.toString());
        
        // POINT!!!!!
        // 개발자가 쓰는 코드
        // 다형성(확장성, 유연성)
        // List(부모) -> ArrayList(자식) 
        List li = new ArrayList();
        li.add("가");
        li.add("나");
        li.add("다");
        li.add("라");
        
        List li2 = li.subList(0, 2); // subList를 통해서 데이터 집합을 하나더 생성하겠다. (0~1번째 방까지)
        System.out.println(li2.toString());
        
        ArrayList alist = new ArrayList();
        alist.add(50);
        alist.add(1);
        alist.add(7);
        alist.add(40);
        alist.add(46);
        alist.add(3);
        alist.add(15);
        
        System.out.println(alist.toString()); // 0번째 방부터 쭉 출력
        
        Collections.sort(alist); // 오름차순정렬해서 출력
        System.out.println(alist.toString()); 
        
        Collections.reverse(alist); // 내림차순 정렬은 없다. 오름차순을 반대로 뒤집어서 출력
        System.out.println(alist.toString());
       
    }
    

}
