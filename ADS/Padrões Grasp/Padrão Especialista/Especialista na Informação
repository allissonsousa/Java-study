///Principio de design de software
/// um dos nove principios do grasp
/// Atribui responsabilidade a classe que possuir maior responsabilidades
/// Garantir que as operaçoes sejam feitas por quem tem o conhecimento
/// Localizar aonde estao as informaçoes relevantes dentro do sistemas
/// Atribui responsabilidade as classes com acessos diretos aos dados relevantes
/// Alta coesao
/// Baixo acoplamento, e baixa dependencia de classes uma entre a outra
/// Faciliade de manutenção e leitura do codigo
/// Usado como base para o padrao do projeto

///Criação de objetos com muitas responsabilidas
/// Codigo mais complexos
/// Risco de sobrecargas
/// Classe Deus

public class Pedido {
    private int numero;
    private Date data;
    private List<ItemPedido> itens;

    public BigDecimal obterValorTotal() {
        Bigdecimal resultado = new Bigdecimal(0);
        itens.forEach(item -> {
            resultado.add(item.obterValorTotal());
        });
        return resultado;
    }
    public int getNumero(){
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public Date getData(){
        return data;
    }
    public Iterator<ItemPedido> getItens() {
        return itens.Iterator();
    }
    public void adicionarItem(int quantidade, Produto produto) {
        itens.add(new ItemPedido(itens.size() + 1, quantidade, produto));
    }
}

public class ItemPedido {
    private int numero;
    private int quantidade;
    private Produto;

    public ItemPedido(int numero, int quantidade, Produto) {
        this.numero = numero;
        this.quantidade = quantidade;
        this.produto = produto;
    }
    public BigDecimal obtervaValor() {
        return produto.getPrecoUnitario().multiply(new BigDecimal(quantidade));
    }
    public int getNumero(){
        return numero;
    }
    public void setNumero(int numero){
        this.numero = numero;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    public Produto getProduto() {
        return produto;
    }
    public void setProduto(Produto produto) {
        this.produto = produto
    }
}
public class Produto {
    private String codigo;
    private String descricao;
    private BigDecimal precounitario;
    private File imagem;

    public String getCodigo(){
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String getDescricao() {
        return descricao;
    }
    public BigDecimal getPrecoUnitario() {
        return precounitario;
    }
    public void setPrecoUnitario(Bigdecimal precounitario) {
        this.precounitario = precounitario;
    }
    public File getImagem() {
        return imagem;
    }
    public void setImagem(File imagem) {
        this.imagem = imagem
    }
}