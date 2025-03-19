public class ShellSort<T> implements Sort<T> {
      @Override
      public void sort(T[] array) {
            int n = array.length;
            for (int gap = n / 2; gap > 0; gap /= 2) {
                  for (int i = gap; i < n; i++) {
                        T temp = array[i];
                        int j;
                        for (j = i; j >= gap && ((Comparable<T>) array[j - gap]).compareTo(temp) > 0; j -= gap) {
                              array[j] = array[j - gap];
                        }
                        array[j] = temp;
                  }
            }
      }

}
