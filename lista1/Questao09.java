package lista1;

import java.util.Scanner;

public class Questao09 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      System.out.println("Limite inferior: ");
      int lowerLimit = sc.nextInt();
      System.out.println("Limite superior: ");
      int upperLimit = sc.nextInt();

      System.err.println("== Estrutura While =="); 
      int i = lowerLimit;
      while (i <= upperLimit) {
         System.out.println(i);
         i++;
      }

      System.err.println("== Estrutura Do-While ==");
      i = lowerLimit;
      do {
         System.out.println(i);
         i++;
      } while (i <= upperLimit);

      System.err.println("== Estrutura For ==");
      for (i = lowerLimit; i <= upperLimit; i++) {
         System.out.println(i);
      }

      sc.close();
   }
}
