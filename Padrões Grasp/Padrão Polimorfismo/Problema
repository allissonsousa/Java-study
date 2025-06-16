// Tratamento uniforme de classes atravez de herança e implementação de interfaces
// Promove a extensibilidade do codigo e reutilização de medotos por herança
// Consinste entao na criação de uma interface generica que pode derivar de varias implementações especificas

public class FechamentoPedido {
    private ConfiguracaoSistema config;

    public FechamentoPedido(ConfiguracaoSistema config){
        this.config = config;
    }

    public BigDecimal fecharPedido(Pedido pedido) {
        if (config.brokerPagamento == ConfiguracaoSistema.BROKER_1) {
            config.broker1.efetuarPagamento_Broker1();
        } else if (config.brokerPagamento == ConfiguracaoSistema.BROKER_2) {
            config.broker2.efetuarPagamento_Broker2();
        } else if (config.brokerPagamento == ConfiguracaoSistema.BROKER_3) {
            config.broker3.efetuarPagamento_Broker3();
        }
    }
}

//no exemplo cada broker fornece uma API proprietaria com interfaces diferentes.
//os sufixos broker nos nomes das operaçoes representam o fato de que cada API possui um nome diferente e diferentes
// tipos de argumentos q podem passar na chamada de cada operação