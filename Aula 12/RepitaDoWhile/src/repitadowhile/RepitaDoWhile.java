/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package repitadowhile;

import javax.swing.JOptionPane;

/**
 *
 * @author H3llGow
 */
public class RepitaDoWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n, soma=0, totvalor=0, par=0, impar=0,maior=0;
        float media=0;
        
        do{
             n = Integer.parseInt(JOptionPane.showInputDialog(null,
                     "<html>Informe um numero: <br><em>(O valor 0 Interrompe)"
                             + "</br></em></html>","Tabela Valores", 
                             JOptionPane.INFORMATION_MESSAGE));
             soma+=n;
             totvalor++;
             
             if(n % 2 == 0){
                par++; 
             }else{
                 impar++;
             }
             if(n>100){
                 maior++;
             }
             media = soma / totvalor;
        }while(n!=0);
       
        JOptionPane.showMessageDialog(null,"<html>Resultado final <hr> "
                + "<br>Soma total: "+ soma + "<br>Valores digitados: "+ totvalor + 
                "<br>Total de Pares: "+ par + "<br>Total de Impares: "+ impar +
                "<br>Acima de 100: "+ maior + "<br>Media dos valores: " + media +"</br></html>", "Resultado Tabela", 
                             JOptionPane.INFORMATION_MESSAGE );
    }
    
}
