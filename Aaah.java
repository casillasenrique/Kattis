import java.util.*;

public class Aaah
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      int actualAhLen = in.next().length();
      System.out.println((in.next().length() <= actualAhLen) ? "go" : "no");
   }
}