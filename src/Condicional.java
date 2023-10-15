public class Condicional {
    public static void main(String[] args) {
        int anoDeLancamento = 2022;
        boolean incluidoNoPlano = false;
        double notaDoFilme = 8.1;
        String tipoPlano = "normal";

        if (anoDeLancamento >= 2022) {
            System.out.println("Novo lançamento!");
        } else {
            System.out.println("Filme com lançamento anterior a 2021.");
        }

        if (incluidoNoPlano == true || tipoPlano.equals("plus")) {
            System.out.println("Filme liberado");
        } else {
            System.out.println("É necessário pagar a locação.");
        }
    }
}
