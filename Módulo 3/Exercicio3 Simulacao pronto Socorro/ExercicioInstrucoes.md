## Exercicio 3 - Simulação de Pronto Socorro

Utilize a classe Fila para simular um sistema de senhas de um pronto-socorro. Cada pessoa pode ser classificada em 3 códigos: vermelho (de prioridade maior), amarelo (prioridade média) e verde (baixa prioridade). O programa deve obedecer as seguintes condições:

- Enfileire 6 pessoas na fila inicial;

- Pessoas com prioridade vermelha devem ser atendidas primeiro;

- Cada consulta dura cerca de 5 segundos, depois o próximo da fila é chamado;

- A cada 8 segundos uma pessoa chega no pronto-socorro com prioridade aleatória (crie um código java para criar a aleatoriedade)

### Explicação dos cósigos:


-EstruturaEstatica.java  = Superclasse usada como base para Pilha e Fila. 

-Fila.java = Extende a EstruturaEstática. Tem os mesmos métodos que a classe Stack

-FilaComPrioridade.java = Estende a fila. Adiciona método para organizar de acordo com a prioridade.

-Exercicio03.java = corpo do exercício.

-Pessoa.java = Para armazenar a pessoa e a prioridade.

-PSAtendimento.java = Onde tem o método do atendimento. Implementa Runnable e usa Thread.

-PSNovosPacientes.java = Onde tem o método da aleatoriedade de pacientes novos. Implementa Runnable e usa Thread.