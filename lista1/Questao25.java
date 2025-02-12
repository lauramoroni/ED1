package lista1;

import java.util.ArrayList;
import java.util.List;

public class Questao25 {
   public static void charCount(String str) {
      int n = str.length();
      List<Character> list = new ArrayList<Character>();    

      for (int i = 0; i < n; i++) {
         char c = str.charAt(i);
         int charCount = 1;
         if (!list.contains(c)) {
            list.add(c);
            for (int j = i + 1; j < n; j++) {
               char cComp = str.charAt(j);
               if (cComp == c) {
                  charCount += 1;
               }
            }
            System.out.printf(c + " = " + charCount + ", ");
         }
      }

   }

   public static void main(String[] args) {
      String str = "anti-inflamatorio!!!";
      charCount(str);
   }
}
