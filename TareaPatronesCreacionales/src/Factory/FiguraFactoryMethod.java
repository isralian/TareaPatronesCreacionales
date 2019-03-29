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
public interface FiguraFactoryMethod {
    public IFigura createFigura(int id,int x,int y,String color);
    
}
