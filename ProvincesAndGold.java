import java.util.Scanner;
public class ProvincesAndGold
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      int gold = in.nextInt();
      int silver = in.nextInt();
      int copper = in.nextInt();
      
      int total = gold*3 + silver*2 + copper;
      
      if(total >= 8)
         System.out.println("Province or Gold");
      else if (total >= 6)
         System.out.println("Duchy or Gold");
      else if(total >= 5)
         System.out.println("Duchy or Silver");
      else if(total >= 3)
         System.out.println("Estate or Silver");
      else if(total >=2)
         System.out.println("Estate or Copper");
      else
         System.out.println("Copper");
   }
}