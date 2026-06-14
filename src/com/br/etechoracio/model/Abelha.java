package src.com.br.etechoracio.model;

public abstract class Abelha {
    private String nome;
    private int idade;

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public Abelha(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public abstract void executarAtividadePrincipal();
    public abstract double calcularConsumoDiario();

    public void exibirInfos() {
        System.out.println("Nome: " + nome + " / Idade: " + idade + " dias");
    }

}




