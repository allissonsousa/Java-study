/// permite o envio de uma requisição para o primeiro elemento de uma cadeia de objetos que podem 
/// realizar algum processamento relacionado a essa requisição.
/// fazendo com que o objeto requisitante não precise ficar acoplado a todos os objetos da cadeia, mas 
/// apenas ao objeto para o qual ele envia a requisição.


public class SevicoTarifaTelefonica {
    //método que calcula o custo de uma ligação recebida como parametro
    public BigDecimal tarifar(Ligacao ligacao) {
        // de acordo com o tipo da ligação, chama o método apropriado de calculo
        if (ligacao.isInterna()) {
            return tarifarLigacaoInterna(ligacao);
        } else if (ligacao.isLocal()) {
            return tarifarLigacaoLocal (ligacao);
        } else if (ligacao.isDDD()) {
            return tarifarLigacaoDDD (ligacao);
        } else if (ligacao.isDDI()) {
            return tarifarLigacaoDDI (ligacao);
        } else {
            return new BigDecimal(0);
        }
    }
    private BigDecimal tarifarLigacaoInterna (Ligacao ligacao) {
        //código para tarifação de ligação interna
    }
    private BigDecimal tarifarLigacaoLocal (Ligacao ligacao) {
        //código para tarifação de ligação local
    }
    private BigDecimal tarifarLigacaoDDD (Ligacao ligacao) {
        //código para tarifação DDD
    }
    private BigDecimal tarifarLigacaoDDI (Ligacao ligacao){
        //código para tarifação DDI
    }
}