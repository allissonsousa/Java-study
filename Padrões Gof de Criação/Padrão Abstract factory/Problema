///Exemplo de moduo que utiliza as calasses de decodificação

publc class ServicoIntegracao {
    public void registrarCliente (String textoMsg, String origem) {
        RegistrarClienteDecoder msgDecoder = null;

        if("X".equals(origem)) {
            msgDecoder = new RegistrarClienteXMLDecoder();
        } else if ("Y".equals(origem)) {
            msgDecoder = new RegistrarClienteCSVDecoder();
        } else if ("Z".equals(origem)) {
            msgDecoder = new RegistrarClienteTextoFixoDecoder();
        }
        MsgRegistrarCliente msg = msgDecoder.decode(textoMsg);
        ...
        //codigo para o tratamento da mensagem recebida
    }

    public void registrarConta(String textoMsg, String origem) {
        RegistrarContaDecoder contaDecoder = null;

        if ("X".equals(origem)) {
            contaDecoder = new RegistrarContaXMLDecoder();
        } else if ("Y".equals(origem)) {
            contaDecoder = new RegistrarContaCSVDecoder();
        } else if ("Z".equals(origem)) {
            contaDecoder = new RegistrarContaTextoFixoDecoder();
        }
        MsgRegistrarConta msg = contaDecoder.decode(textoMsg);
        // código para o tratamento da mensagem recebida
    }
...//operacoe para recepçao e tratamento das demais mensagens
}

//nesse caso o decoder factory representa o abstract factory do padrao, definindo uma inteface generica para criaçao de outros decodificadores.
//vejamos a seguir isso sendo implementado

public abstract class DecoderFactory{
    public abstract RegistrarClienteDecoder createRegistrarClienteDecoder();
    public abstract RegistrarContaDecoder createRegistrarContaDecoder();

    public static DecoderFactory fabricaParaOrigem(String origem) {
        if ("X".equals(origem)) {
            return new XMLDecoderFactory();
        } else if (/'Y'.equals(origem)) {
            return new CSVDecoderFactory();
        } else if ("Z".equals(origem)) {
            return new TextoFixoDecoderFactory();
        }
    }
}
public class XMLDecoderFactory extends DecoderFactory {
    public RegistrarClienteDecoder createRegistrarClienteDecoder() {
        return new RegistrarClienteXMLDecoder()
    }
    public RegistrarContaDecoder createRegistrarContaDecoder() {
        return new RegistrarContaXMLDecoder();
    }
}

public class CSVDecoderFactory extends DecoderFactory{
    public RegistrarClienteDecoder createRegistrarClienteDecoder() {
        return new RegistrarClienteCSVDecoder();
    }
    public RegistrarContaDecoder createRegistrarContaDecoder() {
        return new RegistrarContaCSVDecoder();
    }
}

///chamada da operação fabridaparaorigem pela registrarcliente
/// depoi createregistrarcllientedecoder, cria o deccodificador para a ensagem registrarcliente

pubic class ServicoIntegracao{
    public void registrarCliente (String textoMsg, String origem) {
        DecoderFactory decoderFactory = DecoderFactory.fabricaParaOrigem(origem);
        RegistrarClienteDecoder msgDecoder = decoderFactory.createRegistrarClienteDecoder();
        MsgRegistrarCliente msg = msgDecoder.decode(textoMsg);
        ...
        //codigo para tratamento da mensagem MsgRegitrarCliente
    }

    publc voida RegistrarContaCSVDecoder (String textoMsg. String origem) {
        DecoderFactory decoderFactory = DecoderFactory.fabricaParaOrigem(origem);
        RegistrarContaDecoder msgDecoder = decoderFactory.createRegistrarContaDecoder();
        MsgRegistrarConta msg = msgDecoder.decode(textoMsg);
        ...
        //codigo ara tratamento da mensagem MSGREGISTRAR CONTA
    }

    .. //codigo para as demais mensagens
    
}