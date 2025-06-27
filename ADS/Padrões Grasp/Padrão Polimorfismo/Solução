// Criação consistente de uma interface generica para qual podem existir diversas implementações especificas
// A estrutura condicional é substituida por uma unica chamada utilizando a interface generica

public interface BrokerPagamento {
    void efetuarPagamento (Pedido pedido); //separação do modulo cliente dos modulos que implementao essa interface
}

public class Broker_1_Adapter implements BrokerPagamento {
    private Broker1 broker1 = new Broker1();
    public void efetuarPagamento(Pedido pedido) { //um adaptador de interface é criado especificamente pra cada broker 
        //código especifico para utilização do broker 1
        broker1.efetuarPagamento_Broker1();
    }
}

public class Broker_2_Adapter implements BrokerPagamento ´{
    private Broker1 broker2 = new Broker1();
    public void efetuarPagamento(Pedido pedido) {
        //codigo especifico para utilização do broker 2
        broker2.efetuarPagamento_Broker2();
    }
}

    public class FechamentoPedido {
        private ConfiguracaoSistema config;

        public class FechamentoPedido (ConfiguracaoSistema config) {
            this.config = config;
        }
        public BigDecimal fecharPedido( Pedido pedido) {
            config.broker.efetuarPagamento(); //chamada polimorfica
        }
    }