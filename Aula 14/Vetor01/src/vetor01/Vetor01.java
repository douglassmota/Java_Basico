/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vetor01;

/**
 *
 * @author H3llGow
 */
public class Vetor01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n[] = {5,9,14,7,22,13};
        System.out.println("O total de indices e "+n.length+".");
        
        for(int cont = 0; cont<=n.length-1; cont++){
            System.out.println("A posicao "+cont+" vai receber o valor "+n[cont]); 
        }
    }
    
}
