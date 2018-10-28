import java.util.*;

public class JustAMinute
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      int cases = in.nextInt();
      
      double sumAct = 0, sumDisp = 0;
      for(int i = 0; i<cases; i++)
      {
            int displayMin = in.nextInt(), actualSec = in.nextInt();
            sumAct += ((double) actualSec / 60);
            sumDisp += (double) displayMin;
      }
     
      System.out.println((sumAct <= sumDisp) ? "measurement error" : sumAct/sumDisp);
   }
}