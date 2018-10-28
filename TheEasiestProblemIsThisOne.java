import java.util.*;
public class TheEasiestProblemIsThisOne {
   
   public static int sumDigits(int x) {
      return (x==0) ? 0 : x%10 + sumDigits(x/10);
   }
   
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      
      while(n!=0) {
         int p = 11;
         int sum = sumDigits(n);
         
         while(sum != sumDigits(n*p)) p++;
         
         System.out.println(p);
         n = in.nextInt();
      }
   }
}