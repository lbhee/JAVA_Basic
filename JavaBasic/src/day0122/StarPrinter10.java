package day0122;

import java.util.Scanner;

public class StarPrinter10 {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);
        System.out.println("*****별 찍기 10번*****");
        System.out.print("출력할 줄 수를 입력해주세요: ");
        
        int num = scanner.nextInt();
        
        // 총 줄 수
        for(int i = 1; i <= 2 * num -1; i++) {
            String stars = new String();
            
            int totalWidth = 2 * num -1;
            
            if(i == 1 || i == 2 * num - 1) {
            
        
            // 첫번째 줄 혹은 제일 마지막 줄 인 경우
            // 별을 2 * num - 1개 만큼 넣어준다.
            
                for(int j = 1; j <= totalWidth; j++) {
                stars += "*";     
                }
         
            } else if(i <= num - 1) {
                // 첫번째 줄을 제외한 윗부분
                int upperI = i - 1;
             
                // 해당 줄의 왼쪽 혹은 오른쪽의 별의 갯수
                int starWidth = num - upperI;
             
                // 왼쪽 별 부분
                for (int j = 1; j <= starWidth; j++) {
                    stars += "*";             
                }
                // 해당 줄의 공백의 갯수
                //  = 총 너비 - 별의 갯수
                int spaceWidth = totalWidth - 2 * starWidth;
             
                // 가운데 공백 부분
                for(int j = 1; j <= spaceWidth; j++) {
                 stars += " ";
                }
             
                // 오른쪽 별 부분
                for(int j = 1; j <= starWidth; j++) {
                 stars += "*";
                }     
                
           } else {
             // 맨 마지막 줄을 제외한 아랫부분
             int lowerI = i - num + 1;
             
             // 해당 줄의 별의 갯수
             int starWidth = lowerI;
             
             // 왼쪽 별을 부분
             for(int j = 1; j <= starWidth; j++) {
                 stars += "*";
             }
             
             // 해당 줄의 공백의 갯수
             int spaceWidth = totalWidth - 2 * starWidth;
             
             // 가운데 공백을 담당
             for(int j = 1; j <= spaceWidth; j++) {
                 stars += " ";
             }
             
             // 오른쪽 별을 담당
             for(int j = 1; j <= starWidth; j++) {
                 stars += "*";
             }
             
           }
           System.out.println(stars);
        
        } 
        scanner.close();
    
    }
}
