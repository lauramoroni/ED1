package lista1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

public class Questao32 {
   static HashMap<Character, Character> map = new HashMap<>() {
      {
         // letras maiusculas
         put('Z', 'P');
         put('P', 'Z');
         put('E', 'O');
         put('O', 'E');
         put('N', 'L');
         put('L', 'N');
         put('I', 'A');
         put('A', 'I');
         put('T', 'R');
         put('R', 'T');
         // letras minusculas
         put('z', 'p');
         put('p', 'z');
         put('e', 'o');
         put('o', 'e');
         put('n', 'l');
         put('l', 'n');
         put('i', 'a');
         put('a', 'i');
         put('t', 'r');
         put('r', 't');
      }
   };

   public static void encodeOrDecode(String path, int type) throws IOException {
      BufferedReader reader = new BufferedReader(new FileReader(path)); // arquivo lido
      StringBuilder code = new StringBuilder();

      String line = "";

      String newPath = "";
      if (type == 1) {
         newPath = "ED1\\lista1\\test\\code.txt";
      } else if (type == 2) {
         newPath = "ED1\\lista1\\test\\decode.txt";
      } 

      BufferedWriter writer = new BufferedWriter(new FileWriter(newPath)); // arquivo escrito

         while ((line = reader.readLine()) != null) { // linha atual
            for (int i = 0; i < line.length(); i++) {
               char c = line.charAt(i); // letra atual

               if (map.containsKey(c)) {
                  writer.write(map.get(c)); // escreve letra codificada
               } else {
                  writer.write(c); // escreve letra original
               }
            }
            code.append("\n"); // pula linha
         }
      
         reader.close();
         writer.close();
   }

   public static void main(String[] args) {
      String path = "C:\\Users\\Lenovo\\Documents\\UFERSA\\4 periodo\\ED1\\ED1\\lista1\\test\\test-questao32.txt";

      // codifica
      try {
         encodeOrDecode(path, 1);
      } catch (IOException e) {
         e.printStackTrace();
      }

      // decodifica
      try {
         encodeOrDecode("ED1\\lista1\\test\\code.txt", 2);
      } catch (IOException e) {
         e.printStackTrace();
      }
   }

}
