//verboso e problematico é o uso de xml na execução. 
//O JPA permitiu padronizar a arquitetura dos frameworks de persistencias e concentrou as configurações no arquivo 
//persistence.xml
//É uma api que define interface configuravel por meio de anotações que deve ser seguida pelos frameworks perssistencia

//JPA é um framework de persistencia de dados
//Simplifica a relação com banco de dados relacionais
//Padroniza desenvolvimento
//Abstrai detalhes especificos do BD, permitindo a portabilidade do código
//Lebibilidade e manutenção

//-----
//COMO USAR?
//Criação de classes entidades q representam as tabelas do banco de dados
//Configuração do provedor de persistencia (Eclipselink) e configurar propriedades de conexão
//Executar operações de persistecia (CRUD)

//------
//DEFINIÇÃO DE ENTIDADE?
//Uma entidade JPA é uma classe que representa uma tabela no BD
//Uso do @Entity pra marcar uma classe como entidade
//Propriedades da entidade sao mapeadas para colunas do banco de dados usando anotações @Column e @Id


//--------DEFININDO A ENTIDADE

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Column;

@Entity
public class Produto {
    @Id 
    private Long id; //chave primaria 

    @Column(name = "nome")  //nome do campo
    private String nome;    //atributo a ser nameado para coluna nome

    @Column(name = "preco")
    private double preco;

    //construtores, getters e setters

    
    public Produdo() {      //construtor padrao - vazio
    }

    //Construtor com parâmetros
    public Produto(Long id, String nome, double preco){
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }
}

//---------CONFIGURANDO O PROVEDOR DE PERSISTENCIA


//armazena as configurações de comunicação com o banco de dados
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class PersistenceManager {
    private static final String PERSISTENCE_UNIT_NAME = "nomeUnidadePersistencia";  //unidade de persistencia
    private static EntityManagerFactory emf;  //fabrica de entitymanager

    public static EntityManager getEntityManager() {  //metodo pra usar a fabrica
        if (emf == null) {
            emf = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        }
        return emf.createEntityManager();  //uso da fabrica pra criação de um entitymanager
    } 

    public static void closeEntityManagerFactory() {
        if(emf != null && emf.isOpen()) {
            emf.close();
        }
    }
}

//------------OPERAÇÃO DE PERSISTENCIA

//apos configurar a unidade de persistencia e criar a entidade
import javax.persistence.EntityManager;

public class ExemploPersistencia{
    public static void main (String[] args) {
        EntityManager entityManager = PersistenceManager.getEntityManager();  //criação do entitymanager, get pega o gerenciador de entidade

        try {
            entityManager.getTransaction().begin();  //tudo q eu fizer dentro da transação, ou faz tudo corretamente ou faz nada, 
                                                    //se deu algo de errado desfaz oq foi feito
            Produto produto = new Produto(1l,'Notebook',1999.99); //id = 1L, nome = notebook, preco = 1999.99
            entityManager.persist(produto);  //o gerenciador persiste o produto ou seja inclui ele no banco de dados, cria uma linha na tabela produto
            entityManager.getTransaction().commit(); //pega a transação do gerenciador de entidade e faz um commit
        } catch (Exception e) {  //caso de um erro
            //trata exceções
            entityManager.getTransaction().rollback();  //se der  um erro volta atraz
            e.printStackTrace();
        } finally {
            //fecha o EntityManager
            entityManager.close();
            PersistenceManager.closeEntityManagerFactory(); //fecha a fabrica de entity manager
        }
    }
}

