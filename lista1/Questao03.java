package lista1;

import java.util.Scanner;

public class Questao03 {
   public static void pairOrOdd(int n) {
      if (n % 2 == 0) {
         System.out.println("Par");
      } else {
         System.out.println("Ímpar");
      }
   }

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      System.out.println("Digite um número: ");
      int n = sc.nextInt();

      pairOrOdd(n);

      sc.close();
   }

}
