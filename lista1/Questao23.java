package lista1;

import java.util.Scanner;

public class Questao23 {
   // classe Pessoa
   public static class Pessoa {
      private String cpf;
      private String nome;
      private int idade;
      private String sexo;
      private double peso;
      private double altura;
      private double imc;

      public Pessoa(String cpf, String nome, int idade, String sexo, double peso, double altura) {
         this.cpf = cpf;
         this.nome = nome;
         this.idade = idade;
         this.sexo = sexo;
         this.peso = peso;
         this.altura = altura;
         this.imc = peso / (altura * altura);
      }

      

      public String getCpf() {
         return cpf;
      }



      public void setCpf(String cpf) {
         this.cpf = cpf;
      }



      public String getNome() {
         return nome;
      }



      public void setNome(String nome) {
         this.nome = nome;
      }



      public int getIdade() {
         return idade;
      }



      public void setIdade(int idade) {
         this.idade = idade;
      }



      public String getSexo() {
         return sexo;
      }



      public void setSexo(String sexo) {
         this.sexo = sexo;
      }



      public double getPeso() {
         return peso;
      }



      public void setPeso(double peso) {
         this.peso = peso;
      }



      public double getAltura() {
         return altura;
      }



      public void setAltura(double altura) {
         this.altura = altura;
      }



      public double getImc() {
         return imc;
      }



      public void setImc(double imc) {
         this.imc = imc;
      }

      @Override
      public String toString() {
         return "Pessoa [altura=" + altura + ", cpf=" + cpf + ", idade=" + idade + ", imc=" + getImc() + ", nome=" + nome
               + ", peso=" + peso + ", sexo=" + sexo + "]";
      }

   }

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      System.out.println("Digite o número de pessoas: ");
      int n = sc.nextInt();

      Pessoa[] pessoas = new Pessoa[n];

      for (int i = 0; i < n; i++) {

         System.out.println("Pessoa " + (i + 1));

         System.out.println("Digite o cpf: ");
         String cpf = sc.next();
         System.out.println("Digite o nome: ");
         String nome = sc.next();
         System.out.println("Digite a idade: ");
         int idade = sc.nextInt();
         System.out.println("Digite o sexo: ");
         String sexo = sc.next();
         System.out.println("Digite o peso: ");
         double peso = sc.nextDouble();
         System.out.println("Digite a altura: ");
         double altura = sc.nextDouble();

         pessoas[i] = new Pessoa(cpf, nome, idade, sexo, peso, altura);
      }

      for (Pessoa pessoa : pessoas) {
         System.out.println(pessoa.toString());
      }

      sc.close();
   }

}
