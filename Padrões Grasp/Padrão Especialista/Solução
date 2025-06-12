///E se considerassemos a classe Produto como especialista em preço
/// Ela precisaria saber a quantidade para cumprir esse papel
/// Vamos definir entao a operaçao valorparaquantidade na classe
/// fazendo a operação obter valor passe a quantidade como argumento
/// sendo assim o calculo do valor x quantidade produto fica na classe produto
/// oque falicitaria em casos de aplicar desconto ao valor do produto apartir de x quantidade


public class ItemPedido{
    public ItemPedido(int numero, int quantidade, Produto produto) {
        this.numero =  numero;
        this.quantidade = quantidade;
        this.produto = produto;
    }
    public BigDecimal obtervaValor(){
        return produto.obterPrecoParaQuantidade(quantidade);
    }
    ...//restante da classe itempedido
}

public class Produto {
    private String codigo;
    private String descricao;
    private BigDecimal precounitario;
    private File imagem;

    public Bigdecimal obterPrecoParaQuantidade(int quantidade) {
        return precounitario.multiply(quantidade)
    }
    ...//restante da classe Produto
}