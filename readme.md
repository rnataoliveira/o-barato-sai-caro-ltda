# Trabalho - Estrutura de Dados

## Contextualização  
João, o dono do mercado O Barato Sai Caro ltda, está muito preocupado com o tempo
de espera das pessoas na fila. Ultimamente as reclamações tem sido grandes e ele quer
minimizar o problema de modo a não perder clientes. Ele necessita descobrir, para os vários
horários de funcionamento do mercado, qual o número mínimo de caixas que devem operar
de forma que as pessoas não precisem esperar mais do que 10 minutos na fila.
Como João não é bobo, ele quer saber também quanto isso vai custar ou se, de repente,
ele vai ficar no prejuízo ao tentar resolver o problema.
Assim, João necessita de um programa que simule as filas de pessoas no caixa para os
diversos horários do mercado, contabilize os ganhos, dê o número mínimo de caixas necessário
para garantir que as pessoas não fiquem mais do que 10 minutos na fila e o custo para isso.

## Descrição  
O trabalho de vocês será atender o problema do João. Os caixas estão dispostos de forma
que qualquer pessoa possa ter acesso a eles. A fila é única para todos os caixas do mercado, e
cada pessoa carrega consigo uma pilha de compras. Temos então uma pilha para armazenar
as compras dos clientes, uma fila de clientes a espera de atendimento, e uma lista de caixas
para atendê-los.
Para essa simulação, considere que cada pessoa carrega uma pilha cujo número de itens
é aleatório e varia entre 5 e 40. Além disso, cada item dessa pilha tem um valor também
aleatório no intervalo [5; 50] (incluindo as casas decimais).
A fila é única para todos os caixas do mercado. A probabilidade de uma pessoa entrar
na fila a cada minuto (E) varia de acordo com a hora do dia, e é mostrada na tabela abaixo:  

   Hora  | Prob(E) 
:-------:|-------: 
**08:00**|**0.3**  
**10:00**|**0.4**     
**12:00**|**0.5**     
**14:00**|**0.7**     
**16:00**|**0.9**     
**18:00**|**0.8**     
**20:00**|**0.6**     
    
O primeiro cliente da fila só a deixa quando há um caixa disponível para atendê-lo. Um
caixa está livre quando não possuí cliente, e ao atender um cliente permanece com ele pela
quantidade de minutos igual ao número de itens na pilha que o cliente carrega. Por exemplo,
se o cliente carrega 5 itens na pilha, o caixa ficará ocupado com esse cliente por 5 minutos.
Ao deixar o caixa, o valor pago pelo cliente é contabilizado, e o caixa está livre novamente
para o próximo cliente.
O custo operacional por cada caixa é de R$ 300; 00, de modo que, ao final da simulação,
esse valor deve ser descontado do total ganho com as vendas.
A simulação deve ser realizada para cada hora mostrada na tabela anterior e para cada
número de caixas entre 5 e 20, e só termina após simular duas horas de fila para cada
configuração. Para as configurações com resultado satisfatório (nenhuma pessoa espera
mais do que 10 minutos), deve-se anotar o número de caixas, o valor ganho com as vendas,
o custo com os caixas, o lucro obtido e qual foi o tempo máximo de espera na fila. Esses
dados devem ser mostrados na tela e escritos num arquivo texto ao final do programa.
  
## Especificações  

O programa deverá simular tempo em minutos. Para isso, crie um laço e considere que cada
iteração desse laço é um minuto de sua simulação. Nesse laço, faça todas as atividades:
- Adicione uma pessoa na fila de acordo com a probabilidade da hora sendo simulada;
- Para a pessoa adicionada, crie uma pilha aleatória de itens com valores também aleatórios
(fique atento para os intervalos desses valores);
Atualize os caixas na sua lista: se estiver ocupado, removendo um item da pilha do
cliente, ou se estiver desocupado, removendo o próximo cliente da fila.
- Ao final de duas horas, aumente o número de caixas disponíveis e simule de novo para
a mesma hora. Ao final dos 20 caixas, passe para o próximo horário indicado na tabela
acima e comece denovo. Não se esqueça de anotar os resultados.