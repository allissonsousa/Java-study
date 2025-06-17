///remover os intens invalidos de uma coleçao de itens de um pedido q tem os atributos = quantidade, preço, produto

public class ItemPedido{
    private Produto produto;
    private int quantidade;
    private int precoUnitarioEmCentavos;

    public ItemPedido(Produto produto, int quantidade, int valorEmCentavos) {
        this.produto = produto;
        this.quantidade = quantidade;
        this.precoUnitarioEmCentavos = valorEmCentavos;
    }
    public int valor(){
        return quantidade * precoUnitarioEmCentavos;
    }
    public Produto getProduto() {
        return produto;
    }
    public void setProduto(Produto produto) {
        this.produto = produto;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public voi setQuantidade(int quantidade) {
        this quantidade = quantidade;
    }
    public int getPrecoUnitarioEmCentavos() {
        return precoUnitarioEmCentavos;
    }
    public void setPrecoUnitarioEmCentavos(int precoUnitarioEmCentavos) {
        this.precoUnitarioEmCentavos = precoUnitarioEmCentavos;
    }
}

///Operação de remoção dos intes invallidos >>>

public void removerItensInvalidos(ArrayList<ItemPedido> itens) {
    ArrayIterator<ItemPedido> cursor = new ArrayIterator(itens);
    white (cursor.hasNext()) {
        ItemPedido item = cursor.next();
        if (! isValido(item)){
            cursor.remove(item);
        }
    }
}
///has next - verifica se existe um proximo elemento no array ou se o cursor ja esta no ultimo
/// nex - retorna o proximo elemento do array
/// remove - remove um elemento da correção
public boolean isValido(ItemPedido item) {
    return (item.getQuantidade() > && item.getQuantidade() < 100);
}

///Arraylist = representa estruturas como arrays
/// linkedlist = representa estruturas como listas encadeadas
/// hahset = representa estruturas como conjuntos cahave-valor
/// treeset = representa estruturas como conjntos organizados em arvores de busca