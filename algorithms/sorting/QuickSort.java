public class QuickSort<T> implements Sort<T> {
   public void sort(T[] array) {
      int left = 0;
      int right = array.length - 1;

      if (left < right) {
         int index_pivot = partition(array, left, right);
         quickSort(array, left, index_pivot - 1);
         quickSort(array, index_pivot + 1, right);
      }
   }

   private void quickSort(T[] array, int left, int right) {
      if (left < right) {
         int index_pivot = partition(array, left, right);
         quickSort(array, left, index_pivot - 1);
         quickSort(array, index_pivot + 1, right);
      }
   }

   private int partition(T[] array, int left, int right) {
      // Lomuto partition scheme
      T pivot = array[left];
      int i = left;

      for (int j = left + 1; j <= right; j++) {
         if (((Comparable<T>) array[j]).compareTo(pivot) < 0) {
            i++;
            T temp = array[i];
            array[i] = array[j];
            array[j] = temp;
         }
      }

      T temp = array[left];
      array[left] = array[i];
      array[i] = temp;

      return i;
      
   }

}
