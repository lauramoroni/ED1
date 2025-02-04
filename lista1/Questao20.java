package lista1;

public class Questao20 {
   public static int[] reverseVector(int[] nums) {
      int[] reverseNums = new int[nums.length];

      for (int i = nums.length - 1; i >= 0; i--) {
         reverseNums[nums.length - i - 1] = nums[i];
      }

      return reverseNums;
   }

   public static void main(String[] args) {
      int[] vet = {1, 3, 5, 7, 9};

      int[] newVet = reverseVector(vet);

      for (int i = 0; i < newVet.length; i++) {
         System.out.println(newVet[i]);
      }
   }
}
