package leetcode.src.main.java;

public class MoveZeroes {
   public void moveZeroes(int[] nums) {
      int nonZero = 0;

      for (int i = 0; i < nums.length; i++) {
         if (nums[i] != 0) {
            nums[nonZero] = nums[i];
            nonZero++;
         }
      }

      for (int i = nonZero; i < nums.length; i++) {
         nums[i] = 0;
      }

   }

   public static void main(String[] args) {
      MoveZeroes sol = new MoveZeroes();
      int[] nums = { 0, 0, 1 };

      sol.moveZeroes(nums);

      for (int i = 0; i < nums.length; i++) {
         System.out.print(nums[i] + " ");
      }
   }
}
