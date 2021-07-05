import java.io.File;

public class CmdRename {
    public static void main(String[] args) throws Exception {

        if(args.length != 3 && args.length != 4) {
            System.out.println("사용법 : [파일경로] rename [대상파일명.확장자] [변경파일명.확장자]");
            System.exit(0);

        }

        File f = new File(args[0]);
        if(!f.exists() || !f.isDirectory()) {
            System.out.println("유효하지 않은 경로입니다");
            System.exit(0);
        }

        if(args[1].equals("rename")) {

            args[3] = f.getPath() + "\\" + args[3];

            File newfile = new File(args[3]);

            if(newfile.exists()) {
                System.out.println("이미 존재하는 파일명입니다.");
            }else {
                args[2] = f.getPath() + "\\" + args[2];
                File oldfile = new File(args[2]);
                oldfile.renameTo(newfile);

            }

        }
    }
}
