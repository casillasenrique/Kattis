import java.util.*;
import java.io.*;
public class SevenWonders
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      String cardSet = in.nextLine();
      
      int numCs = 0;
      int numTs = 0;
      int numGs = 0;
      
      int points = 0; 
      
      for(int i = 0; i<cardSet.length(); i++)
      {
         char cardType = cardSet.charAt(i);
         if(cardType == 'C')
            numCs++;
         else if(cardType == 'T')
            numTs++;
         else 
            numGs++;
      }
      
      int minCount = numCs;
      
      if(numTs < minCount)
         minCount = numTs;
      if(numGs < minCount)
         minCount = numGs;
      
      points = (int)(Math.pow(numCs,2) + Math.pow(numTs,2) + Math.pow(numGs,2)) + 7*minCount;
     
      System.out.println(points);
      
   }
}