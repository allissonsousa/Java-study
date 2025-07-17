///Crie um sistema simples que exiba na tela o idioma usado no sistema da maquina
import java.util.*;

public class EncontraLingua {
  
  public static void main(String[] args) {
    Locale loc = Locale.getDefault();
    System.out.println(loc.getDisplayLanguage());
    System.out.println(loc.getLanguage());
  };
};
