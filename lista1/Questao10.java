package lista1;

import java.util.Scanner;

public class Questao10 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      System.err.println("Limite inferior:");
      int lowerLimit = sc.nextInt();
      System.err.println("Limite superior:");
      int upperLimit = sc.nextInt();

      System.err.println("== Estrutura While ==");
      int i = lowerLimit;
      while (i <= upperLimit) {
         if (i%2 != 0){
            System.out.println(i);
         }
         i++;
      }

      System.err.println("== Estrutura Do-While ==");
      i = lowerLimit;
      do {
         if (i%2 != 0){
            System.out.println(i);
         }
         i++;
      } while (i <= upperLimit);
   
      System.err.println("== Estrutura For ==");
      for (i = lowerLimit; i <= upperLimit; i++) {
         if (i%2 != 0){
            System.out.println(i);
         }
      }

      sc.close();
   }
}
