package lista1;

import java.util.List;
import java.util.ArrayList;

public class Questao31<T> {
    private List<T> items;

    public Questao31(List<T> items) {
        this.items = items;
    }

    public void create(T item) {
        this.items.add(item);
    }

    public List<T> read() {
      return this.items;
    }

    public void update(int index, T newItem) {
        this.items.set(index, newItem);
    }

    public void delete(T item) {
        this.items.remove(item);
    }

    public static void main(String[] args) {

      // Testando com tipo String
         List<String> listString = new ArrayList<>();

         Questao31<String> crudString = new Questao31<>(listString);
         System.out.println(crudString.read());
         crudString.create("a");
         crudString.create("b");
         System.out.println(crudString.read());
         crudString.update(1, "z");
         System.out.println(crudString.read());
         crudString.delete("z");
         System.out.println(crudString.read());

      // Testando com tipo Integer
         List<Integer> listInt = new ArrayList<>();

         Questao31<Integer> crudInt = new Questao31<>(listInt);
         System.out.println(crudInt.read());
         crudInt.create(1);
         crudInt.create(2);
         System.out.println(crudInt.read());
         crudInt.update(1, 3);
         System.out.println(crudInt.read());
         crudInt.delete(3);
         System.out.println(crudInt.read());

    }
}
