public class Medico {

    protected String nome;
    protected String crm;
    protected boolean trabalhaNoHospital;

    // Construtor da classe base
    public Medico(String nome, String crm, boolean trabalhaNoHospital) {
        this.nome = nome;
        this.crm = crm;
        this.trabalhaNoHospital = trabalhaNoHospital;
    }

    public void tratarPaciente() {
        System.out.println("O(A) médico(a) " + this.nome + " está realizando um atendimento geral.");
    }

    public String getNome() {
        return nome;
    }

    public String getCrm() {
        return crm;
    }
}

