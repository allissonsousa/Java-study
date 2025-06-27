///Solução o composite : uniformiação de tratamento, uso de folhas e nos com objetos, interação de hierarquias complexas de maneira
/// simplificada, suporta operações como adição, remoçao iteraçao sobre componentes, recursividade simplificada
/// metodo percorrem toda a arvore de componentes
/// facilidade de expansao, adicao de componentes
/// redução de condicionalidade, simplifica a logica e melhora a legibilidade do codigo


public abstract class Elemento {
    public void adicionar (Elemento elem) {}
    public void remover (Elemento elem) {}
    public abstract void apagar();
    public abstract void criptografar();
}

public class Mensagem extends Elemento {
    public void apagar() {
        //logica para apagar a mensagem
    }
    public void criptografar(){
        //logica para criptografar a mensagem
    }
}

public class Pasta extends Elemento{
    private List filhos = new ArrayList<>();
    public void adicionar(Elemento elem) {
        filhos.add(elem);
    }
    public void remver(Elemento elem) {
        filhos.remove(elem)
    }
    public void apagar(){
        for (Elemento elemento : filhos) { //apaga todos os filhos
            elemento.apagar();
        }
        //logica adicional para apagar a pasta
    }
    public void criptografar(){
        for (Elemento elemento : filhos) { // criptografa todos o fihos
            elemento.criptografar();
        }
        //logica adiional para criptograar a pasta
    }
}
