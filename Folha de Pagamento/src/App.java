import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);
        Scanner teclado = new Scanner(System.in);
        System.out.println("--- CÁLCULO DE FOLHA DE PAGAMENTO ---");

        System.out.print("Digite a matrícula do funcionário: ");
        String matricula = teclado.nextLine();

        System.out.print("Digite o nome completo do funcionário: ");
        String nome = teclado.nextLine();

        System.out.print("Digite o salário bruto do funcionário: ");
        double salarioBruto = teclado.nextDouble();

        Funcionario funcionario = new Funcionario(matricula, nome, salarioBruto);

        funcionario.exibirContracheque();

        teclado.close();

    }
}
