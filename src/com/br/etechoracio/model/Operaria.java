package src.com.br.etechoracio.model;

public class Operaria extends Abelha{
    private int tempovoo;

    public Operaria(String nome, int idade, int duracaoVoo) {
        super(nome, idade);
        this.tempovoo = duracaoVoo;
    }

    @Override
    public void executarAtividadePrincipal() {
        System.out.println("Coletando néctar e pólen / cuidando da colmeia");
    }

    @Override
    public double calcularConsumoDiario() {
        return 10.0 + (tempovoo * 2.0);
    }

    @Override
    public void exibirInfos() {
        super.exibirInfos();
        System.out.println(" | Tipo: Operária / tempo de voo: " + tempovoo);
    }
}
