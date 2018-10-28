import java.util.Scanner;
public class Abracadabra
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      int magicNumber = in.nextInt();
      for(int i = 0; i<magicNumber; i++)
         System.out.println((i+1) + "Abracadabra");
   }
}