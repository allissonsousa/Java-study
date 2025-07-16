A arquitetura de um sistema define sua estrutura, modelos, metodos, procedimentos, componentes e organização, tendo em vista a previsão e preevenção de 
do decorrer do desenvolvimento do projeto
Ha varios padrões de desenvolvimento de projetos os mais populares são
-camadas
-broker
-Event-driven

-----CAMAMADAS

Separação de camadas logicas distintas com responsabilidades diferentes definidas
-apresentação = interação com o usuario
-negocio = regras de negocio
-acesso a dados = persistencia de dados

Permite reutilização de componentes de forma independente. Ex: é possivel usar a mesma camada de logica pra aplicação web, aplicativo, ou API
Possibilidade de escabilidade de acordo com a carga e nescessidade de desempenho da aplicação


-----BROKER

Simplificação da comunicação entre os componentes da aplicação pois todos os componentes interagem com o broker de maneira desacoplada
Este pega essas mensagens e repassa para os componentes vigentes a receber essas mensagens
Lida bem com uma aplicaçao distribuidas


-----EventDriven

Lida com eventos assincronos, permitindo que os componentes reajam a esses eventos de maneira eficiente, sendo escalavel e promovendo flexibilidade 
aplicando uma interação entre componentes atravez de eventos, tornando os eventos um meio de comunicação entre as partes da arquitetura
Modular e de facil manutenção
Sistema tolerante a falhas

-------


Esses padroes podem ser combinados ou isolados, isso permite a construção de sistemas robustos e complexos de facil manutençao e mais escalabilidade



----------------------- PADRÃO ARQUITETURAL   X    MODELO ARQUITETURAL-----------

O modelo arquitetural define uma arquitetura de forma abstrata focando no objetivo ou caracteristica principal do projeto
O padrão ou padroes arquiteturais sao definiçoes de componentes estruturais, modelo de comunicação 

Para utilizar uma arquitetura é nescessario compreender sua finalidade sendo baixa ou alta complexidade
-Baixa complexidade pode ser baseada nos paragigmas adotados para codificação, como orientação a objetos
-Alta complexidade exige  uma padronização robusta considerando forma de comunicação com a rede, pools de objetos e etc