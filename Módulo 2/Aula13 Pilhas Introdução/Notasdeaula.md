## Notas da aula 13 =  Pilhas: Introdução

Nesta aula, aprendemos o que são pilhas e o que é LIFO. Vamos trabalhar com pilhas estáticas.

-Como funciona uma pilha como estrutura de dados? Ela tem um funcionamento muito parecido com uma pilha da vida real, mas não pilha de bateria e sim pilha de itens. Ex: pilha de livros. Você vai empilhando um livro sobre o outro. Para retirar os livros, você começa pelos que estão em cima até chegar no livro que precisamos.

-Nesse módulo, vamos usar o que chamamos de “pilhas estáticas”, já que ela terá um vetor/Arraylist por trás dela. Mais para a frente no curso, vamos aprender a fazer listas encadeadas e, quando uma pilha usa uma lista encadeada, ela é chamada de pilha dinâmica.

-Diferença entre vetor e pilha:

-A diferença gráfica é que a pilha é um vetor em pé, isso se faz para facilitar a visualização exata de uma pilha.

-Quando precisamos empilhar/push, adicionamos elementos no final do vetor. Quando precisamos desempilhar/pop, a gente remove sempre o último elemento da pilha, aquele que está no topo.

-Esse comportamento de acrescentar sempre pelo que ta em cima e retirar sempre pelo que ta em cima é chamado de LIFO.

-**LIFO: Last in First Out**, o último elemento a entrar é o primeiro a sair.

-Observações:

- Lembrar que o <T> é chamado diamante.

- Protected: apenas as classes que pertencem ao pacote base e as filhas dessa estrutura é que poderão ver esses métodos.

### Sobre os códigos:

-**EstruturaEstatica.java**

- Classe criada para ser a base das outras. Nela estão os métodos que serão comuns a pilha e fila.

-**Pilha.java**

- Ela extende a classe "EstruturaEstatica". A classe pilha é para aprendermos como pilhas funcionam. Aqui começamos a adicionar alguns métodos já, que vieram da classe mãe.

-**Aula13.java**

- Classe de teste para testarmos o que já foi desenvolvido na classe pilha.
