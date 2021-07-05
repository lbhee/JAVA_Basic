
public class Ex01_Array {

    public static void main(String[] args) {
        // 다차원 배열(2차원)
        // [행] [열]
        // 좌석, 지도 좌표값(경도/위도), 바둑
        
        int[][] score = new int[3][2];
        System.out.println(score[0][0]); //초기화를 한것이 아니고, 배열도 객체이기 때문에 default값이 있는 것.
        
        // 값 넣기
        score[0][0] = 100;
        score[0][1] = 200;
        
        score[1][0] = 300;
        score[1][1] = 400;
        
        score[2][0] = 500;
        score[2][1] = 600;
        
        // 2차원 배열의 값을 출력하려면
        // for문 2개 필요하다.
        // 행의 개수 : 배열이름.length -> score.length
        // 열의 개수 : 배열이름[0].length ->score[0].length
        // (열의 개수는 행마다 다를 수 있다.)        
        for(int i = 0; i < score.length; i++) {
            for(int j = 0; j < score[i].length; j++) {
                System.out.printf("score[%d][%d]=%d\t", i, j, score[i][j]);
            }
            System.out.println();
        }
        
        
        // 1차원 배열의 개선된 for문
        int[] arr = {10,20,30};
        for(int value : arr) {
            System.out.println(value);
        }
        
        
        // 3행 2열짜리 배열을 만들어서 초기화
        int[][] score3 = new int[][] {
            {11, 12},
            {13, 14},
            {15, 16},
        };
        
        // 개선된 for문 2개를 사용해서
        // score3이 가지고 있는 배열의 값을 출력해보세요.
        // for(int value : Array) {}
        // 행의 주소값(열 배열의 주소)을 넘겨준다.
        for(int[] col : score3) {
            for(int value : col) {
                System.out.println("값 : " + value);
            }
        }

    }

}
