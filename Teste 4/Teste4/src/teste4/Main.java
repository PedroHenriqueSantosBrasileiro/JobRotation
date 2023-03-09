package teste4;

public class Main {

    public static void main(String[] args) {

        String estado[] = {"SP", "RJ", "MG", "ES", "Outros"};
        double valor[] = {67836.43, 36678.66, 29229.88, 27165.48, 19849.53};
        double total = 0;

        for (int i = 0; i < valor.length; i++) {

            total += valor[i];
        }

        for (int i = 0; i < valor.length; i++) {
            String porcentagem = "%";
            System.out.printf("%s = %s%.2f\n", estado[i], porcentagem, (100 * valor[i]) / total);

        }

    }

}
