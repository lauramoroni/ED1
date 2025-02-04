package lista1;

import java.util.Scanner;

public class Questao07 {
   public static double[] bhaskara(double a, double b, double c) {
      double delta = Math.pow(b, 2) - 4 * a * c;

      if (delta < 0) {
         return null;
      }

      double x1 = (-b + Math.sqrt(delta)) / (2 * a);
      double x2 = (-b - Math.sqrt(delta)) / (2 * a);

      double[] raizes = {x1, x2};

      return raizes;
   }

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      System.out.println("Digite o valor de a: ");
      double a = sc.nextDouble();
      System.out.println("Digite o valor de b: ");
      double b = sc.nextDouble();
      System.out.println("Digite o valor de c: ");
      double c = sc.nextDouble();

      double[] raizes = Questao07.bhaskara(a, b, c);

      if (raizes == null) {
         System.out.println("Não há raízes reais.");
      } else {
         System.out.printf("x1: %.4f%n", raizes[0]);
         System.out.printf("x2: %.4f", raizes[1]);
      }

      sc.close();
   }

}
