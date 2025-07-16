///Fornece principior de designs poo
/// simplifica a criaçao de objetos
/// define qual classe cria instancia de outra classe
/// se atender a certos requisitos uma classe recebe responsabilidade sobre a atribuição de outra
/// reduz o acoplamento
/// melhora a coesao
/// facilita a manutenção e entendimento do código
/// pode resultar em classes com muitas responsablidades

public class Pedido {
    private int numero;
    private java.util.Date.data;  //uso do pacote JAVA.UTIL
    private List<ItemPedido> itens;

    public void adiciontarItem(int quantidade, Produto produto) {
        itens.add(new ItemPedido(itens.size() + 1, quantidade, produto));
    }
    public Iterator<ItemPedido> getItens() {  //iterator permite navegar por itens de um arraylist
        return itens.Iterator();
    }
    public BigDecimal obterValorTotal() {
        BigDecimal resultado = new BigDecimal(0);
        itens.forEach(item -> {
            resultado.add(item.obterValor())
        });
        return resultado;
    }
    public int getNumero(){  //GET >> usado para LER o valor do dado
        return numero;
    }
    public void setNumero(int numero){   //SET >> usado para DEFINIR  o valor do dado
        this.numero = numero;
    }
    public Date getData(){
        return data;
    }
    public void setData(Date data){  //como o dado ja vai ser usado na mesma funcao apenas o metodo é criado como void
        this.data = data;
    }
}