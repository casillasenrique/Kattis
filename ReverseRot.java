import java.util.*;
public class ReverseRot
{
   public static final String ALPHA_ORDER = "ABCDEFGHIJKLMNOPQRSTUVWXYZ_.";
   public static String reverse(String t, int r)
   {
      String encrypted = new StringBuffer(t).reverse().toString();
      char[] tempString = encrypted.toCharArray();
      for(int i = 0; i<tempString.length; i++)
      {
         int index = ALPHA_ORDER.indexOf(tempString[i]) + r;
         tempString[i] = ALPHA_ORDER.charAt(index%ALPHA_ORDER.length()); 
      }
         
      encrypted = new String(tempString);
      return encrypted;
   }
   
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      int rotIndex = in.nextInt();
      
      String text;
      while(rotIndex != 0)
      {
         text = in.next();
         System.out.println(reverse(text,rotIndex));
         rotIndex = in.nextInt();
      }
   }
}