package lista1;

import java.util.Scanner;

public class Questao12 {
   public static void tabuada(int n) {
      for (int i = 0; i <= 10; i++) {
         System.out.printf("%d X %d = %d %n", n, i, n*i);
      }
   }

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      System.out.println("== Tabuada ==");
      System.out.println("Digite um número (1-9): ");
      int n = sc.nextInt();

      tabuada(n);

      sc.close();
      
   }
}
