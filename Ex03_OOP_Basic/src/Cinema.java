public class Cinema {

    public static void main(String[] args) {
        CinemaMenu menu = new CinemaMenu();
        
        while(true) {
            switch (menu.displayMenu()) {
            case 1 : menu.reservation();
                break;
            case 2 : menu.checkRecord();
                break;
            case 3 : menu.cancleRecord();
                break;
            case 4 : System.out.println("프로그램 종료");
                     //return;  //main 종료
                     System.exit(0); //프로그램 강제 종료 (kill)
            }
        }
    }
}


