import java.util.*;
public class Autori
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      String[] names = in.nextLine().split("-");
      
      String initials = "";
      
      for(int i = 0; i<names.length; i++)
         initials += names[i].charAt(0);
         
      System.out.println(initials); 
   }
}