///Define uma familia de algoritimos 
/// Encapsulandoos em objetos e permitindo que possam ser utilizados de forma intercambiavel
/// O algoritimo pode ser trocado sem que o modulo usuario desse algoritmo precise ser alterado
/// condicionais baseadas no ambiente
/// fluxos de operações complexas (substitui gigantescos ifelse)
/// Pode ser utilizado com flyweight
/// Poderia usar um factory method para criacao das estrategias


public class CusvaJuros {
    private Llist<PontoCurva> pontos;  //pontos que formam a curva de juros

    //calcular a taxa de juros de um titulo para determinada data
    public BigDecimal taxaJuros (Titulo titulo, Date data, TipoAlgoritmo tipo) {
        switch (tipo) {
            case TipoAlgoritmo.REGRESSAO_MULTIPLA:
                return taxaPorRegressaoMultipla(titulo, data);
                break;
            case TipoAlgoritmo.BOOTSTRAP:
                return taxaPorBootstrap(titulo, data);
                break;
            case TipoAlgoritmo.SPLINE:
                return taxaPorSpline(titulo, data);
                break;
        }
    }

    private BigDecimal taxaPorRegressaoMultipla (Titulo titulo, Date data){
        //implementacao do algoritimo por regressao multipla
        //acessa os dados da curva definidos no atributo pontos
    }
    private BigDecimal taxaPorBootstrap(Titulo titulo, Date data) {
        //implementacao do algoritmo pelo metodo bootstrap
        //acessa os dados da curva definidos no atributo pontos
    }
    private BigDecimal taxaPorSpline(Titulo titulo, Date data){
        //implementacao do algoritmo pelo metodo spline
        //acessa os dados da curva definidos no atributo pontos
    }
}

///Viola um dos principios open closed /SOLID do projeto, pois só pode ser alterado adicionando um novo switch case
/// nao é possivel reutilizar o algoritmo