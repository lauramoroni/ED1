public class Program {
   @SuppressWarnings({ "unchecked", "rawtypes" })
   public static void main(String[] args) {
      LinearSearch ls = new LinearSearch();

      Integer[] arr = { 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024 };
      String[] arr2 = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j" };
      Float[] arr3 = { 1.1f, 2.2f, 3.3f, 4.4f, 5.5f, 6.6f, 7.7f, 8.8f, 9.9f, 10.10f }; 

      // time complexity: O(n)
      long timeStartLinearSearch = System.nanoTime();
      System.out.println(ls.search(arr, 512));
      System.out.println(ls.search(arr2, "e"));
      System.out.println(ls.search(arr3, 7.7f));
      long timeEndLinearSearch = System.nanoTime();
      
      BinarySearch bs = new BinarySearch();
      
      // time complexity: O(log n)
      long timeStartBinarySearch = System.nanoTime();
      System.out.println(bs.search(arr, 512));
      System.out.println(bs.search(arr2, "e"));
      System.out.println(bs.search(arr3, 7.7f));
      long timeEndBinarySearch = System.nanoTime();

      System.out.println("Linear search time: " + (timeEndLinearSearch - timeStartLinearSearch) / 1_000_000.0 + " ms");
      System.out.println("Binary search time: " + (timeEndBinarySearch - timeStartBinarySearch) / 1_000_000.0 + " ms");
   }
}