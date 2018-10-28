import java.util.*;

public class Faktor
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      int numArticles = in.nextInt(), factor = in.nextInt();
      
      System.out.println(numArticles * (factor-1) + 1);     
   }
}