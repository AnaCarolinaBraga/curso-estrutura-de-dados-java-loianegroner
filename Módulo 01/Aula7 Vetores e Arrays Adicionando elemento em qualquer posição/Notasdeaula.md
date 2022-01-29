## Aula 7 - Vetores e Arrays: Adicionando elemento em qualquer posição

-Nesta aula, aprendemos como adicionar um elemento qualquer em qualquer posição do vetor. Caso essa posição já esteja preenchida, ele vai mover/transferir o elemento que já estava lá para outra posição antes de colocar o elemento qualquer na posição solicitada.

### Como vamos fazer isso?

-Pegamos o método adiciona, já feito anteriormente, e sobrescrevemos/sobrecarregarregamos ele. Nós vamos modificar a sua assinatura. A primeira versão do adiciona só pede uma String, que é o elemento a ser adicionado. Esse novo método adiciona pede a posição que você quer colocar o elemento e a String que você deseja adicionar.

-Antes de adicionar o elemento na posição, precisamos saber se a posição que ele quer colocar é válida ou não. Caso não seja, serpa lançada um exception.

-Depois foi feito um loop de for, no qual ele pega o elemento que estava originalmente naquela posição e transfere para a posição seguinte. Ele faz isso com todas as próximas posições preenchidas. Ao contrário de como descrevi aqui, o processo será feito da última posição preenchida e vai voltar até a posição solicitada.

-Após mover todos os elementos que já estavam no vetor para as posições subsequentes, ele coloca o elemento qualquer na posição indicada, essas duas informações foram dadas como parâmetros para o método.

-O código pode ser visto na classe **Vetor**.

-O teste para ver o funcionamento do método .adiciona(int posição, String elemento) está no **VestorTestar**.