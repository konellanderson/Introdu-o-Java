import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        String elo;
        int tier;
        String valor;

        Scanner leitor = new Scanner(System.in);

        System.out.println("Qual o seu elo?");
        elo = leitor.nextLine();

        System.out.println("Qual o seu tier?");
        valor = leitor.nextLine();
        tier = Integer.parseInt(valor);

        System.out.println("Qual o seu campeão preferido?");
        String campeao = leitor.nextLine();

        System.out.println("Você é mono " + campeao + " no elo " + elo + " " + tier);

    }
}
