///Encapsulamento de algoritimo, cada comando em uma classe independente, tratamento de eventos de forma distribuida
/// Fragmentação da complexidade do sistema
/// Desacoplamento entre o objeto que dez a requisicao e objeto q processa ela
/// Reutilizaçao de comandos comuns
/// possibilidade de undo e redo
/// Criar filas de requisições

//SUPONDO que um jogo tem as teclas W S Space btn4 COMO comandos de ação
//se fizermos uma operação correspondente para cada ação, definindo constantes equivalentes a todos eventos do jogo


public class InterfaceJogo {
    private Jogo jogo;
    // mapa de configuração evento  -> ação do jogo
    Map<Integer, Integer> configuracao = new HashMap<>();

    public InterfaceJogo (Jogo jogo) {
        this.jogo = jogo;
    }
    public void setConfiguração(Map<Integer, Integer> configuracao) {
        this.configuracao = configuracao;
    }
    public void tratarEvento (int evento) {
        // acessa a tabela para obter o código da ação correspondente ao evento
        int codigoAcao = getCodigoAcao(evento);
        // executa a ação correspondente ao código
        switch (codigoAcao) {
            case IR_PARA_FRENTE: jogo.irParaFrente();
                                            break;
            case IR_PARA_TRAS:      jogo.irParaTras();
                                            break;
            case PULAR:                         jogo.pular();
                                    break;
        }
    }
    private int getCodigoAcao(int evento) {
        return configuracao.get(evento);
    }
}