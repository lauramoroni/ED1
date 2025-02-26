package lista2;

import java.util.Stack;

public class Questao08 {
   public void postFix(String exp) {
      Stack<Integer> pilha = new Stack<>(); // pilha vazia
      String tokens[] = exp.split(" ");

      for (int i = 0; i < tokens.length; i++) {         
         String c = tokens[i];

         if (Character.isDigit(c.charAt(0))) {
            pilha.push(Integer.parseInt(c));
         } else {
            int a = pilha.pop();
            int b = pilha.pop();

            switch (c) {
               case "+":
                  pilha.push(b + a);
                  break;
               case "-":
                  pilha.push(b - a);
                  break;
               case "*":
                  pilha.push(b * a);
                  break;
               case "/":
                  pilha.push(b / a);
                  break;
            }
         }
      }

      System.out.println(pilha.peek());
   }

   public static void main(String[] args) {
      Questao08 questao08 = new Questao08();
      questao08.postFix("304 11 + 2 -");
   }
}
