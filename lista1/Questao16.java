package lista1;

import java.util.Scanner;

public class Questao16 {
   public static int fatorialIterativo(int n) {
      int fatorial = 1;

      for (int i = n; i > 0; i--) {
         fatorial *= i;
      }

      return fatorial;
   }

   public static int fatorialRecursivo(int n) {
      int fatorial = 1;

      if (n == 0) {
         return 1;
      } else {
         fatorial = n * fatorialRecursivo(n - 1);
      }

      return fatorial;
   }

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      System.out.println("Digite um número: ");
      int n = sc.nextInt();

      System.err.println("== Método Iterativo ==");
      long startTime = System.nanoTime();
      System.out.println(fatorialIterativo(n));
      long endTime = System.nanoTime();
      System.err.println("Tempo de execução (iterativo): " + (endTime - startTime) + " nanosegundos");

      System.err.println("== Método Recursivo ==");
      startTime = System.nanoTime();
      System.out.println(fatorialRecursivo(n));
      endTime = System.nanoTime();
      System.err.println("Tempo de execução (recursivo): " + (endTime - startTime) + " nanosegundos");

      sc.close();
   }
}
