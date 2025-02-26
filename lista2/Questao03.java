package lista2;

import java.util.LinkedList;

public class Questao03 {
   private Object[] linkedList;
   private int sizeMax;
   private int first;
   private int last;

   public Questao03(int sizeMax) {
      this.sizeMax = sizeMax;
      linkedList = new Object[sizeMax];
      first = -1;
      last = -1;
   }

   public boolean isEmpty() {
      return first == -1;
   }

   public void add(Object value) {
      int lastTemp = (last + 1) % sizeMax;

      if (lastTemp == first) {
         System.out.println("Queue overflow");
      } else {
         last = lastTemp;
         linkedList[last] = value;
      }

      if (first == -1) {
         first = 0;
      }
   }

   public static void main(String[] args) {
      LinkedList<Integer> linkedList = new LinkedList<>();
      linkedList.add(1);
      linkedList.add(2);
      linkedList.add(3);
      for (int i = 0; i < linkedList.size(); i++) {
         System.out.println(linkedList.get(i));
      }
      linkedList.addFirst(9);
      linkedList.addLast(10);
      for (int i = 0; i < linkedList.size(); i++) {
         System.out.println(linkedList.get(i));
      }

   }

}
