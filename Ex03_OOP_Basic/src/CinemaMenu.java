import java.util.Random;
import java.util.Scanner;

public class CinemaMenu {

   private Scanner sc = new Scanner(System.in); 
   private Random random = new Random();

   private String[][] seat = new String[4][5];
   private int[] reservationNum = new int[8];
   private int[][] InputSeat = new int[4][5]; 

   
   // 예매하기
   public void reservation() {
      
      seatSave(seat);
      seatPrint(seat);

      System.out.println("=======================");
      System.out.println("선택할 좌석을 입력해주세요.");
      System.out.println("이미 예매된 좌석은 \"예매\"라고 표시됩니다.");

      System.out.print("행->");
      int row = sc.nextInt()-1;
      
      System.out.print("열->");
      int col = sc.nextInt()-1;

      if(InputSeat[row][col] == 0) {
         System.out.println("예매가능한 좌석입니다. 예매하시겠습니까?");
         System.out.println("네(1), 아니오(2), 초기화면(0)중 하나를 입력해주세요.");

         int select = sc.nextInt();

         for (int i = 0; i < reservationNum.length; i++) {
            
            int randonNum = random.nextInt(10);

            for (int j = 0; j < reservationNum.length; j++) {
               if (randonNum == reservationNum[j]) {
                  randonNum = random.nextInt(10);
                  j = -1;
               }
            }
            reservationNum[i] = randonNum;
         }

         switch(select) {
         case 1 :
            System.out.println("예매가 완료되었습니다.");
            System.out.printf("예매한 좌석번호:[%d-%d]", row+1, col+1);
            System.out.print(" / 예매번호:[");
            
            String reservationNumString = "";
            for(int value : reservationNum) {
                reservationNumString += value;
               System.out.print(value);
            }
            
            InputSeat[row][col] = Integer.parseInt(reservationNumString); // 예약저장
            System.out.println("] \n감사합니다." );
            break;

         case 2 : System.out.println("페이지가 종료되었습니다."); 
                System.exit(0);
            
         case 0 :

         }

      }else {
         System.out.println("이미 예매 되었습니다.");
         return;
      }
   }


   // 좌석배치도
   public void seatSave(String[][] seat){
      System.out.println("========좌석 현황========");
      for(int i = 0; i < seat.length; i++) {
         for(int j = 0; j < seat[i].length; j++) {
            seat[i][j] = "["+(i+1)+"-"+(j+1)+"]"; 
         }
      }
   }

   
   // 예매 출력
   public void seatPrint(String[][] seat){
      for(int i = 0; i < seat.length; i++) {
         for(int j = 0; j < seat[i].length; j++) {
            if(InputSeat[i][j] > 0) {
               System.out.print("[예매]");
            }else{
               System.out.print(seat[i][j]);
            }
         }
         System.out.println();
      }
   }


   //예매조회
   public void checkRecord() {
      System.out.println("예매번호를 입력해주세요. :");
      sc.nextLine();
      String num = sc.nextLine();

      for(int i = 0; i < InputSeat.length; i++) {
         for(int j = 0; j < InputSeat[i].length; j++) {
            if(InputSeat[i][j] == Integer.parseInt(num)) {
               System.out.println("고객님이 예매하신 좌석은 ["+(i+1)+"-"+(j+1)+"]입니다.");
               System.out.println();

               break;
            }
         }
      }
   }

   
   //예매취소
   public void cancleRecord() {
      System.out.println("예매번호를 입력해주세요. :");
      sc.nextLine();
      String num = sc.nextLine();

      for(int i = 0; i < InputSeat.length; i++) {
         for(int j = 0; j < InputSeat[i].length; j++) {
            if(InputSeat[i][j] == Integer.parseInt(num)) {
               System.out.println("고객님이 예매하신 좌석은 ["+(i+1)+"-"+(j+1)+"]입니다.");
               System.out.println();
               System.out.println("예매를 취소하시겠습니까?");
               System.out.println("네(1), 아니오(2) 중 하나를 입력해주세요.");
            }
         }
      }
      int cancleNum = sc.nextInt();
      if(cancleNum == 1) {
         System.out.println("예매가 취소되었습니다. 감사합니다.");
         System.out.println();
         for(int i = 0; i < InputSeat.length; i++) {
            for(int j = 0; j < InputSeat[i].length; j++) {
               if(InputSeat[i][j] == Integer.parseInt(num)) {
                  InputSeat[i][j] = 0;
               }
            }
         }
      }
   }

   
   //예매시작 메뉴
   int displayMenu() {
      System.out.println("*********************");
      System.out.println("****영화 예매 시스템****");
      System.out.println("1. 예매하기");
      System.out.println();
      System.out.println("2. 예매조회");
      System.out.println();
      System.out.println("3. 예매취소");


      int menu = 0;
      do {
         try {
            menu = sc.nextInt();
            if(menu >= 1 && menu <= 3) {
               break;
            }else {
               throw new Exception("메뉴 선택 번호가 잘못 되었습니다");
            }
         }catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("메뉴 선택 문제 발생");
            System.out.println("메뉴 1~3번까지 입력");
         }
      }while(true);
      return menu;
   }
}