// Vamos criar uma aplicação web simples seguindo o passo a passo a seguir

/// Iremos desenvolver duas classes no mesmo projeto- uma para receber mensagens e outra para reproduzir
/// usaremos o padrao pont-to-point
/// Criação da fabrica de conexões e a fila no glassfish utilizando o asadmin
/// No projeto ejb crie a classe MeuReceptor para tratarmento das mensagens
/// No projeto war crie a classe MeuProdutor que contenha um servlet para enviar mensagem ao receptor
/// No projeto war, altere o index,html com um formulario de envio de mensagem
/// Verifique o resultado no console do glassfish
/// O glassfish é o software servidor de gerenciamento de mensagens assincronas

// Codigo a seguir


// ----Codigo do Receptor            //anotação para entender que a classe é um message driven beans
@MessageDriven(activationConfig = { 
    @ActivationConfigProperty(propertyName = "detinationLookup", propertyValue = "jms/MinhaQueue"), //anotação especificação do topico de destino 
    @ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Queue")  //definição de outras propriedades como filtro, cliente e provedor
})

public class MeuReceptor implements MessageListener {  //o mdb implementa um listener pra ouvir as mensagens

    public MeuReceptor(){

    }

    @Override
    public void onMessage (Message message){  //criação do metodo onmessage, para acessar os dados da mensagem, aplicar a logica de negocios nela, e tratar exceções
        try { System.out.println("Mensagem enviada: " + ((TextMessage) message).getText());
        }catch (JSMException ex) {
            System.out.println("Erro: " ex.getMessage());
        }
    }
}



//----Codigo do produtor
@WebServlet("/MeuProdutor")
public class extends HttpServlet{
    
    @Resource(mappedName = "jms/MinhaConnectionFactory")
    private ConnectionFactory connectionFactory;
    @Resource(mappedName = "jms/MinhaQueue")
    private Queue queue;

    public void putMessage(String mensagem){
        try {
            Connection connection = connectionFactory.createConnection();
            Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
            MessageProducer messageProducer = session.createProducer(queue);
            TextMessage message = session.createTextMessage();
            message.setText(mensagem);
            messageProducer.send(message);
        } catch (JSMException ex){
             System.out.println("Erro: " ex.getMessage());
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
        response.setContentType("text/html;chaset=UTF-8");
        request.setCharacterEncoding("UTF-8");
         String mensagem = request.getParameter("mensagem");
         putMessage(mensagem);
         PrintWriter out = response.getWriter();
            out.println("<h1> Sua mensagem foi Enviada</h1>");
            out.println("Mensagem: "+ mensagem);
    }
}


// ------ use o index.html q esta na pagina ao lado

// ----------------------------------------------------------------- CODIGO MAIS SIMPLIFICADO 

///----- Listener de mensagem

@MessageDriven(
    activationConfig = {
        @ActivationConfigProperty(
            propertyName = "DestinationType",
            propertyValue = "javax.jms.Topic"
        ),
        @ActivationConfigProperty(
            propertyName = "destinationLookup",
            propertyValue = "javax:/jms/topic/MyTopic"
        )})

public class MyMessageDrivenBean implements MessageListener {

    @Resource
    private MessageDrivenContext context;

    @Override
    @TransactionAttribute(TransactionAttributeType.REQUIRED) //controle de transações a partir dessa anotação
    public void onMessage(Message message) {
        try {
            //processar mensagem recebida
            String conteudo = message.getBody(String.clas);
            System.out.println("Mensagem recebida: " + conteudo);
        }
    }
}

/// ------Produtor de mensagem

class MessageProducer{
    @Resource(mappedName = "java:/jms/topic/MyTopic")
    private Topic topic;

    @Resource
    private JMSContext context;

    public void sendMessage(String message) {
        try {
            context.createProducer().send(topic, message);
            System.out.println("Mensagem enviada: " + message);
        } catch (JMSException e){
            e.printStackTrace();
        }
    }
}