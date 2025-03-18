public class InsertSort<T> implements Sort<T> {
   public void sort(T[] array) {
      int size = array.length;

      for (int i = 1; i < size; i++) { // começa no segundo elemento...
         T key = array[i];
         int j = i - 1; // ... e compara com o primeiro

         while (j >= 0 && ((Comparable<T>) array[j]).compareTo(key) > 0) {
            array[j + 1] = array[j];
            j--;
         }

         array[j + 1] = key;
      }
   }
}
