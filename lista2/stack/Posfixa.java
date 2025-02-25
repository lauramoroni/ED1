package lista2.stack;

import java.util.Stack;

public class Posfixa {
   public void posfixa(String exp) {
      Stack<Integer> pilha = new Stack<>();
      String[] tokens = exp.split(" ");

      for (int i = 0; i < tokens.length; i++) {
         if (tokens[i].equals("+")) {
            int a = pilha.pop();
            int b = pilha.pop();
            pilha.push(a + b);
         } else if (tokens[i].equals("-")) {
            int a = pilha.pop();
            int b = pilha.pop();
            pilha.push(b - a);
         } else if (tokens[i].equals("*")) {
            int a = pilha.pop();
            int b = pilha.pop();
            pilha.push(a * b);
         } else if (tokens[i].equals("/")) {
            int a = pilha.pop();
            int b = pilha.pop();
            pilha.push(a / b);
         } else {
            pilha.push(Integer.parseInt(tokens[i]));
         }
      }

      System.out.println("Resultado: " + pilha.elementAt(0));

   }
   public static void main(String[] args) {
      String exp = "7 3 + 6 4 - *";
      Posfixa posfixa = new Posfixa();

      posfixa.posfixa(exp);
   }
}
