import java.util.*;

public class Planina
{
   public static int iterate(int numIterations)
   {
      if(numIterations == 0)
         return 4;
      return (int) (Math.pow(4, numIterations-1) + Math.pow(2, numIterations-1) * (Math.pow(2, numIterations) + 1)+ Math.pow(2, numIterations-1)) + iterate(numIterations-1);   
   }
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      int numIterations = in.nextInt();
      int numPoints = iterate(numIterations);     
      System.out.println(numPoints);
      //(4^0 + (2^1 + 1)*2^0 + 2^0) (4 + 5*2 + 2) (16 + 9*4 + 4) (64 + 17*8 + 8)  
   }
}