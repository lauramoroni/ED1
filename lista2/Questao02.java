package lista2;

public class Questao02<T> {
   private int sizeMax;
   private Object queue[];
   private int first;
   private int last;

   public Questao02(int sizeMax) {
      this.sizeMax = sizeMax;
      queue = new Object[sizeMax];
      first = -1;
      last = -1;
   }

   public boolean isEmpty() {
      return first == -1;
   }

   public void add(T value) {
      int lastTemp = (last + 1) % sizeMax;

      if (lastTemp == first) {
         System.out.println("Queue overflow");
      } else {
         last = lastTemp;
         queue[last] = value;
      }

      if (first == -1) {
         first = 0;
      }
      
   }

   public T remove() {
      if (isEmpty()) {
         System.out.println("Queue underflow");
         return null;
      } else {
         T value = (T) queue[first];
         if (first == last) {
            first = -1;
            last = -1;
         } else {
            first = (first + 1) % sizeMax;
         }
         return value;
      }
   }

   public boolean isFull()
	{
	    int lastTemp = (last + 1) % sizeMax;

	    if (lastTemp == first) {
	        return true;
	    }
	    else { 
	    	return false;
	    }
	}

   public void show() {
      for (int i = first; i <= last; i++) {
         System.out.println(queue[i]);
      }
   }
	
   public static void main(String[] args) {
      Questao02<Integer> queue = new Questao02<>(5);
      queue.add(1);
      queue.add(2);
      queue.add(3);
      queue.add(4);
      queue.add(5);
      queue.show();
      queue.add(6);
      queue.remove();
      queue.remove();
      queue.show();

   }
}
