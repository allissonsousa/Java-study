///
public class RegistrarClienteXMLDecoder {
    public MsgRegistrarCliente decode(String textoMsg, String origem) {
        MsgRegistrarCliente msg;
        if ("X".equals(origem)) {
            msg = new MsgRegistrarCliente_X();
        else if ("Y".equals(origem)) {
            msg = new MsgRegistrarCliente_Y();
        else if ("Z".equals(origem)) {
            msg = new MsgRegistrarCliente_Z();
        }
        // aqui viria o codigo de decodificação e preenchimento dos atributos do objeto MsgRegitrarCliente
        return msg;
        }
    }
}