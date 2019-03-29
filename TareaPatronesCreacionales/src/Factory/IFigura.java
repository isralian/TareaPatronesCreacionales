/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory;

import SinPatron.Direccion;
import java.util.Random;
import javax.swing.JLabel;

/**
 *
 * @author Israel Padilla
 */
public abstract class IFigura {
    private int id;
    private int originalX, originalY;
    private int x,y;
    private String color;
    private Direccion direction;
    private int speed;
    private JLabel label;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOriginalX() {
        return originalX;
    }

    public void setOriginalX(int originalX) {
        this.originalX = originalX;
    }

    public int getOriginalY() {
        return originalY;
    }

    public void setOriginalY(int originalY) {
        this.originalY = originalY;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Direccion getDirection() {
        return direction;
    }

    public void setDirection(Direccion direction) {
        this.direction = direction;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public JLabel getLabel() {
        return label;
    }

    public void setLabel(JLabel label) {
        this.label = label;
    }
    
    
    public IFigura() {
    }

    public IFigura(int id, int x, int y,String color) {
        Random rand = new Random();
        this.id = id;
        this.originalX = x;
        this.originalY = y;
        this.x = x;
        this.y = y;
        this.color = color;
        this.direction = getRandomDirection();
        this.speed = rand.nextInt(10)+1;
    }
    
    public void moverFigura(int width, int height){
        switch (direction){
            case Arriba:
                setY(y-speed);
                label.setLocation(x, y - speed);
                break;
            case Derecha:
                setX(x+speed);
                label.setLocation(x + speed, y);
                break;
            case Abajo:
                setY(y+speed);
                label.setLocation(x, y + speed);
                break;
            case Izquierda:
                setX(x-speed);
                label.setLocation(x - speed, y);
                break;
            default:
                break;
        }
    }

    public static Direccion getRandomDirection(){
        Random rand = new Random();
        switch(rand.nextInt(4)){
            case 0:
                return Direccion.Arriba;
            case 1:
                return Direccion.Derecha;
            case 2:
                return Direccion.Abajo;
            case 3:
                return Direccion.Izquierda;
            default:
                return Direccion.Arriba;
        }
    }
    
    
}
