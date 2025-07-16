// criação de classes artificiais nao dominantes que visao alcançar baixo acoplamento e alta coesao
// intermediarias para tarefaz nao naturais a nenhuma entidade de dominio
// separa responsabilidades complexas externas ao dominio especifico 
// servem para melhorar o design do sistema
// permite introduzir funcionalidades que nao se extendem ao modelo de dominio

// CUIDADO com confusoes, pois n fazem parte inicialmente do dominio, deve haver boa documentação

//por exemplo uma classe que ja contem a logica de negocio nao pode tambem ter a responsabilidade de armazenamento de
// banco de dados, pois inflige o padrão de alta coesao

// é nescessario entao usar uma classe artificial pra solucionar o problema da alta coesao e do baixo acoplamento

// a classe PedidoRepository é invenção pura

public class Pedido {
    private int numero ;
    private java.util.Date data;
    private List<ItemPedido> itens;

    public BigDecimal obterValorTotal() {
        BigDecimal resultado = new BigDecimal(0);
        itens.forEach(item -> {
            resultado.add(item.obterValor());
        });
        return resultado;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public Date getData() {
        return data;
    }
    public void setData(Date data) {
        this.data = data
    }
    public Iterator<ItemPedido> getItens() {
        return itens.iterator();
    }
    public void adicionarItem(int quantidade, Produto produto) {
        itens.add(new ItemPedido(itens.size() + 1, quantidade, produto));
    }
}

// criação da classe invençao pura

public class PedidoRepository {
    public void inserirPedido(Pedido pedido) {
        //monta e executa SQL INSERT com os dados do pedido
    }
    public void atualizarPedido(Pedido pedido) {
        // monta e executa SQL UPADATE com os dados do pedido
    }
    public void excluirPedido(Pedido pedido) {
        // monta e executa SQL DELETE do registro do pedido
    }
    public Pedido recuperarPedidoPorNumero(int numero) {
        //monta e executa SQL SELECT dos dados do pedido
        //monta objeto Pedido a partir dos dados recuperados do banco de dados
        // reotrn aobjeto Pedido
    }
}



// A estratégia comum é chamada de decomposição por representação. Já a criação de classes por Invenção Pura resulta da 
// estratégia chamada decomposição por comportamento.