package teste5;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        System.out.print("Insira uma String: ");
        String nome = tc.nextLine();

        for (int i = nome.length(); i > 0; i--) {
            System.out.print(nome.charAt(i - 1));

        }
        System.out.println("");

    }

}
