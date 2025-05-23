//visa separar a construção d um objeto complexo de sua representação
//supondo que precisamos da representação da nota de negociacao seja definido por tres passos fundamentais,
//1 - construir um cabeçalho da nota
///2 = listar as operações da nota
/// 3- gerar os totais e taxas do dia

public class ExportadorNota {
    public byte[] ExportadorNota(NotaNegociacao nota, String formato) {
        if ("XML".equals(formato))
            return gerarNotaXML(nota);
        else if ("PDF".equals(formato))
            return gerarNotaPDF(nota);
        else if ("XLS".equals(formato))
            return gerarNotaXLS(nota);
    }
    private byte[] gerarNotaXML(NotaNegociacao nota) {
        //contruir cabeçalho em XML
        //listar os itens da nota em XML
        //gerar sumário em XML
        //retornar conteudo da nota no formato xml
    }

    private byte[] gerarNotaPDF(NotaNegociacao nota) {
        //contruir cabeçalho em PDF
        //listar os itens da nota em PDF
        //gerar sumário em PDF
        //retornar conteudo da nota no formato PDF
    }

    private byte[] gerarNotaXLS(NotaNegociacao nota) {
        //contruir cabeçalho em XLS
        //listar os itens da nota em XLS
        //gerar sumário em XLS
        //retornar conteudo da nota no formato XLS
    }

}