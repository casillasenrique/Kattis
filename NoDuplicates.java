import java.util.*;
public class NoDuplicates
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      HashSet<String> words = new HashSet<String>();
      boolean flag = false;
      String newWord;
      
      Scanner sScanner = new Scanner(in.nextLine());
      in.close();
      
      words.add(sScanner.next());
      
      while(sScanner.hasNext() && !flag)
      {
         newWord = sScanner.next();
         if(words.contains(newWord))
            flag = true; 
         else
            words.add(newWord);   
      }
      
      System.out.println((flag) ? "no" : "yes"); 
   }
}