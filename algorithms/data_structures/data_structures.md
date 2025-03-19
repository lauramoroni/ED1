# Estrutura de Dados

## Tabela Hash
Tabela Hash é uma estrutura de dados que associa chaves de pesquisa a valores, eficientes para operações de inserção, remoção e busca. A tabela hash é composta por um vetor de listas encadeadas, onde cada elemento é inserido em uma lista de acordo com a função de hash.

- [`algorithms/data_structures/HashTable.java`](https://github.com/lauramoroni/ED1/blob/main/algorithm/data_structures/HashTable.java)

- **Complexidade do tempo de busca:**
  - Melhor caso: `O(1)`
  - Pior caso: `O(n)`

- **Funcionamento:**
   - A chave é passada para a função de hash, que retorna o índice da tabela hash.
   - É criada uma lista encadeada na posição retornada pela função de hash.

- **Colisão:**
   - Ocorre quando duas chaves são mapeadas para o mesmo índice.
   - Pode ser resolvida com:
     - `Encadeamento separado:` cada índice da tabela hash é uma lista encadeada.
     - `Endereçamento aberto:` tenta encontrar um novo índice para a chave que colidiu.
     - `Rehashing`
   
| Pontos Positivos | Pontos Negativos |
|------------------|------------------|
| Inserção, busca e remoção eficientes | Espaço de memória |
| Fácil implementação | Colisões |

## Árvore Binária
Árvore binária é uma estrutura de dados dinâmica composta por nós, onde cada nó possui no máximo dois filhos. A árvore binária é utilizada para representar estruturas hierárquicas, como árvores de busca binária.

- [`algorithms/data_structures/Binaryblob.java`](https://github.com/lauramoroni/ED1/blob/main/algorithm/data_structures/Binaryblob.java)

- **Complexidade do tempo de busca:**
  - Média: `O(log n)`

- **Funcionamento:**
   - Cada nó possui um valor e dois ponteiros para os filhos esquerdo e direito.
   - Os elementos filhos à esquerda são menores que o nó pai; e os elementos filhos à direita são maiores.

| Pontos Positivos | Pontos Negativos |
|------------------|------------------|
| Busca eficiente | Inserção e remoção custosas |
| Estrutura hierárquica | Desbalanceamento |