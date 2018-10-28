import java.util.*;
public class Kornislav
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      int[] lengths =  {in.nextInt(), in.nextInt(), in.nextInt(), in.nextInt()};
      Arrays.sort(lengths);
      System.out.println(lengths[0] * lengths[2]);
   }
}