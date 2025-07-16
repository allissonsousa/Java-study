/// utilização do banco de dados derby ou java db, inclusao da biblioteca jdbc
/// adicionar biblioteca jdbc e exlipselink jLIb
/// criação do banco de dados com o Derby
/// execução dos comandos de criação de tabelas sql no bd

//Criação do banco de dados 

CREATE TABLE PRODUTO(
    COD_PRODUTO INTEGER NOT NULL PRIMARY KEY,
    Nome VARCHAR(50),
    QUANTIDADE INTEGER,
);

INSERT INTO PRODUTO VALUES (1,"morando", 200); //ID, NOME, QUANTIDADE
INSERT INTO PRODUTO VALUES (2,"banana",1000);
INSERT INTO PRODUTO VALUES (3,"manga",600);

SELECT * FROM PRODUTO;

//O resultado da execução ira criar uma tabela de dados visível no bd


// Unidade de persistencia para o framework jpa trabalhar
// new file > jpu doc > exlipselink> conectado jdc conectado com bd > create

//persistence.xml criação e alteração de tags e conexões
//criação automatica das entidades apos as relaçoes entre as tabelas


//CRIAÇÃO AUTOMATICA DA ENTIDADE 
@Entity
@Table(name = 'Produto')
@XmlRootElement
@NamedQueries({
    @NamedQuerie (name = 'Produto.findAll', querry = 'SELECT p FROM Produto p'),
    @NamedQuerie (name = 'Produto.findByCodigo', querry = 'SELECT p FROM Produto p WHERE p.codigo = :codigo'),
    @NamedQuerie (name = 'Produto.findByName', query = 'SELECT p FROM Produto p WHERE p.nome = :nome'),
    @NamedQuerie (name = 'Produto.findByQuantidade', querry = 'SELECT p FROM Produto p WHERE p.quantidade = :quantidade')
})
public class Produto implements Serializable {

    private static final long serialVersionUID = 1L;
    @ID
    @Basic(optional = false)
    @Column(name = 'CODIGO')
    private Integer codigo;

    @Column(name = 'NOME')
    private String nome;

    @Column(name = 'QUANTIDADE')
    private Integer quantidade;

    @JoinColumn(name = 'COD_EMPRESA', referencedColumnName = 'CODIGO')
    @ManyToOnde(optional = false)
    private Empresa codEmpresa;

    public Produto(){
    }

    public Produto(Integer codigo) {
        this.código = codigo;
    }

    //setter geters 
    //regras de negocios
}