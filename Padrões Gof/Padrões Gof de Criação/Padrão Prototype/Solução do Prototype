//Uso de hash map para criar e registrar as as instancias prototipo de cada subclasse de MsgRegistrar Cliente
import java.util.HashMap

public RegistrarClienteDecoder createRegistrarClienteDecoder(){  //define o metodo publico:create...  retorn obj tipo registclie..
    HashMap<String, MsgRegistrarCliente> prototypes new HashMap<>(); //mapa(dicionario) chamado proto.. 
    prototypes.put("X", new MsgRegistrarCliente_X());
    prototypes.put("Y", new MsgRegistrarCliente_Y());  //add entrada ao mapa chaves x y e z> valor:instancia de msgregclie-xyz
    prototypes.put("Z", new MsgRegistrarCliente_Z());

    return new RegistrarClienteXMLDecoder(prototypes); //usa o parametro proto q é o hashmap, para criar e retornar uma nova instancia RegCxml
}

///Agora vamos criar um codigo que consiga instancias novas sublasses demsgregitrarcliente sem precisar muda-lo
/// por fio o msgregcli desempenha a funçao do concreteprototype

public class RegistrarClienteXMLDecoder {
    private HashMap<String, MsgRegistrarCliente> prototypes;

    public RegistrarClienteXMLDecoder(HashMap<String, MsgRegistrarCliente>prototypes) {
        this.prototypes = prototypes;
    }

    public MsgRegistrarCliente decode(String textoMsg, String origem) { //define o decode q recebe o texto do xml, origem> string dexyz
        MsgRegistrarCliente prototype = prototypes.get(origem);

        MsgRegistrarCliente msg = (MsgRegistrarCliente) prototype.clone(); //cria nova instancia baseada no modelo

        //... aqui viria o codigo de decoificação e preenchimento dos atributos
        // do objeto msregiscliente
        
        return msg;
    }
}