import javax.print.DocFlavor.CHAR_ARRAY;

public class App {
    public static void main(String[] args) throws Exception {
        String filme = "A volta dos que não foram"; // %s
        int anoLancamento = 2021; // %d
        int duracao = 300;
        float notaCritica = 9.2f; // %f
        char letraInicial = 'A'; // %c
        boolean foiSucesso = true; // %b

        System.out.println(filme);
        System.out.println(anoLancamento);
        System.out.println(duracao);
        System.out.println(notaCritica);
        System.out.println(letraInicial);
        System.out.println(foiSucesso);

        System.out.println("O filme " + filme);
        System.out.println("Ano lançamento " + anoLancamento);
        System.out.println("Nota média " + notaCritica);
        System.out.println("Letra inicial " + letraInicial);
        System.out.println("Foi um sucesso? " + foiSucesso);

        System.out.println(
                "O filme " + filme + " Lançado em " + anoLancamento + " Tem uma duração " + duracao + " minutos.\n");

        System.out.format("O filme %s lançado em %d tem uma duração de %d minutos. ", filme, anoLancamento, duracao);

    }
}
