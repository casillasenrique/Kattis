import java.util.*;
public class WhatDoesTheFoxSay
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      int cases = in.nextInt();
      ArrayList<String> soundLog;
      HashSet<String> knownSounds;
      in.nextLine(); 
      for(int i = 0; i<cases; i++)
      {
         soundLog = new ArrayList<String>(Arrays.asList(in.nextLine().split(" ")));
         knownSounds = new HashSet<String>();
         String animal = in.next();
         while(!animal.equals("what"))
         {
            in.next();
            knownSounds.add(in.next());
            animal = in.next();
         }      
         in.nextLine();
         
         for(String s: soundLog)
            if(!knownSounds.contains(s))
               System.out.print(s + " ");
      }
   }
}
