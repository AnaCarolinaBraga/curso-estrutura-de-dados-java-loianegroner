## Notas da aula 11 - Vetores e Arrays: Configurar tipo dinamicamente

“Um vetor armazena sequencia de valores onde todos são do mesmo tipo.”

-Nessa aula, vamos arrumar a classe que fizemos na aula passada. Quando a deixamos mais genérica, colocando o “object”, nós permitimos que se coloque dentro do mesmo vetor integer, String, double, etc. Só que só pode ter do mesmo tipo dentro do vetor!

-Então precisamos encontrar uma maneira de declarar essa classe, vetor ou lista (como quiser chamar). Vamos fazer isso de maneira elegante e limpa que nós temos no Java de fazer isso, que é através de generics. Generics foi adicionado no Java5 para que possamos trabalhar com tipos genéricos. Ou seja, qualquer tipo de classe ou objeto no Java. (esse mesmo principo é aplicado no arraylist).

### Como vamos fazer isso?

-Na declaração da classe, nós vamos passar o tipo da classe que a gente quer utilizar. Para isso, vamos utilizar a simbologia do Generics que é esse sinal “<>”, também conhecido como operador “Diamond”. Dentro desse sinal, vamos passar a letra T, que significa o classtype, ou seja, tipo de classe. Vai ficar <T>.

-Fizemos uma nova classe chamada Lista e fizemos essa declaração.

-Quando formos declarar essa lista em outra classe, nós a chamamos assim Lista<T>... E, no lugar desse T, a gente coloca o tipo de variável. Ex: Lista<String> vetor = new Lista(1); (só precisa colocar o <T> no lado esquerdo, não precisa colocar depois do “new” também).

-Mudamos também o tipo “Object” para T, para ficar mais dinâmico na parte de declaração de variáveis private.

-Só que não é permitido passar para o construtor e instanciar um vetor genérico no java T, por exemplo, não é permitido fazer assim:

	public Lista(int capacidade) {
		this.elementos = new T[capacidade];
		this.tamanho = 0;
	}

### Então, como fazemos para ele permitir o "T"?

-Existe um jeito de fazer isso. Podemos usar o reflection.

-Reflection no java é uma API que deixa você acessar dinamicamente as classes que você tem no seu projeto, os atributos que você tem no seu projeto, e você pode manipular essa informação.

-Então passamos o tipo de variável como parâmetro no construtor.

-Depois usando reflection, que vai ser Array.newInstance vamos passar o tipo de componente, que é o tipo da classe, e a capacidade. Depois fazemos um “casting”, que é “chamar” o T, e assim conseguimos instanciar um vetor dinamicamente:

	public Lista(int capacidade, Class<T> tipoClasse  ) {
		this.elementos = (T[]) Array.newInstance(tipoClasse, capacidade);
		this.tamanho = 0;
	}

-Essa seria uma das soluções. Mas como seria a solução mais elegante no java de como fazer isso? (solução do livro Effective Java)

	public Lista(int capacidade) {
		this.elementos = (T[]) new Object[capacidade];
		this.tamanho = 0;
	}

-E aí mudamos ao longo dos outros métodos para T e (T[]) quando necessário.

**Dica**: leia o livro “Effective Java” do Joshua Bloch depois que terminar esse curso. Ele tem várias dicas de performance, código elegante, código limpo. Leitura obrigatória para quem quer se tornar um bom desenvolvedor Java.



### O que cada pasta de código significa?

-**Lista.java** = Classe Lista<T>.

-**Contato.java** = Classe para testar a generalização da classe lista.

-**Listatestar.java** = Classe para testar a generalização da classe lista usando conjuntamente a classe contato. 

