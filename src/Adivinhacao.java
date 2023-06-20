import java.util.Random;
import java.util.Scanner;

public class Adivinhacao {
    public static void main(String[] args) {
        int numeroSorteado = new Random().nextInt(100);
        int tentativas = 10;
        int palpite;

        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= tentativas; i++) {
            System.out.println("Qual seu " + i + " palpite?");
            palpite = scanner.nextInt();

            if (palpite < numeroSorteado){
                System.out.println("Chute um numero mais alto!");
            }else {
                System.out.println("Chute um numero mais baixo");
            }


            if (i == tentativas  ) {
                System.out.println("Suas chances acabaram!");
                break;
            }

            if( palpite == numeroSorteado) {
                System.out.println("Parabéns você acertou, o numero sorteado foi " + numeroSorteado);
                break;
            }

        }
    }
}
