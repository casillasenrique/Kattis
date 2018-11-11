import java.util.*;
public class TheWeightOfWords_v4 {
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      int len = in.nextInt(), weight = in.nextInt();
      
      if(26*len < weight || len > weight)
         System.out.println("impossible");
      else {
         String word = "";
         for(int i = 0; i<len; i++)
            word += "a";
         
         int remainingWeight = weight - len;    
         for(int i = 0; i<len && remainingWeight != 0; i++) {
            char newChar;
            if(remainingWeight < 26) {
               newChar = (char)('a' + remainingWeight);
               remainingWeight = 0;
            }else {
               newChar = 'z';
               remainingWeight = remainingWeight - (newChar - 'a');              
            }
            word = word.replaceFirst(String.valueOf(word.charAt(i)), String.valueOf(newChar));  
         }      
         System.out.println(word);   
      }
      
      
   }
}