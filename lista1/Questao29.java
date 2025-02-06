package lista1;

import java.util.Scanner;

public class Questao29 {
   public static int sum(int a, int b) {
      if (a == b) {
         return a;
      } else {
         return a + sum(a + 1, b);
      }
   }

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      System.out.println("Digite o intervalo: ");
      int a = sc.nextInt();
      int b = sc.nextInt();

      System.out.println(sum(a, b));

      sc.close();

   }
}
