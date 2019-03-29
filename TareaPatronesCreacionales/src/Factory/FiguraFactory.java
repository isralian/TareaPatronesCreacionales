/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory;

/**
 *
 * @author Israel Padilla
 */
public class FiguraFactory implements FiguraFactoryMethod{

    @Override
    public IFigura createFigura(int id, int x, int y, String color) {
        
        if("Rojo".equals(color)){
            return new LetraO(id,x,y,color);
        }
        else{
            return null;    
        }        
    }
    
}
