package teste3;

import java.util.ArrayList;
import java.util.List;

public class Faturamento {

    private double valor[] = {31490.7866, 37277.9400, 37708.4303, 0.0000, 0.0000, 17934.2269, 0.0000, 6965.1262, 24390.9374, 14279.6481, 0.0000, 0.0000, 39807.6622, 27261.6304, 39775.6434, 29797.6232, 17216.5017, 0.0000, 0.0000, 12974.2000, 28490.9861, 8748.0937, 8889.0023, 17767.5583, 0.0000, 0.0000, 3071.3283, 48275.2994, 10299.6761, 39874.1073};
    private int dia[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30};

    private double menorValor;
    private int menorDia;
    private double maiorValor;
    private int maiorDia;
    private double media;
    

    public void MaiorValor() {

        maiorDia = dia[0];
        maiorValor = valor[0];

        for (int i = 0; i < dia.length; i++) {
            if (valor[i] > maiorValor) {
                maiorValor = valor[i];
                maiorDia = dia[i];
            }

        }

        System.out.printf("Dia com Maior faturamento: Dia %d\n" , maiorDia);
        System.out.printf("Faturamento: %.2f\n" , maiorValor);

    }

    public void MenorValor() {

        menorDia = dia[0];
        menorValor = valor[0];

        for (int i = 0; i < dia.length; i++) {
            if (valor[i] < menorValor) {
                menorValor = valor[i];
                menorDia = dia[i];
            }

        }

        System.out.printf("Dia com menor faturamento: Dia %d\n", menorDia);
        System.out.printf("Faturamento: %.2f\n", menorValor);

    }

    public void DiasAcimaDaMedia() {
        double totalValor = 0;
        int totalDias = 0;
        for (int i = 0; i < dia.length; i++) {

            if (valor[i] > 0) {
                totalDias += 1;
                totalValor += valor[i];
                
                
            }

        }
        
        
        
        media = totalValor / totalDias;
        
        System.out.println(media);
        System.out.println("DIAS COM FATURAMENTO ACIMA DA MÉDIA");
        for(int i = 0;i < dia.length;i++){
            if(valor[i] > media){
                System.out.printf("Dia: %d\n",dia[i]);
                
            }
        }

        
        
        
    }

}
