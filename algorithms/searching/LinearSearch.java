public class LinearSearch<T> implements Search<T> {
   @Override
   public int search(T[] array, T target) {
      for (int i = 0; i < array.length; i++) {
         if (array[i].equals(target)) {
            return i;
         }
      }
      return -1;
   }
}
