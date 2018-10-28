import java.util.*;

public class Pot
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      int nTerms = in.nextInt(), sum = 0, term;
      for(int i = 0; i<nTerms; i++)
      {
         term = in.nextInt();
         sum += Math.pow(term/10, term%10);
      }
      
      System.out.println(sum);
   }
}