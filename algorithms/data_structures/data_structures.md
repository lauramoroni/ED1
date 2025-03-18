# Estrutura de Dados

## Tabela Hash
Tabela Hash é uma estrutura de dados que associa chaves de pesquisa a valores, eficientes para operações de inserção, remoção e busca. A tabela hash é composta por um vetor de listas encadeadas, onde cada elemento é inserido em uma lista de acordo com a função de hash.

- [`algorithm/data_strcutures/HashTable.java`](https://github.com/lauramoroni/ED1/tree/main/algorithm/data_structures/HashTable.java)

- **Complexidade de tempo:**
  - Inserção: O(1)
  - Busca: O(1)
  - Remoção: O(1)

- **Funcionamento:**
   - A chave é passada para a função de hash, que retorna o índice da tabela hash.
   - É criada uma lista encadeada na posição retornada pela função de hash.

- **Colisão:**
   - Ocorre quando duas chaves são mapeadas para o mesmo índice.
   - Pode ser resolvida com:
     - `Encadeamento separado`
     - `Endereçamento aberto`
     - `Rehashing`
   
| Pontos Positivos | Pontos Negativos |
|------------------|------------------|
| Inserção, busca e remoção eficientes | Espaço de memória |
| Fácil implementação | Colisões |

## Árvore Binária
Árvore binária é uma estrutura de dados composta por nós, onde cada nó possui no máximo dois filhos. A árvore binária é utilizada para representar estruturas hierárquicas, como árvores de busca binária.