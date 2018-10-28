import java.util.*;

public class Modulo
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      HashSet<Integer> modulos = new HashSet<Integer>();
      
      for(int i = 0; i<10; i++)
         modulos.add(in.nextInt()%42);
         
      System.out.println(modulos.size());
   }
}