/// Protocolos de mensagens
/// Definem conjunto de regras e formatos que facilitam a troca de mensagem entre diferentes sistemas
/// Envio, e recebimento de mensagens entregues ao MDB
/// Persistencia de mensagens
/// Filas de mensagens
/// Garantia de entrega
/// Processamento de mensagens assincronas
/// Aguardam a chegada das mensagens, que vem atravez de topicos ou filas
/// Escalabilidade 
/// Implementados em clusters
/// Tratamento de excessões e retentativas


// ----USABILIDADE
/// Integração entre sistemas
/// Atualização em tempo real em varios sistemas
/// Processamento em lotes de grande volumes de dados

@MessageDriven(  //uso da notação do message driven bean
    name = "ExampleMDB",  // nome do bean
    activationConfig = {
        @ActivationConfigProperty (         //configuração do tipo de mensagem que vai receber
            propertyName = "destinationType",
            propertyValue = "javax.jms.Queue"
        ),
        @ActivationConfigProperty(
            propertyName = "destination", //Para saber aonde esta , colocando o nome do indentificador do seu serviço em fila JDNI
            propertyValue = "ExampleQueue"
        )
    }
)

public class ExampleMDB implements MessageListener { //implementação de interface para usar o message listener

    @Override
    public void onMessagem (Message message) {  //Metodo onMessage, recebe a mensagem como parametro
        try {
            if (message instanceof TextMessage) { //se a mensagem for do tipo texto, pega o texto e armazena em uma string
                TextMessage textmessage = (TextMessage) message;
                String content = textMessage.getText();

                //Process the message content
                System.out.println("Received message" + content); //logica de negocios...

                //additional processing logic...
    
            }
        } catch (JSMException e) {
            //Handle JMSException
            e.printStackTrace();
        }
    }

}


//-------- MDB
//Atravez da postagen de um cliente

@WebServlet(name = "ServletMessage",
urlPatterns = {"/ServletMessage"})

public class ServletMessage extends HttpServlet {
    @Resource(mappedName = "jms/SimpleConnectionFactory")
    private SimpleConnectionFactory connectionFactory;
    @Resource(mappedName = "jms/SimpleQueue")
    private Queue queue;

    public void putMessage() throws ServletException {
        try {
            Connection connection = connectionFactory.createConnection();
            Session session = connection.createSession(false,Session.AUTO_ACKNOWLEDGE);
            MessageProducer messageProducer = session.createProducer(queue);
            TextMessage message = session.createTextMessage();
            message.setText("Teste com MDB");
            messageProducer.send(message);
        } catch (JMSException ex) {
            throw new ServletException(ex);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()){
            out.println("");
            out.println("");

            putMessage();

            out.println("<h1>Mensagem Enviada </h1>");
            out.println("")
        }
    }
}

//mais complexo que o session beans porem com menor acoplamento

// 1 - mapear fabrica de conexoes da mensageria e a fila de destino do MDB por meio de anotaçao resource

// 2 - definir metodo pumessage para enviar mensagem, > sessao a partir da conexao > produtor de mensagens apartir da sessao

// 3 - criar mensagem de texto por meio da sessao, definir texto da mensagem com setText, enviar mensagem, finaliza definindo metodo putmessage