import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner teclado = new Scanner(System.in);

        System.out.println("Bem-vindo ao Banco Digital!");
        System.out.print("Por favor, digite o nome do titular da conta principal: ");
        String nomeTitular = teclado.nextLine();
        ContaBancaria minhaConta = new ContaBancaria("12345-6", nomeTitular);
        ContaBancaria outraConta = new ContaBancaria("98765-4", "Cliente Destino");

        int opcao = 0;

        while (opcao != 5) {
            System.out.println("\n======= MENU DE OPÇÕES =======");
            System.out.println("Titular: " + minhaConta.getTitular());
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Depositar");
            System.out.println("3 - Sacar");
            System.out.println("4 - Transferir");
            System.out.println("5 - Sair");
            System.out.println("============================");
            System.out.print("Escolha uma opção: ");
            opcao = teclado.nextInt();

            switch (opcao) {
                case 1:
                    minhaConta.consultarSaldo();
                    break;
                case 2:
                    System.out.print("Digite o valor para depósito: ");
                    double valorDeposito = teclado.nextDouble();
                    minhaConta.depositar(valorDeposito);
                    break;
                case 3:
                    System.out.print("Digite o valor para saque: ");
                    double valorSaque = teclado.nextDouble();
                    minhaConta.sacar(valorSaque);
                    break;
                case 4:
                    System.out.println("Você irá transferir para " + outraConta.getTitular());
                    System.out.print("Digite o valor para transferência: ");
                    double valorTransferencia = teclado.nextDouble();
                    minhaConta.transferir(outraConta, valorTransferencia);
                    break;
                case 5:
                    System.out.println("\nObrigado por usar nossos serviços. Encerrando o sistema...");
                    break;
                default:
                    System.out.println("\n❌ Opção inválida. Por favor, tente novamente.");
                    break;
            }
        }

        teclado.close();


    }
}
