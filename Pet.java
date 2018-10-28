import java.util.*;

public class Pet
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      
      int maxPts = 0, winner = 1;
      for(int i = 0; i<5; i++)
      {
         int sum = 0;
         for(int j = 0; j<4; j++)
            sum += in.nextInt();
         
         if(sum > maxPts)
         {
            maxPts = sum;   
            winner = i + 1;
         }
      }
      
      System.out.println(winner + " " + maxPts);
   }
}