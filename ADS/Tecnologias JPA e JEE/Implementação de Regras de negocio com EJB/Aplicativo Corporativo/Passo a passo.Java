/// São softwares desenvolvidos para atender as necessidades complexas e especificas das organizações.

/// Componentes das aplicações corporativas

//Uso de EJBs , enterprise java beans
/// SESSION BEANS = processar a logica de negocios
/// ENTITY BEANS = persistencia em banco de dados, responsavel pelo CRUD
/// MESSAGE DRIVEN BEANS = processar mensagens assincronas com outras aplicações

//Stateless e Stateful Beans


// ---------------------------PASSO A PASSO - CRIAÇÃO DOS ARQUIVOS NA IDE

//>>> PASSO 1

// No netbeans, ou outra IDE, definir um projeto corporativo. No tipo Java Ant, Criar um projeto do tipo Enterprise Aplication, na categoria Java Enterprise


//>>> PASSO 2

// Preencher o nome do projeto, e o local


//>>> PASSO 3

// Escolher o servidor glassFish e versao JEE7 , e selecionar as opçoes de criação para os modulos EJB e web
// Que pode gerar 3 projeots
//-Ejb-ejb > usado na definição de entidades JPA e dos componentes EJB sendo compilado com jar
//-Ejb-war > Contem elementos pra web, como Servlets, facelets e paginas XHTML, compilados em war
//-EJB > agrupa os dois projetos ejb e war em  um arquivo compactado, usa a extensão ear para implantação
//Quando o projeto é corporativo, devemos implementar o projeto principal com EAR, icone de triangulo
//Caso contrario ao implanatar os dois projetos secundarios, ira impedir a execução


// ---------------------------PASSO A PASSO - CRIAÇÃO DOS SESSION BEANS

//>> PASSO 1

// Selecionar o tipo de session bean na categoria EJB

//>> PASSO 2

// Definir o nome do projeto e pacote (ejbs) do novo session bean, escolher o tipo como stateless e marcar apenas a interface local
// Caso ocorra um erro de compilação decorrente da importação da biblioteca javax.ejb inclua a biblioteca JAVA EE 7 API no projeto
// Complemente os codigos da aplicação e da aplicação local e teste o EJB por meio de um servlet
// Deve-se acessar o projeto e adicionar um novo arquivo do tipo servlet na categoria web, com  nome da função do arquivo na aplicação
// sem adicionar informações ao arquivo web.xml
// Com o componente servlet criado, usasse o codigo da aplicação com uma chamada para o EJB e executa o projeto principal
// usa a conexao localhost

//---- PARA CRIAR O EJB DO TIPO MDB

// adicionar no projeto um novo arquivo dipo message drivem bean na categoria enterprise java beans
// defina entao o nome do ejb e o pacote componente e escolhe a fila para as mensagens do servidor (jms/simplequeue)


