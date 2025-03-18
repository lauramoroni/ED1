import java.util.ArrayList;

public class HashTable<T> {
   private int size;
   private int capacity;
   private ArrayList<T> table[];

   @SuppressWarnings("unchecked")
   public HashTable(int capacity) {
      this.capacity = capacity;
      this.size = 0;
      this.table = new ArrayList[capacity];
   }

   // hash function
   private int hash(T key) {
      return key.hashCode() % this.capacity;
   }

   private void insert(T key) {
      int index = hash(key);
      ArrayList<T> list = table[index];
      if (list == null) {
         list = new ArrayList<T>();
         list.add(key);
         table[index] = list;
      } else {
         list.add(key);
      }

      this.size++;
   }

   private T remove(T key) {
      int index = hash(key);
      ArrayList<T> list = table[index];
      T current = null;
      for (int i = 0; i < list.size(); i++) {
         current = list.get(i);
         if (current.equals(key)) {
            list.remove(i);
            this.size--;
            return current;
         }
      }

      return null;
   }

   private T search(T key) {
      int index = hash(key);
      ArrayList<T> list = table[index];
      T current = null;
      for (int i = 0; i < list.size(); i++) {
         current = list.get(i);
         if (current.equals(key)) {
            return current;
         }
      }

      return null;
   }

}
