## Notas da aula 3 e explicação de cada um dos códigos

### O que aprendemos nessa aula:

-Vamos aprender como adicionar um elemento no final do vetor.


### **ATENÇÃO! A separação do nome dos arquivos da classe Vetor aqui no github como "1, 2 ou 3" é apenas para fins didáticos - assim, é possível acompanhar a ordem que cada um foi feito.** Os exercícios foram feitos usando o mesmo vetor, fato que pode ser atestado ao abrir cada um dos códigos.

### O que foi feito no **Vetor01**.java :

- Até então, esse método só tinha o constructo;

- Adição de novo método na classe vetor. Esse método é para conseguirmos adicionar novos elementos no vetor.

- Como vamoz fazer isso? Para adicionar um elemento no vetor, primeiro precisamos ver quais vetores estão nulos.

- Explicação sobre valores nos vetores: Por padrão, quando a gente instancia um vetor de strings no java, todos os elementos terão o valor “null”, que é o valor inicial de uma String no Java. Um Boolean o valor inicial é false, um inteiro é 0, ou de qualquer outro tipo primitivo que represente um número no Java. Dessa forma, a gente pode percorrer o valor e achar aqueles que estão com “null”, no caso da String, e preenche-los com a informação.

- No método que criamos, fizemos com que ele percorra todo o vetor até achar os vazios e, assim, preenchê-los.

- O teste para saber se ele funciona é o **Vetor01testar.java**.

### Problemas de fazer dessa forma:

-Isso se torna inviável quando temos centenas de espaços no vetor, porque não é um algoritmo eficiente. A gente precisa de um algoritmo melhor, que seja mais otimizado.

-Nesse caso, seria legal se pudéssemos guardar qual foi a última posição que inserimos um elemento. Isso nos ajuda também a saber o tamanho real do vetor, no exemplo feito em sala, o vetor tinha 5 espaços e apenas 2 elementos foram adicionados, então o tamanho real dele era 2.

-Além disso, irá dar erro se colocar mais elementos do que o vetor suporta. 

-Podemos resolver isso de duas formas:

### Com Exceção. O que foi feito no **Vetor02**.java :

- Adicionamos a variável de tamanho, que servirá para sabermos qual foi o último espaço preenchido.

- Entretanto, precisamos limitar até onde essa variável de tamanho consegue ir. Ela deve ser limitada ao tamanho do vetor para não dar problema.

- O método que adiciona elementos no vetor, então, tem uma exceção. Se você tentar colocar algo que ultrapassa o tamanho do vetor, ele dá uma mensagem de erro.

- O teste para saber se ele funciona é o **Vetor02testar.java**.

### Com Booleanos. O que foi feito no **Vetor03**.java :

- Adicionamos a variável de tamanho, que servirá para sabermos qual foi o último espaço preenchido.

- Entretanto, precisamos limitar até onde essa variável de tamanho consegue ir. Ela deve ser limitada ao tamanho do vetor para não dar problema.

- Adicionamos um booleano. Caso não ultrapasse o tamanho do vetor, ele retorna "true". Caso contrário, ele retorna "false".

- O teste para saber se ele funciona é também pode ser feito pelo **Vetor01testar.java**.

