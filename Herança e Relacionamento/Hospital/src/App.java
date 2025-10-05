public class App {
    public static void main(String[] args) {

        System.out.println("--- Sistema de Demonstração Hospitalar ---");

        System.out.println("\n======= Criando Clínico Geral =======");
        ClinicoGeral drHouse = new ClinicoGeral("Doutor House", "CRM/RJ 12345", true, false);

        System.out.println("Nome do Médico: " + drHouse.getNome());
        drHouse.tratarPaciente();
        drHouse.receitar();

        System.out.println("\n======== Criando Cirurgião ========");

        Cirurgiao drFredd = new Cirurgiao("Fredd Mercury", "CRM/SP 54321", true);

        System.out.println("Nome do Médico: " + drFredd.getNome());
        drFredd.tratarPaciente();
        drFredd.fazerIncisao();
    }
}