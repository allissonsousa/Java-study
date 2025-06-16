// Protege o sistema contra variações em outros elementos através de abstrações e encapsulamento
// Uso de interface ou classes abstratas base para definir comportamentos q podem variar
// Permite diferentes implementações sem risco de afetar o resto do sistema
// Identifica pontos sujeitos a variação e isola-as com a criação de interfaces no seu entrono, tratando do problema
// Facilidade de manutenção
// Resiliencia a mudanças
// Extensibilidade
// Ex = em um sistema de bd a tecnologia pode mudar de sql pra nosql
// Protege o código contra impactos de mudanças de implementação do sistema


public class ServicoFechamentoPedido{
    private PedidoRepository;

    public ServicoFechamento(PedidoRepository repository) {
        this.pedidoRepository = reporsitory
    }

    public fecharPedido(Pedido pedido) {
        ...
        pedidoRepository.inserirPedido(pedido);
        ...
    }
}

public class PedidoRepository{
    public void inserirPedido(Pedido pedido) {
        // monta e executa SQL INSERT com os dados do pedido
    }
    public void atualizarPedido(Pedido pedido) {
        //monta e executa o SQL UPDATE com os dados do pedido
    }
    public void recuperarPedidoPorNumero(Pedido pedido) {
        //monta e executa SQL SELECT dos dados do pedido
        //monta objeto Pedido a partir dos dados recuperados do bando de dados
        //retorna objeto Pedido
    }
}