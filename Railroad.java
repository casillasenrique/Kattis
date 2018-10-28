import java.util.*;
public class Railroad
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      in.nextInt();
      int y = in.nextInt();
      System.out.println((y%2 != 0) ? "impossible" : "possible"); 
   }
}