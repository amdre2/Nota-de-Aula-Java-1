public class Cirurgiao extends Medico{

    public Cirurgiao(String nome, String crm, boolean trabalhaNoHospital) {
        super(nome, crm, trabalhaNoHospital);
    }

    @Override
    public void tratarPaciente() {
        System.out.println("O(A) cirurgião(ã) " + this.nome + " está tratando o paciente em uma sala de cirurgia.");
    }

    public void fazerIncisao() {
        System.out.println("O(A) cirurgião(ã) " + this.nome + " está realizando uma incisão.");
    }
}

