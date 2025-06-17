///O padrão Flyweight soluciona o problema do alto consumo de memória ao compartilhar dados intrínsecos entre muitos 
/// objetos semelhantes. A abordagem separa os dados compartilháveis (intrínsecos) dos dados específicos de cada objeto 
/// (extrínsecos), armazenando apenas uma instância dos dados intrínsecos
/// Redução significativa de consumo de memória
/// Pode aumentar a complexidade do projeto
/// Usa uma pool de objetos com keysp

public class ElementoQuimicoFactory{  ///fabrica que cria e guarda os dados simbolo e nome como um cartaozinho
    private Map<String, ElementoQuimico> elementos; ///procura no mapa se ja existe um cartao, se ja existe usa ele, se nao cria um novo cartao
    public ElementoQuimico criarElemento (String simbolo, String nome) {
        ElementoQuimico elemento = elementos.get(simbolo);
        if (elemento == null) {
            elemento = new ElementoQuimico(simbolo, nome); //criação de um novo cartaozinho com simboloe nome
            elementos.put(simbolo, elemento);
        }
        return elemento;
    }
}

public class ElementoQuimico {  ///cartaozinho simbolo e nome
    private String simbolo;
    private String nome;

    ElementoQuimico (String simbolo, String nome) {
        this.simbolo = simbolo;
        this.nome = nome;
    }
    // getters e setters omitidos
}

public class Exemplo{
    public static void main(String[]args){  //uso da fabrica para montar as substancias
        ElementoQuimicoFactory factory = new ElementoQuimicoFactory();

        SubstanciaSimples s1 = new SubstanciaSimples('Oxigenio',  //criação do cartao com simbolo O e nome Oxigenio
        factory.criarElemento('O', 'Oxigenio'), 2);
        SubstanciaSimples s2 = new SubstanciaSimples('Ozonio',
        factory.criarElemento('O','Ozonio'), 3);

        Map<ElementoQuimico, Integer> composicaoAgua = new HashMap<>();  //criação de um novo mapa q diz quantos atomos de cada elemento agua tem
        composicaoAgua.put(factory.criarElemento('H', 'Hidrogenio'), 2);
        composicaoAgua.put(factory.criarElemento('0', 'Oxigenio'), 1);

        SubstanciaComposta s3 = new SubstanciaComposta('Agua', composicaoAgua);
    }
}