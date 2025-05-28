/// Intenção : composicao de objetos em estrutura de arvore, traz uniformidade e estruturas hierarquicas, com folhas e nós
///tratamento uniforme de objetos simples e compostos,faz uso de operações recursivas
/// Problema resolvido : descomplicação de estruturas hierarquicas, interacao de objetos nao importando se sao simples ou compostos
/// simplificacao de implementação, codificação e manutençao de codigo, reduz as condicionais do codigo

//sem o padrao composite:

public class ServicoMensagem{
    public void apagar(Object elemento) {
        if (elemento instanceof Mensagem)
            apagarMensagem((Mensagem) elemento);
        else if (elemento instanceof Pasta)
            apagarPasta((Pasta) elemento);
    }

    private void apagarMensagem(Mensagem mensagem) {
        // lógica para apagar mensagem
    }

    private void apagarPasta(Pasta pasta) {
        ///lógica para apagar a pasta
        /// que replicaria a lógica condicional da operação apagar
        /// pois uma pasta pode conter mensagens e pastas
    }
}