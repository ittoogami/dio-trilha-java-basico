import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {

        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        Scanner s = new Scanner(System.in);

        System.out.print("Favor digitar o número da Conta: ");
        numero = s.nextInt();
        System.out.print("Favor digitar o número da Agência: ");
        agencia = s.next();
        System.out.print("Digite o nome do Cliente: ");
        nomeCliente = s.next();
        System.out.print("Digite o saldo da conta: ");
        saldo = s.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");

    }

}
