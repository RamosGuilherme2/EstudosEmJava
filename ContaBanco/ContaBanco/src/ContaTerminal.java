import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
//variaveis
        int numero;
        String numeroConta;
        String agencia;
        double saldo = 237.48;
        Scanner entrada = new Scanner(System.in);

//Loop validando se o numero da conta está no formato correto.
        while (true) {
            System.out.print("Por favor, digite o numero da conta (formato XXXX): ");
            numeroConta = entrada.nextLine();
            if (numeroConta.matches("\\d{4}")) {
                numero = Integer.parseInt(numeroConta);
                break;
            } else {
                System.out.println("Formato inválido. Digite exatamente quatro números.");
            }
        }
        //loop validando se o número de agência inserido está seguindo o formato solicitado.
        while (true) {
            System.out.print("Por favor, digite o numero da agência (formato XXX-X): ");
            agencia = entrada.nextLine();
            if (agencia.matches("\\d{3}-\\d")) {
                break;
            } else {
                System.out.println("Formato inválido. Tente novamente (ex 000-0).");
            }
        }

        System.out.print("Por favor, digite o seu nome: ");
        String nomeCliente = entrada.nextLine();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + " conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

        entrada.close();

    }
}
