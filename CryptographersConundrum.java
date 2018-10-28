import java.util.*;

public class CryptographersConundrum
{
   public static void main(String[] args)
   { 
      Scanner in = new Scanner(System.in);
      String cipherText = in.next();
      int dayCount = 0, temp;
      
      char currentLetter;
      
      for(int i = 0; i < cipherText.length(); i++)
      {
         currentLetter = cipherText.charAt(i);
         
         temp = i%3;
         if(temp == 0 && currentLetter != 'P')
            dayCount++;
         else if(temp == 1 && currentLetter != 'E')
            dayCount++;
         else if(temp == 2 && currentLetter != 'R')
            dayCount++;           
      }
   
      System.out.printf("%d\n", dayCount);
   
   }
}