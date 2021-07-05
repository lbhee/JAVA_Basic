
class Human{
    String name;
}



class Test{
    // 1번
    int add(int i, int j) {
        return i + j;
    }
    
    // 2번
    // 배열도 객체다(heap에 생성되며 주소값을 갖는다.)
    int[] add2(int[] param) { // int[] 주소값을 리턴값을 리턴, int[] 배열의 주소값을 받겠다.)
        // return null; 가능하다!
        // return new int[5]; 가능하다! heap메모리에 배열5개를 만들고 그 주소값을 리턴하라.
        int[] arr = new int[param.length];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = param[i] + 1;
        }
        return arr;
    }
    
    // 함수안에 코드를 여러분 마음대로 작성하고
    // main함수 안에서 가지고 놀아보세요.
    int[] add3(int[] so, int[] so2) {
        int[] soso = new int[so.length];        
        for(int i = 0; i < soso.length; i++) {
            soso[i] = so[i] + so2[i];
        }
        return soso;
    }
}



public class Ex03_MethodCall_Array {
    public static void main(String[] args) {
        
        Test t = new Test();
        
        // 1번.
        int result = t.add(10, 10);
        System.out.println("result : " + result);
        
        // 2번.
        int[] array = {10, 20, 30};
        int[] resultarray = t.add2(array);
        for(int i : resultarray) {
            System.out.println("i : " + i);
       }
        
        // add3()을 가지고 놀아보세요.
        int[] soarray = {100, 100, 100};
        int[] soarray2 = {1, 2, 3};
        int[] resultsoarray = t.add3(soarray, soarray2);
        for(int i : resultsoarray) {
            System.out.println(i);
        }
        
    }

}
