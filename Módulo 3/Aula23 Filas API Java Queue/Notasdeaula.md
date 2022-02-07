## Notas da aula 23 Filas, API Java: Queue

-Nos módulos anteriores, tanto quando usamos a lista e quando usamos a pilha, nós conseguimos chamar classes específicas como a ArrayList e o Stack.

-Entretanto, não é possível fazer o mesmo com a fila, já que a classe “Queue” não existe no java. O que existe é a **interface Queue**.

-Como fazemos, então? Nós podemos instanciar qualquer classe que implemente uma interface, e os métodos que estarão disponíveis para a gente utilizar naquela interface são os métodos que foram declarados naquela interface.
(O famoso conceito do polimorfismo)

-Dessa forma, nós precisamos encontrar uma classe que implemente a Queue e nós vamos utilizar ela. Só que nós só queremos que ela utilize os métodos Queue e não os métodos a mais que ela porventura tenha, como fazemos isso?

		Queue<Integer> fila = new LinkedList<>();

-Assim, nós estamos chamando apenas os métodos Queue que estão implementados na classe LinkedList.

-Eu demonstrei isso na Aula23.java
