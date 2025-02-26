package lista2;

public class Questao01<T> {
   private int top;
   private int sizeMax;
   private Object[] stack;
   
   public Questao01(int sizeMax) {
      this.sizeMax = sizeMax;
      stack = new Object[sizeMax];
      top = -1; // pilha vazia
   }

   public boolean isEmpty() {
      return top == -1; // true = vazia; false = não vazia
   }

   public boolean isFull() {
      return top == sizeMax - 1; // true = cheia; false = não cheia
   }

   public void push(T value) {
      if (isFull()) {
         System.out.println("Stack overflow");
      }  else {
         System.out.println("Empilhando " + value + " no topo da pilha");
         top++;
         stack[top] = value;
      }
   }

   public T pop() {
      if (isEmpty()) {
         System.out.println("Stack underflow");
         return null;
      } else {
         System.out.println("Desempilhando " + stack[top] + " do topo da pilha");
         T value = (T) stack[top];
         top--;
         return value;
      }
   }

   public T peek() {
      if (isEmpty()) {
         System.out.println("Stack underflow");
         return null;
      } else {
         return (T) stack[top];
      }
   }

   public static void main(String[] args) {
      Questao01<Integer> stack = new Questao01<>(5);
      stack.push(1);
      stack.push(2);
      stack.push(3);
      stack.push(4);
      stack.push(5);
      stack.push(6);
      stack.pop();
      stack.pop();
      stack.pop();
      stack.pop();
      stack.pop();
      stack.pop();
   }
}
