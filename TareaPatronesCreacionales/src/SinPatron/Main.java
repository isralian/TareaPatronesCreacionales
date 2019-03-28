/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SinPatron;

import java.util.Random;
/**
 *
 * @author Israel Padilla
 */
public class Main {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Random rand = new Random();
        // Obtain a number.

        Figura[] FigurasArray= new Figura[10];
        int i;
        for(i=0;i<FigurasArray.length;i++){
            FigurasArray[i]=new Figura(i,rand.nextInt(600),rand.nextInt(600),"Rojo",rand.nextInt(4)+1,rand.nextInt(10));        
        }
        
        for(i=0;i<FigurasArray.length;i++){
            System.out.println(FigurasArray[i].toString());
        }
    
    
    }
}
