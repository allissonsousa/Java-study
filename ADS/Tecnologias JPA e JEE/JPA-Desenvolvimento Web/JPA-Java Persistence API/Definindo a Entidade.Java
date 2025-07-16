@Entity
@Table(name = "PRODUTO")
@NamedQueries({@NamedQuery(name="Produto.findAll",querry="SELECT p FROM Produto p")})  //Criação de consultas por meio de uma linguagem chamada JPQL(Java Persistence Querry Language)

public class Produto implements Seriazable {
    private static final long serialVersionUID = 1L;  //referente a versão da classe, usado nos processos de migração da base de dados
    @Id
    @Basic(optional = false) //obrigatoriedade do campo/modo para carregar os dados
    @Column(name = "COD_PRODUTO")
    private Integer codigo;
    @Column(name = "QUANTIDADE")
    private Integer quantidade;

    public Produto(){  //construtor vazio obrigatorio, baseado na chave primaria 
    }
    public Produto (Integer codigo){
        this.codigo = codigo;
    }
  //os getters e setters das propriedades foram omitidos
    @Override
    public int hashCode(){  //metodo utilitario baseado no atributo codigo que identifica a instancia
        int hash = 0;
        hash += (codigo != null ? codigo.hashCode() : 0);
        return hash;
    }
    @Override
    public boolean equals(Object object){  //metodo utilitario baseado no atributo codigo que identifica a instancia
        if (object == null || !(object instanceof Produto)) {
            return false;
        }
        Produto other = (Produto) object;
        return this.codigo != null && 
            this.codigo.equals(other.codigo);
    }
    @Override
    public String toString(){   //controle sobre a entidade como texto
        return "model.Produto [codigo =" + codigo + " ]";
    }

}

