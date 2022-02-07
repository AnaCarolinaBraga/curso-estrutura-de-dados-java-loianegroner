## Notas da Aula 9 - Vetores e Arrays: Remover elemento

-Nessa aula, aprendemos a remover um elemento do vetor de qualquer posição.

-Como faremos isso? Vamos supor que tem um vetor de index 4 (0 a 4), o tamanho dele é 5.

[ A, B, G, C, D]

-E nós queremos retirar o G, então como faremos? Pegaremos o C e levaremos para a casa do G e o D vai passar para a casa do C. Só que, aí nesse caso vai ficar assim:

[ A, B, C, D, D]

-Como resolvemos isso? Ignoramos a última casa, o último D. Para isso, diminuímos o tamanho real do nosso vetor para 4. Dessa forma, esse valor “lixo” que sobrou não vai ter relevância.


### Então como ficará o método?

-O método que vamos fazer vai ser um void, já que vamos estar retirando um elemento do vetor e não precisaremos retornar nada. O parâmetro dele será a posição que você deseja remover o elemento.

-Antes de remover o elemento daquela posição, colocamos para verificar se a posição solicitada é válida ou não.

-Após isso, se a posição for válida, ele começa o processo de transferir o conteúdo do vetor posterior para o anterior, subescrevendo o vetor que tinha que ser removido.

-Ao final, diminuimos o tamanho real do vetor. Dessa forma, quando for colocar um novo elemento nesse vetor, ele vai sobrescrever o elemento repetido a mais que ficou como "lixo".

-Podemos combinar esse método com outros métodos também. Se queremos eliminar determinado elemento, mas não sabemos a posição dele, usamos o método busca(String elemento) e ele retornará a posição. Em seguida, é só usar o método remove(int posicao).

**Vetor.java** é a classe

**VetorTestar.java** é como testamos se o método feito no Vetor.java está funcionando.


### **Dica**: Caso eu tenha dificuldade em “enxergar” o funcionamento do algoritmo, fazê-lo de forma visual ajuda a enxergar o que esta sendo feito e como fazê-lo.
