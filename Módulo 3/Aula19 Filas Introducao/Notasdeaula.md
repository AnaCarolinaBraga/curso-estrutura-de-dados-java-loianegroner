## Notas da aula 19 Filas: Introdução

-Nós vamos aprender a trabalhar com filas estáticas. Como filas funcionam? Nós vamos trabalhar com filas sem prioridade, então vai funcionar da seguinte forma:

-Os elementos que chegam vão formando uma fila e o primeiro que vai ser atendido é o que está na frente.

-O comportamento da fila é FIFO.

-**FIFO = first in first out**, o primeiro a entrar é o primeiro a sair.

-Quando vamos enfileirar(queue), o elemento entra no final da fila.

-Se quiser desenfileirar(dequeue), nós pegamos o elemento que está a mais tempo, ou seja, o que está na primeira posição. 

### Explicação dos códigos:

Fila.java - Início da construção da classe Fila. Ele estende a superclasse Estrutura Estática, que tem as classes que podemos usar tanto em Fila quanto em Pilha.

EstruturaEstatica.java - Superclasse usada como base para Pilha e Fila.

Aula19 - Testar a classe Fila.
