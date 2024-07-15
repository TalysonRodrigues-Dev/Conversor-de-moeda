import javax.swing.*;
import javax.swing.text.html.ListView;
import java.awt.*;



public class ConversorDeMoeda {

    private String c;
    public ConversorDeMoeda(String c) {
        this.c = c;
    }

    public ConversorDeMoeda() {
        this.c = c;
    }

    public static void main(String[] arg) {

        Object[] possibilidadesDeConversao = new Object[]{"De Reais a Dólares", "De Reais a Euros", "De Reais a Libras",
                "De Reais a Yenes", "De Reais a Won Coreano", "De Dólares a Reais", "De Euros a Reais", "De Libras a Reais",
                "De Yenes a Reias", "De Won Coreano a Reais"};
        String c = (String) JOptionPane.showInputDialog(null, "Escolha a Moeda no qual deseja converter seu dinheiro",
                "Convertor", JOptionPane.QUESTION_MESSAGE, null, possibilidadesDeConversao, "De Reais a Dólares");
        if (c != null) {
            System.out.println("Você escolheu: " + c);
        } else {
            System.out.println("Nenhuma opção selecionada.");
        }
        String v;
        double valorConvertido = 0.0;
        boolean isValid;

        do {
            v = JOptionPane.showInputDialog("Insira um valor que deseja converter");
            if (v == null) {
                JOptionPane.showMessageDialog(null, "Operação CANCELADA.");
                return;
            }
            try {
                Double.parseDouble(v);
                isValid = true;

            } catch (NumberFormatException e) {
                isValid = false;
                JOptionPane.showMessageDialog(null, " Por favor, insira um valor númerico válido.");
            }
        } while (!isValid);

        //  logica da converção aqui

        String r;

        JOptionPane.showMessageDialog(null, "O resultado da conversão é: R$ " + valorConvertido);
        int resultado = JOptionPane.showConfirmDialog(null, "Você deseja continuar as operações? ");
            if (resultado == JOptionPane.YES_OPTION) {
                do {
                    v = JOptionPane.showInputDialog("Insira um valor que deseja converter");
                    if (v == null) {
                        JOptionPane.showMessageDialog(null, "Operação CANCELADA.");
                        return;
                    }
                    try {
                        Double.parseDouble(v);
                        isValid = true;

                    } catch (NumberFormatException e) {
                        isValid = false;
                        JOptionPane.showMessageDialog(null, " Por favor, insira um valor númerico válido.");
                    }
                } while (!isValid);


                JOptionPane.showMessageDialog(null, "O resultado da conversão é: R$ " + valorConvertido);






            } else if (resultado == JOptionPane.NO_OPTION) {
                return;




            } else if (resultado == JOptionPane.CANCEL_OPTION) {
                JOptionPane.showMessageDialog(null,"OPERAÇÃO CANCELADA");
                return;


            }


    }
}

