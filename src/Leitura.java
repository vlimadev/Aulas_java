import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite seu filme favorito");
        String filme = leitura.nextLine();

        System.out.println("Qual ano de lançamento?");
        int anoDeLnacamento = leitura.nextInt();

        System.out.println("Diga sua Avaliação para o filme " + filme);
        double avaliacao = leitura.nextDouble();

        System.out.println(filme);
        System.out.println(anoDeLnacamento);
        System.out.println(avaliacao);
    }
}
