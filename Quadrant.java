import java.util.Scanner;
public class SpeedLimit
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      int logEntries = in.nextInt();
      
      while(logEntries != -1)
      {
         int[] speed, time;
         int distance = 0;
         for(int i = 0; i<logEntries; i++)
         {
            speed[i] = in.nextInt();
            time[i] = in.nextInt();
         } 
         
         distance += speed[0] * time[0];
         for(int i = 1; i<logEntries; i++)
         {
            distance += speed[i] * time[i] - time[i-1];
         }
      }
      
      int x= in.nextInt(), y = in.nextInt();
      if(x > 0)
         if(y > 0)
            System.out.println(1);
         else
            System.out.println(4);
      else
         if(y > 0)
            System.out.println(2);
         else
            System.out.println(3);      
   }
}