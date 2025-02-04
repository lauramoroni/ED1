package lista1;

import java.util.Scanner;

public class Questao01 {

   public static double imc(double peso, double altura) {
      return peso / (altura * altura);
   }
   public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);
      
      System.out.println("Digite o peso: ");
      double peso = sc.nextDouble();
      System.out.println("Digite a altura: ");
      double altura = sc.nextDouble();

      double imc = imc(peso, altura);

      System.out.println("IMC: " + imc);

      sc.close();
   }

}
