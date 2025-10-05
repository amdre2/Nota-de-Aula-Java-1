import java.text.NumberFormat;
import java.util.Locale;

public class Funcionario {

    String matricula;
    String nome;
    double salarioBruto;

    public Funcionario(String matricula, String nome, double salarioBruto) {
        this.matricula = matricula;
        this.nome = nome;
        this.salarioBruto = salarioBruto;
    }

    public double calcularInss() {
        final double TAXA_INSS = 0.15; 
        return this.salarioBruto * TAXA_INSS;
    }

    public double calcularSalarioLiquido() {
        return this.salarioBruto - this.calcularInss();
    }

    public void exibirContracheque() {
        NumberFormat formatadorMoeda = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));

        System.out.println("\n========================================");
        System.out.println("        CONTRACHEQUE MENSAL");
        System.out.println("========================================");
        System.out.println("Matrícula: \t" + this.matricula);
        System.out.println("Nome: \t\t" + this.nome);
        System.out.println("----------------------------------------");
        System.out.println("Salário Bruto: \t" + formatadorMoeda.format(this.salarioBruto));
        System.out.println("Desconto INSS (15%): \t" + formatadorMoeda.format(this.calcularInss()));
        System.out.println("----------------------------------------");
        System.out.println("Salário Líquido: \t" + formatadorMoeda.format(this.calcularSalarioLiquido()));
        System.out.println("========================================\n");
    }

}
