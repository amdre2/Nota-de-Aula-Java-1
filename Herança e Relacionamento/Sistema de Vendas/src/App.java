public class App {
    public static void main(String[] args) {

        System.out.println("--- Simulação de Sistema de Vendas ---");

        System.out.println("\nCadastrando cliente e vendedor...");
        Cliente cliente1 = new Cliente("Carlos Souza", "111.222.333-44");
        Vendedor vendedor1 = new Vendedor("Beatriz Lima", "MAT-2025-01");
        System.out.println("Cliente e vendedor cadastrados!");

        System.out.println("\nRegistrando pedidos...");

        Pedido pedido1 = new Pedido(1001, "04/10/2025", 250.50, cliente1, vendedor1);
        Pedido pedido2 = new Pedido(1002, "04/10/2025", 99.99, cliente1, vendedor1);
        System.out.println("Pedidos registrados com sucesso!");

        System.out.println("\n--- Exibindo Pedidos Registrados ---");
        pedido1.exibirDetalhes();
        pedido2.exibirDetalhes();
    }
}