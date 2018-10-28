import java.util.*;
import java.io.*;
import java.util.stream.*;

public class ArmyStrengthHard
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      int cases = in.nextInt();
       
      int numGodMonsters, numMechMonsters; 
      for(int i = 0; i<cases; i++)
      {          
         numGodMonsters = in.nextInt();
         numMechMonsters = in.nextInt();
         long maxGodStrength = 0;
         long maxMechStrength = 0;
         long strength;
         in.nextLine();
          
         ArrayList<Long> godArmy = new ArrayList<Long>(Arrays.stream(Arrays.stream(in.nextLine().split(" ")).mapToLong(Long::parseLong).toArray()).boxed().collect(Collectors.toList()));   
         maxGodStrength = Collections.max(godArmy);
                 
         ArrayList<Long> mechArmy = new ArrayList<Long>(Arrays.stream(Arrays.stream(in.nextLine().split(" ")).mapToLong(Long::parseLong).toArray()).boxed().collect(Collectors.toList()));   
         maxMechStrength = Collections.max(mechArmy);
            
         System.out.println((maxMechStrength > maxGodStrength) ? "MechaGodzilla" : "Godzilla");            
      }
   }
}