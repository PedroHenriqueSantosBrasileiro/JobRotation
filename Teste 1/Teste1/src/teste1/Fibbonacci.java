/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teste1;

/**
 *
 * @author Drac
 */
public class Fibbonacci {
    
    private long primeiro = 0;
    private long segundo = 1;
    private long soma;
        
    public void verificarSequencia(long valor){
        
        for(int i = 0; i <= valor;i++){
            soma = primeiro+segundo;
            
            
            if(soma == valor || valor == 0){
                System.out.println("O numero está na sequencia");
                break;
            }else if(soma > valor){
                System.out.println("O valor não esta na sequencia");
                break;
            }
            
            primeiro = segundo;
            segundo = soma;
            
        }
        
    }
    
}
