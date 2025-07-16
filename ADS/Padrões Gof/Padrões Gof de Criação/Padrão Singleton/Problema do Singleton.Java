// Garantir que existe apenas UMA instancia de uma classe provendo um ponto de acesso global a esssa instancia 
//atributo unicaInstancia é uma ref a essa unica instancia a ser compartilhada

//uso do padrao abstract factory para implementar os singleton 
public class XMLDecoderFactory extends DecoderFactory{
    private static DecoderFactory factory = null;
    private XMLDecoderFactory(){

    }

    public static DecoderFactory getFactory(){
        if (factory == null)
            factory = new XMLDecoderFactory();
        return factory
    }

    public abstract RegistrarClienteDecoder createRegistrarClienteDecoder() {
        return new RegistrarClienteXMLDecoder();
    }
    public abstract RegistrarContaDecoder createRegistrarContaDecoder() {
        return new RegistrarContaXMLDecoder();
    }
}

///Uso da operacao getinstance, regustri de fabrucas en yn hashmap codificado pela origem x y z

public abstract class DecoderFactory {
    private static HashMap<String, DecoderFactory> factoryMap;

    static {
        factoryMap = new HashMap<>();
        factoryMap.put("X", XMLDecoderFactory.getinstance());
        factoryMap.put("Y", XMLDecoderFactory.getinstance());
        factoryMap.put("Z", XMLDecoderFactory.getinstance());
    }

    public static DecoderFactory getinstance(String origem) {
        return factoryMap.get(origem);
    }

    public abstract RegistrarClienteDecoder createRegistrarClienteDecoder();
    public abstract RegistrarContaDecoder createRegistrarContaDecoder();
}