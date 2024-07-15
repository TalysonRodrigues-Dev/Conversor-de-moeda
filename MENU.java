import javax.swing.JOptionPane;
import java.io.IOException;

public class MENU {
    public static  void main (String[] args ){

        String[] opcoes = {"Converter Moeda", "Converter temperatura"};

        int escolha = JOptionPane.showOptionDialog(null,
                "escolha o tipo de conversão: ",
                "Conversor",
                JOptionPane.DEFAULT_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                null,
                opcoes,
                opcoes[0]);

        switch (escolha) {
            case 0:
                JOptionPane.showMessageDialog(null, "Conversão de moeda Selecionada.");
                ConversorDeMoeda.main(null);
                try {
                    BuscaMoeda.main(null);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                break;
            case 1:
                JOptionPane.showMessageDialog(null, "Conversão de Temperatura Selecionada.");
                break;

            default:
                JOptionPane.showMessageDialog(null,"Conversor fechado", "AVISO", JOptionPane.ERROR_MESSAGE);
                break;

        }


    }

}
