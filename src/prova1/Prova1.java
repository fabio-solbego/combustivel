/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prova1;

import java.text.DecimalFormat;



/**
 *
 * @author Computador
 */
public class Prova1 {

   
    public static void main(String[] args) {
      double quantComb, totGas, totAlc;
        int comb;
        final double GAS = 5.84;
        final double ALC = 4.90;
        Scanner ler = new Scanner(System.in);
        DecimalFormat f = new DecimalFormat("0.00");
        
        System.out.println("Quanto combustivel foi abastecido?");
        quantComb = ler.nextDouble();
        System.out.println("Digite:\n 1 Gasolina\n 2 Álcool\n ->");
        comb = ler.nextInt();
        switch(comb){
            case 1: 
                totGas = quantComb * GAS;
                System.out.println("Quantidade Abastecida: "+quantComb
                        +"\nTotal de Gasolina é"
                        + "\n R$ "+f.format(totGas)+" (sem desconto)");
                if(quantComb<=25){
                    totGas = totGas * 0.97;
                    System.out.println("Quantidade abastecida: "+quantComb
                        +"\nTotal de Gasolina é"
                        + "\n R$ "+f.format(totGas)+" (com desconto - 3%)");
                }else{
                    totGas = totGas * 0.96;
                    System.out.println("Total de Gasolina é"
                        + "\n R$ "+f.format(totGas)+" (com desconto - 4%)");
                }
                 
                break;
            case 2: 
                totAlc = quantComb * ALC;
                System.out.println("Total de Álcool é"
                        + "\n R$ "+f.format(totAlc)+" (sem desconto)");
                
                 if(quantComb<=25){
                    totAlc = totAlc * 0.98;
                    System.out.println("Quantidade abastecida: "+quantComb
                        +"\nTotal de Álcool é"
                        + "\n R$ "+f.format(totAlc)+" (com desconto - 2%)");
                }else{
                    totAlc = totAlc * 0.96;
                    System.out.println("Quantidade abastecida: "+quantComb
                        +"\nTotal de Álcool é"
                        + "\n R$ "+f.format(totAlc)+" (com desconto - 4%)");
                }
                break;
        }    
        
        
    }
    
}
