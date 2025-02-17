package leetcode.src.main.java;

import java.util.Stack;

public class ValidParentheses {
   public boolean isValid(String s) {
      int size = s.length();

      Stack<Character> stack = new Stack<Character>();

      for (int i = 0; i < size; i++) {
         // ler o caractere da string
         char c = s.charAt(i);

         switch (c) {
            // caracteres de abertura
            case '(':
               stack.push(c);
               break;
            case '[':
               stack.push(c);
               break;
            case '{':
               stack.push(c);
               break;

            // caracteres de fechamento
            // verificar se a pilha está vazia
            case ')':
               if (stack.isEmpty()) {
                  return false;
               } else {
                  char top = stack.pop(); // desempilhar o caractere do topo da pilha e atribui à variável
                  if (top != '(') {
                     return false;
                  }
               }
               break;

            case ']':
               if (stack.isEmpty()) {
                  return false;
               } else {
                  char top = stack.pop();
                  if (top != '[') {
                     return false;
                  }
               }
               break;

            case '}':
               if (stack.isEmpty()) {
                  return false;
               } else {
                  char top = stack.pop();
                  if (top != '{') {
                     return false;
                  }
               }
               break;
            
            default:
               break;
         }

      }

      // verifica se a pilha está vazia; se não estiver, a string não é válida
      if (!stack.isEmpty()) {
         return false;
      } else {
         return true;
      }
   }

   public static void main(String[] args) {
      ValidParentheses vp = new ValidParentheses();
      String s = "[([])]";
      System.out.println(vp.isValid(s));
   }

}
