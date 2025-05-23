// A intenção o padrão adapter do GOF: converter a interface de uma classe EXISTENTE em outra interface esperada pelos modulos 
// dos clientes. Isso torna interfaces incompativeis capazes de trabalhar em conjunto sem mofificação de código
// Reaproveitamento de Codigo
//Aplicação >> sistemas com apis variadas ou bibliotecas

//implementando uma solução. ex um vendedor q usa dois metodos de pagamento com a classe abcpagamento e pagptxo


// Solução de pagamentos do foneceor XPTO
public class PagXTO {
    public void pagarCartaoVisa(DadosCartao cartao, BigDecimal valor);
    public void pagarCartaoMastercard(DadosCartao cartao, BigDecimal valor);
}

//Solução de pagamentos do fornecedor ABC
public class ABCPagamentos {
    public void pagarEmCartaoCredito(String numeroCartao, String Nome, String CVV, String validade, BigDecimal valor)
}


//Sem usar o padrao adapter um modulo cliente que precisasse chamr uma api de pagamento usaria o esquema seguinte
public class ServiçoPagamento {
    public void pagarCartaoCredito(String nomeBroker, CartaoCredito cartao, BigDecimal valor)
    {
        if ("XPTO".equals(nomeBroker)) {
            pagarCartaoXPTO(cartao, valor);
        } else if ("ABC".equals(nomeBroker)) {
                pagarCartaoABC(cartao, valor);
        }
    }
    
    // chamada à API de pagamento do fornecedor XPTO
    private void pagarCartaoXPTO(CartaoCredito cartao, BigDecimal valor) {
        PagXPTO brokerPagamento = new PagXPTO();
        //converte o parametro cartao para a estrutura requerida pela API
        DadosCartao dadosCartao = converterCartao(cartao);
        //com base no número do cartao, define a funcao da API a ser chamada
        if(isCartaoVisa(cartao)) {
            brokerPagamento.pagarCartaoVisa(dadosCartao, valor);
        } else {
            brokerPagamento.pagarCartaoMastercard(dadosCartao, valor)
        }
    }
    //chamda à API de pagamento do forecedor ABC
    private void pagarCartaoABC(CartaoCredito cartao, BigDecimal valor){
        ABCPagamentos brokerPagamento = new ABCPagamentos();
        brokerPagamento.pagarEmCartaoCredito(cartao.numero(), cartao.nome(),
            cartao.cvv(), cartao.valildade(), valor);
    }

}