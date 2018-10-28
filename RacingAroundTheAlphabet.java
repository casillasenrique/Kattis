import java.util.*;
public class RacingAroundTheAlphabet
{
   public static void main(String[] args)
   {
      final String L_CIRCLE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ '";
      final double CIRCUMFERENCE = 60 * Math.PI;
          
      Scanner in = new Scanner(System.in);
      int cases = in.nextInt();      
      double timeElapsed;
      String aphorism;
     
      
      in.nextLine();
      
      for(int i = 0; i<cases; i++)
      {
         timeElapsed = 1;
         aphorism = in.nextLine();
         int index1 = L_CIRCLE.indexOf(aphorism.charAt(0)), index2;
         int letterDist;
         for(int j = 1; j<aphorism.length(); j++)
         {
            index2 = L_CIRCLE.indexOf(aphorism.charAt(j));
            letterDist = index2 - index1;
            if(Math.abs(letterDist) > 14)
               if(letterDist < 0)
                  letterDist = L_CIRCLE.length() - index1 + index2;
               else
                  letterDist = index1 + L_CIRCLE.length() - index2;
            else
               letterDist = Math.abs(letterDist);         
           
            timeElapsed += 1 + (((double)letterDist*CIRCUMFERENCE)/28)/15;
            index1 = index2;
            //System.out.println(timeElapsed);
         }   
         System.out.println(timeElapsed);  
      }
   }
}