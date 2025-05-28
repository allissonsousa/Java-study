///Minimização do uso de memoria, evita duplicação desnecessaria de dados
/// !!!!Evitar redundancias desnecessarias
/// Melhora a performance em sistemas que tem muitos objetos semelhantes ou parecido
///Ineficiencia em sistemas de alto volume de objetos / que usam muitos objetos de dados repetitivos/ melhora a escabilidade do sistema

public class ElementoQuimico {
    private String simbolo;
    private String nome;

    public ElementoQuimico (String simbolo, String nome) {
        this.simbolo = simbolo = simbolo;
        this.nome = nome;
    }

    //getters e setters omitidos
}

public abstract class Substancia {
    private String nome;

    public Substancia(String nome) {
        this.nome = nome;
    }

    //getters e setters omitidos
}

public class SubstanciaSimples extends Substancia {
    private int atomos; 
    private ElementoQuimico elemento;

    public SubstanciaSimples (String nome, ElementoQuimico elemento, int atomos) {
        super(nome);
        this.atomos = atomos;
        this.elemento = elemento;
    }
    //getters e setters omitidos
}

public class SubstanciaComposta extends Substancia {
    //conjunto de elementos quimicos e respectivas quantidades de atomos
    private Map<ElementoQuimico, Interger> composicao;

    public SubstanciaComposta (String nome, Map<ElementoQuimico, Integer> composicao){
        super(nome);
        this.composicao = composicao;
    }

    //getters e setters omitidos
}

///O código a seguir mostra como objetos dessas classes poderiam ser 
/// instanciados. Note como o elemento químico oxigênio é instanciado 
/// repetidamente nas diferentes substâncias criadas.


public class Exemplo {
    public static void main(String[] args) {
        SubstanciaSimples s1 = new SubstanciaSimples("Oxigênio",
            new ElementoQuimico("O", "Oxigênio"), 2);
        SubstanciaSimples s2 = new SubstanciaSimples("Ozônio",
            new ElementoQuimico("O", "Oxigênio"), 3);

        Map<ElementoQuimico, Integer> composicaoAgua = new HashMap<>();
        composicaoAgua.put(new ElementoQuimico("H", "Hidrogênio"), 2);
        composicaoAgua.put(new ElementoQuimico("O", "Oxigênio"), 1);

        SubstanciaComposta s3 = new SubstanciaComposta("Agua", composicaoAgua);
    }
}