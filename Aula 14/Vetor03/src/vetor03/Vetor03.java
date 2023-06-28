/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vetor03;

import java.util.Arrays;

/**
 *
 * @author H3llGow
 */
public class Vetor03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double num[] = {3.5, -4, -3.7, 4.8};
        
        Arrays.sort(num);
        
        for(double valor:num){
            System.out.println(valor + " "); 
        }
             
    }
    
}
