import java.util.*;
public class QuickBrownFox
{
   public static void main(String[] args)
   {
      final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
      
      Scanner in = new Scanner(System.in);
      int cases = in.nextInt();
      ArrayList<String> letterBank;
      in.nextLine();
      String sentence;
      for(int i = 0; i<cases; i++)
      {
         letterBank = new ArrayList<String>(Arrays.asList(ALPHABET.split("")));
         letterBank.remove(0);
         
         System.out.println(letterBank.size());

         sentence = in.nextLine().replaceAll("[ .,?!'\"0123456789]", "").toLowerCase();

         for(int j = 0; j<sentence.length() && letterBank.size() > 0; j++)
         {
            
            letterBank.remove(String.valueOf(sentence.charAt(j)));  
            System.out.println(letterBank.size());
         }
         if(letterBank.size() > 0)
         {
            String missingLetters = "";
            for(String s: letterBank)
               missingLetters += s;
            System.out.println("missing " + missingLetters);   
         }
         else
            System.out.println("pangram");   
      }
   
   }
}
