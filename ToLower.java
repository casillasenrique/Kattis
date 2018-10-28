import java.util.*;

public class ToLower
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      int numProblems = in.nextInt(), cases = in.nextInt(), solved = 0;
      
      for(int i = 0; i<numProblems; i++)
      {
         String testCase;
         boolean allCorrect = true;
         for(int j = 0; j<cases; j++)
         {
            testCase = in.next();
            if(allCorrect)
            {
               String temp = "" + Character.toLowerCase(testCase.charAt(0)) + testCase.substring(1);
               if(!testCase.toLowerCase().equals(temp))
                  allCorrect = false;
            }
         }
         
         if(allCorrect)
            solved++;   
      }
      System.out.println(solved);
   }
   
   
}