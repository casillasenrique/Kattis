import java.util.*;

public class Sibice
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      int numMatches = in.nextInt(), width = in.nextInt(), length = in.nextInt();
      double maxLength = Math.sqrt((double)(Math.pow(width,2) + Math.pow(length,2)));
      
      int matchLength;
      for(int i = 0; i<numMatches; i++)
      {
         matchLength = in.nextInt();
         if(matchLength <= maxLength)
            System.out.println("DA");
         else
            System.out.println("NE");   
      }   
   }
}