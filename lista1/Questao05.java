package lista1;

import java.util.Scanner;

public class Questao05 {
   public double nota1;
   public double nota2;
   public double nota3;
   public double nota4;
   public double mediaFinal;

   public Questao05(double nota1, double nota2, double nota3, double nota4) {
      this.nota1 = nota1;
      this.nota2 = nota2;
      this.nota3 = nota3;
      this.nota4 = nota4;
   }

   public Questao05(double nota1, double nota2, double nota3) {
      this.nota1 = nota1;
      this.nota2 = nota2;
      this.nota3 = nota3;
      this.nota4 = 0;
   }

   public double mediaFinal() {
      if (this.nota4 != 0) {
         this.mediaFinal = (this.nota1 + this.nota2 + this.nota3 + this.nota4) / 4;
      } else {
         this.mediaFinal = (this.nota1 + this.nota2 + this.nota3) / 3;
      }
      return this.mediaFinal;
   }

   public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);
      
      System.out.println("Digite a primeira nota: ");
      double nota1 = sc.nextDouble();
      System.out.println("Digite a segunda nota: ");
      double nota2 = sc.nextDouble();
      System.out.println("Digite a terceira nota: ");
      double nota3 = sc.nextDouble();

      Questao05 aluno1 = new Questao05(nota1, nota2, nota3);

      if (aluno1.mediaFinal() < 7) {
         System.out.println("Média inferior a 7. Digite a nota da quarta prova.");
         double nota4 = sc.nextDouble();
         aluno1.nota4 = nota4;
      } else {
         System.out.println("Aluno aprovado.");
      }

      System.out.printf("Média final do aluno 1: %.2f %n", aluno1.mediaFinal());

      if (aluno1.mediaFinal() < 5) {
         System.out.println("Situação: reprovado.");
      } else {
         System.out.println("Situação: aprovado.");
      }

      sc.close();
   }

}
