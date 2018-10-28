import java.util.*;

public class Trik
{
   public static int executeSequence(String move, int loc)
   {
      if(move.equals("A"))
      {
         if(loc == 1)
            return 2;
         else if(loc == 2)
            return 1;
      }else if(move.equals("B"))
      {
         if(loc == 2)
            return 3;
         else if(loc == 3)
            return 2;
      }else if(move.equals("C"))
      {
         if(loc == 1)
            return 3;
         else if(loc == 3)
            return 1;
      }
      
      return loc;                            
   }
   
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      int ball = 1;
      String[] moves = in.next().split("");
      
      for(String move: moves)
         ball = executeSequence(move, ball);
      
      System.out.println(ball);
   }
}