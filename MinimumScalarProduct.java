import java.util.*;
public class MinimumScalarProduct
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      int cases = in.nextInt();
      
      int[] v;
      int[] u;
      for(int i = 0; i<cases; i++)
      {
         int vectorDimension = in.nextInt();
         v = new int[vectorDimension];
         u = new int[vectorDimension];     
         for(int j = 0; j<vectorDimension; j++)
            v[j] = in.nextInt();   
         
         for(int j = 0; j<vectorDimension; j++)
            u[j] = in.nextInt();
            
         Arrays.sort(v);
         Arrays.sort(u);      
         
         long dotProduct = 0;
         for(int j = 0; j<vectorDimension; j++)
            dotProduct += (long)v[j] * (long)u[vectorDimension-1-j];
            
         System.out.println("Case #" + (i+1) + ": " + dotProduct);   
      }
   }
}