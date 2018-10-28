import java.util.*;
public class Apaxiaaans
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      String[] letters = in.next().split(""); 
      
      String currentLetter = letters[0];
      System.out.print(currentLetter);
      for(int i = 1; i<letters.length; i++)
      {
        if(letters[i].equals(currentLetter))
           System.out.print("");
        else
        {
           currentLetter = letters[i]; 
           System.out.print(currentLetter);  
        }      
      }    
   }
}