// Esse é o meu exemplo de como usar o Scanner. Para ver o da instrutora, vá para a classe "ExemploScanner.java"

import java.util.Scanner;

public class ExemploScannerMeu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();
        System.out.println("Digite o nome do seu bichinho: ");
        String bichinho = scanner.nextLine();
        System.out.println("Digite a idade do seu pet: ");
        int idadePet = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Digite o tipo de animal que seu pet é: ");
        String especie = scanner.nextLine();

        System.out.println(bichinho + " é o nome do pet do(a) " + nome + ", que é um " + especie + " com " + idadePet + " anos.");
        scanner.close();
    }
}
