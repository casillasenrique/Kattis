import java.util.*;

public class ACMContestScoring
{  
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      HashMap<String,Integer> attempts = new HashMap<String,Integer>();
      
      int time = in.nextInt();
      int probsSolved = 0;
      while(time != -1)
      {
         String pName = in.next();
         boolean accepted = in.next().equals("right");
         
         if(!accepted)
            attempts.put(pName, attempts.getOrDefault(pName,0) - 20);
         else
         {
            int penalties = (-1) * attempts.getOrDefault(pName,0);
            attempts.put(pName, time + penalties);
            probsSolved++;
         }
   
         time = in.nextInt();                         
      }
      
      int totalTime = 0;
      for(Map.Entry<String,Integer> entry: attempts.entrySet())
      {
         int tTime = entry.getValue();
         if(tTime >= 0)
            totalTime += tTime;  
      }
  
      System.out.println(probsSolved + " " + totalTime);     
   }
}