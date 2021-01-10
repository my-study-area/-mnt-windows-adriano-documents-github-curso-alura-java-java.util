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
