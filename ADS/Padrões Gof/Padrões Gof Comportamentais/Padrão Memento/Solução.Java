/// funcionalidade que permitisse o usuário desfazer as últimas operações de adição de itens ao pedido
///  armazenando todas as informações necessárias para a restauração de um objeto Pedido
/// A classe Pedido representa o participante Originator do padrão, pois é o seu estado que deve ser
///  armazenado e restaurado.


public class PedidoMemento{
    private int numero;
    private int numeroCorrente;
    private List<ItemPedidoMemento> itens;

    public PedidoMemento(int numeroPedido, int numeroCorrente, List<ItemPedido>itensOrigem){
        this.numero = numeroPedido;
        this.numeroCorrente = numeroCorrente;
        this.itens = new ArrayList<>();
        for (ItemPedido item : itensOrigem) {
            this.itens.add(
                new ItemPedidoMemento (item.getNumero(), item.getQuantidade(),item.getCodigoProduto())
            );
        }
    }
    public int getNumero() {
        return numero;
    }

    public int getNumeroCorrente() {
        return numeroCorrente;
    }

    public List<ItemPedidoMemento> getItens() {
        return itens;
    }
}
//A classe pedido é o Originator do codigo e seus dados devem ser armazenados no Memento

public class Pedido {
    private in numero;
    private List<ItemPedido> itens;
    private int numeroCorrente;

    public Pedido(int numero) {
        this.numero = numero;
        itens = new ArrayList<ItemPedido>();
        numeroCorrente = 1;
    }

    public PedidoMemento criarMemento(){
        return new PedidoMemento(numero, numeroCorrentem, itens);
    }
    
    public void restaurarMemento(PedidoMemento memento) {
        this.numero = memento.getNumero();
        this.numeroCorrente = memento.getNumeroCorrente();
        itens = new ArrayList<ItemPedido>();
        for (ItemPedidoMemento itemMemento : memento.getItens()) {
            itens.add(new ItemPedido(itemMemento.getNumero(),
            itemMemento.getQuantidade(),
            itemMemento.getCodigoProduto()));
        }
    }
}

///O código anterior ilustra duas operações adicionadas à classe Pedido 
/// >>Operacao criar mememnto
/// >>Operacao restaurar memento



///Implementacao de uma operação UNDO utilizando um objeto da classe pedido.
/// guardando uma referencia para o memento criado e retornando pelo objeto pedido

public class Exemplo {
    public static void main(String[] args) {
        Pedido pedido = new Pedido(1);
        pedido.adicionarItem(1, '1234');
        pedido.adicionarItem(2, '2345');
        //salva o estado atual do pedido, com dois itens
        PedidoMemento memento = pedido criarMemento();
        //adiciona o terceiro item ao pedido
        pedido.adicionarItem(3, '3456');
        System.ou.println(pedido.getItens().size()); //imprime o valor 3
        //restaura a situação salva do pedido, com dois itens apenas
        pedido.restaurarMemento(memento);
        System.out.println(pedido.getItens(.size()));; //imprime o valor 2
    }
}