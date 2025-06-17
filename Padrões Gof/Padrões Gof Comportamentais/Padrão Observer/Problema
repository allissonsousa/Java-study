///Utilizado em plataformas de desenvolvimento entre modelo e visualizacao no android, chamadas http do angular
/// Uma fonte de dados pode ser assinada por um conjunto de dados
/// Dependencia de um para muitos


public class Ponto extends Observable {
    private int x;
    private int y;

    public Ponto(int a, int b) {
        this.x = a;
        this.y = b;
    }
    public int getX(){
        return x;
    }
    public void setX(int x) {
        this.x = x;
        setChanged();  //chama operação definida na superclasse Observable
        notfyObservers();  //chama operação definida na superclasse Observable
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
        setChanged(); //chama operação definida na superclasse Observable
        notifyObservers();  //chama operação definida na superclasse Observable
    }
}


///definindo duas classes que desempenham o papel de observadores de modificações nas instâncias da classe Ponto
/// implementam a operação update, definida na classe Observable


public class Observador1 implements Observer {
    public void update (Observable o, Object o1) {
        if (o instanceof Ponto) {
            Ponto exemplo = (Ponto) o;
            System.out.println('Observador 1 => y ' + exemplo.getY());
        }
    }
}

public class Observador2 implements Observer {
    public void update(Observable o, Object o1) {
        if (o instanceof Ponto) {
            Ponto exemplo = (Ponto) o;
            System.out.println('Observador 2 => x = ' + exemplo.getX());
            System.out.println('Observador 2 => y = ' + exemplo.getY())
        }
    }
}



///omo o objeto subject e os observadores devem ser conectados para que o mecanismo funcione
/// uma instância da classe Ponto é criada e dois observadores são adicionados a ela por meio da operação addObserver


public class ExemploObserver {
    public static void main (String[] args) {
        Ponto subject = new Ponto(2, 5);
        Observador1 obs1 = new Observador1();
        Observador2 obs2 = new Observador2();

        subject.addObserver(obs1);  //equivalente a operação attach definida no padrao
        subject.addObserver(obs2);

        subject.setX(10);  //modifica o valor de x e notifica os observadores
        subject.setY(10);  //modigica o valor de y e notifica os observadores
    }
}