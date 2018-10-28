import java.util.*;
import java.awt.*;
public class Beehives 
{
   public static class Point
   {
      private double x,y;
      public Point(double x, double y)
      {
         this.x = x;
         this.y = y;
      }
   	
      public double distance(Point p)
      {
         double dx = this.x - p.x;
         double dy = this.y - p.y;
         return Math.sqrt(dx*dx + dy*dy);
      }
      
      public String toString()
      {
         return "(" + x + "," + y + ")";
      }
   }
   
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      double safeDist = in.nextDouble();
      int numHives = in.nextInt();
      int numSour, numSweet;
      
           //Sweet is true, sour is false
      HashMap<Point,Boolean> hives = new HashMap<Point,Boolean>();
      
      while(safeDist != 0 || numHives != 0)
      {
         numSour = 0; 
         numSweet = 0;
         hives = new HashMap<Point, Boolean>();
         for(int i = 0; i<numHives; i++)
            hives.put(new Point(in.nextDouble(),in.nextDouble()), true);

         for(Map.Entry<Point,Boolean> hive: hives.entrySet())
            for(Map.Entry<Point,Boolean> checkHive: hives.entrySet())
               if(!hive.equals(checkHive) && hive.getKey().distance(checkHive.getKey()) < safeDist)
               {
                  //System.out.println("Hive: " + hive.getKey() + " CheckHive: " + checkHive.getKey());
                  hives.put(hive.getKey(), false);
               }
               
         for(Map.Entry<Point,Boolean> hive: hives.entrySet())
            if(!hive.getValue())
               numSour++;
            else
               numSweet++;   
               
         System.out.println(numSour + " sour, " + numSweet + " sweet");
         safeDist = in.nextDouble();
         numHives = in.nextInt();
      }
   }
}