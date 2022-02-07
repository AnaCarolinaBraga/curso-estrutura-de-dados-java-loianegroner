## Notas da aula 4- Vetores e Arrays: tamanho e imprimir elementos

## O que aprendemos nessa aula?

-Nessa aula, aprendemos como verificar o tamanho real de um vetor e como imprimir seus elementos.

## Sobre o código:
**O que nós temos feito na classe até agora:**

-A classe tem duas variáveis private: uma string e uma integer.

-A String é para guardar os elementos do Vetor e a integer é marcar a última posição que foi inserida elementos no vetor.

## O que acrescentamos no código na aula:

-Criação de dois novos métodos:

- O primeiro é o método tamanho, que retorna o tamanho do vetor. Ele não vai receber nenhum argumento/parâmetro porque não queremos que nosso usuário modifique seu valor.

- O segundo método é para imprimir todos os elementos do vetor.

-Como vamos fazer isso? Podemos usar a classe Java de Arrays e toString. Só que ele imprime todos os elementos do vetor, só que ele imprime todos os elementos do vetor e não é isso que queremos.
Para isso, fazemos uma concatenação de Strings. No lugar de fazer a concatenação simples, usamos uma classe mais específica do java e mais aproproriada para fazer isso, que é a classe StringBuilder. Assim temos um algoritmo para fazer o toString mais eficiente e mais elegante. 



Curiosidade da aula: A classe java possui uma classe utilitária chamada Arrays que serve para trabalharmos com coleções de objetos, a exemplo dos vetores. Essa classe Arrays possui o método “toString” onde podemos passar um vetor de elementos, um array de elementos, e ela retorna todos os elementos do array.
