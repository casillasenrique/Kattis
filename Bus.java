import java.util.*;
public class Bus
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      int cases = in.nextInt();
      
      for(int i = 0; i<cases; i++)
      {
         int numStops = in.nextInt();
         double passengers = 0;
         for(int j = 0; j<numStops; j++)
            passengers = (passengers + .5) * 2; 
         System.out.println((int)passengers);
      }
   }
}