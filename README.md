# curso-alura-java.util
Curso de
Java e java.util: Coleções, Wrappers e Lambda expressions

## Anotações
### Módulo: Conhecendo Arrays
- Um array é uma estrutura de dados e serve para guardar - elementos (valores primitivos ou referências)
- Arrays usam colchetes ([]) sintaticamente. Ex: `int[]idades = new int[5];`
- Arrays têm um tamanho fixo!
- Um array também é um objeto!
- Arrays são zero-based (o primeiro elemento se encontra na - posição 0)
- Um array é sempre inicializado com os valores padrões.
- Ao acessar uma posição inválida recebemos a exceção - ArrayIndexOutOfBoundException
- Arrays possuem um atributo length para saber o tamanho
- A forma literal de criar uma Array é com o uso de chaves {}. Ex: `int[] refs = {1,2,3,4,5};`;

### Módulo: Guardando qualquer referência
Utilizando Array String do método `public static void main(String[] args)`:

```bash
cd bin
java br.com.bytebank.banco.test.TestArrayString 12 3 4
```
- uma array do tipo Object pode guardar qualquer tipo de referência
- quando convertemos uma referência genérica para uma referência mais específica é preciso usar um type cast
- o cast só compila quando é possível, mesmo assim pode falhar na hora de rodar
- quando o type cast falha podemos receber uma ClassCastException
- para receber valores ao chamar o programa Java na linha de comando podemos usar o array String[] no método main

### Módulo: ArrayList e Generics
- a classe java.util.ArrayList encapsula o uso do array e oferece vários métodos de mais alto nível
- uma lista guarda referencias
- como usar métodos size, get, remove
- como usar o foreach para iterar a ArrayList
- os generics parametrizam classes
- no caso da ArrayList podemos definir o tipo dos elementos através de generics

### Módulo: Equals e mais listas
- utilizamos a sobrescrita do método equals para verificar a igualdade das referências
- que o método equals é utilizado pelas listas
- que existe mais uma lista, a java.util.LinkedList
- a diferença entre ArrayList e LinkedList
  - Arraylist:
    - acesso fácil e performático pelo índice
    - elementos precisam ser copiados quando não há mais capacidade
  - LinkedList
    - inserção e remoção performática em qualquer posição, também no início
    - acesso mais demorado pelo índice, é preciso pesquisar os elementos
- a interface java.util.List que define os métodos da lista

### Módulo: Vector e a interface Collection
- o `java.util.Vector`, que é uma `ArrayList `thread safe
- a interface `java.util.Collection` que é a interface de todas as coleções
- as listas são sequencias que aceitam elementos duplicados
- os conjuntos (`java.util.Set`) também são coleções, mas não aceitam duplicados nem são listas

### Módulo: As classes Wrappers
- para cada primitivo existe uma classe chamada `Wrapper`
- para guardar um primitivo numa coleção é preciso criar um objeto que embrulha o valor
- a criação do objeto `Wrapper` é chamada de `autoboxing`
- a retirada do valor primitivo do objeto `Wrapper` é chamada de `unboxing`
- `autoboxing` e `unboxing` acontecem automaticamente.
- as classes wrapper possuem vários métodos auxiliares, por exemplo para o parsing
- todas as classes wrappers que representam um valor numérico possuem a classe `java.lang.Number` como mãe

### Módulo: Ordenação de listas
- para ordenar uma lista é preciso definir um critério de ordenação
- há duas formas de definir esse critério
  - pela interface `Comparator`
  - pela interface `Comparable` (ordem natural)
- o algoritmo de ordenação já foi implementado
  - na lista no método sort
  - na classe Collections pelo método sort
- a classe Collections é uma fachada com vários métodos auxiliares para - trabalhar com as coleções, principalmente listas
