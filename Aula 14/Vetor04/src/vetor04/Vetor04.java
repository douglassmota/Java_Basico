/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vetor04;

import java.util.Arrays;

/**
 *
 * @author H3llGow
 */
public class Vetor04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int vet[] = {5,45,63,2,9,78};
        int pos = Arrays.binarySearch(vet, 63);
        
        for(int num: vet){
            System.out.print(num + " ");
        }
        System.out.println(" ");
        System.out.println("Encontrei o numero Key na posicao "+ pos);
    }
    
}
