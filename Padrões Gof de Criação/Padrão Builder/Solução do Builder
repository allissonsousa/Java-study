///estrutura da solução builder
///a classe ExportarNota recebe um builder em seu construtor

public class ExportadorNota{
    private NotaBuilder builder; //atributo "builder" que armazenara um objeto "NotaBuilder"
    public ExportadorNotaNegociacao(NotaBuider builder) {
        this.builder = builder; //armazena o obj "NotaBuilder" passado antes, para o atributo builder dentro dessa classe
    }
    public void exportarNota(NotaNegociacao nota) { //void = o metodo n retorna valor, apena executa uma açao, grava um dado, ou exibe algo na tela
        builder.gerarCabecalho(nota);
        // Gera o cabeçalho da nota (ex: cliente, data, número)
        builder.gerarItensNota(nota);
         // Gera os itens da nota (ex: produtos, serviços)
        builder.gerarSumario(nota);
        // Gera o sumário da nota (ex: total, impostos)
    }

}
///A classe ComandoExportarNotaPDF é um exemplo de cliente do exportador de nota. O método executar instancia um 
/// builder concreto (NotaPDFBuilder), cria um diretor (ExportadorNota), passando o builder a ser utilizado, e chama 
/// a operação de construção do produto desejado (exportarNota). O último passo é solicitar ao builder concreto o objeto
///  NotaPDF construído.

public class ComandoExportarNotaPDF{
    public NotaPDF executar(NotaNegociacao nota) {
        NotaPDFBuilder builder = new NotaPDFBuilder();
        ExportadorNota diretor = new ExportadorNota(builder);
        diretor.exportarNota(nota);
        retun builder.obterNotaPDF()
    }
}
