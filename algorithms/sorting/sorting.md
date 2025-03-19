# Algoritmos de Ordenação

## Bubble Sort
Bubble Sort é o algoritmo de ordenação mais simples que funciona trocando repetidamente os elementos adjacentes se estiverem na ordem errada.

- [`algorithms/sorting/BubbleSort.java`](https://github.com/lauramoroni/ED1/blob/main/algorithm/sorting/BubbleSort.java)

- **Complexidade de tempo:** `O(n^2)`

| Pontos Positivos | Pontos Negativos |
|------------------|------------------|
| Simples de implementar | Ineficiente para arrays grandes (complexidade do pior caso é muito alta)|
| Requer pouca memória | Não é estável |
| É rápido para arrays pequenos | Não é adaptativo |

## Selection Sort
Selection Sort é um algoritmo de ordenação que divide a lista de entrada em duas partes: a sublista de itens já ordenados e a sublista de itens restantes a serem ordenados. No início, a sublista de itens já ordenados está vazia e a sublista de itens restantes é a lista de entrada inteira.

- [`algorithms/sorting/SelectSort.java`](https://github.com/lauramoroni/ED1/blob/main/algorithm/sorting/SelectSort.java)

- **Complexidade de tempo:** `O(n^2)`
- **Funcionamento:** O algoritmo encontra o menor elemento da lista e o troca com o primeiro elemento. Então, encontra o segundo menor elemento e o troca com o segundo elemento, e assim por diante.

| Pontos Positivos | Pontos Negativos |
|------------------|------------------|
| Simples de implementar | Ineficiente para arrays grandes |
| Requer pouca memória | Não é estável |

## Insertion Sort
Insertion Sort é um algoritmo de ordenação que consiste na seleção de um elemento da lista de entrada e inserção dele na posição correta na lista ordenada. O algoritmo continua selecionando e inserindo elementos até que a lista de entrada esteja vazia.

- [`algorithms/sorting/InsertSort.java`](https://github.com/lauramoroni/ED1/blob/main/algorithm/sorting/InsertSort.java)


- **Complexidade de tempo**
   - **Melhor caso:** `O(n)` (quando o array já está ordenado)
   - **Pior caso:** `O(n^2)` (quando o array está ordenado em ordem decrescente)

| Pontos Positivos | Pontos Negativos |
|------------------|------------------|
| Simples de implementar | Não tão eficiente quanto outros algoritmos de ordenação |
| Estável| Não é estável |
| Eficiente para arrays pequenos | Ineficiente para arrays grandes |

## Quick Sort
Quick Sort é um algoritmo de ordenação baseado no princípio de `Dividir para Conquistar`. O algoritmo escolhe um elemento como pivô e divide a lista de entrada em duas partições: uma com elementos menores que o pivô e outra com elementos maiores que o pivô. Então, o algoritmo ordena recursivamente as partições.

- [`algorithms/sorting/QuickSort.java`](https://github.com/lauramoroni/ED1/blob/main/algorithm/sorting/QuickSort.java)


- **Complexidade de tempo**
   - **Melhor caso:** `O(n log n)`
   - **Pior caso:** `O(n^2)` (quando o vetor já está ordenado)

- **Funcionamento:**
1. Escolher um elemento como pivô.
2. Particionar a lista de forma que todos os elementos menores que o pivô estejam à esquerda e todos os elementos maiores que o pivô estejam à direita.
3. Ordenar recursivamente as partições.

| Pontos Positivos | Pontos Negativos |
|------------------|------------------|
| Eficiente para arrays grandes | Não é estável |
| Eficiente para arrays pequenos | Complexo de implementar |
| Complexidade de tempo média `O(n log n)` | |

## Shell Sort
Shell Sort é um algoritmo de ordenação que é uma extensão do Insertion Sort. O algoritmo divide a lista de entrada em subgrupos menores e ordena esses subgrupos usando o Insertion Sort. O algoritmo continua dividindo a lista em subgrupos menores e ordenando-os até que a lista inteira esteja ordenada.

- [`algorithms/sorting/ShellSort.java`](https://github.com/lauramoroni/ED1/blob/main/algorithm/sorting/ShellSort.java)

- **Complexidade de tempo:** 
   - **Melhor caso:** `O(n log n)`
   - **Pior caso:** `O(n^2)`

| Pontos Positivos | Pontos Negativos |
|------------------|------------------|
| Eficiente para arrays grandes | Complexo de implementar |
| Eficiente para arrays pequenos | Não é estável |
| Complexidade de tempo média `O(n log n)` | |

## Heap Sort
Heap Sort é um algoritmo de ordenação que utiliza uma estrutura de dados chamada `heap` (árvore binária mantida na forma de array). O algoritmo constrói um heap a partir da lista de entrada e, em seguida, remove o elemento raiz do heap e o insere na lista ordenada. O algoritmo repete esse processo até que o heap esteja vazio.

- **Complexidade de tempo:** `O(n log n)`
- **Funcionamento:** 
   1. Percorre a lista sequencialmente
   2. Insere cada elemento no heap
   3. Remove o elemento raiz do heap e o insere na lista ordenada

| Pontos Positivos | Pontos Negativos |
|------------------|------------------|
| Eficiente para arrays grandes | Não é estável |
| Complexidade de tempo `O(n log n)` | Complexo de implementar |