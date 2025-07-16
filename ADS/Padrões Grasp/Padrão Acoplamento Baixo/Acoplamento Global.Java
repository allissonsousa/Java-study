// modulos se comunicam por intermedio de recursos
// ex: variaveis globais
// no java n existe sintaxe para criação de variaveis globais
// resultado semelhante a uma classe global pode ser alcancado usando o PUBLIC STATIC

public class Globais {
    public static int limiteParaSaque = 500;
    public static String nomeBanco;
}

public ModuloA {
    public void operacaoA(){
        if(valor <= Globais.limiteParaSaque){
            System.out.println("valor dentro do limite");
        }
    }
}

public class ModuloA {
    public void operacaoB(int valor){
        Globais.limiteParaSaque = 1000;
    }
}

//Embora A n utilize diretamente elementos de B, acaba sendo afetada pela mudança implementada 
//no recurso que é compartilhado por ambos
