public class Program {
   @SuppressWarnings({ "unchecked", "rawtypes" })
   public static void main(String[] args) {
      // searching algorithms
      LinearSearch ls = new LinearSearch();
      BinarySearch bs = new BinarySearch();

      // sorting algorithms
      BubbleSort bubbleSort = new BubbleSort();
      SelectSort selectSort = new SelectSort();
      InsertSort insertSort = new InsertSort();
      QuickSort quickSort = new QuickSort();
      ShellSort shellSort = new ShellSort();

      // arrays
      Integer[] arr = { 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024 };
      String[] arr2 = { "two", "four", "eight", "sixteen", "thirty-two", "sixty-four", "one hundred twenty-eight", "two hundred fifty-six", "five hundred twelve", "one thousand twenty-four" };
      Float[] arr3 = { 1.1f, 2.2f, 3.3f, 4.4f, 5.5f, 6.6f, 7.7f, 8.8f, 9.9f, 10.10f }; 
      Character[] arr4 = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j' };

      // tests for searching algorithms and compare the time of execution
      long timeStartLinearSearch = System.nanoTime();
      System.out.println("Linear Search: " + ls.search(arr, 128));
      long timeEndLinearSearch = System.nanoTime();

      long timeStartBinarySearch = System.nanoTime();
      System.out.println("Binary Search: " + bs.search(arr, 128));
      long timeEndBinarySearch = System.nanoTime();

      System.out.println("Time of execution for Linear Search: " + (timeEndLinearSearch - timeStartLinearSearch) / 1_000_000.0  + " milliseconds");
      System.out.println("Time of execution for Binary Search: " + (timeEndBinarySearch - timeStartBinarySearch) / 1_000_000.0  + " milliseconds");

      // tests for sorting algorithms and compare the time of execution
      long timeStartBubbleSort = System.nanoTime();
      bubbleSort.sort(arr);
      bubbleSort.sort(arr2);
      bubbleSort.sort(arr3);
      bubbleSort.sort(arr4);
      long timeEndBubbleSort = System.nanoTime();

      long timeStartSelectSort = System.nanoTime();
      selectSort.sort(arr);
      selectSort.sort(arr2);
      selectSort.sort(arr3);
      selectSort.sort(arr4);
      long timeEndSelectSort = System.nanoTime();

      long timeStartInsertSort = System.nanoTime();
      insertSort.sort(arr);
      insertSort.sort(arr2);
      insertSort.sort(arr3);
      insertSort.sort(arr4);
      long timeEndInsertSort = System.nanoTime();

      long timeStartQuickSort = System.nanoTime();
      quickSort.sort(arr);
      quickSort.sort(arr2);
      quickSort.sort(arr3);
      quickSort.sort(arr4);
      long timeEndQuickSort = System.nanoTime();

      long timeStartShellSort = System.nanoTime();
      shellSort.sort(arr);
      shellSort.sort(arr2);
      shellSort.sort(arr3);
      shellSort.sort(arr4);
      long timeEndShellSort = System.nanoTime();

      // sorted arrays
      for (int i : arr) {
         System.out.print(i + " ");
      }
      System.out.println();
      for (String i : arr2) {
         System.out.print(i + " - ");
      }
      System.out.println();
      for (float i : arr3) {
         System.out.print(i + " - ");
      }
      System.out.println();
      for (char i : arr4) {
         System.out.print(i + " - ");
      }
      System.out.println();

      System.out.println("Time of execution for Bubble Sort: " + (timeEndBubbleSort - timeStartBubbleSort) / 1_000_000.0 + " milliseconds");
      System.out.println("Time of execution for Select Sort: " + (timeEndSelectSort - timeStartSelectSort) / 1_000_000.0  + " milliseconds");
      System.out.println("Time of execution for Insert Sort: " + (timeEndInsertSort - timeStartInsertSort) / 1_000_000.0  + " milliseconds");
      System.out.println("Time of execution for Quick Sort: " + (timeEndQuickSort - timeStartQuickSort) / 1_000_000.0  + " milliseconds");
      System.out.println("Time of execution for Shell Sort: " + (timeEndShellSort - timeStartShellSort) / 1_000_000.0  + " milliseconds");
   }
}