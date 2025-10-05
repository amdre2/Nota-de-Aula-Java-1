import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        Filme meuFilme = null; // O filme começa como nulo, precisa ser cadastrado
        int opcao = 0;

        while (opcao != 5) {
            System.out.println("\n======= CATÁLOGO DE STREAMING =======");
            System.out.println("1 - Cadastrar um novo título");
            System.out.println("2 - Exibir detalhes do título");
            System.out.println("3 - Avaliar o título");
            System.out.println("4 - Exibir média de avaliações");
            System.out.println("5 - Sair");
            System.out.println("=====================================");
            System.out.print("Escolha uma opção: ");

            // Validação para garantir que a entrada seja um número
            while (!teclado.hasNextInt()) {
                System.out.println("\n❌ Entrada inválida! Por favor, digite um número.");
                teclado.next(); // Descarta a entrada inválida
                System.out.print("Escolha uma opção: ");
            }
            opcao = teclado.nextInt();
            teclado.nextLine(); // Limpa o buffer do scanner

            switch (opcao) {
                case 1:
                    System.out.println("\n--- Cadastro de Novo Título ---");
                    System.out.print("Digite o nome: ");
                    String nome = teclado.nextLine();
                    System.out.print("Digite o gênero: ");
                    String genero = teclado.nextLine();
                    System.out.print("Digite o ano de lançamento: ");
                    int ano = teclado.nextInt();
                    System.out.print("Digite a duração em minutos: ");
                    int duracao = teclado.nextInt();
                    teclado.nextLine(); // Limpa o buffer do scanner

                    meuFilme = new Filme(nome, genero, ano, duracao);
                    System.out.println("\n✅ Título '" + nome + "' cadastrado com sucesso!");
                    break;

                case 2:
                    if (meuFilme != null) {
                        meuFilme.exibirDetalhes();
                    } else {
                        System.out.println("\n❌ Nenhum título cadastrado. Use a opção 1 primeiro.");
                    }
                    break;

                case 3:
                    if (meuFilme != null) {
                        System.out.print("Digite sua nota para o título (0 a 10): ");
                        int nota = teclado.nextInt();
                        meuFilme.avaliar(nota);
                    } else {
                        System.out.println("\n❌ Nenhum título cadastrado. Use a opção 1 primeiro.");
                    }
                    break;

                case 4:
                    if (meuFilme != null) {
                        double media = meuFilme.calcularMediaAvaliacoes();
                        System.out.printf("\nℹ️ A média de avaliações do título é: %.1f\n", media);
                    } else {
                        System.out.println("\n❌ Nenhum título cadastrado. Use a opção 1 primeiro.");
                    }
                    break;

                case 5:
                    System.out.println("\nEncerrando o programa. Até a próxima!");
                    break;

                default:
                    System.out.println("\n❌ Opção inválida. Por favor, escolha uma opção de 1 a 5.");
                    break;
            }
        }

        teclado.close();
    }
}


