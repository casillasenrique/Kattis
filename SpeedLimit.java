import java.util.Scanner;
public class SpeedLimit
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      int logEntries = in.nextInt();
      
      while(logEntries != -1)
      {
         int speed, time1, time2, distance = 0;

         speed = in.nextInt();
         time1 = in.nextInt();
         distance += time1 * speed;
         for(int i = 1; i<logEntries; i++)
         {
            speed = in.nextInt();
            time2 = in.nextInt();
            distance += speed * (time2 - time1);
            time1 = time2;
         } 
            
         System.out.println(distance + " miles");
         logEntries = in.nextInt();
      }      
   }
}