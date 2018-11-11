import java.util.*;
public class CoconutSplat {
   //Some constants to allow integer representations of each state
   public static final int FOLDED = 0, FIST = 1, PALM = 2, GONE = 3;
   
   private static class Hand {
      
      private int pID;
      private int state;
       
      public Hand(int n, int type) {
         state = type;
         pID = n;
      }
      
      public void hit() {
         state++;     
      }
      
      //Used for debugging
      public String toString() {
         return "Player " + pID + "[" + state + "]";
      }
   }
    
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      int syllables = in.nextInt(), numPeople = in.nextInt();
      
      ArrayList<Hand> hands = new ArrayList<Hand>();
      
      for(int i = 0; i<numPeople; i++)
         hands.add(new Hand(i+1,FOLDED));
         
      int hIndex = 0;   
      while(hands.size() != 1) 
      {
         //Loops through the array until the rhyme ends
         hIndex = (hIndex + syllables - 1)%hands.size();
         
         //Hits the hand
         hands.get(hIndex).hit();
         
         int tempState = hands.get(hIndex).state;
         
         if(tempState == FIST)
            hands.add(hIndex, new Hand(hands.get(hIndex).pID, FIST));
         else if(tempState == PALM)
            hIndex = (hIndex+1)%hands.size();
         else if(tempState == GONE) 
            hands.remove(hIndex);       
      } 
      
      System.out.println(hands.get(0).pID);    
      
   }
}