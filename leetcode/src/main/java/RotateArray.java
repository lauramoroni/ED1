package leetcode.src.main.java;

public class RotateArray {
   public void rotateArray(int[] nums, int k) {
      int[] a = new int[nums.length];

      for (int i = 0; i < nums.length; i++) {
          a[(i + k) % nums.length] = nums[i];
      }
      
      for (int i = 0; i < nums.length; i++) {
          nums[i] = a[i];
      }
   }

   public static void main(String[] args) {
      RotateArray sol = new RotateArray();
      int[] nums = { 1, 2, 3, 4, 5, 6, 7 };
      int k = 3;

      sol.rotateArray(nums, k);

      for (int i = 0; i < nums.length; i++) {
         System.out.print(nums[i] + " ");
      }
   }
}
