import java.util.*;
public class CompletingTheSquare
{
   public static double dist(int x1, int y1, int x2, int y2)
   {
      int dx = x1-x2, dy = y1 - y2;
      return Math.sqrt(dx*dx + dy*dy);
   }

   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      int a = in.nextInt();
      int b = in.nextInt();
      int c = in.nextInt();
      int d = in.nextInt();
      int e = in.nextInt();
      int f = in.nextInt();
      
      if(Math.abs(dist(a,b,c,d) - dist(c,d,e,f)) != 0)
      {
         int tempX = c; 
         c = e;
         e = tempX;
         
         int tempY = d;
         d = f;
         f = tempY;
      }
      
      if(Math.abs(dist(a,b,c,d) - dist(c,d,e,f)) != 0)
      {
         int tempX = a; 
         a = c;
         c = tempX;
         
         int tempY = b;
         b = d;
         d = tempY;
      }
         
      
      //System.out.println("(a,b): (" + a + "," + b + ")");
      //System.out.println("(c,d): (" + c + "," + d + ")");
      //System.out.println("(e,f): (" + e + "," + f + ")");
      
      int x = a + e - c;
      int y = b + f - d;
      System.out.println(x + " " + y);
   }
}