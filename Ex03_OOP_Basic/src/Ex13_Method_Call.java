/*
 * 함수의 parameter로
 * >>값 전달(call by value) 
 *  :
 *  
 * >>주소값 전달(call by reference)
 *  : 주소를 주는 것이기 때문에 값이 바뀌면 바뀐다!
 * 
 */
class Data{
    int i;
}


public class Ex13_Method_Call {
    public static void main(String[] args) {
        
        Data d = new Data();
        d.i = 100;
        System.out.println("d.i : " + d.i);
        
        // 주소값 전달
        scall(d); //scall의 파라미터가 갖는 Data라는 타입을 갖는 주소값을 parameter로 넘긴다.
        System.out.println("ater : d.i : " + d.i);
        
        // 값 전달
        vcall(d.i);
        System.out.println("d.i : " + d.i);
    }
    
    
    static void scall(Data sdata) {
        System.out.println("함수 : " + sdata.i);
        sdata.i = 111;
    }
    
    static void vcall(int x) {
        System.out.println("before x : " + x);
        x = 8888;
        System.out.println("after x : " + x);
    }

}
