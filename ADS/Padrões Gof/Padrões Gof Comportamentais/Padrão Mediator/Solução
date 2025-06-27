///O mediador faz intermedio dos objetos, intervindo quando ele é chamado, um objeto nunca vai chamar o outro diretamente
/// tudo passa pelo mediador, cada ação, um participante do codigo nao vai nem saber quem é o outro participante
/// gera uma solução de menor acoplamento para interações complexas entre objetos
/// controle fica centralizado no mediador


public interface MediadorCompra { //criacao da interface que define os componentes participantes das interacoes
    void pagamentoConcluido(int idCompra);
    void pedidoConfirmado();
}

public class MediadorCompraSimples implements MediadorCompra{
    private Pagamento pagamento;
    private Compra compra;
    private Logistica logistica;
    private SAC sac;

    public MediadorCompraSimples(Pagamento pagamento, Compra compra, Logistica logistica, SAC sac) {
        this.pagamento = pagamento;
        this.compra = compra;
        this.logistica = logistica;
        this.sac = sac;
    }
    public void pagamentoConcluido(int idCompra){
        //medidador invoca operações da compra ao recever a notificacao de pagamento
        compra.confirmar(idCompra);
    }
    public void pedidoConfirmado(){
        //mediador invoca operacoes de logistica e do sac ao receber a confirmação
        CompraVO dadosCompra = prepararDadosCompra(compra);
        logistica.prepararEntrega(dadosCompra);
        sac.enviarEmailConfirmacaoCompra(dadosCompra);
    }
    private CompraVO prepararDadosCompra(Compra compra) {
        CompraVO dadosCompra = new CompraVO();
        //codigo para carga de todos os dados da compra estaria aqui
        return dadosCompra;
    }
}