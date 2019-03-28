/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SinPatron;


/**
 *
 * @author Israel Padilla
 */
public class Figura {
    private int id;
    private int x,y;
    private String color;
    private int direction;
    private int speed; 

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

    public int getDirection() {
        return direction;
    }

    public void setDirection(int direction) {
        this.direction = direction;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public Figura() {
    }

    public Figura(int id, int x, int y, String color, int direction, int speed) {
        this.id = id;
        this.x = x;
        this.y = y;
        this.color = color;
        this.direction = direction;
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "id: "+id+",x: "+x+",y: "+y+",color: "+color+",direction: "+direction+",speed: "+speed; //To change body of generated methods, choose Tools | Templates.
    }
            
    
}
