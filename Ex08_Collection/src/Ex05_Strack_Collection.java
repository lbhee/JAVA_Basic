import java.util.Stack;

import kr.or.bit.MyStack;

/* JAVA API
 * Stack, Queue 제공
 */

public class Ex05_Strack_Collection {
    public static void main(String[] args) {
        Stack s = new Stack(); // 후입선출
        s.push("A"); // 넣기 push()
        s.push("B");
        System.out.println(s.pop()); // 빼내기 pop()
        System.out.println(s.pop());
        // System.out.println(s.pop()); // 꺼낼 데이터가 없는데 pop()을하면 에러!         
        System.out.println(s.isEmpty());
        
        // ----------------------------------------------------------------------------------------
        
        // 직접만든 Stack
        MyStack my = new MyStack(5);
        System.out.println(my.isEmpty());
        System.out.println(my.isFull());
        my.push("A");
        my.push("B");
        my.push("C");
        my.push("D");
        my.push("E");
        my.push("F");
        System.out.println(my.pop());
        System.out.println(my.pop());
        System.out.println(my.pop());
        System.out.println(my.pop());
    }

}
