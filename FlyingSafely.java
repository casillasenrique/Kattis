import java.util.*;
public class FlyingSafely
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      int cases = in.nextInt(), numCities, numPilots;
      for(int i = 0; i<cases; i++)
      {
         numCities = in.nextInt();
         numPilots = in.nextInt();
         
         for(int j = 0; j<numPilots*2; j++)
               in.nextInt();
   
         System.out.println(numCities - 1);
      }
 
   }
}
