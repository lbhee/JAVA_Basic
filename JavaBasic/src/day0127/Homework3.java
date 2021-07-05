package day0127;
/*
어느 학생의 기말고사 시험점수 (5과목)
        int sum=0;
        float average = 0f;
        int[] jumsu = {100,55,90,60,78};
        
        1. 총과목의 수
        2. 과목의 합
        3. 과목의 평균
        단 2,3  문제는 하나의  for  으로 해결하세요
*/

public class Homework3 {
    public static void main(String[] args) {
        
        int sum = 0;
        float average = 0f;
        int[] jumsu = {100,55,90,60,78};
        
        int su = jumsu.length;
        
        for(int i = 0; i < jumsu.length; i++) {
            sum += jumsu[i];
            average = sum / su;          
            
        }       
    }

}
