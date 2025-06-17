///viabilizar undo e redo, empilhando instantâneos do estado do objeto, 
/// de forma a permitir a recuperação dos estados anteriores
/// guardar o estado do objeto anterior à execução das operações que precisarão ser desfeitas.


public class Pedido {
    private int numero;
    private List<ItemPedido> itens;
    private int numeroItemCorrente;

    public Pedido(int numero) {
        this.numero = numero;
        itens = new ArrayList<>();
        numeroItemCorrente = 1;
    }
    
    public void adicionarItem(int qtde, String codigoProduto){
        itens.add (new ItemPedido (++numeroItemCorrente, qtde, codigoProduto));
    }
    public int getNumero(){
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public Iterator<ItemPedido> getItens() {
        return itens.iterator();
    }
}