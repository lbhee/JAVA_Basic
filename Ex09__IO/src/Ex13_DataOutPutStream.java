import java.io.DataOutputStream;
import java.io.FileOutputStream;

/*
 * FileOutputStream , FileInputStream의 보조스트림
 * DataOutPutStream, DataInputStream
 * 장점 : java 8가지 기본타입 형식으로 read write 할 수 있다. (123을 읽어오면 문자열로 읽히는 것을)
 * 단, 위 함수들은 자기들끼리만 가능하다. (한쌍)
 * >> txt기록 > 규칙적인 방법(구분할 수 있는 구분자를 넣어줘야함) > 80 100 22 65
 * > split > 배열 > 정수 > 연산 이렇게 했어야 했음.
 * 
 * 
 */
public class Ex13_DataOutPutStream {
    public static void main(String[] args) {
        int[] score = {100, 60, 55, 94, 23};
        FileOutputStream fos = null;
        DataOutputStream dos = null;
        
        try {
            fos = new FileOutputStream("score.txt");
            dos = new DataOutputStream(fos);
            for(int i = 0; i < score.length; i++) {
                 dos.writeInt(score[i]); // 단, 무조건 read
                // dos.writeUTF(null); // 한글, 영문, 중문 모두 2바이트 ~ 3바이트기준 -> 깨지지않음.
            }
               
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                dos.close();
                fos.close();
            } catch (Exception e2) {
                // TODO: handle exception
            }
        }

    }
 // 결과는 깨져서 나온다. 규칙적인 방법이 아니므로. 따라서 DataInputStream으로 읽어야 안깨진다.
}
