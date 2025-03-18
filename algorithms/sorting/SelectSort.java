public class SelectSort<T> implements Sort<T>{
   public void sort(T[] array) {
      int size = array.length;

      for (int i = 0; i < size - 1; i++) {
         int smallest = i;

         // itera sobre o restante do array para encontrar o menor elemento
         for (int j = i + 1; j < size; j++) {
            if (((Comparable<T>) array[j]).compareTo(array[smallest]) < 0) {
               smallest = j;
            }
         }

         // troca o menor elemento com o primeiro elemento do array
         T temp = array[i];
         array[i] = array[smallest];
         array[smallest] = temp;
      }
   }
}
