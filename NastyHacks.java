import java.util.*;

public class NastyHacks
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      int cases = in.nextInt();
      for(int i = 0; i<cases; i++)
      {
         int initRevenue = in.nextInt();
         int adRevenue = in.nextInt();
         int adCost = in.nextInt();
         
         int profit = adRevenue - adCost;
         
         if(profit == initRevenue)
            System.out.println("does not matter");
         else
            System.out.println(((profit > initRevenue) ? "" : "do not ") + "advertise");
      }
   }
}