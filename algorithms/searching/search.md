# Algoritmos de Busca

## Busca Linear
A busca linear é um algoritmo de busca simples que percorre um vetor de elementos, um por um, até encontrar o elemento desejado.

- **Estático**: Utilização de um vetor fixo. 
- **Dinâmico**: Utilização de uma lista encadeada.

```java
   public int search(T[] array, T target) {
      for (int i = 0; i < array.length; i++) {
         if (array[i].equals(target)) {
            return i;
         }
      }
      return -1;
   }
```

- **Complexidade de tempo**: O(n)
- **Melhor caso**: O(1)
- **Pior caso**: O(n)


| Pontos Positivos | Pontos Negativos |
|------------------|------------------|
| Simples de implementar | Ineficiente para vetores grandes |
| Não requer ordenação | Complexidade O(n) |

## Busca Binária
A busca binária é um algoritmo de busca que consiste na divisão do vetor em duas metades, comparando o elemento do meio com o elemento desejado. Caso o elemento do meio seja igual ao elemento desejado, a busca é concluída. Caso contrário, a busca é realizada na metade do vetor onde o elemento desejado pode estar.

```java
   public int search(T[] array, T target) {
      int left = 0; 
      int right = array.length - 1;

      while (left <= right) {
         int mid = (left + right) / 2;

         if (array[mid].equals(target)) {
            return mid;
         } else if (array[mid].compareTo(target) < 0) {
            left = mid + 1;
         } else {
            right = mid - 1;
         }
      }

      return -1;
   }
```

- **Complexidade de tempo**: O(log n)
- **Melhor caso**: O(1)
- **Pior caso**: O(log n)

| Pontos Positivos | Pontos Negativos |
|------------------|------------------|
| Maior eficiência e agilidez | Requer vetor ordenado |
| Complexidade O(log n) | Complexidade de implementação |

