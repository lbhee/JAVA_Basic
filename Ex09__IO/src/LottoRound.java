import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;
import java.util.TreeSet;

public class LottoRound {
   private Set<Integer> lotto;
   
   public LottoRound() {
      lotto = new TreeSet<Integer>();
   }

   public Set<Integer> LottoNum(){
      
      for(int i = 0; lotto.size() < 6; i++) {
         lotto.add((int)(Math.random()*45+1));
       }           
      return lotto;
   }

   public void write() throws IOException{

      FileWriter fw = new FileWriter("Lotto_Result.txt",true);
      BufferedWriter bw = new BufferedWriter(fw);      
      Date today = new Date();
      SimpleDateFormat day = new SimpleDateFormat("yyyy-MMM-dd HH:mm");
      bw.write("로또 번호 : " + LottoNum() + " [" + day.format(today) + "]");      
      bw.newLine();
      bw.flush();
   }

}