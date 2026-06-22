import src.com.br.etechoracio.model.Operaria;
import src.com.br.etechoracio.model.Zangao;
import src.com.br.etechoracio.model.Rainha;

public class TestaColmeia {

    public static void main(String[] args) {

        Operaria operaria1 = new Operaria("operaria1", 20, 5);
        Zangao Zangao1 = new Zangao("Zangao1", 18, 2);
        Rainha rainha1 = new Rainha("rainha1", 100, 1500);

        System.out.println("operaria1:");
        operaria1.coletarRecursos();
        operaria1.defenderColmeia();

        System.out.println();

        System.out.println("Zangao1:");
        Zangao1.defenderColmeia();

        System.out.println();

        System.out.println("rainha1:");
        System.out.println("Não possui capacidades especiais.");
    }
}