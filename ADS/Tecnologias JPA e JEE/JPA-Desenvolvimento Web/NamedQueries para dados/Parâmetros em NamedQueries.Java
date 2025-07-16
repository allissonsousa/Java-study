/// Consulta de dados parametrizada inclui receber os parametros, chave primaria de indentificação, e enviar instruções pro bd

// NAMED QUERIES
/// - consultas pre definidas e reutilizaveis
/// - consulta com nomes unicos ( geralmente usando o nome da classe da entidade)
/// - uso da anotação @NamedQuery com nome da consulta e a query em JPQL 
/// - uso do método setParameter() para atribuir valores aos parametros

@Entity
@Table (name = 'PRODUTO')
@NamedQueries({
    @NamedQuery(name = 'Produto.findAll', query = 'SELECT p FROM Produto p'),
    @NamedQuery(name = 'Produto.findByCodigo', query = 'SELECT p FROM Produto WHERE p.codigo = :codigo') //:codigo é a anotação de parametro
})

public class Produto implements Serializable{ } //classe de entidade

// --- UTILIZAÇÃO DAS NAMEDQUERIES

//Executando a NamedQuery com parametros
Query query = em.createNamedQuery('Produto.findById'); //instanciação de um objeto tipo query, usando o entitymaganer, é criado uma namedquery passando o identificador dela
query.setParameter('codigo', 1); //chama o metodo setparameter
List<Produto> produtos = query.getResultList();

// Imprimindo os produtos encontrados
for (Produto p : produtos) {
    System.out.println("Produto encontrado :" + p.getNome() " - Quantidade: " + p.getQuantidade());
}


// ------ PRINCIPAL
// Criação da classe principal

public class Principal {

    public static void main(String [] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ExemploSimplesJPAPU");
        EntityManager em = emf.createEntityManager();
        Query query  = em.createNamedQuery('Produto.findById');
        query.setParameter('codigo',1);
        List<Produto> lista = query.getResultList();
        lista.forEach((e) -> {
            System.out.println(e.getCodProduto() + "-" e.getNome())
        });
        em.close();
    }
}