/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SinPatron;

import java.util.Random;
import javax.swing.JLabel;
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
        int n = 10;
        Random rand = new Random();
        // Obtain a number.
        PanelFigura panel=new PanelFigura();
        panel.setVisible(true);
        
        Figura[] FigurasArray= new Figura[n];
        
        int i;
        int width = panel.getWidth();
        int height = panel.getHeight();
        for(i=0;i<n;i++){
            FigurasArray[i]=new Figura(i,rand.nextInt(width),rand.nextInt(height));
            JLabel label = new JLabel();
            FigurasArray[i].setLabel(label);
            panel.add(label);
            label.setLayout(null);
            label.setSize(20, 20);
            label.setLocation(FigurasArray[i].getX(), FigurasArray[i].getY());
            label.setText("O");           
            label.setVisible(true);
        }
        
        while(true){
            for(i=0;i<n; i++){
                FigurasArray[i].moverFigura(width, height);
                System.out.println(FigurasArray[i].toString());
            }
        }
        
        
//        for(i=0;i<FigurasArray.length;i++){
//            System.out.println(FigurasArray[i].toString());
//        }
    
    
    }
}
