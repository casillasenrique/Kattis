import java.util.*;

public class AddingWords {
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      
      String operation; 
      
      Map<String,Integer> words = new HashMap<String,Integer>();
      
      while(in.hasNext()) {
         operation = in.next();
         switch(operation) {
            case "def":
               words.put(in.next(), in.nextInt());
               break;
            case "calc":
               String equation = in.nextLine().substring(1);                  
               String[] terms = equation.split(" ");
               equation += " ";
               
               
               int sum = 0;
               boolean unknown = false;
               
               if(words.containsKey(terms[0])) 
               {
                  sum += words.get(terms[0]);
               }else
                  unknown = true;
               
               
               int x;
               for(int i = 1; i<terms.length-1 && !unknown; i+=2) 
               {
                  String operator = terms[i];
                  if(words.containsKey(terms[i+1])) 
                  {
                     x = words.get(terms[i+1]);
                     if(operator.equals("+"))
                        sum+=x;
                     else
                        sum-=x;
                  }else
                     unknown = true;
               }
               
               System.out.print(equation); 
               
               String resultant = "";
               if(!unknown) {
                  //Search map for number   
                  for(Map.Entry<String, Integer> w: words.entrySet())
                     if(w.getValue() == sum) {
                        resultant = w.getKey();
                        break;
                     }
               }
               
               System.out.println((!unknown && !resultant.equals("")) ? resultant : "unknown");
               
               break;
            case "clear":
               words.clear();
               break;
         }
      }
   }
}