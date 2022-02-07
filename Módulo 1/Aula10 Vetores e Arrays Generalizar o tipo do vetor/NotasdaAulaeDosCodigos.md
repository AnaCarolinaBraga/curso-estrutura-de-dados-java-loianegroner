### Notas da aula 10 - Vetores e Arrays: Generalizar o tipo do vetor

-Nessa aula aprendemos como generalizar o tipo do vetor.
-Só que tem um problema de implementar da forma como implementamos nessa aula. Na próxima aula vão explicar o que é e vão ensinar uma forma melhor de fazer isso.

-Até agora, só trabalhamos com o vetor do tipo elementos (String). Para alguns projetos, no entanto, temos que deixar isso um pouco mais genérico, generalizar essa classe para que ela pudesse funcionar com qualquer tipo de dado do java, seja inteiro, double, não importa.

### Como transformamos essa classe vetor para poder funcionar com qualquer tipo de dado?

- A maneira mais simples de fazer isso é trocar a String inicial (private String[] elementos)por Object (private Object[] elementos), já que o Object é a classe mãe/pai de todas as classes do java.

- Fizemos então a transformação na classe do que era String para Object.

### O que cada pasta de código significa?

-**VetorObjetos.java** = Classe vetor com o private Object[].

-**Contato.java** = Classe para testar a generalização da classe vetor.

-**Vetortestar.java** = Classe para testar a generalização da classe vetor usando conjuntamente a classe contato. Ele usa a classe contato para criar os elementos e coloca depois esses elementos dentro da classe vetor.


-Curiosidade: Você passar um tipo primitivo e ele ser transformado em um objeto (object), se chama **autoboxing** no Java.