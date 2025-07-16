///JPA= framework de persistencia de dados
/// Entity manager= interface JPA que realiza operações de persistencia com dados
/// JPQL= linguagem de consulta de dados do JPA para recuperar dados de forma flexivel/ lembra um pouco SQL

///O entity manager permite, consulta, atualizar inserção e atualização de dados
/// persist(obj) insere um objeto no BD
/// merge(obj) compara um objeto existente no BD e atualiza as mudanças
/// remove(obj) remove o objeto no BD

///JPQL- Linguagem de consulta


// ----  INSERÇÃO DE DADOS
public class ExemploInsercaoDados{
    public static void main(String[] args){
        //obtem o entityManager a partir do PersistenceManager
        EntityManager entityManager = PersistenceManager.getEntityManager();

        try {
            //inicia uma transação
            entityManager.getTransaction().begin(); 

            //cria uma nova instancia da entidade Produto
            Produto produto = new Produto(1L, "Notebook", 1999.99); //instancia e inserta um novo objeto do tipo produto, persiste o objeto no bd

            //comita a transação
            entityManager.getTransaction().commit(); //comita a inserção no BD

            System.out.println("Inserção de dados concluida com sucesso!")

        } catch (Exception e) {
            //trata exceções
            entityManager.getTransaction().rollback(); //se deu erro volta ao estado anterior desfazendo a alteração da persistencia no BD
            e.printStackTrace();
        } finally {
            //fecha o entity Manager
            entityManager.close();
            PersistenceManager.closeEntityManagerFactory();  //fecha o manager factory que cria os gerenciadores de entidades
        }
    }
}



//--- ATUALIZAÇÃO DE DADOS
import javax.persistence.EntityManager;

public class ExemploAtualizacaoDados {
    public static void main(String[] args){
        //Obtem o entityManager a partir do persistence Manager
        EntityManager entityManager = PersistenceManager.getEntityManager();

        try {
            //inicia uma transação
            entityManager.getTransaction().begin();

            //recupera o objeto Produto do banco de dados
            Produto produto = entityManager.find(Produto.class,1L);

            //verifica se o objeto existe
            if (produto != null) {
                //atualiza os dados do objeto
                produto.setNome("Notebook Avançado");
                produto.setPreco(2999.99);
            }

            //comita a transação de dados
            entityManager.getTransaction().commit();

            System.out.println("Atualização de dados concluida com sucesso!")

            catch (Exception e) {
                //trata exceções
                entityManager.getTransaction().rollback();
                e.printStackTrace();
            } finally {
                //fecha o entity manager
                entityManager.close();
                PersistenceManager.closeEntityManagerFactory();
            }
        }
    }
}



//--------- CONSULTA COM JPQL
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

public class ExemploConsultaJPQL {
    public static void main(String[] args){
        //obtem o entity manager a partir do persistencemanager
        EntityManager entityManager = PersistenceManager.getEntityManager();

        try {
            //cria a consulta JPQL
            String jpql = 'SELECT p FROM Produto p WHERE p.preco > :minPreco';

            //cria a consulta tipada
            TypedQuery<Produto> querry = entityManager.createQuerry(jpql, Produto.class);

            //define os paramtros da consulta
            query.SetParameter("minPreco", 1000.0);

            //Executa a consulta e obtem o resultado
            List<Produto> produtos = querry.getResultList();

            //exibe os resultados
            for (Produto produto : produtos) {
                System.out.println(Produto.getNome() + " - Preco :" + produto.getPreco())
            }
        } catch (Exception e){
            //trata exceções
            e.printStackTrace();  //exibe a sequencia de chamadas de metodos que levou ao erro da execução, servindo como um indicador de erro
        } finally {
            //fecha o entity manager
            entityManager.close();
            PersistenceManager.closeEntityManagerFactory();
        }
    }
}

