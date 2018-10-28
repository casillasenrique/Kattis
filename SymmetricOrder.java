import java.util.*;
public class SymmetricOrder
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      int numNames = in.nextInt();
      int n = 1;
      ArrayList<String> descendingSet; 
      while(numNames != 0)
      {
         descendingSet = new ArrayList<String>();
         
         System.out.println("SET " + n);
         
         for(int i = 0; i<numNames; i++)
         {
            if(i%2 == 0)
               System.out.println(in.next());
            else
               descendingSet.add(in.next());      
         }
         for(int i = descendingSet.size() - 1; i>=0; i--)
            System.out.println(descendingSet.get(i));
         
         numNames = in.nextInt();
         n++;
      }
   }
}
