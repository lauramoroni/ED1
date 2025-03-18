# Algoritmos de Ordenação

## Bubble Sort
Bubble Sort é o algoritmo de ordenação mais simples que funciona trocando repetidamente os elementos adjacentes se estiverem na ordem errada.

- **Complexidade de tempo:** O(n^2)

| Pontos Positivos | Pontos Negativos |
|------------------|------------------|
| Simples de implementar | Ineficiente para arrays grandes (complexidade do pior caso é muito alta)|
| Requer pouca memória | Não é estável |
| É rápido para arrays pequenos | Não é adaptativo |

## Selection Sort
Selection Sort é um algoritmo de ordenação que divide a lista de entrada em duas partes: a sublista de itens já ordenados e a sublista de itens restantes a serem ordenados. No início, a sublista de itens já ordenados está vazia e a sublista de itens restantes é a lista de entrada inteira.

- **Complexidade de tempo:** O(n^2)
- **Funcionamento:** O algoritmo encontra o menor elemento da lista e o troca com o primeiro elemento. Então, encontra o segundo menor elemento e o troca com o segundo elemento, e assim por diante.

| Pontos Positivos | Pontos Negativos |
|------------------|------------------|
| Simples de implementar | Ineficiente para arrays grandes |
| Requer pouca memória | Não é estável |
