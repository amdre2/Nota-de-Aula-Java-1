public class Pedido {
    private int numero;
    private String data;
    private double valorTotal;

    private Cliente cliente;
    private Vendedor vendedor;

    public Pedido(int numero, String data, double valorTotal, Cliente cliente, Vendedor vendedor) {
        this.numero = numero;
        this.data = data;
        this.valorTotal = valorTotal;
        this.cliente = cliente;
        this.vendedor = vendedor;
    }

    public void exibirDetalhes() {
        System.out.println("\n---------- DETALHES DO PEDIDO ----------");
        System.out.println("Número: " + this.numero);
        System.out.println("Data: " + this.data);
        System.out.printf("Valor Total: R$ %.2f\n", this.valorTotal);
        System.out.println("----------------------------------------");

        System.out.println("Cliente: " + this.cliente.getNome() + " (CPF: " + this.cliente.getCpf() + ")");

        System.out.println("Vendedor: " + this.vendedor.getNome() + " (Matrícula: " + this.vendedor.getMatricula() + ")");
        System.out.println("----------------------------------------");
    }
}