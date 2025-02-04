package lista1;

import java.util.Scanner;

public class Questao11 {
   public static void main(String[] args) {

      String senhaCorreta = "Laura";

      Scanner sc = new Scanner(System.in);

      System.out.println("Digite a senha:");
      String password = sc.nextLine();

      while (!password.equals(senhaCorreta)) {
         System.out.println("Senha inválida. Digite novamente:");
         password = sc.nextLine();
      }

      System.out.println("Senha correta!");

      sc.close();
   }
}
   