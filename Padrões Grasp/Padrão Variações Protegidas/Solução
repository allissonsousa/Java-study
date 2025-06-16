// identificar pontos sujeitos a variação e isolar essas variações com a criação de interfaces em seu entorno

public class ServicoFechamentoPedido{
    private PedidoRepository pedidoRepository;

    public ServicoFechamento(PedidoRepository repository) {
        this.pedidoRepository = repository;
    }

    public fecharPedido(Pedido pedido) {
        ...
        pedidoRepository.inserirPedido(pedido);
        ...
    }
}

public interface PedidoRepository{
    void inserirPedido(Pedido pedido);
    void atualizarPedido(Pedido pedido);
    void excluirPedido(Pedido pedido);
    Pedido recuperarPedidoPorNumero(int numero);
}

public class PedidoRDBMSRepository implements PedidoRepository {
    public void inserirPedido(Pedido pedido) {
        //monta e executa o SQL INSERT com os dados do pedido
    }
    public void atualizarPedido(Pedido pedido) {
        //monta e executa o SQL UPDATE com os dados do pedido
    }
    public void excluirPedido(Pedido pedido) {
        //monta e executa o SQL DELETE do registro do pedido
    }
    public Pedido recuperarPedidoPorNumero(int numero) {
        //monta e executa SQL SELECT dos dados do pedido
        //monta objeto Pedido a partir dos dados recuperados do banco de dados
        //retorn objeto Pedido
    }
}

public class PedidoMongoRepository implements PedidoRepository{
    public void inserirPedido(Pedido pedido) {
        //monta e executa comando MondoDB com os dados do pedido
    }
    public void atualizarPedido(Pedido pedido) {
        //monta e executa o MondoDB com os dados do pedido
    }
    public void excluirPedido(Pedido pedido) {
        //monta e executa o MondoDB do registro do pedido
    }
    public Pedido recuperarPedidoPorNumero(int numero) {
        //monta e executa MondoDB dos dados do pedido
        //monta objeto Pedido a partir dos dados recuperados do banco de dados
        //retorn objeto Pedido
    }
}
