/// Ha diversos compenentes prontos q podem ser usados no JAVA
/// No MVC usamos : JSF, Spring, EJB e Hibernate

/// ------------ JSF >> JavaServer Faces
/// Usado na camada view
/// Construção facil de interfaces graficas
/// Componentes reutilizaveis, programação baseada em eventos


/// ------------ SPRING
/// Usado na camada Controler
/// Suporte ao desenvolvimento de aplicações empresariais escalaveis e modulare
/// Injeção de dependencias
/// Gerenciamento de transações
/// Configuração flexivel


/// ------------ EJB >> Enterprise JavaBeans
/// Usado na camada Model
/// Nescessario para aplicações corporativas
/// Gerenciamento de transações
/// Segurança
/// Escalabilidade 


/// ----------- HIBERNATE
/// Usado na camada Model
/// Serve para mapeamento objeto relacional ORM, que simplifica o acesso ao banco de dados
/// Persistencia de objetos para o bd relacional de forma transparente
/// O desenvolvedor usa java e o framework transmite para sql 


// ----------------------------------------------- INTERAÇÃO ENTRE OS COMPONENTES -------------------------

// JSF >> Interage com o Spring >> recebe requisições e enviao ao Controller
// Spring >> chama os métodos EJB e Hibernate, realiza operações de negócio e persistencia de dados
// >> O resultado volta para o JSF e é exibido

@Local
public interface ProdutoGestorLocal {
    List<Produto> obterTodos();
    void incluir(Produto p);
}

@Stateless
public class ProdutoGestor implements ProdutoGestorLocal {
    @Override
    public List obterTodos() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ExemploSimplesJPAPU");
        EntityManager em = emf.createEntityManager();
        Querry query = em.createNamedQuery("Produto.findAll");
        List<Produto> lista = query.getResultList();
        em.close();
        return lista;
    }
    @Override
    public void incluir(Produto p) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ExemploSimplesJPAPU");
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(p);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        }finally{
            em.close();
        }
    }
}



@WebServlet(name = "ServletListaProduto", urlPatterns = {"/ServletListaProduto"})
public class ServletListaProduto extends HttpServlet {
    @EJB
    ProdutoGestorLocal facade;
//o atributo facade, do tipo ProdutoGestorLocal, utilizando a anotação EJB 
//para injetar o acesso ao pool de Session Beans. Após configurar o acesso, invocamos o método obterTodos
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<html><body>");
            facade.obterTodos().forEach (p -> {
                out.println(p.getNome());
            });
            out.println("");
        }
    }
}