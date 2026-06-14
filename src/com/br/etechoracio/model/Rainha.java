package src.com.br.etechoracio.model;

public class Rainha extends Abelha {
    private int ovosDiarios;

    public Rainha(String nome, int idade, int ovosDiarios) {
        super(nome, idade);
        this.ovosDiarios = ovosDiarios;
    }

    @Override
    public void executarAtividadePrincipal() {
        System.out.println("Atividade: Reprodução da colônia (colocando ovos)");
    }

    @Override
    public double calcularConsumoDiario() {
        return 20.0 + (ovosDiarios * 0.01);
    }

    @Override
    public void exibirInfos() {
        super.exibirInfos();
        System.out.println(" | Tipo: Rainha | Ovos por Dia: " + ovosDiarios);
    }
}
