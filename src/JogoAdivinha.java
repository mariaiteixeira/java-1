// Meu código. Para ver o da instrutora: "OutroJogoAdivinha.java"

import java.util.Random;
import java.util.Scanner;

public class JogoAdivinha {
    public static void main(String[] args) {
        Scanner continuacaoTentativa = new Scanner(System.in);
        int numeroAleatorio = new Random().nextInt(100);
        int numeroDeTentativas = 0;
        int numeroParaAdivinhar = 0;
        int totalTentativas = 0;

        while (numeroDeTentativas < 5) {
            System.out.println("Tente adivinhar o número!");
            numeroParaAdivinhar = continuacaoTentativa.nextInt();
            numeroDeTentativas++;

            if (numeroParaAdivinhar == numeroAleatorio) {
                System.out.println("Você acertou o número aleatório! Uau!");
                break;
            } else {
                totalTentativas++;
                if (numeroParaAdivinhar > numeroAleatorio) {
                    System.out.println("O número aleatório é menor que " + numeroParaAdivinhar);
                } else {
                    System.out.println("O número aleatório é maior que " + numeroParaAdivinhar);
                }
            }
        }

        if (numeroDeTentativas == 5 && numeroParaAdivinhar != numeroAleatorio) {
            System.out.println("Você perdeu! O número aleatório era " + numeroAleatorio);
        }

    }
}
