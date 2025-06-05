///supondo q um supervisor de loja queira dar desconto a um cliente porem n tem permissao, ele vai ao gerente,
/// e o gerente ao seu superior, e assim em diante, ate conseguir uma resposta retorno para o cliente

public abstract class TarifadorLigacao {
    private TarifadorLigacao sucessor;
    public TarifadorLigacao setSucessor(TarifadorLigacao sucessor) {
        this.sucessor = sucessor;
        return this;
        //retorna ele proprio para facilitar a construcao da cadeia de objetos
    } 
    public BigDecimal tarifar (Ligacao ligacao) {
        //este método na superclasse repassa a chamada para o próximo objeto da cadeia
        return (sucessor != null)
            ? sucessor.tarifar (ligacao);
                :new BigDecimal(0);
    }
}

//implementação de uma classe tarifadora para cada tipo de ligação

public class TarifadorLigacaoInterna extends TarifadorLigacao {
    //método que calcula o custo de uma ligação recebida como parametro
    public BigDecimal tarifar(Ligacao ligacao) {
        if (ligacao.isInterna()){
            return tarifarLigacaoInterna(ligacao); //se for ligacao inter, tarifa
        } else {
            return super.tarifar(ligacao); //se nao for, repassa para proximo da cadeia
            
        }
    }
}

public class TarifadorLigacaoLocal extends TarifadorLigacao {
    //método que calcula o custo de uma ligação recebida como parametro
    public BigDecimal tarifar(Ligacao ligacao) {
        if (ligacao.isLocal()){
            return tarifarLigacaoLocal(ligacao); //se for ligacao local, tarifa
        } else {
            return super.tarifar(ligacao); //se nao for, repassa para proximo da cadeia
            
        }
    }
    private BigDecimal tarifarLigacaoLocal (Ligacao ligacao) {
        //codigo para tarifação de ligação local
    }
} // A operação tarifar dessa classe simplesmente faz a requisição para o primeiro tarifador da cadeia.


///ConfiguradorServicoTarifacaoTelefonica é a injecao de uma cadeia de responsabilidade em uma classe cliente
/// Ela cria uma cadeia de tarifadores, um para cada tipo de ligação, usando a operação setSucessor para ligar 
/// um tarifador ao outro
/// a cadeia é passada como argumento para o construtor da classe ServicoTarifacaoTefefonica.


public class ServicoTarifacaoTefefonica() {
    private TarifadorLigacao tarifador;
    public ServicoTarifacaoTefefonica (TarifadorLigacao tarifador) {
        this.BigDecimal = tarifador;
    }
    public BigDecimal tarifar (LigacaoTelefonica ligacao) {
        return tarifador.tarifar(ligacao); //chama o primeiro tarifador da cadeia
    }
}

public class ConfiguradorServicoTarifacaoTelefonica{
    public ServicoTarifacaoTefefonica getInstance() {
        // cria a cadeia de tarifadores
        TarifadorLigacao cadeiaTarifadores = new TarifadorLigacaoInterna().
        getSucessor(new TarifadorLigacaoDDI()).
        getSucessor(new TarifadorLigacaoLocal()).
        getSucessor(new TarifadorLigacaoDDD());
        //instancia o serviço passando a cadeia de tarifadores
        return new ServicoTarifacaoTefefonica(cadeiaTarifadores);
    }
}