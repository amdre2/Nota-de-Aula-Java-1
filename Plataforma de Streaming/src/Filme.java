public class Filme {

    private String nome;
    private String genero;
    private int ano;
    private int duracao; // em minutos
    private double somaNotas;
    private int qtdAvaliacoes;

    public Filme(String nome, String genero, int ano, int duracao) {
        this.nome = nome;
        this.genero = genero;
        this.ano = ano;
        this.duracao = duracao;
        this.somaNotas = 0.0; // Inicializa com zero ao criar o filme
        this.qtdAvaliacoes = 0; // Inicializa com zero ao criar o filme
    }

    public void exibirDetalhes() {
        System.out.println("\n---------- DETALHES DO TÍTULO ----------");
        System.out.println("Nome: \t\t" + this.nome);
        System.out.println("Gênero: \t" + this.genero);
        System.out.println("Ano de Lançamento: " + this.ano);
        System.out.println("Duração: \t" + this.duracao + " minutos");

        // Exibe a média de forma formatada
        System.out.printf("Média de Avaliações: %.1f (%d avaliações)\n", this.calcularMediaAvaliacoes(), this.qtdAvaliacoes);
        System.out.println("--------------------------------------");
    }

    public void avaliar(int nota) {
        if (nota >= 0 && nota <= 10) {
            this.somaNotas += nota;
            this.qtdAvaliacoes++;
            System.out.println("\n✅ Avaliação (" + nota + ") registrada com sucesso para '" + this.nome + "'!");
        } else {
            System.out.println("\n❌ Nota inválida! Por favor, insira um valor entre 0 e 10.");
        }
    }

    public double calcularMediaAvaliacoes() {
        if (this.qtdAvaliacoes == 0) {
            return 0.0;
        }
        return this.somaNotas / this.qtdAvaliacoes;
    }
}

