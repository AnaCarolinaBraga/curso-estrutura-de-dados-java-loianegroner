## Notas da aula 6 - Vetores e Arrays: Verificar se elemento existe

-Nessa aula, implementamos um método para verificar se determinado elemento existe no vetor.

-Para isso, vamos sobreescrever o método busca, modificando a assinatura do método, ou seja, vamos modificar o tipo de retorno ou a quantidade de parâmetros que o método recebe.

-O método pode ser do tipo booleano, que recebe como parâmetro uma String, e retornar “true” caso o elemento exista, ou “false” caso não exista.

-O método também ser do tipo integral, que recebe como parâmetro uma String, e que pode retornar a posição do elemento caso ele exista e uma posição incompatível, como -1, caso não exista.

### Mas como saber se o elemento existe ou não?

-Para isso, vamos fazer um **algoritmo de busca**. O algoritmo de busca mais simples que existe é chamado de “busca sequencial”, ele vai de posição em posição no vetor para procurar se aquele é o elemento que ele ta procurando.

-Para comparar Strings, utilizamos no Java o .equals(). Dentro dos parênteses você coloca o elemento que gostaria de comparar. Esse .equals se for colocado como .equalsIgnoreCase() ele irá ignorar letras maiúsculas e minúsculas.
