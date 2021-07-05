package day0127;

// 수학과 학생들의 기말고사 시험점수
// int[] score = new int[] {79,88,97,54,56,95};
// int max = score[0];  //max 변수 >> 79
// int min  = score[0]; //min  변수 >> 79


/*
 제어문을 사용해서  max  라는 변수에 시험점수 최대값을
 min  라는 변수에 시험점수 최소값을 담으세요
 출력결과 : max > 97 , min > 54
 단 for 문을 한번만 사용하세요 (max , min 하나의  for문)
  
*/

public class Homework1 {
    public static void main(String[] args) {
        
        int[] score = new int[] {79,88,97,54,56,95};
        int max = score[0];
        int min = score[0];
        
        for(int i = 0; i < score.length - 1; i++) {
            if(score[i] > score[i + 1]) {
                int temp = score[i];
                score[i] = score[i + 1];
                score[i + 1] = temp;
                i = -1;
                
                max = score[5];
                min = score[0];
            }
        }
        
        System.out.println("max > " +max+" , min > "+min);
        
    }

}
