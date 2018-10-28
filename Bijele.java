import java.util.*;

public class Bijele
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      int[] actualPieces = {in.nextInt(), in.nextInt(), in.nextInt(), in.nextInt(), in.nextInt(), in.nextInt()};
      
      System.out.print(1 - actualPieces[0] + " ");
      System.out.print(1 - actualPieces[1] + " ");
      System.out.print(2 - actualPieces[2] + " ");
      System.out.print(2 - actualPieces[3] + " ");
      System.out.print(2 - actualPieces[4] + " ");
      System.out.print(8 - actualPieces[5]);         
   }
}