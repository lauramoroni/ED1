package lista1;

import java.util.Scanner;

public class Questao15 {
   public static int sum(int a, int b) {
      int sum = 0;

      for (int i = a; i <= b; i++) {
         sum += i;
      }

      return sum;
   }

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in); 

      System.out.println("Informe o intervalo:");
      int a = sc.nextInt();
      int b = sc.nextInt();

      int sum = sum(a, b);

      System.out.printf("Somatório de %d até %d = %d", a, b, sum);

      sc.close();
      }
}
