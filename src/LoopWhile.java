import java.util.Scanner;

public class LoopWhile {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double media = 0;
        double nota = 0;
        int totalDeNotas = 0;

        while (nota != -1){
            System.out.println("Diga sua Avaliação para o filme ou digite -1 para encerrar");
            nota = leitura.nextDouble();

            if (nota != -1) {
                media += nota;
                totalDeNotas++;
            }

        }
        System.out.println("Media de avaliações " + media/totalDeNotas);
    }
}
