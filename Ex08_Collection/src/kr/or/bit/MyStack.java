package kr.or.bit;

// Stack 자료구조 설계하기 
// 1. 저장공간 필요하다 : Array : Object[] stackarr
// 2. MyStack my = new MyStack(); 하면 -> 기본적으로 배열이 생성되게 한다. (크기설정가능)
// 3. 배열의 위치정보(포인트)가 저장되는 변수가 필요하다.
// 기능 : push(Object), Object pop(), isEmpty, isFull

public class MyStack {
    private Object[] stackarr; // 저장공간
    private int maxsize; // 정보저장 최대크기
    private int top; // 배열의 인덱스(위치정보)
     
    public MyStack(int maxsize) {
        this.maxsize = maxsize;
        stackarr = new Object[maxsize];
        top = -1;
    }
    
    public boolean isEmpty() {
        return (top == -1); // 조건문의 값을 리턴 true, false
    }   
    
    public boolean isFull() {
        return (top == maxsize - 1);
    }
    
    public void push(Object i) {
        if(isFull()) {
            System.out.println("stack full..");
            // throw new ..예외
        }else {
            stackarr[++top] = i; // -1을 0으로 만들고 그 방에다가 데이터 저장
        }
    }
    
    public Object pop() {
        Object value = null;
        if(isEmpty()) {
            System.out.println("stack empty");
            // throw new .. 예외
        }else {
            value = stackarr[top];
            top--;
        }
        return value;
    }

}
