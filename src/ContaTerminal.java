import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite seu nome: ");
        String nomeCliente = scanner.nextLine(); // Mario Andrade

        System.out.print("Digite sua agencia: ");
        String agencia = scanner.nextLine(); // 067-8

        System.out.print("Digite o Número da sua conta: ");
        int numero = scanner.nextInt(); // 1021

        System.out.print("Digite o saldo: R$");
        double saldo = scanner.nextDouble(); // 237.48

        System.out.print("Olá ".concat(nomeCliente).concat(
                ", obrigado por criar uma conta em nosso banco, sua agência é ".concat(agencia).concat(", conta ")
                        + numero + " e seu saldo R$" + saldo + " já está disponível para saque."));

        scanner.close();
    }

}
