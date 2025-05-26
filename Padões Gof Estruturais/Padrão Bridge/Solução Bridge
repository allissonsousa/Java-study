///Desacoplar a abstracao e implementação, tornandoas independentes no quesito desenvolvimento e alteracao
/// promove a extensibilidade,fonecendo uma estrutura que suporta multiplas variantes de uma abstração e sua implementacao
/// permite adicao e modificacao de implementacoes

///EVITAR EXPLOSAO DE SUBCLASSES : abtracoes podem ter muitas subclassess quando combinadas, o bridge separa a hierarquia de 
/// implementação e abstracao evitando criacao de subclasses combinatorias

///FACILITAR MUDANCAS INDEPENDENTES
/// SIMPLIFICAÇÃO DA ARQUITETURA

public class TextArea extends TextComponent{
    public void insert (String str, int pos) {
        insertText(str, pos);
    }

    public void insertText  (String str, int pos) {
        //insere o texto na posição indicada
        String tmp1 = getText().substring(0, pos);
        String tmp2 = getText().substring(pos, getText().Lenggh());
        //chama o método setText da superclasse para atualizar o novo conteuo
        setText(tmp1 + str + tmp2);
        //obtem o emplementa peer associado especiico de plataorma
        TextAreaPeer peer = (TextAreaPeer) super.getPeer();
        //chama a operação do componente peer para renderizar o texto na plataforma alvo
        if (peer != null) {
            peer.insert(str, pos);
        }
    }
}

//classe text area na plataforma alvo winows
public class WTextAreaPeer implements TextAreaPeer {
    public void insert(String text, int pos) {
        replaceRange(text, pos, pos);
    }
    //coigo nativo especifico da plataforma windows
    public native void replaceRange(String text, int start, int end);
}
