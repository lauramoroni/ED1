package leetcode.src.main.java;

import java.util.HashMap;
import java.util.Scanner;

class RomanToInteger {

   HashMap<Character, Integer> romanNumbers = new HashMap<Character, Integer>() {
      {
         put('I', 1);
         put('V', 5);
         put('X', 10);
         put('L', 50);
         put('C', 100);
         put('D', 500);
         put('M', 1000);
      }
   };

   public int romanToInt(String s) {
      int ans = 0;
      for (int i = 0; i < s.length(); i++) {
         // 1. current number < next number -> subtract current number from next number
         // 2. current number >= next number -> add current number

         Boolean limit = i + 1 < s.length();

         char currentNumber = s.charAt(i);
         char nextNumber = limit ? s.charAt(i + 1) : ' ';
         
         if (limit && romanNumbers.get(currentNumber) < romanNumbers.get(nextNumber)) {
            ans += romanNumbers.get(nextNumber) - romanNumbers.get(currentNumber);
            i++;
         } else {
            ans += romanNumbers.get(currentNumber);
         }
      }
      return ans;
   }

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      RomanToInteger sol = new RomanToInteger();
      String s = sc.nextLine();
      System.out.println(sol.romanToInt(s));
      sc.close();
   }
}

   


// XLIX - 49
// III - 3
// LVIII - 58