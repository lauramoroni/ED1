package lista1;

import java.util.Scanner;

public class Questao04 {
   public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);

      double conta1 = 100;
      double conta2 = 100;

      System.out.println("Saldo da conta1: " + conta1);
      System.out.println("Saldo da conta2: " + conta2); 

      System.out.println("Digite o valor a ser transferido da Conta 1 para a Conta 2: ");
      double transferencia = sc.nextDouble();

      if (conta1 < transferencia) {
         System.out.println("Saldo insuficiente.");
      } else {
         conta1 -= transferencia;
         conta2 += transferencia;
         System.out.println("Transferência realizada com sucesso.");
      }

      System.out.println("Saldo da conta1: " + conta1);
      System.out.println("Saldo da conta2: " + conta2); 

      sc.close();
   }
}

