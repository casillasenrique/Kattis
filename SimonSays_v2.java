import java.util.*;
public class SimonSays_v2 {
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      
      int cases = in.nextInt();
      in.nextLine();
      for(int i = 0; i<cases; i++) {
         String[] line = in.nextLine().split(" ");
         if(line.length >= 2 && line[0].equals("Simon") && line[1].equals("says"))
         {
            for(int j = 2; j<line.length; j++)
               System.out.print(line[j] + " ");
            System.out.println();
         }      
      }
   }
}