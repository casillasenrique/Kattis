import java.util.*;
public class UnBearAbleZoo {
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      
      HashMap<String,Integer> animals;
      int counter = 1;
      
      int numAnimals = in.nextInt();
      in.nextLine();
      
      while(numAnimals != 0) 
      {
         animals = new HashMap<String,Integer>();
         for(int i = 0; i<numAnimals; i++) 
         {
            String[] line = in.nextLine().toLowerCase().split(" ");
            String animal = line[line.length-1];
            animals.put(animal, animals.getOrDefault(animal,0) + 1);          
         }
         
         ArrayList<String> sortedList = new ArrayList<String>(animals.keySet());
         Collections.sort(sortedList);
         
         System.out.println("List " + counter + ":");
         
         for(String a: sortedList)
            System.out.println(a + " | " + animals.get(a));   
         
         counter++;
         numAnimals = in.nextInt(); 
         in.nextLine();
      }
   }
}