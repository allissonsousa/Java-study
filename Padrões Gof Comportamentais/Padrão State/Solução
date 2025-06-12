///As classes PDV_Estado_Disponivel e PDV_EstadoVendendo são dois exemplos de classes concretas que correspondem a 
/// implementações distintas da interface genérica de eventos.


public class PDV {
    private PDV_Estado estadoCorrente;

    public void mudarEstado(PDV_Estado estado) {
        this.estadoCorrente = estado;
    }
    public iniciarSangria() {
        //contexto é passado como argumento para a operação do estadoCorrente
        estadoCorrente.iniciarSangria(this);
    }
}
public abstract class PDV_Estado {
    public abstract void iniciarSangria(PDV pdv);
}
public class PDV_Estado_Disponivel() extends PDV_Estado {
    public void iniciarSangria(PDV pdv) {
        //inicia o processo de sangria normal
        contexto.mudarEstado(new PDV_Estado_SangriaNormal());
    }
}
public class PDV_Estado_Vendendo() extends PDV_Estado {
    public void iniciarSangria(PDV pdv) {
        //inicia o processo de sangria expressa
        contexto.mudarEstado(new PDV_Estado_SangriaExpressa());
    }
}
