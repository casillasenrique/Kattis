import java.util.*;
public class CrackingRSA {

   public static int getPrimeFactorization(long n) {
      for(int i = 2; i<n/2; i++)
         if(n%i == 0)
            return i;
      return -1;  
   }
   
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      int cases = in.nextInt();
      for(int i = 0; i<cases; i++) {
         long n = in.nextLong(), e = in.nextLong();
         long p = getPrimeFactorization(n);
         long q = n/p;
                  
         long totient = (p-1)*(q-1);
         
         long k = 1;
         
         while((k*totient+1)%e != 0) k++;
         
         System.out.println((k*totient+1)/e);
      }
   }
}