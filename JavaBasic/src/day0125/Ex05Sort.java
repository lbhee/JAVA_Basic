package day0125;

// 정렬
// 값에 따라서 오름차순 혹은 내림차순으로
// 배열 안의 값들을 정리해주는 것
// 오름차순 : 인덱스가 작을수록 값도 작음
// 내림차순 : 인덱스가 작을수록 값은 큼

// 우리가 직접 만들어보자

public class Ex05Sort {
    public static void main(String[] args) {
        int[] intArray = {3, 1, 9, 4, 8, 2};
        
        for(int i = 0; i < intArray.length; i++) {
            System.out.printf("intArray[%d]: %d\n", i, intArray[i]);
        }
        
        // 우리가 구현할 정렬 방법은
        // 인덱스와 그 다음 인덱스 값을 비교해서
        // 만약 다음 인덱스가 더 작으면
        // 두개의 위치를 바꿔주고 처음부터 다시 검사하는 형식으로
        // 진행하게 된다.
        
        for(int i = 0; i < intArray.length - 1; i++) {
            if(intArray[i] > intArray[i+1]) {
                System.out.println(i+"번째가 "+(i+1)+"번째보다 크므로 바꾼다.");
                int temp = intArray[i];
                intArray[i] = intArray[i+1];                        
                intArray[i+1] = temp;
                i = -1;
                System.out.printf("%d %d %d %d %d %d\n",
                    intArray[0], intArray[1], intArray[2],
                    intArray[3], intArray[4], intArray[5]);
            }
        }
    }

}
