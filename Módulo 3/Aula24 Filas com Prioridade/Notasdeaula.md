## Notas da aula 24 Filas com prioridade

-Com essa aula, aprendemos como podemos extender a nossa classe Fila e criar uma fila com prioridade utilizando a interface Comparable do Java, desenvolvendo o método compareTo() para poder comparar os objetos e já fazer a inserção na ordem que a nossa fila precisa.

-Começamos a estudar algoritmos de ordenação.

-Aprendemos como implementa a interface Comparable dentro de uma classe de duas formas, tanto colocando o "implements" do lado do nome da classe, quanto declarando dentro de um método.

-Ao implementar dentro de uma classe, é adicionado o método compareTo(Object o). Só que lá no título, public class FilaComPrioridade<T> implements Comparable<T> eu posso colocar na implementação já o que deve ser comparado dentro desse T.

-O método "compareTo(Object o)" é comum que retorne valores específicos:
- É comum que se o obj 1 > obj2 ele retorne algum valor > 0 (tipo 1)
- É comum que se o obj 1 < obj2 ele retorne algum valor <  0 (tipo -1)
- É comum que se o obj 1 = obj2 ele retorne = 0


### Explicação dos códigos:

EstruturaEstatica.java - Superclasse usada como base para Pilha e Fila. (modifiquei o método adiciona, estava dando erro o método anterior)

Fila.java - Classe fila que construímos. Tem os métodos de fila semelhantes ao da interface Queue. Ela extende a superclasse EstruturaEstatica.

FilaComPrioridade.java - Demos um override no método enfileira, adicionando o Comparable, para que adicione na fila com prioridade.

Aula24- Testar a classe FilaComPrioridade.