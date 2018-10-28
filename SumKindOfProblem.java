import java.util.*;

public class SumKindOfProblem
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      int cases = in.nextInt(), num;
      for(int k = 1; k <= cases; k++)
      {
         in.next();         
         num = in.nextInt();
         int sumInt = 0, sumOdd = 0, sumEven = 0;
         for(int i = 0; i <= num*2; i++)
         {
            if(i <= num)
               sumInt += i;
            
            if(i%2 == 1)
               sumOdd += i;
            else   
               sumEven += i;
                
         }
         System.out.println(k + " " + sumInt + " " + sumOdd + " " + sumEven);
      }
   }
}