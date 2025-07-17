///Crie um sistema simples que exiba na tela a resolução do visor do dispositivo
import java.awt.Dimension;
import java.awt.Toolkit;

public class ResolucaoTela {
    public static void main(String[] args){
        Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
        int largura = tela.width;
        int altura = tela.height;
        System.out.println("A resolução da tela é: " + altura + " x " + largura);
    }
}