/// tem como objetivo fornecer um substituto ou marcador para controlar o acesso a um objeto
///  interessante quando for necessário carregar objetos sob demanda (lazy loading)
///  permite adicionar uma camada de controle e proteção, melhorando a eficiência e
///  a segurança do sistema sem alterar a interface do objeto real.
/// chamar uma operação de um objeto remoto, é necessário estabelecer uma conexão,
/// empacotar os dados para transmissão e fazer a chamada,usado para interaçao entre chamadas em maquinas diferentes
/// que trocam dados entre si

/// EJB = Enterprise JavaBenas = tecnologia para acessar 
public class ModuloCliente{  //declaração da classe
    private ServicoConta session; //referencia para o objeto remoto (servicoconta)
    private static final Class homeClazz = ServicoContaHome.class;  //homeclazz= classe fabrica q conecta o EJB

    public void executarTransferencia(executarTransferencia transf) throws ServicoContaException {
        try {
            ServicoContaHome home = (ServicoContaHome) getHome('ServicoConta', homeClazz); //gethome busca a fabrica servicontahome
            session = home.create();  //usa a fabrica para criar uma instancia do servicio remoto, armazena em session
            session.executarTransferencia(transf); //chamada delegada ao objeto real  
        } catch (Exception ex) {    //em caso de erro, chamada personalizada
            throw new ServicoContaException(ex);
        }
    }

    public EJBHome getHome(String name, Class clazz) throws NamingException {
        Object objref = context.lookup(name);  //vai no catalogo JNDI do servidorm buscar o servico Servicoconta
        EJBHome getHome = (EJBHome) PortableRemoteObject.narrow(objref, clazz);  // narrow = converte o objeto remoto para o tipo Servicocontahome
        return getHome;  //retorna a ref para a fabrica de conexoes
    }
}