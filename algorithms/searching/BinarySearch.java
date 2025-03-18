public class BinarySearch<T extends Comparable<T>> implements Search<T> {
   // array must be sorted
   @Override
   public int search(T[] array, T target) {
      int left = 0; 
      int right = array.length - 1;

      while (left <= right) {
         int mid = (left + right) / 2;

         if (array[mid].equals(target)) {
            return mid;
         } else if (array[mid].compareTo(target) < 0) {
            left = mid + 1;
         } else {
            right = mid - 1;
         }
      }

      return -1;
   }
   
}
