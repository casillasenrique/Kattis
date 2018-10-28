import java.util.*;
public class EstimatingTheAreaOfACircle
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
           
      double r = in.nextDouble();
      int totalPts = in.nextInt();
      int ptsInCircle = in.nextInt();           
      while(r!=0 || totalPts!=0 || ptsInCircle!=0)
      {  
         double trueArea = Math.PI * r*r;
         double estimate = Math.pow(2*r,2) * ptsInCircle / (double) totalPts;  
         System.out.println(trueArea + " " + estimate); 
         
         r = in.nextDouble();
         totalPts = in.nextInt();
         ptsInCircle = in.nextInt();
      }
   }
}