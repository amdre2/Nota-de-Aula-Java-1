import java.text.NumberFormat;
import java.util.Locale;

public class ContaBancaria {

    private String numeroConta;
    private String titular;
    private double saldo;


    public ContaBancaria(String numeroConta, String titular) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = 0.0;
    }

    private String formatarMoeda(double valor) {
        return NumberFormat.getCurrencyInstance(new Locale("pt", "BR")).format(valor);
    }

    public void consultarSaldo() {
        System.out.println("----------------------------------");
        System.out.println("Titular: " + this.titular);
        System.out.println("Saldo atual: " + formatarMoeda(this.saldo));
        System.out.println("----------------------------------");
    }

    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.println("\n✅ Depósito de " + formatarMoeda(valor) + " realizado com sucesso!");
        } else {
            System.out.println("\n❌ Valor de depósito inválido. O valor deve ser maior que zero.");
        }
    }

    public void sacar(double valor) {
        if (valor <= 0) {
            System.out.println("\n❌ Valor de saque inválido. O valor deve ser maior que zero.");
        } else if (this.saldo >= valor) {
            this.saldo -= valor;
            System.out.println("\n✅ Saque de " + formatarMoeda(valor) + " realizado com sucesso!");
        } else {
            System.out.println("\n❌ Saldo insuficiente para realizar o saque de " + formatarMoeda(valor));
        }
    }

    public void transferir(ContaBancaria destino, double valor) {
        if (valor <= 0) {
            System.out.println("\n❌ Valor de transferência inválido. O valor deve ser maior que zero.");
        } else if (this.saldo >= valor) {
            // Retira o dinheiro desta conta
            this.saldo -= valor;
            // Deposita o dinheiro na conta de destino
            destino.saldo += valor;
            System.out.println("\n✅ Transferência de " + formatarMoeda(valor) + " para " + destino.getTitular() + " realizada com sucesso!");
        } else {
            System.out.println("\n❌ Saldo insuficiente para realizar a transferência de " + formatarMoeda(valor));
        }
    }

    public String getTitular() {
        return this.titular;
    }
}

