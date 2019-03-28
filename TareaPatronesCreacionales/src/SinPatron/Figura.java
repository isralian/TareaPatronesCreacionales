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
public class Figura {
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
    
    public Figura() {
    }

    public Figura(int id, int x, int y) {
        Random rand = new Random();
        this.id = id;
        this.originalX = x;
        this.originalY = y;
        this.x = x;
        this.y = y;
        this.color = "Rojo";
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
    
    @Override
    public String toString() {
        return "id: "+id+",x: "+x+",y: "+y+",color: "+color+",direction: "+direction+",speed: "+speed; //To change body of generated methods, choose Tools | Templates.
    }
            
    
}
