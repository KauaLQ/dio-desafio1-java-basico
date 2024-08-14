import javax.swing.*;
public class ContaInterfaceBasica {
    public static void main(String[] args) {
        ImageIcon icon = new ImageIcon("C:\\BootCampJava\\JavaBasico\\dio-desafio1-java-basico\\ContaBanco\\src\\dio_makethechange_logo.jpg");
        String nomeCliente = (String) JOptionPane.showInputDialog(
                null,
                "Boas vindas ao BancoDIO!" + "\n" + "Digite seu nome de usuário: ",
                "BancoDIO",
                JOptionPane.QUESTION_MESSAGE,
                icon,
                null,
                "");

        int numeroConta = Integer.parseInt((String) JOptionPane.showInputDialog(
                null,
                "Digite o número da conta...",
                "BancoDIO",
                JOptionPane.QUESTION_MESSAGE,
                icon,
                null,
                ""));
        /*JOptionPane.showInputDialog só captura variáveis como String.
        Por isso é preciso coonverter o número da conta para um valor int com a função Integer.parseInt*/

        String numeroAgencia = (String) JOptionPane.showInputDialog(
                null,
                "Digite o número da sua agência...",
                "BancoDIO",
                JOptionPane.QUESTION_MESSAGE,
                icon,
                null,
                "");

        double saldoConta = Double.parseDouble((String) JOptionPane.showInputDialog(
                null,
                "Digite o saldo da sua conta...",
                "BancoDIO",
                JOptionPane.QUESTION_MESSAGE,
                icon,
                null,
                ""));

        JOptionPane.showMessageDialog(
                null,
                "Olá, " + nomeCliente + ", seja bem-vindo! Sua conta foi criada com sucesso." + "\n" +
                        "Sua agência é " + numeroAgencia + "\n" +
                        "Sua conta é " + numeroConta + "\n" +
                        "Seu saldo " + saldoConta + " já está disponível para saque.",
                "BancoDIO",
                JOptionPane.PLAIN_MESSAGE,
                icon);
    }
}
