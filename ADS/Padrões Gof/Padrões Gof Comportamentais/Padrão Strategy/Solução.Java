/// separar cada algoritmo em uma classe, fazendo com que todas as classes específicas
/// implementem uma interface comum, representada pelo participante Strategy.
/// Definição de família de algoritmos
/// Passos comuns na superclasse
/// Simplificação das estruturas


public interface CalculadoraJuros{
    BigDecimal taxaJuros (Titulo titulo, Date data, List<PontoCurva> pontos);
}
public class CalculadoraJurosRegressaoMultipla implements CalculadoraJuros {
    public BigDecimal taxaJuros (Titulo titulo, Date data, List<PontoCurva> pontos) {
        //implementação do algoritmo por regressao multipla
        //acessa os dados da curva recebidos no parametro pontos
    }
}

public class CalculadoraJurosBootstrap implements CalculadoraJuros{
    public BigDecimal taxaJuros (Titulo titulo, Date data, List<PontoCurva>pontos) {
        //implementação do algoritmo pleo metodo bootstrap
        //acessa os dados da curva recebidos no parametro pontos
    }
}

public class CalculadoraJurosSpline implements CalculadoraJuros{
    public BigDecimal taxaJuros (Titulo titulo, Date data, List<PontoCurva> pontos){
        //implementaaco do algoritmo pelo metodo spline cubicos
        //acessa os dados da curva recebidos no parametro pontos
    }
}

//CurvaJuros pode solicitar o cálculo da taxa, passando o algoritmo desejado para a sua execução.

public class CurvaJuros {
    private List<PontoCurva> pontos;

    //calcular a taxa de juros de um titulo para uma determinada data
    public BigDecimal taxaJuros (Titulo titulo, Date data, CalculadoraJuros calculadoraJuros){
        return calculadoraJuros.taxaJuros(Titulo, data, pontos);
    }
}

///
//

public class ClienteExemplo {
    private CurvaJuros curva;
    public ClienteExemplo() {
        curva = new CurvaJuros();
        //processo de construcao dos pontos da curva (omitido para simplificacao)
    }
    public BigDecimal obterTaxa (Titulo titulo, Date data) {
        //neste contexto, a taxa e calculada utilizando o  método splines cubicos
        return curva.taxaJuros (titulo, data, new CalculadoraJurosSpline());
    }
}