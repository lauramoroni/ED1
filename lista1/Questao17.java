package lista1;

import java.util.Scanner;
import java.lang.Math;

public class Questao17 {
   public static int fatorial(int n) {
      int fatorial = 1;

      if (n == 0) {
         return 1;
      } else {
         fatorial = n * fatorial(n - 1);
      }

      return fatorial;
   }
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      double res = 0;

      int ans = 1;

      do {

         System.out.println("== Calculadora ==");
         System.out.printf("[1] Potenciação %n [2] Raiz Quadrada %n [3] Fatorial %n [0] Sair %n");

         ans = sc.nextInt();

         switch (ans) {
            case 1: 
               System.out.print("Base: ");
               double base = sc.nextDouble();
               System.out.print("Expoente: ");
               double exp = sc.nextDouble();
   
               res = Math.pow(base, exp);

               break;
            case 2:
               System.out.print("Informe o número: ");
               double n = sc.nextDouble();
   
               if (n < 0) {
                  System.out.println("Não existe raiz para valores menores que 0. Informe outro número.");
                  do {
                     n = sc.nextDouble();
                  } while (n < 0);
               }
   
               res = Math.sqrt(n);

               break;
            case 3:
               System.out.print("Número: ");
               int num = sc.nextInt();
   
               int fat = fatorial(num);
   
               res = fat;
   
               break;
            case 0:
               System.out.println("Saindo...");
               break;
            default:
            System.out.println("Opção inválida.");
            break;
         }

         if (ans != 0) {
            System.out.println("Resultado: " + res);
         }

      } while (ans != 0);


      sc.close();
   }
}
