package lista1;

import java.util.Scanner;
import java.lang.Math;

public class Questao02 {

   public static double circleArea(double radius) {
      return Math.PI * Math.pow(radius, 2);
   }
   public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);

      System.out.println("Digite o raio: ");

      double radius = sc.nextDouble();
      if (radius < 0) {
         System.out.println("Raio não pode ser negativo.");
         System.exit(1);
      }

      double area = circleArea(radius);

      System.out.println("Area: " + area);

      sc.close();

   }
}
