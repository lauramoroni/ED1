public class Program {
   @SuppressWarnings({ "unchecked", "rawtypes" })
   public static void main(String[] args) {
      // searching algorithms
      LinearSearch ls = new LinearSearch();
      BinarySearch bs = new BinarySearch();
      BinaryTree bt = new BinaryTree();

      // sorting algorithms
      BubbleSort bubbleSort = new BubbleSort();
      SelectSort selectSort = new SelectSort();
      InsertSort insertSort = new InsertSort();
      QuickSort quickSort = new QuickSort();
      ShellSort shellSort = new ShellSort();
      BinaryTree searchBinaryTree = new BinaryTree();

      // arrays
      Integer[] arr = { 1024, 512, 256, 128, 64, 32, 16, 8, 4, 2 };
      String[] arr2 = { "one thousand twenty-four", "five hundred twelve", "two hundred fifty-six", "one hundred twenty-eight", "sixty-four", "thirty-two", "sixteen", "eight", "four", "two" };
      Float[] arr3 = { 10.10f, 9.9f, 8.8f, 7.7f, 6.6f, 5.5f, 4.4f, 3.3f, 2.2f, 1.1f }; 
      Character[] arr4 = { 'j', 'i', 'h', 'g', 'f', 'e', 'd', 'c', 'b', 'a' };

      // tests for searching algorithms and compare the time of execution
      long timeStartLinearSearch = System.nanoTime();
      System.out.println("Linear Search: " + ls.search(arr, 128));
      long timeEndLinearSearch = System.nanoTime();

      long timeStartBinarySearch = System.nanoTime();
      System.out.println("Binary Search: " + bs.search(arr, 128));
      long timeEndBinarySearch = System.nanoTime();

      bt.insert(2);
      bt.insert(4);
      bt.insert(8);
      bt.insert(16);
      bt.insert(32);
      bt.insert(64);
      bt.insert(128);
      bt.insert(256);
      bt.insert(512);
      bt.insert(1024);
      long timeStartBinaryTree = System.nanoTime();
      System.out.println("Binary Tree: " + bt.search(128));
      long timeEndBinaryTree = System.nanoTime();

      System.out.println("Time of execution for Linear Search: " + (timeEndLinearSearch - timeStartLinearSearch) / 1_000_000.0  + " milliseconds");
      System.out.println("Time of execution for Binary Search: " + (timeEndBinarySearch - timeStartBinarySearch) / 1_000_000.0  + " milliseconds");
      System.out.println("Time of execution for Binary Tree: " + (timeEndBinaryTree - timeStartBinaryTree) / 1_000_000.0  + " milliseconds");

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

      long timeStartSearchBinaryTree = System.nanoTime();
      searchBinaryTree.insert(1028);
      searchBinaryTree.insert(512);
      searchBinaryTree.insert(256);
      searchBinaryTree.insert(128);
      searchBinaryTree.insert(64);
      searchBinaryTree.insert(32);
      searchBinaryTree.insert(16);
      searchBinaryTree.insert(8);
      searchBinaryTree.insert(4);
      searchBinaryTree.insert(2);
      searchBinaryTree.printInOrder();
      long timeEndSearchBinaryTree = System.nanoTime();

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
      System.out.println("Time of execution for Search Binary Tree: " + (timeEndSearchBinaryTree - timeStartSearchBinaryTree) / 1_000_000.0  + " milliseconds");
   }
}