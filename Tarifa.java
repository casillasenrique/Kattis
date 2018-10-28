import java.util.*;
public class Tarifa
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      int lim = in.nextInt();
      int months = in.nextInt();
      int totalUsed = 0;
      int maxUsed = lim * months + lim;  
      for(int i = 0; i<months; i++)
         totalUsed += in.nextInt();

      System.out.println(maxUsed - totalUsed);
   }
}