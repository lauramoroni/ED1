package leetcode.src.main.java;

import java.util.Scanner;

class ReverseString {
   public void reverseString(char[] s) {
      int n = s.length;
      
      char[] temp = new char[n];

      for (int i = 0; i < n; i++) {
         temp[n - i - 1] = s[i];
         s[i] = temp[i];
      }
      for (int i = 0; i < n; i++) {
         s[i] = temp[i];
      }
   }

   public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);
      ReverseString sol = new ReverseString();
      char[] s = sc.nextLine().toCharArray();

      sol.reverseString(s);
      System.out.println(s);

      sc.close();
   }
}

