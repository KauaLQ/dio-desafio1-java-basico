import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner entradaDados = new Scanner(System.in);
        System.out.println("Digite o número da sue nome: ");
        String nomeCliente = entradaDados.nextLine();
        System.out.println(" ");

        Scanner entradaDados2 = new Scanner(System.in);
        int numeroConta;
        System.out.println("Digite o número da sua conta: ");
        numeroConta = entradaDados2.nextInt();
        System.out.println(" ");

        Scanner entradaDados3 = new Scanner(System.in);
        System.out.println("Digite o número da sua agência: ");
        String numeroAgencia = entradaDados3.nextLine();
        System.out.println(" ");

        Scanner entradaDados4 = new Scanner(System.in);
        System.out.println("Digite o saldo da sua conta: ");
        double saldoConta = entradaDados4.nextDouble();
        System.out.println(" ");

        System.out.println("Olá, " + nomeCliente + ", seja bem-vindo. Sua conta foi criada com sucesso. Sua agência é " + numeroAgencia + ", sua conta é " + numeroConta + ", e seu saldo " + saldoConta + " já está disponível para saque.");

        entradaDados.close();
        entradaDados2.close();
        entradaDados3.close();
        entradaDados4.close();
    }
}