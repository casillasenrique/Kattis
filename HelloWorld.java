import java.util.Scanner;
public class TwoStones
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      int stones = in.nextInt();
      System.out.println((stones%2 == 0) ? "Bob" : "Alice");
   }
}