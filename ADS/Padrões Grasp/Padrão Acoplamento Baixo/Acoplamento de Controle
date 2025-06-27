/// modulo controla a logica interna de outro modulo, passando uma informação de controle


public class ProdutoRepository{
    public static final int ARQUIVO_LOCAL = 1;
    public static final int ARQUIVO_FTP = 2;
    public static final int BANCO_RELACIONAL = 3;

    public Produto obterProduto(int origem, String chave){
        switch (origem){
            case ARQUIVO_LOCAL:
                return obterProdutoViaArquivoLocal(chave);
            case ARQUIVO_FTP:
                return obterProdutoViaArquivoFTP(chave);
            case BANCO_RELACIONAL:
                return obterProdutoViaBancoRelacional(chave);
        }
    }
    private Produto obterProdutoViaArquivoLocal (String chave){
        //implementação da operação de leitura do Produto via arquivo local
    }
    private Produto obterProdutoViaArquivoFTP(String chave){
        //implementação da operação de leitura do Produto via arquiv ftp
    }
    private Produto obterProdutoViaBancoRelacional(String chave){
        //implementação da operação de leitura do Porduto via banco de dados relacionais
    }
}

public class ModuloCliente{
    public void operacaoCliente(ProdutoRepository repositorio){
        Produto p = repositorio.obterProduto(ProdutoRepository.BANCO_RELACIONAL, "1234");
        //restante da implementação da operação que viria aqui
    }
}