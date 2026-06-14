package src.com.br.etechoracio.model;

public class Zangao extends Abelha{
    private int voosDeAcasalamento;

    public Zangao(String nome, int idade, int voosDeAcasalamento) {
        super(nome, idade);
        this.voosDeAcasalamento = voosDeAcasalamento;
    }

    @Override
    public void executarAtividadePrincipal() {
        System.out.println("Participando do processo reprodutivo.");
    }

    @Override
    public double calcularConsumoDiario() {
        return 15.0 + (voosDeAcasalamento * 3.0);
    }

    @Override
    public void exibirInfos() {
        super.exibirInfos();
        System.out.println("Tipo: Zangão / Voos de Acasalamento: " + voosDeAcasalamento);
    }
}
