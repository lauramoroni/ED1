package lista1;

//  Utilizando o recurso Generic de Java, faça um método para exibir um objeto (usando seu método toString), e outro método para exibir os elementos de um vetor.

public class Questao30 {

    public static<T> void prinntObjectGeneric(T obj) {
        System.out.println(obj.toString());
    }

   public static <E> void printArrayGeneric(E[] array) {
      for (E element : array) {
         System.out.printf("%s ", element);
      }
   }

   public static void main(String[] args) {
      Integer[] intArray = {1, 2, 3, 4, 5};
      Double[] doubleArray = {1.1, 2.2, 3.3, 4.4};
      Character[] charArray = {'H', 'E', 'L', 'L', 'O'};

      System.out.println("Array integerArray contains:");
      printArrayGeneric(intArray);
      System.out.println("\nArray doubleArray contains:");
      printArrayGeneric(doubleArray);
      System.out.println("\nArray characterArray contains:");
      printArrayGeneric(charArray);

      int x = 10;
      double y = 10.1;
      char z = 'z';

      prinntObjectGeneric(x);
      prinntObjectGeneric(y);
      prinntObjectGeneric(z);
   }
}