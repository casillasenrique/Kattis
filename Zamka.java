import java.util.*;

public class Zamka
{
   public static boolean sumDigits(int number, int requiredSum) 
   {
      int sum = 0;
      while(number > 0)
      {
         sum += number % 10;
         number/=10;
      }
      return sum == requiredSum; 
   }
   
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      int lowerBound = in.nextInt(), upperBound = in.nextInt(), x = in.nextInt();
      
      int min = lowerBound, max = upperBound;
      boolean found = false;
      while(min <= upperBound && !found)
      {
         if(sumDigits(min, x))    
            found = true;
         else
            min++;
      }
      
      found = false;
      while(max >= min && !found)
      {
         if(sumDigits(max, x))
            found = true;
         else
            max--;   
      }
      
      System.out.println(min + "\n" + max);
   }
}