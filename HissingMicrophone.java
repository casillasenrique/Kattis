import java.util.*;

public class HissingMicrophone
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      System.out.println((in.next().contains("ss") ? "hiss" : "no hiss"));   
   }
}