import java.util.*;

public class ReversedBinaryNumbers
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      String binary = Integer.toBinaryString(in.nextInt());
      
      String reversedBinary = "";
      
      for(int i = binary.length() - 1; i>=0; i--)
         reversedBinary += binary.charAt(i);
         
      System.out.println(Integer.parseInt(reversedBinary, 2));   
         
          
   }
}