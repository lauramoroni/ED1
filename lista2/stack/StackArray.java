package lista2.stack;

public class StackArray {

   private int top;
   private int sizeMax;
   private int[] stack;

   public StackArray(int sizeMax) {
      this.sizeMax = sizeMax;
      stack = new int[sizeMax];
      top = -1; // pilha vazia
   }

   public boolean isEmpty() {
      return top == -1; // true = vazia; false = não vazia
   }

   public boolean isFull() {
      return top == sizeMax - 1; // true = cheia; false = não cheia
   }

   // empilha um valor na pilha
   public void push(int value) {
      // verificar se a pilha está cheia
      if (isFull()) {
         System.out.println("Stack overflow");
      }  else {
         System.out.println("Empilhando " + value + " no topo da pilha");
         top++;
         stack[top] = value;
      }
   }

   // desempilha o valor do topo da pilha
   public void pop() {
      // verificar se a pilha está vazia
      if (isEmpty()) {
         System.out.println("Stack underflow");
      } else {
         System.out.println("Desempilhando " + stack[top] + " do topo da pilha");
         top--;
      }
   }

   // consulta o topo da pilha
   public int peek() {
      if (isEmpty()) {
         System.out.println("Stack underflow");
         return -1;
      } else {
         return stack[top];
      }
   }

   // exibir a pilha
   public void show() {
      if (isEmpty()) {
         System.out.println("Pilha vazia");
      } else {
         System.out.println("Elementos da pilha:");
         for (int i = top; i >= 0; i--) {
            System.out.println(stack[i]);
         }
      }
   }

   public static void main(String[] args) {
      StackArray stack = new StackArray(5);
      stack.push(10);
      stack.push(20);
      stack.push(30);
      stack.push(40);
      stack.push(50);
      stack.push(60);
      stack.show();
      stack.pop();
      stack.pop();
      stack.show();
      stack.push(70);
      stack.show();
   }
}
