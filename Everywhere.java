import java.util.*;

public class Everywhere
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      HashSet<String> cities;
      int cases = in.nextInt(), numCities;
      
      for(int i = 0; i<cases; i++)
      {
         numCities = in.nextInt();
         cities = new HashSet<String>();
         for(int j = 0; j < numCities; j++)
            cities.add(in.next());
         System.out.println(cities.size());   
      } 
   }
}