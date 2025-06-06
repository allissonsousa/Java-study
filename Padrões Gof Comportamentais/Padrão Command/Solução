///código para a configuração dos eventos do jogo com a aplicação desse padrão
/// criação da interface generica COMANDO e os comandos concretos correspondentes as ações do jogo


public interface Comando {
    public abstract void executar()  //criacao de um elemento visivel em todas as classes e subclasses q ira
    //armazenar um codigo implementado quando for chamado, é como uma variavel que recebe todo um trecho de codigo
    //ABSTRACT
}

public class Comando_IrParaFrente implements Comando { //IMPLEMENTS=  obriga a classe a receber os metodos da interface usada logo acima
    private Jogo jogo;
    public Comando_IrParaFrente (Jogo jogo) {
        this.jogo = jogo;   //THIS.jogo se refere ao atributo da classe
    }
    public void executar() {
        jogo.irParaFrente();
    }
}
public class Comando_IrParaTras implements Comando{
    private Jogo jogo; //declarando atributo jogo. classe Jogo é uma classe q ja foi declarada
    public Comando_IrParaTras (Jogo jogo) {
        this.jogo = jogo;
    }
    public void executar() {
        jogo.irParaTras();
    }
} 

///Note que o construtor de cada comando concreto recebe o objeto da classe Jogo para o qual a 
/// requisição será passada. Portanto, Jogo corresponde ao participante Receiver do padrão.


//associando as teclas/botoes aos comandos
//a classe configuracao jogo corresponde ao Cliente do padrao

public class ConfiguracaoJogo {
    public static Map<Integer, Comando> obterConfiguracaoPadrao (Jogo jogo) {
        Comando comando_ParaFente = new Comando_IrParaFrente(jogo);
        Comando comando_Paratras = new Comando_IrParaTras(jogo);
        Comando comando_Pular = new Comando_Pular(jogo);

        Map<Integer, Comando> comandoMap = new HashMap<>();
        comandoMap.put(TECLA_W, comando_ParaFente);
        comandoMap.put(TECLA_S, comando_Paratras);
        comandoMap.put(TECLA_ESPACO, comando_Pular);
        comandoMap.put(BOTAO_4, comando_Pular);

        return comandoMap;
    }
}

//Implementação da Classe InterfaceJogo
//O metodo TratarEvento ficou desacoplado de todos os possiveis comandos, permite add comandos sem alteralo
//codigos de eventos de interface e seus comandos ::

public class InterfaceJogo {
    private Map<Integer, Comando> configuracao:  //cpnstrução de uma estrutura mapa\dicionario  que chave = integer = numeros
                                                //valor = obj classe comando = ação
    public void setConfiguraçãoJogo(map<Integer, comando> configuracao){
        this.configuracao = configuracao
    }
    public void tratarEvento(int evento){
        //acessa a tabela para obter o comando correspondente ao evento e o executa
        getComando(evento).execute();
        }
        private Comando getComando(int evento) {
            return configuracao.get(evento);
        }
}
public class AppExemplo{
    public static void main (String[args]){ //STATIC= pertence a classe, n precisa criar objet para ser chamado
                                            // quando o programa é executado começa por aqui
                                            //MAIN: nome obrigatorio para ponto de inicio do JAVA
                                            //STRING ARGS= permite receber argumentos do terminal
            Jogo jogo = new Jogo(); //variavel jogo= contem o proprio  jogo em si
            //classe Jogo = contem o estado atual do jogo
        InterfaceJogo controlador = new InterfaceJogo(); //controlador é uma instancia da classe interfacejogo, cria 
                                                            //um objeto q controla a interface do jogo
        controlador.setConfiguraçãoJogo(ConfiguracaoJogo.obterConfiguracaoPadrao(jogo)); 
                    //chama o metodo statico(obtconfigpadrao da classe configjogo), que recebe o jogo como argumento
                    //e retorna um confunto de comandos/configuracar padrao
        //codigo restante para colocar o jogo no ar
    }
}
