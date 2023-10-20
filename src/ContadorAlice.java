// Este código está errado por querer! Para ver a versão correta, vá na classe "ContadorAliceCorreto.java".

public class ContadorAlice {

    public static void main(String[] args) {
        int contador = 1;

        while(contador <= 10) {
            System.out.println(contador);
            // Não chamamos aqui o incremento. Então ele vai considerar que enquanto a variável "contador" for menor que
            // 10 (e está gravada como 1), o certo é imprimir em loop a variável.
        }
    }
}