## Notas da aula 8 - Vetores e Arrays: Aumentar capacidade do vetor

-Nessa aula, aprendemos a adicionar capacidade ao vetor sempre que precisar de mais espaço.

### O que já aprendemos a fazer anteriormente?

-Já aprendemos a adicionar novos elementos no vetor, seja ao final dele ou em qualquer posição. Mas... e se a capacidade do vetor estourar? Para isso, vamos aumenta-la.

### Como vamos aumentar a capacidade do vetor?

-Vamos adicionar um novo método chamado .aumentoCapacidade().

-Ele será um método privado e não público, porque apenas a própria classe terá acesso a ele.

-O método não terá parâmetros/argumentos.

### O que o método faz?

- Esse método cria um novo vetor. Sua capacidade será o dobro do vetor anterior. É melhor fazer dessa forma do que só acrescentar de um em um espaço no vetor.

-Fazemos esse vetor com capacidade dobrada, depois transferimos todos os elementos do vetor anterior para dentro dele.

-Em seguida, transformamos esse novo vetor com capacidade dobrada no "vetor principal", que é o vetor que será usado no programa.

-Colocamos dentro dos outros métodos de adicionar elementos uma "chamada" para esse método antes da adição do elemento. Quando a variável tamanho for igual ao tamanho da váriavel elementos, ele será "acionado" e aumentará o tamanho do vetor. Em seguida, o método de adicionar elementos continuará normalmente.