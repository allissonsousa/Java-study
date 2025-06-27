///soluciona o problema de controle de acesso e otimização de recursos ao interpor um objeto 
/// substituto entre o cliente e o objeto real.
/// maior controle e eficiência, mas podem introduzir complexidade adicional e potencial latência


//Padrão J2EE conhecido como BusinessDelegate, implementado utilizando o padrão de projeto proxy.>>

public interface ServicoContaDelegate {
    void executarTransferencia(Transferencia tranf) throws ServicoContaException;
}

public class ServicoContaProxyEJB implements ServicoContaDelegate {
    private ServicoConta session;  //referencia para o objeto remoto
    private static final Class homeClazz = ServicoContaHome.class;

    public void executarTransferencia(Transferencia tranf) throws ServicoContaException{
        try {
            session = getSession(homeClazz);  //conexao com o objeto remoto
            session.executarTransferencia(tranf); //chamada delegada ao objeto real
        } catch (Exception ex) {
            throw new ServicoContaException(ex);
        }
    }

    public ServicoConta getSession(Class homeClazz) throws ServicoContaException {
        try {
            ServicoContaHome home = (ServicoContaHome) getHome('ServicoConta', homeClazz);
            session = home.create();
        } catch (Exception ex) {
            throw new ServicoContaException(ex);
        }
        return session;
    }
}

public EJBHome getHome(String name, Class Clazz) throws NamingException {
    Object objref = context.lookup(name);
    EJBHome home = (EJBHome) PortableRemoteObject.narrow(objref, clazz);
    return home;
}