import java.util.*;
public class Tri {
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      int a = in.nextInt(), b = in.nextInt(), c = in.nextInt();
      
      if(a+b==c)
         System.out.printf("%d+%d=%d",a,b,c);
      else if(a==b+c)
         System.out.printf("%d=%d+%d",a,b,c);
      else if(a-b==c)
         System.out.printf("%d-%d=%d",a,b,c);
      else if(a==b-c)
         System.out.printf("%d=%d-%d",a,b,c);
      else if(a*b==c)
         System.out.printf("%d*%d=%d",a,b,c);
      else if(a==b*c)
         System.out.printf("%d=%d*%d",a,b,c);
      else if(a/b==c)
         System.out.printf("%d/%d=%d",a,b,c);
      else if(a==b/c)
         System.out.printf("%d=%d/%d",a,b,c);      
            
   }
}