///Conversao de interfaces 
/// desacoplamento
/// torna o codigo mais complexo ma menos extenso e reutiliavel
/// é mais flexivel e mais simples no quesito cliente
/// por ser mais complexo pode acabar sendo mais dificil de manter esse codigo


//FACADE:simplifica a interface de um subsistema inteiro

//DECORATOR: adiciona comportamento a um objeto dinamicamente ser alterar sua interface

//BRIDGE: separa uma abstração de sua implementação

//PROXY: atua como intermediario semelhante ao adapter, mas para controlar o acesso ao objeto original

//A implementação a seguir mostra a estrutura da implementação com a utilização do padrão.

public class ServiçoPagamento {
    //o parametro broker pagamento é um objeto adaptar q implementa a interface generica broker pagamento
    public void pagarCartaoCredito(brokerPagamento broker, CartaoCredito cartao, BigDecimal valor) {
        broker.pagarCartaoCredito  (cartao, valor);
    }
}
public class BrokerXPTOAdapter implements BrokerPagamento{
    public void pagarCartaoCredito(CartaoCredito cartao, BigDecimal valor) {
        PagXPTO brokerPagamento = new PagXPTO();
        DadoCartao dadoCartao = converterCartao(cartao);

        if (isCartaoVisa(cartao)) {
            brokerPagamento.pagarCartaoVisa(dadosCartao, valor);
        } else {
            brokerPagamento.pagarCartaoMastercard(dadosCartao, valor);
        }
    }
}

public class BrokerABCAdapter implements BrokerPagamento {
    public void pagarCartaoCredito(CartaoCredito cartao, BigDecimal valor) {
        ABCPagamentos brokerPagamento = new ABCPagamentos();
        brokerPagamento.pagarEmCartaoCredito(cartao.numero(), cartao.nome(), cartao.cvv(), cartao.validade(), valor)
    }
}
