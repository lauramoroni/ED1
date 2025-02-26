package lista2;

import java.io.*;
import java.util.LinkedList;

public class Questao05 {
   public void countWord(String fileName) {
      LinkedList<String> wordCounted = new LinkedList<>();

      try {
         FileReader file = new FileReader(fileName);
         BufferedReader reader = new BufferedReader(file);

         BufferedWriter writer = new BufferedWriter(new FileWriter("ED1\\lista2\\test\\output.txt"));
         
         String line = reader.readLine();
         while (line != null) {
            String[] words = line.split(" ");
            for (String word : words) {
               if (wordCounted.contains(word)) {
                  int index = wordCounted.indexOf(word);
                  int count = Integer.parseInt(wordCounted.get(index + 1));
                  count++;
                  wordCounted.set(index + 1, String.valueOf(count));
               } else {
                  wordCounted.add(word);
                  wordCounted.add("1");
               }
            }
            line = reader.readLine();
         }

         for (int i = 0; i < wordCounted.size(); i += 2) {
            writer.write(wordCounted.get(i) + " " + wordCounted.get(i + 1) + "\n");
         }

         reader.close();
         writer.close();

      } catch (IOException e) {
         System.out.println("An error occurred.");
         e.printStackTrace();
      }
   }

   public static void main(String[] args) {
      Questao05 questao05 = new Questao05();
      questao05.countWord("ED1\\lista2\\test\\test-questao05.txt");
   }
}
