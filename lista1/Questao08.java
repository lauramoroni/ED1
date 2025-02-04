package lista1;

import java.util.HashMap;
import java.util.Scanner;

public class Questao08 {
   public static void numeroPorExtenso(int n) {

      HashMap<Integer, String> numeros = new HashMap<Integer, String>() {
         {
            put(1, "um");
            put(2, "dois");
            put(3, "três");
            put(4, "quatro");
            put(5, "cinco");
         }
      };

      if (numeros.containsKey(n)) {
         System.out.println(numeros.get(n));
      } else {
         System.out.println("Número não mapeado.");
      }

   }

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      System.out.println("Digite um número: ");
      int n = sc.nextInt();

      numeroPorExtenso(n);

      sc.close();
   }
}
