
//------- ENTITY MANAGER CONSULTA JPQL

/// >>>DEFINIÇÃO DO ENTITY MANAGER FACTORY
/// >>>OBTENÇÃO DE UM OBJETO TIPO QUERRY
/// >>>INSTYÇÃO JPQ É TRANSFORMADA EM INSTRUÇÃO SQL

public class Principal {
    public static void main(String[] args) {
        //emf recebe o managerfactory
        EntityManagerFactory emf = Persistence.createEntityManagerFactory('ExemeploSimplesJPAPU'); 

        //emf cria um manager que será a variavel em
        EntityManager em = emf.createEntityManager();

        //o manager em cria um objeto tipo querry que ia pro banco de dados
        Querry querry = em.creatNamedQuerry("Produto.findAll");

        //chama a lista de produtos que recebera o metodo querry e retornara o resultado da consulta
        List<Produto> lista = querry.getResultList();

        //para cada elemento da lista sera criado um print na tela
        lista.forEach((e) -> {
            System.out.println(e.getNome());
        });

        //fecha o managerentity
        em.close()
    }
}


//----- INCLUSÃO DE DADOS


public static void incluir(Produto p){  //criação da funcão incluir 

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("ExemploSimplesJPAPU";
    EntityManager em = emf.createEntityManager();
    try {       //Para previnir erros é usado o Transaction, oq é obrigatório no JPA
        em.getTransaction().begin(); //bloco de codigo protegido iniciado com begin
        em.persist(p); //inclusao do produto no banco de dados atravez do persist
        em.getTransaction().commit();
    } catch(Exception e){
        em.getTransaction().rollback();  //em caso de erro alterações sao desfeitas
    } finally {
        em.close();
    })
}

//------- ALTERAÇÃO DE DADOS

public static void alterar(Produto p){
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("ExemploSimplesJPAPU");
    EntityManager em = emf.createEntityManager();
    try{
        em.getTransaction().begin();
        em.merge(p);
        em.getTransaction().commit();
    } catch(Exception e) {
        em.getTransaction().rollback();
    } finally {
        em.close();
    }
}

//--------- EXCLUSÃO DE DADOS

//Para fazer a remoção deve-se encontrar o registro atravez do metodo find, e exclui-lo por meio do remove

public static void excluir(Integer codigo){
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("ExemploSimplesJPAPU");
    EntityManager em = emf.createEntityManager();
    try {
        em.getTransaction().begin();
        em.remove(em.find(Produto.class, codigo));
        em.getTransaction().commit();
    } catch(Exception e){
        em.getTransaction().rollback();
    } finally {
        em.close();
    }
}


//----- CONCLUSÃO

/// FIND >> SELECT
/// PERSIST >> INSERT
/// MERGE >> UPDATE
/// REMOVE >> DELETE