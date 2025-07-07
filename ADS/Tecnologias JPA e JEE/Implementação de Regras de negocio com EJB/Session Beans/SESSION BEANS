/// Encapsulamento da logica de negocios
/// usados para implementar transações, acesso a DB e outras operações de logica de negocios
/// Essenciais em aplicações empresariais JEE
/// Stateles e Statfull


//------ STATELESS 

/// Nao armazena dados entre uma utilização e outra
/// Pode ser compartilhado por varias requisiçoes simultaneas
/// Leve 
/// Usado em situações que nao nescessitam de armazenar os dados (calculadora ex)



// ----- STATEFULL

/// Armazena os dados das requisições
/// Usado quando nescessario manter o contexto da aplicação (troca de mensagens por ex)
/// Pode armazenar informaçoes sensiveis de um cliente ou outra parte da aplicação (carrinho de comprar ex)
/// Pode ser usado em comercio eletronico, serviço financeiro


// ----- Interface de Acesso

// Antes de definir o session beans ciramos sua interface de acesso com base na anotação local, permitindo q o
// componente seja acessado remotamente

@Local
public interface calculadora {
    int somar (int a, int b);
}

@Stateless 
public class Calculadora implements Calculadora {
    @Override
    public int somar (int a, int b) {
        return a + b;
    }
}



// ---- SERVELET

@WebServlet(name = "ServletSoma",ulPatterns = {"/ServletSoma"})
public class ServletSoma extends HttpServlet{

    @EJB
    CalculadoraLocal facade;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<html><body>");

            out.println("<h1>Servlet ServletSoma: " + facade.somar(2,3) + "</h1>");
            out.println("</body");
            out.println("</html>");
        }
    }
}