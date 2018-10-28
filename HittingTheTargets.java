import java.util.*;

public class HittingTheTargets
{
   public static class Rectangle
   {
      private int x1, y1, x2, y2;
      
      public Rectangle(int r, int b, int l, int t)
      {
         x1 = r;
         y1 = b;
         x2 = l;
         y2 = t;
      }
      
      public boolean hitBy(int x, int y)
      {
         return x >= x1 && x <= x2 && y >= y1 && y <= y2; 
      }
   }
   
   public static class Circle
   {
      private int h, k, r;
      
      public Circle(int x, int y, int r)
      {
         h = x;
         k = y;
         this.r = r;
      }
      
      public boolean hitBy(int x, int y)
      {
         return Math.sqrt(Math.pow((y - k),2) + Math.pow((x - h),2)) <= r;
      }
   }
   
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in); 
      int numTargets = in.nextInt();
      ArrayList<Rectangle> rects = new ArrayList<Rectangle>();
      ArrayList<Circle> circles = new ArrayList<Circle>();
       
      for(int i = 0; i<numTargets; i++)
      {
         String type = in.next();
         if(type.equals("rectangle"))
            rects.add(new Rectangle(in.nextInt(), in.nextInt(), in.nextInt(), in.nextInt()));
         else if(type.equals("circle"))
            circles.add(new Circle(in.nextInt(), in.nextInt(), in.nextInt()));       
      }
      
      int cases = in.nextInt();
      for(int i = 0; i<cases; i++)
      {
         int x = in.nextInt(), y = in.nextInt(), targetsHit = 0;
         for(Rectangle r: rects)
            if(r.hitBy(x,y))
               targetsHit++;
         for(Circle c: circles)
            if(c.hitBy(x,y))
               targetsHit++;
               
         System.out.println(targetsHit);      
      }
   }
}