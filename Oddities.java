import java.util.*;

public class Oddities
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      int cases = in.nextInt();
     
      int num;
      for(int i = 0; i<cases; i++)
      {
         num = in.nextInt();
         System.out.println(num + " is " + ((num%2 == 0) ? "even" : "odd"));
      }
   }
}