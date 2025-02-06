package lista1;

import java.util.Scanner;

public class Questao14 {
   public static void isPrime(int n) {

      boolean isPrime = true;

      for (int i = 2; i < n; i++) {
         if (n % i == 0) {
            isPrime = false;
         } 
      }

      if (isPrime) {
         System.out.println(n + " é primo.");
      } else {
         System.out.println(n + " não é primo.");
      }
   }

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      System.out.println("Informe um número:");
      int n = sc.nextInt();

      for (int i = 1; i <= n; i++){
         isPrime(i);
      }

      sc.close();
   }
}
