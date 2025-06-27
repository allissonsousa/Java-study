///visa promover a separação entre uma família de objetos e os algoritmos que serão utilizados
///definicao de novas funcionalidades sem modificar os objetos
/// extensao de software
/// nao usar quando ha modificacao frequente na hierarquia
/// funcionalidades plugaveis
/// espalhamento e fragmentação de interesses
/// visitantes podem ser acrecentados



//O código a seguir, ilustra a implementação do problema das expressões aritméticas, utilizando o padrão Visitor

public abstract class ElementoExpressao {
    public abstract void (VisitorExpressaoAritimetica visitor);
}

public class NumeroInteiro extends ElementoExpressao {
    private int valor;
    public NumeroInteiro(int valor) {
        this.valor = valor;
    }
    public void accept(VisitorExpressaoAritimetica visitor) {
        visitor.visitNumeroInteiro(this);
    }
    public int getValor() {
        return valor;
    }
}

public abstract class OperadorAritimetico extends ElementoExpressao {
    private ElementoExpressao operandoEsquerdo;
    private ElementoExpressao operandoDireito;

    public OperadorAritimetico(ElementoExpressao operandoEsquerdo, ElementoExpressao operandoDireito) {
        this.operandoDireito = operandoDireito;
        this.operandoEsquerdo = operandoEsquerdo;
    }
    public abstract String getOperador();
    public ElementoExpressao getOperandoEsquerdo() {
        return operandoEsquerdo;
    }
    public void setOperandoEsquerdo(ElementoExpressao operandoEsquerdo) {
        this.operandoEsquerdo = operandoEsquerdo;
    }
    public ElementoExpressao getOperandoDireito() {
        return operandoDireito;
    }
    public void setOperandoDireito(ElementoExpressao operandoDireito) {
        this.operandoDireito = operandoDireito;
    }
}

public class OpSoma extends OperadorAritimetico {
    public OpSoma(ElementoExpressao operandoDireito, ElementoExpressao operandoEsquerdo) {
        super(operandoDireito, operandoEsquerdo);
    }
    public String getOperador() {
        return '+';
    }
    public void accept(VisitorExpressaoAritimetica visitor){
        visitor.visitOpSoma(this);
    }
}

/////////

public interface VisitorExpressaoAritimetica {
    void visitNumeroInteiro(NumeroInteiro numero);
    void visitOpSoma(OpSoma opSoma);
}
public class VisitorCalculadora implements VisitorExpressaoAritimetica {
    private int valor;
    public int getValor() {
        return valor;
    }
    public void visitNumeroInteiro(NumeroInteiro numero) {
        valor = numero.getValor();
    }
    public void visitOpSoma(OpSoma opSoma) {
        valor = obterValorExpressao(opSoma.getOperandoEsquerdo()) + obterValorExpressao(opSoma.getOperandoDireito())
    }
    private int obterValorExpressao(ElementoExpressao expressao) {
        VisitorCalculadora visitor = new VisitorCalculadora();
        expressao.accept(visitor);
        return visitor.getValor();
    }
}
public class TestCalculadora{
    public static void main(String[] args){
        //definicao da expressao 10 + 20 + 30
        ElementoExpressao expressao = new OpSoma(new NumeroInteiro(10), new NumeroInteiro(20), new NumeroInteiro(30));
        VisitorCalculadora visitorCalc = new VisitorCalculadora();
        expressao.accept(visitorCalc);
        System.out.println('resultado = ' + visitorCalc.getValor());
    }
}