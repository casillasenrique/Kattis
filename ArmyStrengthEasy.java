import java.util.*;
import java.io.*;

public class ArmyStrengthEasy
{
   public static void main(String[] args) throws IOException
   {
      Scanner in = new Scanner(/*new File("sampleArmyStrengths.in")*/System.in);
      int cases = in.nextInt();
       
      int numGodMonsters, numMechMonsters; 
      for(int i = 0; i<cases; i++)
      {          
         numGodMonsters = in.nextInt();
         numMechMonsters = in.nextInt();
         long maxGodStrength = 0;
         long maxMechStrength = 0;
         long strength;
         
         for(int j = 0; j<numGodMonsters; j++)
         {
            strength = in.nextLong();
            maxGodStrength = Math.max(strength, maxGodStrength);
         }
         
         for(int j = 0; j<numMechMonsters; j++)
         {
            strength = in.nextLong();
            maxMechStrength = Math.max(strength, maxMechStrength);
         }
      
            
         System.out.println((maxMechStrength > maxGodStrength) ? "MechaGodzilla" : "Godzilla");       
      }
   }
}