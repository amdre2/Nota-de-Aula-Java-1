public class ClinicoGeral extends Medico {
    private boolean atendeEmCasa;

    public ClinicoGeral(String nome, String crm, boolean trabalhaNoHospital, boolean atendeEmCasa) {

        super(nome, crm, trabalhaNoHospital);
        this.atendeEmCasa = atendeEmCasa;
    }

    public void receitar() {
        System.out.println("O(A) clínico(a) geral " + this.nome + " está prescrevendo uma receita.");
    }
}

