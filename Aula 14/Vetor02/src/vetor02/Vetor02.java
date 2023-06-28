/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vetor02;

/**
 *
 * @author H3llGow
 */
public class Vetor02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String mes[] = {"Janeiro","Fevereiro","Marco","Abil","Maio","Junho",
            "Julho","Agosto","Setembro","Outubro","Novembro","Dezembro"};
        int dia[] = {31,28,31,30,31,30,31,31,30,31,30,31};
        
        for(int cont = 0; cont<mes.length; cont++){
            System.out.println("O mes de " + mes[cont] + " tem "
                    +dia[cont]+" dias."); 
        }
    }
    
}
