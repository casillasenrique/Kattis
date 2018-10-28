import java.util.*;

public class ColdputerScience
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
 
      int cases = in.nextInt(), counter = 0;
      for(int i = 0; i<cases; i++)
         if(in.nextInt() < 0)
            counter++;
      
      System.out.println(counter);
   }
}