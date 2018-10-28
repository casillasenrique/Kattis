import java.util.*;

public class Filip
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      int n1 = in.nextInt(), n2 = in.nextInt();
      
      int newNum1 = n1%10*100 + (n1/10%10)*10 + (n1/100%10);
      int newNum2 = n2%10*100 + (n2/10%10)*10 + (n2/100%10);

      
      System.out.println((newNum1 > newNum2) ? newNum1 : newNum2);
   }
}