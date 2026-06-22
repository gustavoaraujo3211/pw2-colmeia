package src.com.br.etechoracio.model;

public class Operaria extends Abelha implements ColetarRecurso, DefenderColmeia {
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

    @Override
    public void coletarRecursos() {
        System.out.println("Coletando néctar nas flores.");
    }

    @Override
    public void defenderColmeia() {
        System.out.println("Defendendo a entrada da colmeia.");
    }
}
