package teste1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       Scanner tc = new Scanner(System.in);
       Fibbonacci fb = new Fibbonacci(); 
       
        System.out.print("Digite o valor que vai ser vereficado:");
        long valor = tc.nextLong();
        
        fb.verificarSequencia(valor);
        
        
    }

}
